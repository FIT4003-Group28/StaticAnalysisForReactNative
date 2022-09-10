package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aacu  reason: default package */
/* loaded from: classes2.dex */
public final class aacu {
    public final brpq<dilu, aacs> a;
    public final List<aact> b = new ArrayList();

    public aacu(dxio<akfa> dxioVar, btmv btmvVar, cqat cqatVar) {
        brpo brpoVar = new brpo(dxioVar, btmvVar, cqatVar);
        brpoVar.a = 10;
        brpoVar.b = "ExperienceCategorical";
        brpoVar.b(1800000L);
        this.a = brpoVar.a();
    }

    public static aacs c(dils dilsVar) {
        dprx dprxVar = dilsVar.b;
        if (dprxVar == null) {
            dprxVar = dprx.h;
        }
        if ((dprxVar.a & 2) == 0) {
            dprx dprxVar2 = dilsVar.b;
            if (dprxVar2 == null) {
                dprxVar2 = dprx.h;
            }
            dhjx dhjxVar = dilsVar.c;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            return new aacs(dprxVar2, akyx.m(dhjxVar));
        }
        dprx dprxVar3 = dilsVar.b;
        if (dprxVar3 == null) {
            dprxVar3 = dprx.h;
        }
        dprx dprxVar4 = dilsVar.b;
        if (dprxVar4 == null) {
            dprxVar4 = dprx.h;
        }
        dpuq dpuqVar = dprxVar4.c;
        if (dpuqVar == null) {
            dpuqVar = dpuq.d;
        }
        return new aacs(dprxVar3, new akqs(dpuqVar));
    }

    public final synchronized void a(aact aactVar) {
        this.b.remove(aactVar);
    }

    public final aacq b(aacn aacnVar) {
        aacs c = c(aacnVar.a());
        djmy djmyVar = aacnVar.a().d;
        if (djmyVar == null) {
            djmyVar = djmy.e;
        }
        djnk djnkVar = djmyVar.b;
        if (djnkVar == null) {
            djnkVar = djnk.f;
        }
        if (!djnkVar.c.isEmpty()) {
            return aacq.a;
        }
        dilu b = this.a.b(c);
        if (b != null) {
            return new aacq(deha.a(new aaco(b)));
        }
        for (aact aactVar : this.b) {
            if (c.a(aactVar.a).a()) {
                return new aacq(aactVar.b);
            }
        }
        return aacq.a;
    }
}
