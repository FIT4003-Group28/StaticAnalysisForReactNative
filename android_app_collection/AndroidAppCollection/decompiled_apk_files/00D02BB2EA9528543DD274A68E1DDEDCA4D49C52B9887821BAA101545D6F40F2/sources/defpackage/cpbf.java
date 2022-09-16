package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cpbf  reason: default package */
/* loaded from: classes5.dex */
public final class cpbf extends cpbe {
    private final WeakReference<Activity> a;
    private final int b = R.styleable.AppCompatTheme_switchStyle;

    public cpbf(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // defpackage.cpbe, defpackage.cpbd
    public final void s(Status status) {
        Activity activity = this.a.get();
        if (activity == null) {
            return;
        }
        if (status.c()) {
            try {
                status.b(activity, this.b);
                return;
            } catch (IntentSender.SendIntentException unused) {
            }
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.b, new Intent(), 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(status.d() ? -1 : status.g);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }
}
