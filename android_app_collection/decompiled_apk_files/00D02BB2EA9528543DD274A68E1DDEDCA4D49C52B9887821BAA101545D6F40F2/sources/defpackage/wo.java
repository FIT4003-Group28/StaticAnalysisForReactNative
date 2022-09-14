package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wo  reason: default package */
/* loaded from: classes7.dex */
public final class wo implements Runnable {
    final /* synthetic */ wt a;
    private final wr b;

    public wo(wt wtVar, wr wrVar) {
        this.a = wtVar;
        this.b = wrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vd vdVar;
        vf vfVar = this.a.c;
        if (vfVar != null && (vdVar = vfVar.b) != null) {
            vdVar.y(vfVar);
        }
        View view = (View) this.a.f;
        if (view != null && view.getWindowToken() != null && this.b.c()) {
            this.a.l = this.b;
        }
        this.a.n = null;
    }
}
