package defpackage;
/* compiled from: PG */
/* renamed from: adfb  reason: default package */
/* loaded from: classes.dex */
public class adfb extends aczs implements adey {
    public final adfa a;
    public final btrm b;
    @dzsi
    private final abkm c;
    @dzsi
    private String d;
    private final gh e;

    public adfb(btrm btrmVar, abtz abtzVar, ff ffVar, acwt acwtVar) {
        adfa adfaVar = new adfa(this);
        this.a = adfaVar;
        adez adezVar = new adez(this);
        this.e = adezVar;
        this.b = btrmVar;
        this.c = abtzVar.a(false, dtxr.v, acwtVar, absg.HOME_SCREEN_EXPLORE_TAB);
        adfaVar.a();
        ffVar.g().am(adezVar, false);
    }

    @Override // defpackage.adey
    @dzsi
    public abkm a() {
        return this.c;
    }

    public boolean b() {
        return this.c != null;
    }

    public void c(@dzsi dvha dvhaVar) {
        akqi akqiVar;
        if (this.c != null) {
            String str = null;
            String str2 = (dvhaVar == null || (dvhaVar.a & 4) == 0) ? null : dvhaVar.d;
            if (dvhaVar == null || (dvhaVar.a & 8) == 0) {
                akqiVar = null;
            } else {
                dpsn dpsnVar = dvhaVar.e;
                if (dpsnVar == null) {
                    dpsnVar = dpsn.d;
                }
                long j = dpsnVar.b;
                dpsn dpsnVar2 = dvhaVar.e;
                if (dpsnVar2 == null) {
                    dpsnVar2 = dpsn.d;
                }
                akqiVar = new akqi(j, dpsnVar2.c);
            }
            abkm abkmVar = this.c;
            dbsk.s(abkmVar);
            abkmVar.a(str2, akqiVar);
            if (dvhaVar != null && (dvhaVar.a & 1) != 0) {
                str = dvhaVar.b;
            }
            this.d = str;
            cqkx.p(this);
        }
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.d);
        b.d = dtxr.T;
        return b.a();
    }

    public void f(boolean z) {
        abkm abkmVar = this.c;
        if (abkmVar != null) {
            abkmVar.h(z);
            cqkx.p(this);
        }
    }

    public void g(@dzsi dvjb dvjbVar) {
        abkm abkmVar;
        if (dvjbVar == null || (abkmVar = this.c) == null) {
            return;
        }
        abkmVar.c(dvjbVar.c);
    }
}
