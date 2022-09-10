package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zqa  reason: default package */
/* loaded from: classes7.dex */
public class zqa implements zff {
    public final List<zqy> a;
    private final Context b;
    private final buti c;
    private final List<zfk> d;
    private final List<zfk> e;
    private final boolean f;
    private boolean g;
    private final zqc h;
    private final boolean i;
    private final Executor j;
    @dzsi
    private final ybi k;
    @dzsi
    private final zsd l;
    @dzsi
    private final zhw m;
    @dzsi
    private final zme n;
    @dzsi
    private final zmf o;
    @dzsi
    private final zmd p;
    @dzsi
    private final zcp q;
    @dzsi
    private final jad r;

    public zqa(Context context, buti butiVar, List<zqy> list, List<zfk> list2, List<zfk> list3, zqc zqcVar, boolean z, @dzsi ybi ybiVar, @dzsi zsd zsdVar, @dzsi zhw zhwVar, @dzsi zme zmeVar, @dzsi zmf zmfVar, @dzsi zmd zmdVar, @dzsi zcp zcpVar, @dzsi jad jadVar, @dzsi zeb zebVar, Executor executor) {
        this.b = context;
        this.c = butiVar;
        this.a = list;
        this.d = list2;
        this.e = list3;
        this.h = zqcVar;
        this.i = z;
        this.k = ybiVar;
        this.l = zsdVar;
        this.m = zhwVar;
        this.n = zmeVar;
        this.o = zmfVar;
        this.p = zmdVar;
        this.q = zcpVar;
        this.r = jadVar;
        this.j = executor;
        boolean z2 = list3.size() > 3;
        this.f = z2;
        this.g = z2;
        for (zqy zqyVar : list) {
            zqyVar.h(this);
        }
        if (ybiVar != null) {
            ybiVar.c(this);
        }
    }

    @Override // defpackage.zff
    public List<? extends zbh> a() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.zff
    @dzsi
    public xzi b() {
        return this.k;
    }

    @Override // defpackage.zff
    public zfg c() {
        return this.h;
    }

    @Override // defpackage.zff
    public Boolean d() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.zff
    @dzsi
    public zcy e() {
        return this.n;
    }

    @Override // defpackage.zff
    @dzsi
    public zda f() {
        return this.o;
    }

    @Override // defpackage.zff
    @dzsi
    public zcx g() {
        return this.p;
    }

    @Override // defpackage.zff
    @dzsi
    public zcp h() {
        return this.q;
    }

    @Override // defpackage.zff
    @dzsi
    public jad i() {
        return this.r;
    }

    @Override // defpackage.zff
    public List<zfk> j() {
        return this.d;
    }

    @Override // defpackage.zff
    public List<zfk> k() {
        return this.g ? this.e.subList(0, 2) : this.e;
    }

    @Override // defpackage.zff
    public Boolean l() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.zff
    public cqkl m() {
        this.g = false;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.zff
    public String n() {
        int size = this.e.size() - 2;
        return this.b.getResources().getQuantityString(R.plurals.TRIP_LEVEL_NOTICES_MORE_BUTTON, size, Integer.valueOf(size));
    }

    @Override // defpackage.zff
    @dzsi
    public zec o() {
        return this.l;
    }

    @Override // defpackage.zff
    @dzsi
    public zcr p() {
        return this.m;
    }

    public void q() {
        for (zqy zqyVar : this.a) {
            zqyVar.l(false);
        }
    }

    public void r() {
        long j;
        for (zqy zqyVar : this.a) {
            if (!zqyVar.i()) {
                dccx dccxVar = new dccx();
                dwfy bZ = dwge.m.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwge dwgeVar = (dwge) bZ.b;
                dwgeVar.b = 7;
                int i = dwgeVar.a | 1;
                dwgeVar.a = i;
                dwgeVar.a = i | 64;
                long j2 = 4622945017495814144L;
                dwgeVar.g = 12.0d;
                int i2 = 0;
                int i3 = 0;
                while (i2 < zqyVar.a().size()) {
                    dpec r = zqyVar.a().get(i2).r();
                    if (r == null) {
                        j = j2;
                    } else {
                        if ((r.a & 64) != 0) {
                            doyf doyfVar = r.h;
                            if (doyfVar == null) {
                                doyfVar = doyf.c;
                            }
                            if ((doyfVar.a & 16) != 0) {
                                doyf doyfVar2 = r.h;
                                if (doyfVar2 == null) {
                                    doyfVar2 = doyf.c;
                                }
                                doyb doybVar = doyfVar2.b;
                                if (doybVar == null) {
                                    doybVar = doyb.d;
                                }
                                if ((doybVar.a & 1) != 0) {
                                    doyf doyfVar3 = r.h;
                                    if (doyfVar3 == null) {
                                        doyfVar3 = doyf.c;
                                    }
                                    doyb doybVar2 = doyfVar3.b;
                                    if (doybVar2 == null) {
                                        doybVar2 = doyb.d;
                                    }
                                    dnoh dnohVar = doybVar2.b;
                                    if (dnohVar == null) {
                                        dnohVar = dnoh.d;
                                    }
                                    dccxVar.g(Integer.valueOf(i2));
                                    dhjy bZ2 = dhjz.e.bZ();
                                    double d = dnohVar.b;
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    dhjz dhjzVar = (dhjz) bZ2.b;
                                    int i4 = dhjzVar.a | 2;
                                    dhjzVar.a = i4;
                                    dhjzVar.c = d;
                                    double d2 = dnohVar.c;
                                    dhjzVar.a = i4 | 1;
                                    dhjzVar.b = d2;
                                    bZ.b(bZ2.bK());
                                    i3++;
                                }
                            }
                        }
                        if (i3 == 101.0d) {
                            this.c.b(bZ.bK(), new zpz(zqyVar, dccxVar.f()), this.j);
                            dccxVar = new dccx();
                            bZ = dwge.m.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dwge dwgeVar2 = (dwge) bZ.b;
                            dwgeVar2.b = 7;
                            int i5 = dwgeVar2.a | 1;
                            dwgeVar2.a = i5;
                            dwgeVar2.a = i5 | 64;
                            j = 4622945017495814144L;
                            dwgeVar2.g = 12.0d;
                            i3 = 0;
                        } else {
                            j = 4622945017495814144L;
                        }
                    }
                    i2++;
                    j2 = j;
                }
                if (i3 > 0) {
                    this.c.b(bZ.bK(), new zpz(zqyVar, dccxVar.f()), this.j);
                }
            }
        }
    }

    public void s(int i, boolean z) {
        zsd zsdVar = this.l;
        if (zsdVar != null) {
            zsdVar.g();
        }
    }

    public void t() {
        this.g = this.f;
    }
}
