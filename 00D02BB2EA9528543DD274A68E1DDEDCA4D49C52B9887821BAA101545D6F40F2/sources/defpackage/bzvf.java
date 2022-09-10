package defpackage;

import android.app.Application;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzvf  reason: default package */
/* loaded from: classes4.dex */
public final class bzvf implements Runnable {
    final /* synthetic */ bzvh a;

    public bzvf(bzvh bzvhVar) {
        this.a = bzvhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bzvh bzvhVar = this.a;
        if (bzvhVar.i.e(bzvhVar.b)) {
            Application application = bzvhVar.b;
            Toast.makeText(application, application.getString(R.string.NAVIGATE_BACK_TO_NOTIFICATION_AFTER_RATING_ACCESSIBILITY_PROMPT, new Object[]{bzvhVar.j.c()}), 0).show();
        }
    }
}
