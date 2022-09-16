package defpackage;
/* compiled from: PG */
/* renamed from: sqr  reason: default package */
/* loaded from: classes4.dex */
public final class sqr implements sqh {
    private final sqj a;
    private final aotc b;
    private final spt c;

    public sqr(sqj sqjVar, aotc aotcVar, spt sptVar) {
        this.a = sqjVar;
        this.b = aotcVar;
        this.c = sptVar;
    }

    private final boolean b(aota aotaVar) {
        for (aosz aoszVar : new aops(aotaVar.c, aota.a)) {
            if (!this.a.a(aoszVar, this.c).a()) {
                return false;
            }
        }
        for (aotb aotbVar : aotaVar.d) {
            if (!c(aotbVar)) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(aotb aotbVar) {
        for (aosz aoszVar : new aops(aotbVar.c, aotb.a)) {
            if (this.a.a(aoszVar, this.c).a()) {
                return true;
            }
        }
        for (aota aotaVar : aotbVar.d) {
            if (b(aotaVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sqh
    public final boolean a() {
        aosz aoszVar;
        Boolean valueOf;
        aotc aotcVar = this.b;
        int i = aotcVar.b;
        if (i == 2) {
            valueOf = Boolean.valueOf(b((aota) aotcVar.c));
        } else if (i != 3) {
            sqj sqjVar = this.a;
            if (i == 1) {
                aoszVar = aosz.b(((Integer) aotcVar.c).intValue());
                if (aoszVar == null) {
                    aoszVar = aosz.CB_NONE;
                }
            } else {
                aoszVar = aosz.CB_NONE;
            }
            valueOf = Boolean.valueOf(sqjVar.a(aoszVar, this.c).a());
        } else {
            valueOf = Boolean.valueOf(c((aotb) aotcVar.c));
        }
        return valueOf.booleanValue();
    }
}
