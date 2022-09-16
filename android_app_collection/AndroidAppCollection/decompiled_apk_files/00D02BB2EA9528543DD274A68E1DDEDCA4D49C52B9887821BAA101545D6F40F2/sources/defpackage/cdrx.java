package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdrx  reason: default package */
/* loaded from: classes4.dex */
public final class cdrx implements cdjb {
    final /* synthetic */ cdsa a;

    public cdrx(cdsa cdsaVar) {
        this.a = cdsaVar;
    }

    @Override // defpackage.cdjb
    public final dbsg<String> a() {
        String str;
        dmbu dmbuVar = this.a.j().c;
        if (dmbuVar == null) {
            dmbuVar = dmbu.i;
        }
        if ((dmbuVar.a & 4) != 0) {
            dmbu dmbuVar2 = this.a.j().c;
            if (dmbuVar2 == null) {
                dmbuVar2 = dmbu.i;
            }
            str = dmbuVar2.c;
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    @Override // defpackage.cdjb
    public final dbsg<cdis> b() {
        return this.a.d;
    }

    @Override // defpackage.cdjb
    public final cdja c() {
        dmbu dmbuVar = this.a.j().c;
        if (dmbuVar == null) {
            dmbuVar = dmbu.i;
        }
        int a = dmbt.a(dmbuVar.d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 == 2) {
            return cdja.DRAFT;
        }
        return cdja.PUBLISHED;
    }

    @Override // defpackage.cdjb
    public final String d() {
        dmbu dmbuVar = this.a.j().c;
        if (dmbuVar == null) {
            dmbuVar = dmbu.i;
        }
        return dmbuVar.h;
    }

    @Override // defpackage.cdjb
    public final eapd e() {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        dmbu dmbuVar = this.a.j().c;
        if (dmbuVar == null) {
            dmbuVar = dmbu.i;
        }
        return new eapd(timeUnit.toMillis(dmbuVar.g));
    }

    @Override // defpackage.cdjb
    public final dbsg<String> f() {
        String str;
        dmaw dmawVar = this.a.j().e;
        if (dmawVar == null) {
            dmawVar = dmaw.n;
        }
        if (dmawVar.b == 11) {
            dmaw dmawVar2 = this.a.j().e;
            if (dmawVar2 == null) {
                dmawVar2 = dmaw.n;
            }
            str = dmawVar2.b == 11 ? (String) dmawVar2.c : "";
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    @Override // defpackage.cdjb
    public final String g() {
        return this.a.j().b;
    }

    @Override // defpackage.cdjb
    public final dbsg<String> h() {
        return dbsg.j((this.a.j().a & 32) != 0 ? this.a.j().g : null);
    }
}
