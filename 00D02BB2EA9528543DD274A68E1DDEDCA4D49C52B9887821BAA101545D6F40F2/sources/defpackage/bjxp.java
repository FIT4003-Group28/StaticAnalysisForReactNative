package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjxp  reason: default package */
/* loaded from: classes3.dex */
public final class bjxp implements bjwf {
    public final gga a;
    public final btrm b;
    public final bjgh c;
    public final jlp d;
    public final String e;
    public djao f;
    public final boolean g;
    public final cjtd h;
    private final Executor i;
    private final bjxt j;
    private final btzi<djrg, djri> k = new bjxo(this);
    private final bvez l;

    public bjxp(gga ggaVar, bjxt bjxtVar, bvez bvezVar, btrm btrmVar, bjgi bjgiVar, Executor executor, jlp jlpVar, bwrs bwrsVar, djao djaoVar, boolean z) {
        this.a = ggaVar;
        this.j = bjxtVar;
        this.l = bvezVar;
        this.b = btrmVar;
        this.c = bjgiVar.a(bwrsVar);
        this.i = executor;
        this.d = jlpVar;
        this.f = djaoVar;
        this.g = z;
        ilo iloVar = (ilo) bwrsVar.c();
        dbsk.s(iloVar);
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.gc;
        this.h = c.a();
        djam djamVar = djaoVar.b;
        this.e = (djamVar == null ? djam.m : djamVar).b;
    }

    @Override // defpackage.bjwf
    public final boolean a(String str) {
        djao djaoVar = this.f;
        if ((djaoVar.a & 16) != 0) {
            djam djamVar = djaoVar.g;
            if (djamVar == null) {
                djamVar = djam.m;
            }
            return djamVar.b.equals(str);
        }
        return false;
    }

    @Override // defpackage.bjwf
    public final String b() {
        djam djamVar = this.f.b;
        if (djamVar == null) {
            djamVar = djam.m;
        }
        djag djagVar = djamVar.c;
        if (djagVar == null) {
            djagVar = djag.d;
        }
        dhze dhzeVar = djagVar.a;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        return dhzeVar.f;
    }

    @Override // defpackage.bjwf
    public final bjwg c(bwrs<ilo> bwrsVar, djam djamVar) {
        bjxt bjxtVar = this.j;
        gga a = bjxtVar.a.a();
        bjxt.a(a, 1);
        cqhn a2 = bjxtVar.b.a();
        bjxt.a(a2, 2);
        cpv a3 = bjxtVar.c.a();
        bjxt.a(a3, 3);
        bjxt.a(bwrsVar, 4);
        bjxt.a(this, 5);
        bjxt.a(djamVar, 6);
        return new bjxs(a, a2, a3, bwrsVar, this, djamVar, null);
    }

    public final void d(djrg djrgVar) {
        this.l.b(djrgVar, this.k, this.i);
    }
}
