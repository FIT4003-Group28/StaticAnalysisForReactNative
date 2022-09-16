package defpackage;

import android.content.Context;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: jvl  reason: default package */
/* loaded from: classes7.dex */
public final class jvl implements kdj {
    public final cqat a;
    public final dehq b;
    public final dehq c;
    public final bvjj d;
    public final jzv e;
    public final Context f;
    public final dxio<aukk> g;
    public final nog h;
    public final ldz i;
    public final jtp j;
    private final mvv k;

    public jvl(cqat cqatVar, dehq dehqVar, dehq dehqVar2, bvjj bvjjVar, jzv jzvVar, mvv mvvVar, jtp jtpVar, cqkj cqkjVar, dxio dxioVar, nog nogVar, ldz ldzVar) {
        dbsk.s(cqatVar);
        this.a = cqatVar;
        dbsk.s(dehqVar);
        this.b = dehqVar;
        dbsk.s(dehqVar2);
        this.c = dehqVar2;
        dbsk.s(bvjjVar);
        this.d = bvjjVar;
        dbsk.s(jzvVar);
        this.e = jzvVar;
        this.k = mvvVar;
        dbsk.s(jtpVar);
        this.j = jtpVar;
        this.f = cqkjVar.d;
        dbsk.s(dxioVar);
        this.g = dxioVar;
        dbsk.s(nogVar);
        this.h = nogVar;
        this.i = ldzVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kdj
    public final boolean a() {
        return this.h.b() == 1;
    }

    @Override // defpackage.kdj
    public final void b() {
        this.k.g();
        this.h.a();
    }

    @Override // defpackage.kdj
    public final void d(dndr dndrVar) {
        this.k.g();
        ldz ldzVar = this.i;
        lkr lkrVar = ldzVar.l;
        if (lkrVar != null) {
            lkrVar.o.k(lkrVar.j.b(dndrVar));
            return;
        }
        les lesVar = ldzVar.k;
        lesVar.k.k(lesVar.h.b(dndrVar));
    }

    @Override // defpackage.kdj
    public final void e() {
        ldz ldzVar = this.i;
        lkr lkrVar = ldzVar.l;
        if (lkrVar != null) {
            lkrVar.m();
            return;
        }
        les lesVar = ldzVar.k;
        lesVar.w(lesVar.h.x());
    }

    @Override // defpackage.kdj
    public final void f(String str, String str2, String str3, @dzsi dpvf dpvfVar, dhjx dhjxVar, boolean z, drph drphVar, mnz mnzVar, dbsg<Long> dbsgVar, boolean z2) {
        ldz ldzVar = this.i;
        mbr d = ldzVar.d();
        dbsk.s(d);
        if (ldzVar.l != null) {
            d.a(str, str2, str3, dpvfVar, null, dtxm.dJ, deaf.INPUT_VOICE, z, mex.a(), drphVar, mnzVar, dbsgVar, z2);
        } else {
            d.a(str, str2, str3, dpvfVar, dhjxVar, dtxm.dP, deaf.INPUT_VOICE, z, mex.a(), drphVar, mnzVar, dbsgVar, z2);
        }
    }

    @Override // defpackage.kdj
    public final void g(dcdc<ldm> dcdcVar) {
        lzf lzfVar;
        ldz ldzVar = this.i;
        if (ldzVar.l != null && (lzfVar = ldzVar.j) != null) {
            lzfVar.b();
        }
        les lesVar = ldzVar.k;
        lesVar.w(lesVar.h.o(lesVar.l, dcdcVar, msv.INTENT_MULTIPLE_WAYPOINTS));
    }

    @Override // defpackage.kdj
    public final void h(String str, ddho ddhoVar, @dzsi dwir dwirVar) {
        this.k.g();
        ldz ldzVar = this.i;
        ldzVar.b.a();
        ldzVar.c.a();
        ldzVar.d().a(str, "", null, null, null, ddhoVar, deaf.INPUT_KEYBOARD, false, dwirVar, null, mnz.SEARCH_KEYBOARD_QUERY, dbpy.a, false);
        ldzVar.b.b();
    }

    @Override // defpackage.kdj
    public final void i(ldm ldmVar, kdk kdkVar, @dzsi vup vupVar, mnz mnzVar) {
        this.k.g();
        ldz ldzVar = this.i;
        lkr lkrVar = ldzVar.l;
        if (lkrVar == null || lkrVar.w) {
            ldzVar.k.z(ldmVar, kdkVar, vupVar, true, mnzVar);
        } else {
            lkrVar.o(ldmVar, kdkVar, vupVar, mnzVar, true);
        }
    }
}
