package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: dfx  reason: default package */
/* loaded from: classes3.dex */
final class dfx implements Runnable {
    final /* synthetic */ dfy a;

    public dfx(dfy dfyVar) {
        this.a = dfyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c = Choreographer.getInstance();
    }
}
