package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atuy  reason: default package */
/* loaded from: classes2.dex */
public class atuy extends atss<crqz> implements atyb {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private final atuw A;
    private final crfl B;
    private final dcdn<dkxe, atxt> C;
    @dzsi
    private atti D;
    @dzsi
    private atya E;
    private final bvjj b;
    private final asbr c;
    private final atus d;

    public atuy(crqz crqzVar, asbr asbrVar, btrm btrmVar, bvjj bvjjVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, Context context, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, atus atusVar, atuw atuwVar, btvo btvoVar, crfl crflVar) {
        super(crqzVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, crqzVar.a ? 3500L : a);
        cjtd a2;
        dbsg dbsgVar;
        this.p = context.getString(R.string.REPORT_INCIDENT_PROMPT_TITLE);
        this.v = cjtd.a(dtxw.bD);
        int s = bvjjVar.s(bvjk.jA, 0);
        if (s < 3) {
            this.q = this.j.getText(R.string.REPORT_INCIDENT_PROMPT_SAFETY_TEXT);
            bvjjVar.W(bvjk.jA, s + 1);
        }
        this.b = bvjjVar;
        this.c = asbrVar;
        this.B = crflVar;
        this.d = atusVar;
        this.A = atuwVar;
        dcdg dcdgVar = new dcdg();
        for (dkxf dkxfVar : auej.c(btvoVar)) {
            dkxe b = dkxe.b(dkxfVar.b);
            b = b == null ? dkxe.UNKNOWN_USER_INCIDENT_TYPE : b;
            auei c = auei.c(dkxfVar.c, dkxfVar.d);
            aryv aryvVar = crqzVar.c;
            dkxc b2 = dkxc.b(dkxfVar.e);
            b2 = b2 == null ? dkxc.UNKNOWN_LABEL : b2;
            Integer a3 = auej.a(b2);
            atur aturVar = null;
            cqvf l = a3 == null ? null : cqrt.l(a3.intValue());
            dqkr dqkrVar = dqkr.UNKNOWN_INCIDENT_TYPE;
            switch (b.ordinal()) {
                case 1:
                    a2 = cjtd.a(dtxw.bG);
                    break;
                case 2:
                    a2 = cjtd.a(dtxw.bI);
                    break;
                case 3:
                    a2 = cjtd.a(dtxw.bL);
                    break;
                case 4:
                    a2 = cjtd.a(dtxw.bJ);
                    break;
                case 5:
                    a2 = cjtd.a(dtxw.bF);
                    break;
                case 6:
                    a2 = cjtd.a(dtxw.bK);
                    break;
                case 7:
                    a2 = cjtd.a(dtxw.bO);
                    break;
                case 8:
                    a2 = cjtd.a(dtxw.bM);
                    break;
                case 9:
                default:
                    a2 = null;
                    break;
                case 10:
                    a2 = cjtd.a(dtxw.bN);
                    break;
            }
            if (l != null && a2 != null) {
                atus atusVar2 = this.d;
                if (dkxe.INCIDENT_SPEED_LIMIT.equals(b)) {
                    dbsgVar = dbsg.i(aryvVar);
                } else {
                    dbsgVar = dbpy.a;
                }
                atux atuxVar = new atux(this, b, b2);
                atus.a(c, 1);
                atus.a(dbsgVar, 2);
                atus.a(l, 3);
                atus.a(atuxVar, 4);
                atus.a(a2, 5);
                vtn a4 = atusVar2.a.a();
                atus.a(a4, 6);
                aturVar = new atur(c, dbsgVar, l, atuxVar, a2, a4);
            }
            if (aturVar != null) {
                dkxe b3 = dkxe.b(dkxfVar.b);
                dcdgVar.f(b3 == null ? dkxe.UNKNOWN_USER_INCIDENT_TYPE : b3, aturVar);
            }
        }
        this.C = dcdgVar.b();
        M(S(true).a());
        if (crqzVar.a) {
            this.D = new atti(btvoVar, (int) R.string.MIDTRIP_UGC_COOLDOWN_HEADER_TEXT, context.getString(R.string.MIDTRIP_UGC_COOLDOWN_TEXT), cqrt.i(iup.e(R.raw.ic_cooloff), iva.b(ire.g(), ire.c())), true, ak().booleanValue());
        }
    }

