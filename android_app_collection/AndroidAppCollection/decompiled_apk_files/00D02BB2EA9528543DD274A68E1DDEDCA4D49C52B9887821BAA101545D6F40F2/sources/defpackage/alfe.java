package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alfe  reason: default package */
/* loaded from: classes2.dex */
public final class alfe {
    private final Context a;
    private final akvz b;
    private final boolean c;
    @dzsi
    private final bvjj d;
    @dzsi
    private final btvo e;
    @dzsi
    private final cqat f;
    @dzsi
    private dkwv g;
    @dzsi
    private dcfc<Long> h;
    @dzsi
    private alfq i;

    public alfe(Context context, akvz akvzVar, boolean z, @dzsi bvjj bvjjVar, @dzsi btvo btvoVar, @dzsi cqat cqatVar) {
        this.a = context;
        this.b = akvzVar;
        this.c = z;
        this.i = new alfq(context, akvzVar, z);
        this.d = bvjjVar;
        this.e = btvoVar;
        if (btvoVar != null && (btvoVar.getUgcParameters().R().a & 2) != 0 && (btvoVar.getUgcParameters().R().a & 4) != 0) {
            dkwv R = btvoVar.getUgcParameters().R();
            this.g = R;
            this.h = dcfc.Q(dcbg.b(R.c).o(alfc.a).z());
        }
        this.f = cqatVar;
    }

    public static int a(dozz dozzVar, boolean z, boolean z2) {
        dozs dozsVar;
        if (dozzVar.b == 22) {
            dozsVar = (dozs) dozzVar.c;
        } else {
            dozsVar = dozs.q;
        }
        dgas dgasVar = dozsVar.d;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        int i = -dgasVar.b;
        int i2 = 1;
        if (z && z2) {
            i2 = 10000;
        }
        return i * i2;
    }

    public final dmpn b(int i, boolean z, String str) {
        String str2;
        if (i > 0) {
            Context context = this.a;
            str2 = context.getString(R.string.JAMCIDENT_DELAY_TIME, bvtb.e(context.getResources(), i, bvsz.ABBREVIATED).toString());
        } else {
            str2 = null;
        }
        return e(z, str, null, str2, null);
    }

    public final dmpn c(long j, boolean z, String str, @dzsi akra akraVar) {
        btvo btvoVar;
        dcfc<Long> dcfcVar;
        String string;
        String str2;
        if (j < 1 || (btvoVar = this.e) == null || auej.c(btvoVar).isEmpty() || !this.e.getUgcParameters().aj() || this.g == null || (dcfcVar = this.h) == null || this.d == null || this.f == null) {
            return e(z, str, null, null, akraVar);
        }
        Long valueOf = Long.valueOf(j);
        dbsg j2 = dbsg.j(dcfcVar.floor(valueOf));
        long longValue = ((Long) j2.c(valueOf)).longValue();
        bvjj bvjjVar = this.d;
        dbsk.s(bvjjVar);
        List<String> F = bvjjVar.F(bvjk.jB, new ArrayList());
        int size = F.size();
        dkwv dkwvVar = this.g;
        dbsk.s(dkwvVar);
        if (size < dkwvVar.b) {
            string = this.a.getString(true != j2.a() ? R.string.INCIDENT_VOTE_COUNT_LONG : R.string.INCIDENT_VOTE_COUNT_BUCKET_LONG, Long.valueOf(longValue));
            cqat cqatVar = this.f;
            dbsk.s(cqatVar);
            long b = cqatVar.b();
            final long millis = b - TimeUnit.DAYS.toMillis(1L);
            if (!dcbg.b(F).p(new dbsl(millis) { // from class: alfd
                private final long a;

                {
                    this.a = millis;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return Long.parseLong((String) obj) > this.a;
                }
            })) {
                F.add(Long.toString(b));
                bvjj bvjjVar2 = this.d;
                dbsk.s(bvjjVar2);
                bvjjVar2.ah(bvjk.jB, F);
            }
        } else {
            string = j2.a() ? this.a.getString(R.string.INCIDENT_VOTE_COUNT_BUCKET_SHORT, Long.valueOf(longValue)) : Long.toString(longValue);
        }
        String str3 = string;
        if (this.c) {
            dkwv dkwvVar2 = this.g;
            dbsk.s(dkwvVar2);
            str2 = dkwvVar2.e;
        } else {
            dkwv dkwvVar3 = this.g;
            dbsk.s(dkwvVar3);
            str2 = dkwvVar3.d;
        }
        return e(z, str, str2, str3, akraVar);
    }

