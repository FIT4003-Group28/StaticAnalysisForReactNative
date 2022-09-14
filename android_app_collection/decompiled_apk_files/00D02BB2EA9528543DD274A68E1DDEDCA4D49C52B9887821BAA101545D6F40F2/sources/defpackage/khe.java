package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: khe  reason: default package */
/* loaded from: classes7.dex */
public final class khe {
    public final Context a;
    public final boolean b;
    public final ckcw c;
    public final ahjq d;
    public final axwq e;
    public final axwi f;
    public final bvrb g;
    public final mgm h;
    @dzsi
    public klr i = null;
    public final LongSparseArray<klg> j = new LongSparseArray<>();

    public khe(Context context, boolean z, ckcw ckcwVar, ahjq ahjqVar, axwq axwqVar, axwi axwiVar, broq broqVar, bvrb bvrbVar) {
        this.a = context;
        this.d = ahjqVar;
        dbsk.s(axwqVar);
        this.e = axwqVar;
        dbsk.s(axwiVar);
        this.f = axwiVar;
        dbsk.s(ckcwVar);
        this.c = ckcwVar;
        dbsk.s(broqVar);
        this.h = new mgm(broqVar);
        this.g = bvrbVar;
        this.b = z;
    }

    public static ddho a(baab baabVar, boolean z) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        if (ordinal == 0) {
            return z ? dtxm.L : dtxm.R;
        } else if (ordinal == 1) {
            return z ? dtxm.ak : dtxm.aq;
        } else if (ordinal == 5) {
            return z ? dtxm.D : dtxm.J;
        } else {
            String valueOf = String.valueOf(baabVar.name());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unexpected listType: ".concat(valueOf) : new String("Unexpected listType: "));
        }
    }

    @dzsi
    public static cqtd c(dndr dndrVar) {
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        baab baabVar = baab.FAVORITES;
        int ordinal = dndrVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return nqu.am();
        }
        if (ordinal == 4) {
            return nqu.W();
        }
        dndrVar.name();
        return nqu.al();
    }

    public static cqtd d(dndr dndrVar) {
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        baab baabVar = baab.FAVORITES;
        int ordinal = dndrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return nqu.F();
            }
            if (ordinal == 4) {
                return nqu.X();
            }
            dndrVar.name();
            return nqu.G();
        }
        return nqu.E();
    }

    public final klr b(mgn mgnVar, @dzsi ckhf ckhfVar) {
        return new khc(this, ckhfVar, mgnVar);
    }

    public final void e(final mgn mgnVar, final khn khnVar, final khx khxVar) {
        boolean z = true;
        if (khxVar != khx.FAVORITE_PLACES && khxVar != khx.WANT_TO_GO_PLACES && khxVar != khx.CUSTOM_PLACES) {
            z = false;
        }
        dbsk.g(z, "type was %s, expected FAVORITE_PLACES, WANT_TO_GO_PLACES, or CUSTOM_PLACES", khxVar);
        if (!this.b) {
            return;
        }
        this.g.b(new Runnable(this, mgnVar, khxVar, khnVar) { // from class: kgz
            private final khe a;
            private final mgn b;
            private final khx c;
            private final String d = "";
            private final khn e;

            {
                this.a = this;
                this.b = mgnVar;
                this.c = khxVar;
                this.e = khnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                baab baabVar;
                ckgz ckgzVar;
                dcdc<baal> e;
                dcdc<baal> dcdcVar;
                int i;
                GmmLocation gmmLocation;
                Context context;
                cqtd U;
                cqtd V;
                ckhf ckhfVar;
                baad baadVar;
                final khe kheVar = this.a;
                mgn mgnVar2 = this.b;
                khx khxVar2 = this.c;
                String str = this.d;
                final khn khnVar2 = this.e;
                final dccx F = dcdc.F();
                final dccx F2 = dcdc.F();
                if (khxVar2 == khx.FAVORITE_PLACES) {
                    baabVar = baab.FAVORITES;
                } else if (khxVar2 == khx.WANT_TO_GO_PLACES) {
                    baabVar = baab.WANT_TO_GO;
                } else {
                    baabVar = baab.CUSTOM;
                }
                if (khxVar2 == khx.FAVORITE_PLACES) {
                    ckgzVar = ckee.G;
                } else if (khxVar2 == khx.WANT_TO_GO_PLACES) {
                    ckgzVar = ckee.H;
                } else {
                    ckgzVar = ckee.I;
                }
                ckgz ckgzVar2 = ckgzVar;
                dbsk.g(baabVar == baab.FAVORITES || baabVar == baab.WANT_TO_GO || baabVar == baab.CUSTOM, "type was %s, expected FAVORITES or WANT_TO_GO or CUSTOM", baabVar);
                GmmLocation a = kheVar.d.a();
                try {
                    if (baabVar == baab.CUSTOM) {
                        baadVar = kheVar.f.h(str).get();
                    } else {
                        baadVar = kheVar.f.i(baabVar).get();
                    }
                    if (baadVar == null) {
                        e = dcdc.e();
                    } else {
                        e = baadVar.i();
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    String valueOf = String.valueOf(baabVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("Error reading list items for list type ");
                    sb.append(valueOf);
                    sb.toString();
                    bvoo.j(e2);
                    e = dcdc.e();
                }
                int size = e.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    baal baalVar = e.get(i2);
                    baak z2 = baalVar.z();
                    if (z2 != null && (a == null || mgo.a(a, z2.b()))) {
                        akqi a2 = z2.a();
                        String y = baalVar.y(kheVar.a);
                        String a3 = !akqi.d(a2) ? z2.b().a() : "";
                        amvg P = amvh.P();
                        dcdcVar = e;
                        P.a = dpjs.ENTITY_TYPE_DEFAULT;
                        P.c = z2.a();
                        P.d = z2.b();
                        P.j = y;
                        P.k = true;
                        i = size;
                        ldm ldmVar = new ldm(P.a(), z2.d(), y, z2.d());
                        int i4 = i3 + 1;
                        Context context2 = kheVar.a;
                        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
                        int ordinal = baabVar.ordinal();
                        gmmLocation = a;
                        if (ordinal != 0) {
                            context = context2;
                            if (ordinal == 1) {
                                U = nqu.ac();
                            } else if (ordinal == 5) {
                                U = nqu.ae();
                            } else {
                                baabVar.name();
                                U = nqu.al();
                            }
                        } else {
                            context = context2;
                            U = nqu.U();
                        }
                        cqtd cqtdVar = U;
                        int ordinal2 = baabVar.ordinal();
                        if (ordinal2 == 0) {
                            V = nqu.V();
                        } else if (ordinal2 == 1) {
                            V = nqu.ab();
                        } else if (ordinal2 == 5) {
                            V = nqu.ad();
                        } else {
                            baabVar.name();
                            V = nqu.G();
                        }
                        cqtd cqtdVar2 = V;
                        int ordinal3 = baabVar.ordinal();
                        if (ordinal3 == 0) {
                            ckhfVar = ckee.P;
                        } else if (ordinal3 == 1) {
                            ckhfVar = ckee.R;
                        } else if (ordinal3 != 5) {
                            String valueOf2 = String.valueOf(baabVar.name());
                            throw new IllegalArgumentException(valueOf2.length() != 0 ? "Unexpected type: ".concat(valueOf2) : new String("Unexpected type: "));
                        } else {
                            ckhfVar = ckee.S;
                        }
                        kli kliVar = new kli(context, y, a3, ldmVar, cqtdVar, cqtdVar2, null, kheVar.b(mgnVar2, ckhfVar), i3, khe.a(baabVar, false), khe.a(baabVar, true));
                        F.g(kliVar);
                        kheVar.g.b(new Runnable() { // from class: kha
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        }, bvrj.UI_THREAD);
                        if (akqi.d(a2) && kheVar.j.get(a2.c) == null) {
                            kheVar.j.put(a2.c, kliVar);
                            F2.g(a2);
                        }
                        i3 = i4;
                    } else {
                        dcdcVar = e;
                        i = size;
                        gmmLocation = a;
                    }
                    i2++;
                    e = dcdcVar;
                    size = i;
                    a = gmmLocation;
                }
                int i5 = i3;
                if (ckgzVar2 != null) {
                    ((ckco) kheVar.c.a(ckgzVar2)).a(i5);
                }
                kheVar.g.b(new Runnable(kheVar, khnVar2, F, F2) { // from class: khb
                    private final khe a;
                    private final dccx b;
                    private final dccx c;
                    private final khn d;

                    {
                        this.a = kheVar;
                        this.d = khnVar2;
                        this.b = F;
                        this.c = F2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        khe kheVar2 = this.a;
                        khn khnVar3 = this.d;
                        dccx dccxVar = this.b;
                        dccx dccxVar2 = this.c;
                        khnVar3.a(dccxVar.f());
                        dcdc f = dccxVar2.f();
                        if (!f.isEmpty()) {
                            mgm mgmVar = kheVar2.h;
                            khd khdVar = new khd(kheVar2);
                            dwim bZ = dwir.R.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dwir dwirVar = (dwir) bZ.b;
                            dwirVar.a |= 1;
                            dwirVar.c = "*";
                            dhjx dhjxVar = mgm.a;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dwir dwirVar2 = (dwir) bZ.b;
                            dhjxVar.getClass();
                            dwirVar2.d = dhjxVar;
                            dwirVar2.a |= 2;
                            int size2 = f.size();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dwir dwirVar3 = (dwir) bZ.b;
                            dwirVar3.a |= 16;
                            dwirVar3.g = size2;
                            cjsb cjsbVar = new cjsb();
                            cjsbVar.d();
                            dnqh a4 = cjsbVar.a();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dwir dwirVar4 = (dwir) bZ.b;
                            a4.getClass();
                            dwirVar4.s = a4;
                            dwirVar4.a |= 33554432;
                            int size3 = f.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                akqi akqiVar = (akqi) f.get(i6);
                                if (akqi.d(akqiVar)) {
                                    dwik bZ2 = dwil.c.bZ();
                                    String o = akqiVar.o();
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    dwil dwilVar = (dwil) bZ2.b;
                                    o.getClass();
                                    dwilVar.a |= 1;
                                    dwilVar.b = o;
                                    bZ.a(bZ2);
                                }
                            }
                            mgmVar.c = new brln(bZ.bK(), new iqy());
                            brln brlnVar = mgmVar.c;
                            brlnVar.f = khdVar;
                            mgmVar.b.a(brlnVar);
                        }
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }
}
