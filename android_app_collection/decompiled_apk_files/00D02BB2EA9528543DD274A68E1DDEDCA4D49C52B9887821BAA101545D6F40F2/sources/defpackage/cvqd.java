package defpackage;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvqd  reason: default package */
/* loaded from: classes5.dex */
public final class cvqd implements cvpx {
    private final Context a;
    private final cvqa b;

    public cvqd(Context context, cvqa cvqaVar) {
        this.a = context;
        this.b = cvqaVar;
    }

    @Override // defpackage.cvpx
    public final dsbn a() {
        return dsbn.IHNR_LAYOUT;
    }

    @Override // defpackage.cvpx
    public final boolean b() {
        if (!dxyd.b()) {
            cvlw.d("IhnrCustomizer", "iHNR surveys are disabled by feature flag", new Object[0]);
            return false;
        } else if (cvpo.a()) {
            return true;
        } else {
            cvlw.d("IhnrCustomizer", "Must be at least API level 24 to add iHNR survey", new Object[0]);
            return false;
        }
    }

    @Override // defpackage.cvpx
    public final dbsg<drwt> c(ib ibVar, @dzsi cvkc cvkcVar, cvkj cvkjVar, dsbo dsboVar) {
        dscv dscvVar;
        if (!b()) {
            return dbpy.a;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this.a, ibVar.b());
        String packageName = this.a.getPackageName();
        RemoteViews createBigContentView = recoverBuilder.createBigContentView();
        if (dsboVar.a == 1) {
            dscvVar = (dscv) dsboVar.b;
        } else {
            dscvVar = dscv.e;
        }
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), (int) R.layout.ihnr);
        if (!dscvVar.b.isEmpty()) {
            remoteViews.setTextViewText(R.id.question, dscvVar.b);
        } else {
            remoteViews.setViewVisibility(R.id.question, 8);
        }
        if ((dscvVar.a & 2) != 0) {
            dscu dscuVar = dscvVar.c;
            if (dscuVar == null) {
                dscuVar = dscu.c;
            }
            remoteViews.setTextViewText(R.id.first_button, dscuVar.b);
            cvqa cvqaVar = this.b;
            dscu dscuVar2 = dscvVar.c;
            if (dscuVar2 == null) {
                dscuVar2 = dscu.c;
            }
            dsbk dsbkVar = dscuVar2.a;
            if (dsbkVar == null) {
                dsbkVar = dsbk.e;
            }
            remoteViews.setOnClickPendingIntent(R.id.first_button, cvqaVar.a(cvkcVar, cvkjVar, dsbkVar));
        }
        if ((dscvVar.a & 4) != 0) {
            dscu dscuVar3 = dscvVar.d;
            if (dscuVar3 == null) {
                dscuVar3 = dscu.c;
            }
            remoteViews.setTextViewText(R.id.second_button, dscuVar3.b);
            cvqa cvqaVar2 = this.b;
            dscu dscuVar4 = dscvVar.d;
            if (dscuVar4 == null) {
                dscuVar4 = dscu.c;
            }
            dsbk dsbkVar2 = dscuVar4.a;
            if (dsbkVar2 == null) {
                dsbkVar2 = dsbk.e;
            }
            remoteViews.setOnClickPendingIntent(R.id.second_button, cvqaVar2.a(cvkcVar, cvkjVar, dsbkVar2));
        }
        RemoteViews remoteViews2 = new RemoteViews(packageName, (int) R.layout.notification_with_survey);
        remoteViews2.removeAllViews(R.id.notification_container);
        remoteViews2.removeAllViews(R.id.survey_container);
        remoteViews2.addView(R.id.notification_container, createBigContentView);
        remoteViews2.addView(R.id.survey_container, remoteViews);
        ibVar.F = remoteViews2;
        return dbsg.i(drwt.IHNR);
    }
}