    public final dmpn d(boolean z, String str) {
        return e(z, str, null, null, null);
    }

    public final synchronized dmpn e(boolean z, String str, @dzsi String str2, @dzsi String str3, @dzsi akra akraVar) {
        return f(z, str, str2, str3, akraVar, true);
    }

    public final synchronized dmpn f(boolean z, String str, @dzsi String str2, @dzsi String str3, @dzsi akra akraVar, Boolean bool) {
        akuh a;
        alfq alfqVar = this.i;
        if (alfqVar == null) {
            return dmpn.r;
        }
        alfp alfpVar = z ? alfp.CAR : alfp.PHONE;
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        if (alfqVar.i) {
            bvoo.h("Attempted to use Jamcident Callout background style after it has been destroyed.", new Object[0]);
        }
        int a2 = alfqVar.j.a().a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a2;
        dccx F = dcdc.F();
        F.g(alfqVar.b(str, alfpVar.d).e());
        if (str3 != null) {
            if (alfqVar.i) {
                bvoo.h("Attempted to use Jamcident Callout spacer style after it has been destroyed.", new Object[0]);
            }
            dmpc e = alfqVar.k.a().e();
            if (e.c) {
                e.bF();
                e.c = false;
            }
            dmpd dmpdVar = (dmpd) e.b;
            dmpd dmpdVar2 = dmpd.h;
            dmpdVar.a |= 1;
            dmpdVar.b = " ";
            F.g(e);
            if (str2 != null) {
                F.g(alfqVar.b(str2, alfpVar.e).e());
                dmpc e2 = alfqVar.a(alfpVar).e();
                if (e2.c) {
                    e2.bF();
                    e2.c = false;
                }
                dmpd dmpdVar3 = (dmpd) e2.b;
                str3.getClass();
                dmpdVar3.a |= 1;
                dmpdVar3.b = str3;
                F.g(e2);
            } else if (bool.booleanValue()) {
                if (alfqVar.i) {
                    bvoo.h("Attempted to use Jamcident Callout text style after it has been destroyed.", new Object[0]);
                }
                int ordinal = alfpVar.ordinal();
                if (ordinal == 0) {
                    a = alfqVar.m.a();
                } else if (ordinal == 1) {
                    a = alfqVar.l.a();
                } else {
                    bvoo.h("Attempt to create a style for an unsupported style type: %s", alfpVar);
                    a = alfqVar.n.a();
                }
                dmpc e3 = a.e();
                if (e3.c) {
                    e3.bF();
                    e3.c = false;
                }
                dmpd dmpdVar4 = (dmpd) e3.b;
                str3.getClass();
                dmpdVar4.a |= 1;
                dmpdVar4.b = str3;
                F.g(e3);
            } else {
                dmpc e4 = alfqVar.a(alfpVar).e();
                if (e4.c) {
                    e4.bF();
                    e4.c = false;
                }
                dmpd dmpdVar5 = (dmpd) e4.b;
                str3.getClass();
                dmpdVar5.a |= 1;
                dmpdVar5.b = str3;
                F.g(e4);
            }
        }
        dcdc SL = bvox.b(this.a) ? F.f().SL() : F.f();
        int size = SL.size();
        for (int i = 0; i < size; i++) {
            dmpeVar.b((dmpc) SL.get(i));
        }
        dmlp bZ = dmlq.e.bZ();
        dmlo dmloVar = alfq.c.get(0);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        dmlqVar.c = dmloVar.j;
        dmlqVar.a |= 2;
        if (akraVar != null) {
            dmls a3 = akxh.a(akraVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar2 = (dmlq) bZ.b;
            a3.getClass();
            dmlqVar2.b = a3;
            dmlqVar2.a |= 1;
        }
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar2 = (dmph) dmpeVar.bK();
        dmphVar2.getClass();
        dmpnVar.b = dmphVar2;
        dmpnVar.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar2.d = bK;
        dmpnVar2.a |= 4;
        return (dmpn) dmpkVar.bK();
    }

    public final synchronized void g() {
        if (this.i == null) {
            this.i = new alfq(this.a, this.b, this.c);
        }
    }

    public final synchronized void h() {
        alfq alfqVar = this.i;
        if (alfqVar != null) {
            if (!alfqVar.i) {
                for (akuh akuhVar : alfqVar.g) {
                    alfqVar.d.j(akuhVar);
                }
                alfqVar.g.clear();
                alfqVar.h.clear();
                alfqVar.i = true;
            }
            this.i = null;
        }
    }
}
