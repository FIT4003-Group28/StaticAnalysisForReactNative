package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpau  reason: default package */
/* loaded from: classes3.dex */
final class bpau implements Runnable {
    final /* synthetic */ bpax a;

    public bpau(bpax bpaxVar) {
        this.a = bpaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.J(), (int) R.string.NET_FAIL_TITLE, 1).show();
    }
}
