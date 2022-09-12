package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: awnr  reason: default package */
/* loaded from: classes.dex */
public final class awnr extends itb implements awnv {
    public final gga a;
    public final dxio<ammc> b;
    public final asik c;
    @dzsi
    ArrayList<String> f;
    private final bvrb g;
    private final btrm h;
    private final dxio<bzmm> i;
    private final dxio<awnu> j;
    private final dxio<akct> k;
    private final dxio<awbl> o;
    private final dxio<bycq> p;
    private final dxio<awnu> q;
    private final dxio<cjnv> r;
    @dzsi
    private Runnable s;
    public boolean d = false;
    public boolean e = false;
    private final awnq t = new awnq(this);

    public awnr(gga ggaVar, bvrb bvrbVar, btrm btrmVar, dxio<ammc> dxioVar, dxio<bzmm> dxioVar2, dxio<akct> dxioVar3, dxio<awbl> dxioVar4, dxio<bycq> dxioVar5, dxio<awnu> dxioVar6, dxio<cjnv> dxioVar7, dxio<awnu> dxioVar8, asik asikVar) {
        this.a = ggaVar;
        this.g = bvrbVar;
        this.h = btrmVar;
        this.b = dxioVar;
        this.i = dxioVar2;
        this.k = dxioVar3;
        this.o = dxioVar4;
        this.p = dxioVar5;
        this.q = dxioVar6;
        this.r = dxioVar7;
        this.j = dxioVar8;
        this.c = asikVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        btrm btrmVar = this.h;
        awnq awnqVar = this.t;
        dceq a = dcet.a();
        a.b(asin.class, new awns(asin.class, awnqVar, bvrj.UI_THREAD));
        btrmVar.g(awnqVar, a.a());
    }

    @Override // defpackage.itb
    public final void Nu() {
        super.Nu();
        this.h.a(this.t);
    }

    @Override // defpackage.awnv
    public final void e(@dzsi Runnable runnable, @dzsi Runnable runnable2) {
        this.s = runnable2;
        this.d = false;
        this.g.b(new awno(this, runnable), bvrj.UI_THREAD);
    }

    @Override // defpackage.awnv
    public final void f() {
        this.g.b(new awnp(this), bvrj.UI_THREAD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0.equals("area_traffic") != false) goto L10;
     */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ggg i() {
        /*
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.f
            r1 = 0
            if (r0 == 0) goto Ld8
        L5:
            java.util.ArrayList<java.lang.String> r0 = r5.f
            defpackage.dbsk.s(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld8
            java.util.ArrayList<java.lang.String> r0 = r5.f
            r2 = 0
            java.lang.Object r0 = r0.remove(r2)
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r0.hashCode()
            switch(r3) {
                case -1923018202: goto L5c;
                case -1548612125: goto L52;
                case 115899: goto L48;
                case 103149417: goto L3e;
                case 110250375: goto L34;
                case 335592523: goto L2b;
                case 566378053: goto L21;
                default: goto L20;
            }
        L20:
            goto L66
        L21:
            java.lang.String r2 = "traffic_to_place"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L66
            r2 = 5
            goto L67
        L2b:
            java.lang.String r3 = "area_traffic"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L66
            goto L67
        L34:
            java.lang.String r2 = "terms"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L66
            r2 = 4
            goto L67
        L3e:
            java.lang.String r2 = "login"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L66
            r2 = 2
            goto L67
        L48:
            java.lang.String r2 = "ulr"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L66
            r2 = 6
            goto L67
        L52:
            java.lang.String r2 = "offline"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L66
            r2 = 3
            goto L67
        L5c:
            java.lang.String r2 = "confidentiality"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L66
            r2 = 1
            goto L67
        L66:
            r2 = -1
        L67:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto Laa;
                case 2: goto La1;
                case 3: goto L98;
                case 4: goto L8f;
                case 5: goto L86;
                case 6: goto L7d;
                default: goto L6a;
            }
        L6a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Unknown fragment name "
            int r4 = r0.length()
            if (r4 == 0) goto Lb5
            java.lang.String r0 = r3.concat(r0)
            goto Lba
        L7d:
            dxio<cjnv> r0 = r5.r
            java.lang.Object r0 = r0.a()
            awnu r0 = (defpackage.awnu) r0
            goto Lc1
        L86:
            dxio<awnu> r0 = r5.q
            java.lang.Object r0 = r0.a()
            awnu r0 = (defpackage.awnu) r0
            goto Lc1
        L8f:
            dxio<bycq> r0 = r5.p
            java.lang.Object r0 = r0.a()
            awnu r0 = (defpackage.awnu) r0
            goto Lc1
        L98:
            dxio<awbl> r0 = r5.o
            java.lang.Object r0 = r0.a()
            awnu r0 = (defpackage.awnu) r0
            goto Lc1
        La1:
            dxio<akct> r0 = r5.k
            java.lang.Object r0 = r0.a()
            awnu r0 = (defpackage.awnu) r0
            goto Lc1
        Laa:
            r0 = r1
            goto Lc1
        Lac:
            dxio<awnu> r0 = r5.j
            java.lang.Object r0 = r0.a()
            awnu r0 = (defpackage.awnu) r0
            goto Lc1
        Lb5:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        Lba:
            r2.<init>(r0)
            defpackage.bvoo.f(r2)
            goto Laa
        Lc1:
            if (r0 == 0) goto L5
            dxio<bzmm> r2 = r5.i
            java.lang.Object r2 = r2.a()
            bzmm r2 = (defpackage.bzmm) r2
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L5
            ggg r0 = r0.g()
            if (r0 == 0) goto L5
            return r0
        Ld8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awnr.i():ggg");
    }

    @Override // defpackage.awnv
    public final boolean j() {
        return this.d;
    }

    @Override // defpackage.awnv
    public final void k(Bundle bundle) {
        bundle.putStringArrayList("displayedFragments", this.f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.awnv
    public final void l(Bundle bundle) {
        char c;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("displayedFragments");
        this.f = stringArrayList;
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                switch (next.hashCode()) {
                    case -1923018202:
                        if (next.equals("confidentiality")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1548612125:
                        if (next.equals("offline")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115899:
                        if (next.equals("ulr")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 103149417:
                        if (next.equals("login")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110250375:
                        if (next.equals("terms")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 335592523:
                        if (next.equals("area_traffic")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 566378053:
                        if (next.equals("traffic_to_place")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        it.remove();
                        break;
                }
            }
        }
    }

    public final void m() {
        Runnable runnable = this.s;
        if (runnable != null) {
            runnable.run();
        }
        this.f = null;
        this.d = true;
        this.h.b(new awnt());
    }
}
