package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cvqa  reason: default package */
/* loaded from: classes5.dex */
public final class cvqa {
    private final Context a;
    private final cvoy b;

    public cvqa(Context context, cvoy cvoyVar) {
        this.a = context;
        this.b = cvoyVar;
    }

    public final PendingIntent a(@dzsi cvkc cvkcVar, cvkj cvkjVar, dsbk dsbkVar) {
        Intent d = this.b.d();
        cvov.b(d, cvkcVar);
        cvov.a(d, cvkjVar);
        cvov.c(d, 3);
        cvov.d(d, dsbkVar.b);
        d.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", dsbkVar.d);
        if ((dsbkVar.a & 2) != 0) {
            d.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_SCORE", dsbkVar.c);
        }
        return PendingIntent.getBroadcast(this.a, cvpd.c(cvpd.a(cvkcVar == null ? "Anonymous" : cvkcVar.b(), cvkjVar.a()), dsbkVar.b, 3), d, 1207959552);
    }
}
