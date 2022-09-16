package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: odh  reason: default package */
/* loaded from: classes3.dex */
public final class odh extends lpi implements odd, ynl {
    public int a;
    private List b;
    private int c;

    public odh(abeb abebVar, ajyi ajyiVar, yni yniVar, yzj yzjVar, acti actiVar, ajxt ajxtVar, ajin ajinVar, snc sncVar, iub iubVar, ampq ampqVar) {
        super(ajyiVar, yniVar, yzjVar, ajinVar, sncVar, iubVar, ampqVar, ajxtVar, abebVar, actiVar, null);
    }

    public static boolean r(aakq aakqVar) {
        if (aakqVar != null) {
            aslq aslqVar = aakqVar.a;
            if ((aslqVar.c & 8) != 0 && aslqVar.h.equals("related-items")) {
                return true;
            }
        }
        return false;
    }

    private final void s() {
        this.b = null;
        this.a = 0;
        this.c = 0;
    }

    @Override // defpackage.odd
    public final int b() {
        return this.a;
    }

    @Override // defpackage.odd
    public final int e() {
        return this.c;
    }

    @Override // defpackage.odd
    public final void g() {
        List list = this.b;
        if (list != null) {
            ajsm ajsmVar = this.i;
            ajsmVar.clear();
            ajsmVar.addAll(list);
            this.b = null;
        }
        this.a++;
    }

    @Override // defpackage.odd
    public final void h() {
        if (this.b == null) {
            this.b = new ArrayList();
            this.i.k(this.b);
        }
        for (int i = 0; i < this.i.size(); i++) {
            Object obj = this.i.get(i);
            if (!(obj instanceof ezy) && !(obj instanceof aumr)) {
                I(obj, new ezy(i));
            }
        }
        this.a++;
    }

    @Override // defpackage.lpi, defpackage.ajyq
    public final void i(aakq aakqVar) {
        super.i(aakqVar);
        aslq aslqVar = aakqVar.a;
        int i = 1;
        if ((aslqVar.c & 1) != 0) {
            aslo asloVar = aslqVar.d;
            if (asloVar == null) {
                asloVar = aslo.a;
            }
            if ((asloVar.b & 128) == 0) {
                return;
            }
            aslo asloVar2 = aslqVar.d;
            if (asloVar2 == null) {
                asloVar2 = aslo.a;
            }
            aumr aumrVar = asloVar2.j;
            if (aumrVar == null) {
                aumrVar = aumr.a;
            }
            if (!this.i.contains(aumrVar) || (aumrVar.b & 2) == 0) {
                return;
            }
            ajsm ajsmVar = this.i;
            int bv = awwc.bv(aumrVar.d);
            if (bv != 0) {
                i = bv;
            }
            ajsmVar.mG(new ode(this, i));
        }
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.zdx
    public final void j() {
        super.j();
        s();
    }

    @Override // defpackage.odd
    public final void k(int i) {
        this.c = i;
    }

    @Override // defpackage.ajxl
    public final void lB() {
        super.lB();
        s();
    }

    @Override // defpackage.lpi, defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == odh.class) {
            switch (i) {
                case -1:
                    return new Class[]{isw.class, aabk.class, aabm.class, aawi.class, aawj.class, ajym.class};
                case 0:
                    n((isw) obj);
                    return null;
                case 1:
                    nn((aabk) obj);
                    return null;
                case 2:
                    no((aabm) obj);
                    return null;
                case 3:
                    N((aawi) obj);
                    return null;
                case 4:
                    o((aawj) obj);
                    return null;
                case 5:
                    M((ajym) obj);
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.ky(cls, obj, i);
    }
}
