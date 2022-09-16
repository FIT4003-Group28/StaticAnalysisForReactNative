package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zoj  reason: default package */
/* loaded from: classes7.dex */
public final class zoj implements acnw {
    final /* synthetic */ zom a;
    final /* synthetic */ voh b;
    final /* synthetic */ zok c;

    public zoj(zok zokVar, zom zomVar, voh vohVar) {
        this.c = zokVar;
        this.a = zomVar;
        this.b = vohVar;
    }

    @Override // defpackage.acnw
    public final void a(int i, int i2, boolean z, boolean z2) {
        zod l = this.a.l();
        if (l != null) {
            l.i().m();
            for (View view : cqkx.n(l)) {
                RecyclerView recyclerView = (RecyclerView) cqkx.e(view, jkn.n, zvp.class);
                if (recyclerView != null) {
                    recyclerView.l(l.b);
                }
            }
        } else {
            zol zolVar = this.a.d;
            Integer valueOf = zolVar == null ? null : Integer.valueOf(((zgk) zolVar).a);
            if (valueOf != null) {
                voh vohVar = this.b;
                int intValue = valueOf.intValue();
                vok vokVar = (vok) vohVar;
                vokVar.e.a().c();
                vokVar.m = null;
                vokVar.j(intValue);
            }
        }
        this.c.c.b(new srj());
        cqkx.p(this.a);
    }
}
