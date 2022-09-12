package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: shh  reason: default package */
/* loaded from: classes7.dex */
public class shh implements sbf {
    @dzsi
    public domy b;
    private final qjk c;
    private final sbz d;
    private final roq e;
    private final sfc f;
    private final rot g;
    private final dbsg<domy> h;
    private final cqkn<sbg> i = new shg(this);
    public final List<sbg> a = new ArrayList();

    public shh(Application application, qjk qjkVar, sbz sbzVar, roq roqVar, cqhn cqhnVar, shk shkVar, sfd sfdVar, rot rotVar, btvo btvoVar, rzp rzpVar) {
        this.c = qjkVar;
        this.d = sbzVar;
        this.e = roqVar;
        this.g = rotVar;
        this.f = sfdVar.a(R.string.COMMUTE_TRAVEL_MODE_HEADING, dtxl.cA, dtxl.cD, rzpVar);
        this.h = qjkVar.g();
        for (domy domyVar : qjkVar.e()) {
            shj i = shj.i(shkVar, application, qjkVar, btvoVar, domyVar, this.i);
            if (i.e().booleanValue()) {
                this.b = domyVar;
            }
            this.a.add(i);
        }
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.f.e().b();
    }

    @Override // defpackage.sbf
    public List<sbg> b() {
        return this.a;
    }

    public final cqkl c() {
        sfc sfcVar = this.f;
        domy domyVar = this.b;
        dbsk.s(domyVar);
        return sfcVar.a(sht.t(domyVar));
    }

    @Override // defpackage.sav
    public Boolean l() {
        return Boolean.valueOf(!this.f.c());
    }

    @Override // defpackage.sav
    public Boolean m() {
        return false;
    }

    @Override // defpackage.sav
    public Boolean n() {
        return Boolean.valueOf(this.b != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    @Override // defpackage.sav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl o() {
        /*
            r8 = this;
            domy r0 = r8.b
            if (r0 != 0) goto L7
            cqkl r0 = defpackage.cqkl.a
            return r0
        L7:
            qjk r1 = r8.c
            r1.i(r0)
            roq r0 = r8.e
            r0.a()
            dbsg<domy> r0 = r8.h
            boolean r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L64
            domy r0 = r8.b
            defpackage.dbsk.s(r0)
            dbsg<domy> r2 = r8.h
            java.lang.Object r2 = r2.b()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            sfc r0 = r8.f
            boolean r0 = r0.g()
            if (r0 == 0) goto L6e
            sfc r0 = r8.f
            r2 = 1
            ror[] r2 = new defpackage.ror[r2]
            ror r3 = defpackage.ror.RECEIPT
            r2[r1] = r3
            dcep r2 = defpackage.dcep.M(r2)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            ror[] r4 = defpackage.ror.values()
            int r5 = r4.length
        L4a:
            if (r1 >= r5) goto L5a
            r6 = r4[r1]
            boolean r7 = r2.contains(r6)
            if (r7 != 0) goto L57
            r3.add(r6)
        L57:
            int r1 = r1 + 1
            goto L4a
        L5a:
            rzo r1 = new rzo
            r1.<init>(r3)
            cqkl r0 = r0.a(r1)
            return r0
        L64:
            qjk r0 = r8.c
            r0.r()
            qjk r0 = r8.c
            r0.u()
        L6e:
            domy r0 = r8.b
            defpackage.dbsk.s(r0)
            domy r2 = defpackage.domy.UNKNOWN_TRAVEL_MODE
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L88
            sbz r0 = r8.d
            shf r2 = new shf
            r2.<init>(r8)
            r0.b(r2, r1)
            cqkl r0 = defpackage.cqkl.a
            return r0
        L88:
            cqkl r0 = r8.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shh.o():cqkl");
    }

    @Override // defpackage.sav
    public cjtd p() {
        if (!this.g.b() || !this.f.g()) {
            return this.f.b;
        }
        ddzf bZ = ddzg.t.bZ();
        ddik bZ2 = ddil.e.bZ();
        dbsk.s(this.b);
        domy domyVar = domy.UNKNOWN_TRAVEL_MODE;
        int ordinal = this.b.ordinal();
        int i = 5;
        if (ordinal == 1) {
            i = 2;
        } else if (ordinal == 2) {
            i = 3;
        } else if (ordinal == 3) {
            i = 6;
        } else if (ordinal != 4) {
            i = ordinal != 5 ? 1 : 4;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddil ddilVar = (ddil) bZ2.b;
        ddilVar.b = i - 1;
        ddilVar.a |= 1;
        ddil bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.f = bK;
        ddzgVar.a |= 16777216;
        cjta c = cjtd.c(this.f.b);
        c.r(bZ.bK());
        return c.a();
    }

    @Override // defpackage.sav
    public cqkl q() {
        return this.f.d();
    }

    @Override // defpackage.sav
    public cjtd r() {
        return this.f.a;
    }

    @Override // defpackage.sav
    public Boolean s() {
        return sau.a();
    }

    @Override // defpackage.sav
    public rzp t() {
        return this.f.c;
    }
}