    @Override // defpackage.atss, defpackage.atxz
    public void Oa() {
        super.Oa();
        dqkr dqkrVar = ((crqz) this.e).d;
        dkxf d = dqkrVar != null ? auej.d(this.h, dqkrVar) : null;
        if (d == null) {
            EnumSet<?> I = this.b.I(bvjk.ja, dkxe.class);
            boolean z = false;
            for (dkxf dkxfVar : auej.c(this.h)) {
                dkxe b = dkxe.b(dkxfVar.b);
                if (b == null) {
                    b = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
                }
                if (!I.contains(b)) {
                    dkxe b2 = dkxe.b(dkxfVar.b);
                    if (b2 == null) {
                        b2 = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
                    }
                    I.add(b2);
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            this.b.aj(bvjk.ja, I);
            return;
        }
        dkxe b3 = dkxe.b(d.b);
        if (b3 == null) {
            b3 = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
        }
        dkxc b4 = dkxc.b(d.e);
        if (b4 == null) {
            b4 = dkxc.UNKNOWN_LABEL;
        }
        g(b3, b4);
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.REPORT_INCIDENT;
    }

    @Override // defpackage.atss, defpackage.atxz
    public boolean W() {
        return true;
    }

    @Override // defpackage.atss, defpackage.atxz
    public boolean X() {
        atti attiVar = this.D;
        return attiVar == null || attiVar.c() == null;
    }

    @Override // defpackage.atss, defpackage.atxz
    @dzsi
    public CharSequence Y() {
        if (((crqz) this.e).a) {
            atti attiVar = this.D;
            dbsk.s(attiVar);
            bvsi bvsiVar = new bvsi(this.j);
            bvsiVar.c(attiVar.a().a(this.f).toString());
            if (attiVar.c() != null) {
                bvsiVar.c(attiVar.c());
            }
            return bvsiVar.toString();
        }
        return super.Y();
    }

    @Override // defpackage.atyb
    @dzsi
    public atxr d() {
        return this.D;
    }

    @Override // defpackage.atyb
    public List<atxt> e() {
        return this.C.values().v();
    }

    @Override // defpackage.atyb
    @dzsi
    public atya f() {
        return this.E;
    }

    public final void g(dkxe dkxeVar, dkxc dkxcVar) {
        if (this.h.getUgcParameters().av()) {
            t();
            atxt atxtVar = this.C.get(dkxeVar);
            dbsk.s(atxtVar);
            cqtd a2 = atxtVar.a();
            atuw atuwVar = this.A;
            atuw.a(this, 1);
            atuw.a(dkxeVar, 2);
            atuw.a(a2, 3);
            atuw.a(dkxcVar, 4);
            dehq a3 = atuwVar.a.a();
            atuw.a(a3, 5);
            Executor a4 = atuwVar.b.a();
            atuw.a(a4, 6);
            crfl a5 = atuwVar.c.a();
            atuw.a(a5, 7);
            asbr a6 = atuwVar.d.a();
            atuw.a(a6, 8);
            this.E = new atuv(this, dkxeVar, a2, dkxcVar, a3, a4, a5, a6);
            cqkx.p(this);
        } else if (!this.c.a()) {
            p();
        } else {
            crfl crflVar = this.B;
            akra d = ((crqz) this.e).d();
            dqkr b = auej.b(dkxeVar);
            dbsk.s(b);
            crqz crqzVar = (crqz) this.e;
            aryv aryvVar = crqzVar.c;
            crflVar.h(d, b, Float.valueOf(crqzVar.i()), ((crqz) this.e).j());
            p();
        }
    }
}
