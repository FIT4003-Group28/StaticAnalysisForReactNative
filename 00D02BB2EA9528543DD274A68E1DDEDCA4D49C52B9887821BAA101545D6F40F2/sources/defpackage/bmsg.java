package defpackage;
/* compiled from: PG */
/* renamed from: bmsg  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmsg {
    public static bmsg d(String str, eapd eapdVar, dtcc dtccVar) {
        dbsk.a(!str.isEmpty());
        dtcg dtcgVar = dtccVar.b;
        if (dtcgVar == null) {
            dtcgVar = dtcg.g;
        }
        dtce dtceVar = dtcgVar.c;
        if (dtceVar == null) {
            dtceVar = dtce.c;
        }
        e(dtceVar);
        dtcg dtcgVar2 = dtccVar.b;
        if (dtcgVar2 == null) {
            dtcgVar2 = dtcg.g;
        }
        dtck dtckVar = dtcgVar2.d;
        if (dtckVar == null) {
            dtckVar = dtck.e;
        }
        f(dtckVar);
        dtbu dtbuVar = dtccVar.c;
        if (dtbuVar == null) {
            dtbuVar = dtbu.e;
        }
        dtbw dtbwVar = dtbuVar.b;
        if (dtbwVar == null) {
            dtbwVar = dtbw.e;
        }
        g(dtbwVar);
        dtbu dtbuVar2 = dtccVar.c;
        if (dtbuVar2 == null) {
            dtbuVar2 = dtbu.e;
        }
        dtby dtbyVar = dtbuVar2.c;
        if (dtbyVar == null) {
            dtbyVar = dtby.d;
        }
        h(dtbyVar);
        return new bmry(str, eapdVar, dtccVar);
    }

    public static int e(dtce dtceVar) {
        int size = dtceVar.b.size();
        dbsk.a(size == dtceVar.a.size());
        return size;
    }

    public static int f(dtck dtckVar) {
        int size = dtckVar.b.size();
        boolean z = true;
        dbsk.a(size == dtckVar.d.size());
        if (size != dtckVar.c.size()) {
            z = false;
        }
        dbsk.a(z);
        return size;
    }

    public static int g(dtbw dtbwVar) {
        int size = dtbwVar.a.size();
        boolean z = true;
        dbsk.a(size == dtbwVar.b.size());
        dbsk.a(size == dtbwVar.c.size());
        if (size != dtbwVar.d.size()) {
            z = false;
        }
        dbsk.a(z);
        return size;
    }

    public static int h(dtby dtbyVar) {
        int size = dtbyVar.a.size();
        boolean z = true;
        dbsk.a(size == dtbyVar.c.size());
        if (size != dtbyVar.b.size()) {
            z = false;
        }
        dbsk.a(z);
        return size;
    }

    public static dpon i(dtca dtcaVar) {
        dpom bZ = dpon.d.bZ();
        dstv dstvVar = dtcaVar.b;
        if (dstvVar == null) {
            dstvVar = dstv.c;
        }
        long b = dsvb.b(dstvVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpon dponVar = (dpon) bZ.b;
        dponVar.a |= 1;
        dponVar.b = b;
        dstv dstvVar2 = dtcaVar.c;
        if (dstvVar2 == null) {
            dstvVar2 = dstv.c;
        }
        long b2 = dsvb.b(dstvVar2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpon dponVar2 = (dpon) bZ.b;
        dponVar2.a |= 2;
        dponVar2.c = b2;
        return bZ.bK();
    }

    public abstract String a();

    public abstract eapd b();

    public abstract dtcc c();
}
