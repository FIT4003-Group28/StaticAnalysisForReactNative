package defpackage;
/* compiled from: PG */
/* renamed from: byuo  reason: default package */
/* loaded from: classes4.dex */
public final class byuo {
    private final bwqv a;
    private bzig b;

    public byuo(bwqv bwqvVar) {
        this.a = bwqvVar;
    }

    private final synchronized void c() {
        bvrj.UI_THREAD.d();
        if (this.b == null) {
            bzig bzigVar = (bzig) this.a.j(bwrj.SELECTED_STATION, (dssr) bzig.i.cu(7));
            if (bzigVar == null) {
                bzigVar = bzig.i;
            }
            dbsk.s(bzigVar);
            this.b = bzigVar;
        }
    }

    public final synchronized void a() {
        this.b = bzig.i;
        this.a.s(bwrj.SELECTED_STATION, this.b);
    }

    public final synchronized void b(String str, akqq akqqVar, float f, boolean z) {
        c();
        if (!z) {
            bzib bZ = bzig.i.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bzig bzigVar = (bzig) bZ.b;
            str.getClass();
            bzigVar.a |= 1;
            bzigVar.b = str;
            dpum h = akqqVar.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bzig bzigVar2 = (bzig) bZ.b;
            h.getClass();
            bzigVar2.c = h;
            int i = bzigVar2.a | 4;
            bzigVar2.a = i;
            int i2 = i | 8;
            bzigVar2.a = i2;
            bzigVar2.d = f;
            bzigVar2.a = i2 | 64;
            bzigVar2.g = false;
            this.b = bZ.bK();
        }
        this.a.s(bwrj.SELECTED_STATION, this.b);
    }
}
