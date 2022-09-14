package defpackage;

import android.widget.Toast;
/* compiled from: PG */
/* renamed from: arwx  reason: default package */
/* loaded from: classes2.dex */
final class arwx implements Runnable {
    final /* synthetic */ arxa a;

    public arwx(arxa arxaVar) {
        this.a = arxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        arxa arxaVar = this.a;
        Toast.makeText(arxaVar.o, arxaVar.PS(), 1).show();
        synchronized (this.a) {
            this.a.p = null;
        }
    }
}
