package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: nhb  reason: default package */
/* loaded from: classes7.dex */
public final class nhb implements dbsz<vvy> {
    final /* synthetic */ Context a;
    final /* synthetic */ bvjj b;
    final /* synthetic */ vzg c;
    final /* synthetic */ jtp d;
    final /* synthetic */ jvk e;

    public nhb(Context context, bvjj bvjjVar, jtp jtpVar, vzg vzgVar, jvk jvkVar) {
        this.a = context;
        this.b = bvjjVar;
        this.d = jtpVar;
        this.c = vzgVar;
        this.e = jvkVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(@dzsi vvy vvyVar) {
        amte a;
        vvy vvyVar2 = vvyVar;
        Context context = this.a;
        bvjj bvjjVar = this.b;
        amte amteVar = null;
        if (this.d.a.ag && vvyVar2 != null) {
            vvw vvwVar = vvyVar2.f;
            if (vvwVar == null) {
                vvwVar = vvw.d;
            }
            if (vze.c(vvwVar) && (a = vze.a(vvyVar2, context)) != null && bvjjVar.w(bvjk.eg, 0L) < a.g) {
                amteVar = a;
            }
        }
        if (amteVar == null) {
            this.c.a();
            return;
        }
        dcdc<ldm> i = ldm.i(amteVar, this.a.getResources());
        i.size();
        ldz ldzVar = this.e.a;
        lzf lzfVar = ldzVar.j;
        dbsk.s(lzfVar);
        Boolean l = lzfVar.k().l();
        if (l != null && l.booleanValue()) {
            return;
        }
        lkr lkrVar = ldzVar.l;
        if (lkrVar == null || lkrVar.w) {
            les lesVar = ldzVar.k;
            lesVar.w(lesVar.h.g(i, amteVar, true));
            return;
        }
        lkrVar.g.a();
        lkrVar.i.a();
        lkrVar.o.k(lkrVar.j.g(i, amteVar, true));
        lkrVar.g.b();
    }
}
