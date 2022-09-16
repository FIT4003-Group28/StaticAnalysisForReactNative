package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bbbs  reason: default package */
/* loaded from: classes3.dex */
final class bbbs extends cqqw {
    final /* synthetic */ bbbv a;

    public bbbs(bbbv bbbvVar) {
        this.a = bbbvVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        bbbv bbbvVar;
        Runnable runnable;
        if (i2 <= 0 || (runnable = (bbbvVar = this.a).i) == null || bbbvVar.h) {
            return;
        }
        bbbvVar.i = null;
        runnable.run();
        cqkx.p(this.a);
    }
}
