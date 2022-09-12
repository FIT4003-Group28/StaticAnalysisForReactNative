package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbwm  reason: default package */
/* loaded from: classes3.dex */
final class bbwm implements Runnable {
    final /* synthetic */ bbwn a;

    public bbwm(bbwn bbwnVar) {
        this.a = bbwnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.b, (int) R.string.UNKNOWN_ERROR, 0).show();
    }
}
