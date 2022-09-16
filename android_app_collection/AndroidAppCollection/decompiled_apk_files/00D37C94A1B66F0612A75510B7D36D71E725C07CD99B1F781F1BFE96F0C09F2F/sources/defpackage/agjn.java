package defpackage;
/* compiled from: PG */
/* renamed from: agjn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agjn implements Runnable {
    public final /* synthetic */ agjz a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ agjn(agjz agjzVar, String str) {
        this.a = agjzVar;
        this.b = str;
    }

    public /* synthetic */ agjn(agjz agjzVar, String str, int i) {
        this.c = i;
        this.a = agjzVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agqv p;
        agqv p2;
        agqu agquVar;
        int i = this.c;
        if (i == 0) {
            agjz agjzVar = this.a;
            String str = this.b;
            if (!agjzVar.h.z() || (p = ((aglj) agjzVar.k.get()).p(str)) == null || !p.A()) {
                return;
            }
            ylr.b();
            ((aglj) agjzVar.k.get()).V(str, agqe.PAUSED);
            agkg agkgVar = (agkg) agjzVar.l.get();
            ylr.b();
            agkgVar.c.j(agkgVar.c(str), 128);
            agkgVar.c.i(agkgVar.b(str));
            agjzVar.t(str);
        } else if (i == 1) {
            agjz agjzVar2 = this.a;
            String str2 = this.b;
            ylr.b();
            if (((aglj) agjzVar2.k.get()).E(str2)) {
                agjzVar2.q(str2);
                agjzVar2.o();
                return;
            }
            agjzVar2.p(str2, 2);
        } else if (i == 2) {
            agjz agjzVar3 = this.a;
            String str3 = this.b;
            if (!agjzVar3.h.z()) {
                return;
            }
            agjzVar3.G(str3, 2);
        } else if (i == 3) {
            agjz agjzVar4 = this.a;
            String str4 = this.b;
            if (!agjzVar4.h.z() || (p2 = ((aglj) agjzVar4.k.get()).p(str4)) == null || !p2.C()) {
                return;
            }
            ylr.b();
            ((aglj) agjzVar4.k.get()).V(str4, agqe.ACTIVE);
            if (p2.o == null) {
                agjzVar4.A(str4, null, p2.m);
            } else {
                agkg agkgVar2 = (agkg) agjzVar4.l.get();
                ylr.b();
                agkgVar2.c.l(agkgVar2.b(str4));
            }
            agjzVar4.t(str4);
        } else if (i == 4) {
            agjz agjzVar5 = this.a;
            String str5 = this.b;
            agkg agkgVar3 = (agkg) agjzVar5.l.get();
            agkgVar3.c.m(agkgVar3.b(str5));
        } else if (i == 5) {
            agjz agjzVar6 = this.a;
            String str6 = this.b;
            agqv p3 = ((aglj) agjzVar6.k.get()).p(str6);
            if (p3 == null || (agquVar = p3.j) == null) {
                return;
            }
            if (!agquVar.e()) {
                agjzVar6.C(p3);
            } else {
                agjzVar6.t(str6);
            }
        } else {
            agjz agjzVar7 = this.a;
            String str7 = this.b;
            if (!agjzVar7.h.z()) {
                return;
            }
            agjzVar7.G(str7, 1);
        }
    }
}
