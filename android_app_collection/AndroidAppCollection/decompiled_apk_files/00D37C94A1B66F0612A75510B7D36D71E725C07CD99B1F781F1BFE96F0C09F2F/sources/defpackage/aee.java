package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aee  reason: default package */
/* loaded from: classes.dex */
final class aee implements Runnable {
    final /* synthetic */ aei a;

    public aee(aei aeiVar) {
        this.a = aeiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aei aeiVar = this.a;
        Context rb = aeiVar.rb();
        if (rb == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        aeiVar.ag.p(1);
        aeiVar.ag.o(rb.getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
