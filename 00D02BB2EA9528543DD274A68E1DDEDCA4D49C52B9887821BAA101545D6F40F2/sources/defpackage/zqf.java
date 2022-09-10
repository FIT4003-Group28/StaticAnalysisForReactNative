package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: zqf  reason: default package */
/* loaded from: classes7.dex */
public class zqf implements Comparable<zqf>, zfk {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final cqtd e;
    private final int f;
    private final boolean g;
    private final dxio<afha> h;
    private final boolean i;
    private final Runnable j;
    private final dnpq k;

    public zqf(gga ggaVar, bvsl bvslVar, vtn vtnVar, dxio<afha> dxioVar, btvo btvoVar, dozz dozzVar, Runnable runnable, boolean z) {
        int i;
        dozs dozsVar;
        dnpq dnpqVar;
        doyy doyyVar;
        dozs dozsVar2;
        doyy doyyVar2;
        this.j = runnable;
        this.g = z;
        this.h = dxioVar;
        this.i = btvoVar.getDirectionsPageParameters().H;
        this.e = yzx.a(dozzVar, vtnVar, vyt.g);
        dozy dozyVar = dozy.UNKNOWN;
        dozy b = dozy.b(dozzVar.f);
        int ordinal = (b == null ? dozy.UNKNOWN : b).ordinal();
        String p = (ordinal == 20 || ordinal == 30) ? alca.p(dozzVar) : dozzVar.g;
        this.a = p;
        dozy b2 = dozy.b(dozzVar.f);
        int ordinal2 = (b2 == null ? dozy.UNKNOWN : b2).ordinal();
        if (ordinal2 == 20 || ordinal2 == 30) {
            String q = alca.q(dozzVar);
            if (!q.isEmpty()) {
                p = q;
            }
        } else {
            p = dozzVar.g;
        }
        this.b = p;
        dozy b3 = dozy.b(dozzVar.f);
        int ordinal3 = (b3 == null ? dozy.UNKNOWN : b3).ordinal();
        String str = "";
        this.c = (ordinal3 == 20 || ordinal3 == 30) ? alca.r(dozzVar) : str;
        dozy b4 = dozy.b(dozzVar.f);
        int ordinal4 = (b4 == null ? dozy.UNKNOWN : b4).ordinal();
        if (ordinal4 == 4) {
            i = -1;
        } else if (ordinal4 == 20) {
            if (dozzVar.b == 22) {
                dozsVar2 = (dozs) dozzVar.c;
            } else {
                dozsVar2 = dozs.q;
            }
            dowb dowbVar = dozsVar2.f;
            i = (dowbVar == null ? dowb.d : dowbVar).b;
        } else if (ordinal4 != 30) {
            i = Integer.MAX_VALUE;
        } else {
            if (dozzVar.b == 30) {
                doyyVar2 = (doyy) dozzVar.c;
            } else {
                doyyVar2 = doyy.d;
            }
            dowb dowbVar2 = doyyVar2.a;
            i = (dowbVar2 == null ? dowb.d : dowbVar2).b;
        }
        this.f = i;
        Resources resources = ggaVar.getResources();
        dozy b5 = dozy.b(dozzVar.f);
        int ordinal5 = (b5 == null ? dozy.UNKNOWN : b5).ordinal();
        if (ordinal5 == 20) {
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            dowb dowbVar3 = dozsVar.f;
            str = bynw.b(resources, bvslVar, dowbVar3 == null ? dowb.d : dowbVar3);
        } else if (ordinal5 == 30) {
            if (dozzVar.b == 30) {
                doyyVar = (doyy) dozzVar.c;
            } else {
                doyyVar = doyy.d;
            }
            dowb dowbVar4 = doyyVar.a;
            str = bynw.b(resources, bvslVar, dowbVar4 == null ? dowb.d : dowbVar4);
        }
        this.d = str;
        if ((dozzVar.a & 128) != 0) {
            dnpqVar = dozzVar.j;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
        } else {
            dnpqVar = null;
        }
        this.k = dnpqVar;
    }

    @Override // defpackage.zfk
    public String a() {
        return this.a;
    }

    @Override // defpackage.zfk
    public String b() {
        return this.b;
    }

    @Override // defpackage.zfk
    public String c() {
        return this.c;
    }

    @Override // defpackage.zfk
    public Boolean d() {
        return Boolean.valueOf(!dbsj.d(this.c));
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        Runnable runnable = this.j;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.zfk
    public String g() {
        return this.d;
    }

    @Override // defpackage.zfk
    public Boolean h() {
        return Boolean.valueOf(!dbsj.d(this.d));
    }

    @Override // defpackage.zfk
    public cqtd i() {
        return this.e;
    }

    @Override // defpackage.zfk
    public Boolean j() {
        dnpq dnpqVar;
        boolean z = false;
        if (this.i && !this.g && (dnpqVar = this.k) != null && !dnpqVar.c.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zfk
    public String k() {
        dnpq dnpqVar = this.k;
        return dnpqVar != null ? dnpqVar.d.isEmpty() ? this.k.c : this.k.d : "";
    }

    @Override // defpackage.zfk
    public cqkl l() {
        dnpq dnpqVar = this.k;
        if (dnpqVar != null) {
            this.h.a().m(dnpqVar.c, 4);
        }
        return cqkl.a;
    }

    @Override // defpackage.zfk
    public cjtd m() {
        return cjtd.a(dtxn.bD);
    }

    @Override // java.lang.Comparable
    /* renamed from: n */
    public int compareTo(zqf zqfVar) {
        int i = this.f;
        int i2 = zqfVar.f;
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }
}
