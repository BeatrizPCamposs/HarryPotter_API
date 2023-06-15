package com.example.appharrypotter;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

import java.util.Calendar;

public class WidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            Intent intent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
            views.setOnClickPendingIntent(R.id.imageButton, pendingIntent);

            //Definindo uso de calendário para que o widget possá mudar de imagem de acordo com cada dia da semana
            Calendar calendar = Calendar.getInstance();
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            switch (dayOfWeek) {
                case Calendar.MONDAY:
                    views.setImageViewResource(R.id.imageButton, R.drawable.segunda);
                    break;
                case Calendar.TUESDAY:
                    views.setImageViewResource(R.id.imageButton, R.drawable.terca);
                    break;
                case Calendar.WEDNESDAY:
                    views.setImageViewResource(R.id.imageButton, R.drawable.quarta);
                    break;
                case Calendar.THURSDAY:
                    views.setImageViewResource(R.id.imageButton, R.drawable.quinta);
                    break;
                case Calendar.FRIDAY:
                    views.setImageViewResource(R.id.imageButton, R.drawable.sexta);
                    break;
                case Calendar.SATURDAY:
                    views.setImageViewResource(R.id.imageButton, R.drawable.sabado);
                    break;
                case Calendar.SUNDAY:
                    views.setImageViewResource(R.id.imageButton, R.drawable.domingo);
                    break;
                default:
                    break;
            }

            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}



