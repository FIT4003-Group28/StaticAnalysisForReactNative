package com.google.android.libraries.youtube.innertube.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayerConfigModel implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final float[] a = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    public static final PlayerConfigModel b;
    private static final atzv k;
    public final atzv c;
    public Set d;
    public Set e;
    public Set f;
    public boolean h;
    private Set l;
    private Set m;
    private asop n;
    public boolean g = false;
    public boolean i = false;
    public boolean j = true;

    static {
        atzv atzvVar = atzv.a;
        k = atzvVar;
        b = new PlayerConfigModel(atzvVar);
        CREATOR = new aalf(11);
    }

    public PlayerConfigModel(atzv atzvVar) {
        atzvVar.getClass();
        this.c = atzvVar;
    }

    public final int A() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.s;
        if (i != 0) {
            return i;
        }
        return 2;
    }

    public final int B() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqrw aqrwVar = aqfnVar.c;
        if (aqrwVar == null) {
            aqrwVar = aqrw.a;
        }
        return aqrwVar.d;
    }

    public final int C() {
        apfm apfmVar = this.c.j;
        if (apfmVar == null) {
            apfmVar = apfm.a;
        }
        int i = apfmVar.g;
        if (i != 0) {
            return i;
        }
        return 2000;
    }

    public final int D() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.A;
        if (i != 0) {
            return i;
        }
        return 389;
    }

    public final long E(int i) {
        aopq aopqVar;
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i2 = aqwuVar.l;
        if (i2 == 0) {
            i2 = 25000;
        }
        long j = i2;
        atzv atzvVar = this.c;
        if ((atzvVar.b & 2) != 0) {
            aqwu aqwuVar2 = atzvVar.e;
            if (aqwuVar2 == null) {
                aqwuVar2 = aqwu.b;
            }
            aopqVar = aqwuVar2.aN;
        } else {
            aopqVar = null;
        }
        if (aopqVar != null && !aopqVar.isEmpty() && i < aopqVar.size()) {
            j = ((Integer) aopqVar.get(i)).intValue();
        }
        return j * 1000;
    }

    public final long F() {
        atzv atzvVar = this.c;
        if ((atzvVar.b & 128) != 0) {
            atzg atzgVar = atzvVar.g;
            if (atzgVar == null) {
                atzgVar = atzg.a;
            }
            if ((atzgVar.b & 4) == 0) {
                atzg atzgVar2 = this.c.g;
                if (atzgVar2 == null) {
                    atzgVar2 = atzg.a;
                }
                return atzgVar2.c * 1000.0f;
            }
            atzg atzgVar3 = this.c.g;
            if (atzgVar3 == null) {
                atzgVar3 = atzg.a;
            }
            awad awadVar = atzgVar3.d;
            if (awadVar == null) {
                awadVar = awad.a;
            }
            return awadVar.b;
        }
        return 0L;
    }

    public final long G() {
        atzg atzgVar = this.c.g;
        if (atzgVar == null) {
            atzgVar = atzg.a;
        }
        return atzgVar.g;
    }

    public final long H() {
        atzg atzgVar = this.c.g;
        if (atzgVar == null) {
            atzgVar = atzg.a;
        }
        return atzgVar.f;
    }

    public final long I() {
        auzz auzzVar = this.c.p;
        if (auzzVar == null) {
            auzzVar = auzz.a;
        }
        long j = auzzVar.b;
        if (j != 0) {
            return j;
        }
        return -1L;
    }

    public final long J() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.bc;
        if (i != 0) {
            return i;
        }
        return 2000L;
    }

    public final long K() {
        aqke aqkeVar = this.c.z;
        if (aqkeVar == null) {
            aqkeVar = aqke.b;
        }
        long j = aqkeVar.d;
        if (j != 0) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    public final PlayerConfigModel L(String str) {
        aopa mo52toBuilder = this.c.mo52toBuilder();
        aqwu aqwuVar = ((atzv) mo52toBuilder.instance).e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        aopa mo52toBuilder2 = aqwuVar.mo52toBuilder();
        mo52toBuilder2.ac(str);
        mo52toBuilder.copyOnWrite();
        atzv atzvVar = (atzv) mo52toBuilder.instance;
        aqwu aqwuVar2 = (aqwu) mo52toBuilder2.mo39build();
        aqwuVar2.getClass();
        atzvVar.e = aqwuVar2;
        atzvVar.b |= 2;
        return new PlayerConfigModel((atzv) mo52toBuilder.mo39build());
    }

    public final PlayerConfigModel M() {
        aopa mo52toBuilder = this.c.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        atzv atzvVar = (atzv) mo52toBuilder.instance;
        atzvVar.e = null;
        atzvVar.b &= -3;
        return new PlayerConfigModel((atzv) mo52toBuilder.mo39build());
    }

    public final aqfn N() {
        aqfn aqfnVar = this.c.d;
        return aqfnVar == null ? aqfn.a : aqfnVar;
    }

    public final synchronized asop O() {
        if (this.n == null) {
            asop asopVar = this.c.n;
            if (asopVar == null) {
                asopVar = asop.a;
            }
            this.n = asopVar;
        }
        return this.n;
    }

    public final asuk P() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        asuk b2 = asuk.b(aqwuVar.ai);
        return b2 == null ? asuk.LIVE_ONLY_PEG_STRATEGY_UNKNOWN : b2;
    }

    public final atoi Q() {
        aqfp aqfpVar = N().h;
        if (aqfpVar == null) {
            aqfpVar = aqfp.a;
        }
        atoi atoiVar = aqfpVar.c;
        return atoiVar == null ? atoi.a : atoiVar;
    }

    public final Long R() {
        aszz aszzVar = this.c.f114J;
        if (aszzVar == null) {
            aszzVar = aszz.a;
        }
        if ((aszzVar.b & 2) != 0) {
            aszz aszzVar2 = this.c.f114J;
            if (aszzVar2 == null) {
                aszzVar2 = aszz.a;
            }
            return Long.valueOf(aszzVar2.d);
        }
        return null;
    }

    public final Long S() {
        aszz aszzVar = this.c.f114J;
        if (aszzVar == null) {
            aszzVar = aszz.a;
        }
        if ((aszzVar.b & 1) != 0) {
            aszz aszzVar2 = this.c.f114J;
            if (aszzVar2 == null) {
                aszzVar2 = aszz.a;
            }
            return Long.valueOf(aszzVar2.c);
        }
        return null;
    }

    public final String T() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 1) != 0) {
            awbw awbwVar = atzvVar.v;
            if (awbwVar == null) {
                awbwVar = awbw.a;
            }
            return awbwVar.k;
        }
        return "";
    }

    public final synchronized Set V() {
        if (this.l == null) {
            aqwu aqwuVar = this.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            this.l = amvn.p(aqwuVar.Z);
        }
        return this.l;
    }

    public final synchronized Set W() {
        Set p;
        if (this.m == null) {
            aqwu aqwuVar = this.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            if (aqwuVar.ao.size() == 0) {
                p = amyg.a;
            } else {
                aqwu aqwuVar2 = this.c.e;
                if (aqwuVar2 == null) {
                    aqwuVar2 = aqwu.b;
                }
                p = amvn.p(aqwuVar2.ao);
            }
            this.m = p;
        }
        return this.m;
    }

    public final boolean X() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.ab;
    }

    public final boolean Y() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.z;
    }

    public final boolean Z() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.V;
    }

    public final double a() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.bs;
    }

    public final boolean aA(aqws aqwsVar) {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        if (aqwuVar.bd.size() == 0) {
            return false;
        }
        aqwu aqwuVar2 = this.c.e;
        if (aqwuVar2 == null) {
            aqwuVar2 = aqwu.b;
        }
        return new aops(aqwuVar2.bd, aqwu.a).contains(aqwsVar);
    }

    public final boolean aB() {
        apdz apdzVar = this.c.w;
        if (apdzVar == null) {
            apdzVar = apdz.a;
        }
        return apdzVar.d;
    }

    public final boolean aC() {
        apdz apdzVar = this.c.w;
        if (apdzVar == null) {
            apdzVar = apdz.a;
        }
        return apdzVar.c;
    }

    public final boolean aD() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 1) != 0) {
            awbw awbwVar = atzvVar.v;
            if (awbwVar == null) {
                awbwVar = awbw.a;
            }
            return awbwVar.f;
        }
        return false;
    }

    public final boolean aE() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.R;
    }

    public final boolean aF() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        if (aqwuVar.H) {
            aqwu aqwuVar2 = this.c.e;
            if (aqwuVar2 == null) {
                aqwuVar2 = aqwu.b;
            }
            return aqwuVar2.N;
        }
        return false;
    }

    public final boolean aG() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.P;
    }

    public final boolean aH() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.aj;
    }

    public final boolean aI() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.ar;
    }

    public final boolean aJ() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.L;
    }

    public final boolean aK() {
        apav apavVar = this.c.o;
        if (apavVar == null) {
            apavVar = apav.a;
        }
        return apavVar.b;
    }

    public final boolean aL() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.S;
    }

    public final boolean aM() {
        aunv aunvVar = this.c.D;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return aunvVar.m;
    }

    public final boolean aN() {
        apim apimVar = this.c.f;
        if (apimVar == null) {
            apimVar = apim.a;
        }
        return apimVar.c;
    }

    public final boolean aO() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqrw aqrwVar = aqfnVar.c;
        if (aqrwVar == null) {
            aqrwVar = aqrw.a;
        }
        return aqrwVar.h;
    }

    public final boolean aP() {
        apim apimVar = this.c.f;
        if (apimVar == null) {
            apimVar = apim.a;
        }
        return apimVar.d;
    }

    public final boolean aQ() {
        apim apimVar = this.c.f;
        if (apimVar == null) {
            apimVar = apim.a;
        }
        return apimVar.e;
    }

    public final boolean aR() {
        apfm apfmVar = this.c.j;
        if (apfmVar == null) {
            apfmVar = apfm.a;
        }
        return apfmVar.f;
    }

    public final boolean aS() {
        aqke aqkeVar = this.c.z;
        if (aqkeVar == null) {
            aqkeVar = aqke.b;
        }
        return aqkeVar.f;
    }

    public final boolean aT() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.C;
    }

    public final boolean aU() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aV() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.U;
    }

    public final boolean aW() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.aV;
    }

    public final boolean aX() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.ah;
    }

    public final boolean aY() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.aq;
    }

    public final boolean aZ() {
        apgg apggVar = this.c.A;
        if (apggVar == null) {
            apggVar = apgg.a;
        }
        return apggVar.b;
    }

    public final boolean aa() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.aW;
    }

    public final boolean ab() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.W;
    }

    public final boolean ac() {
        atzv atzvVar = this.c;
        if ((atzvVar.b & 8192) != 0) {
            apfm apfmVar = atzvVar.j;
            if (apfmVar == null) {
                apfmVar = apfm.a;
            }
            return apfmVar.o;
        }
        return false;
    }

    public final boolean ad() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.bb;
    }

    public final boolean ae() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.aX;
    }

    public final boolean af() {
        aqke aqkeVar = this.c.z;
        if (aqkeVar == null) {
            aqkeVar = aqke.b;
        }
        return aqkeVar.g;
    }

    public final boolean ag() {
        apim apimVar = this.c.f;
        if (apimVar == null) {
            apimVar = apim.a;
        }
        return apimVar.f;
    }

    public final boolean ah() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.ac;
    }

    public final boolean ai() {
        aqjw aqjwVar = this.c.I;
        if (aqjwVar == null) {
            aqjwVar = aqjw.a;
        }
        return aqjwVar.c;
    }

    public final boolean aj() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.aO;
    }

    public final boolean ak() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 1) != 0) {
            awbw awbwVar = atzvVar.v;
            if (awbwVar == null) {
                awbwVar = awbw.a;
            }
            return awbwVar.b;
        }
        return false;
    }

    public final boolean al() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 1) != 0) {
            awbw awbwVar = atzvVar.v;
            if (awbwVar == null) {
                awbwVar = awbw.a;
            }
            return awbwVar.j;
        }
        return false;
    }

    public final boolean am() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 1) != 0) {
            awbw awbwVar = atzvVar.v;
            if (awbwVar == null) {
                awbwVar = awbw.a;
            }
            return awbwVar.h;
        }
        return false;
    }

    public final boolean an() {
        atzg atzgVar = this.c.g;
        if (atzgVar == null) {
            atzgVar = atzg.a;
        }
        return atzgVar.e;
    }

    public final boolean ao() {
        aqfp aqfpVar = N().h;
        if (aqfpVar == null) {
            aqfpVar = aqfp.a;
        }
        return aqfpVar.b;
    }

    public final boolean ap() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 1) != 0) {
            awbw awbwVar = atzvVar.v;
            if (awbwVar == null) {
                awbwVar = awbw.a;
            }
            return awbwVar.d;
        }
        return false;
    }

    public final boolean aq() {
        return !this.h && N().j;
    }

    public final boolean ar(aanv aanvVar) {
        atzv atzvVar = this.c;
        if ((atzvVar.b & 2) != 0) {
            aanu aanuVar = aanu.DEFAULT;
            aqwu aqwuVar = atzvVar.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            int bu = awwc.bu(aqwuVar.aA);
            if (bu == 0) {
                bu = 1;
            }
            int i = bu - 1;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return aanvVar.a();
                    }
                    return false;
                } else if (aanvVar != aanv.RECTANGULAR_2D && aanvVar != aanv.RECTANGULAR_3D && aanvVar != aanv.NOOP) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean as() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        return (aqfnVar.b & 1024) != 0;
    }

    public final boolean at() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.h;
    }

    public final boolean au() {
        apdz apdzVar = this.c.w;
        if (apdzVar == null) {
            apdzVar = apdz.a;
        }
        return apdzVar.b;
    }

    public final boolean av() {
        apdz apdzVar = this.c.w;
        if (apdzVar == null) {
            apdzVar = apdz.a;
        }
        return apdzVar.e;
    }

    public final boolean aw() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 262144) != 0) {
            aqjw aqjwVar = atzvVar.I;
            if (aqjwVar == null) {
                aqjwVar = aqjw.a;
            }
            return aqjwVar.b;
        }
        return false;
    }

    public final boolean ax() {
        auae auaeVar = this.c.K;
        if (auaeVar == null) {
            auaeVar = auae.a;
        }
        return auaeVar.b;
    }

    public final boolean ay() {
        auae auaeVar = this.c.K;
        if (auaeVar == null) {
            auaeVar = auae.a;
        }
        return auaeVar.c;
    }

    public final boolean az() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.f;
    }

    public final float b() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        float f = aqwuVar.m;
        if (f != 0.0f) {
            return f;
        }
        return 0.7f;
    }

    public final boolean ba() {
        aunv aunvVar = this.c.D;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return aunvVar.j;
    }

    public final byte[] bb() {
        return this.c.toByteArray();
    }

    public final float bc() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        float f = aqwuVar.au;
        if (f != 0.0f) {
            return f;
        }
        return 0.5f;
    }

    public final int bd() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.av;
        if (i != 0) {
            return i;
        }
        return 12;
    }

    public final int be(int i) {
        atzv atzvVar = this.c;
        if ((atzvVar.b & 2) != 0) {
            aqwu aqwuVar = atzvVar.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            int cb = awwc.cb(aqwuVar.at);
            if (cb != 0) {
                return cb;
            }
            return 1;
        }
        return i;
    }

    public final float c() {
        atzv atzvVar = this.c;
        if ((atzvVar.b & 64) != 0) {
            apim apimVar = atzvVar.f;
            if (apimVar == null) {
                apimVar = apim.a;
            }
            return Math.min(1.0f, (float) Math.pow(10.0d, (-apimVar.b) / 20.0f));
        }
        return 1.0f;
    }

    public final float d() {
        atzv atzvVar = this.c;
        if ((atzvVar.b & 8192) != 0) {
            apfm apfmVar = atzvVar.j;
            if (apfmVar == null) {
                apfmVar = apfm.a;
            }
            if ((apfmVar.b & 2048) != 0) {
                apfm apfmVar2 = this.c.j;
                if (apfmVar2 == null) {
                    apfmVar2 = apfm.a;
                }
                return apfmVar2.l;
            }
        }
        return e();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        atzv atzvVar = this.c;
        if ((atzvVar.b & 8192) != 0) {
            apfm apfmVar = atzvVar.j;
            if (apfmVar == null) {
                apfmVar = apfm.a;
            }
            return apfmVar.k;
        }
        return 0.85f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PlayerConfigModel) && this.c.equals(((PlayerConfigModel) obj).c);
    }

    public final float f() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqrw aqrwVar = aqfnVar.c;
        if (aqrwVar == null) {
            aqrwVar = aqrw.a;
        }
        return aqrwVar.e;
    }

    public final int g() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.B;
        if (i != 0) {
            return i;
        }
        return 38;
    }

    public final int h() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.n;
        if (i != 0) {
            return i;
        }
        return 50;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final int i() {
        aunv aunvVar = this.c.D;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return aunvVar.k;
    }

    public final int j() {
        asun asunVar = this.c.G;
        if (asunVar == null) {
            asunVar = asun.a;
        }
        double d = asunVar.e;
        if (d > 0.0d) {
            return (int) (d * 1000.0d);
        }
        return 40000;
    }

    public final int k() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.ay;
    }

    public final int l() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.T;
    }

    public final int m() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.o;
        if (i != 0) {
            return i;
        }
        return 8000;
    }

    public final int n() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.y;
    }

    public final int o() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.p;
        if (i != 0) {
            return i;
        }
        return 8000;
    }

    public final int p() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.aw;
    }

    public final int q() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqrw aqrwVar = aqfnVar.c;
        if (aqrwVar == null) {
            aqrwVar = aqrw.a;
        }
        int i = aqrwVar.b;
        if (i != 0) {
            return i;
        }
        return 120000;
    }

    public final int r() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqrw aqrwVar = aqfnVar.c;
        if (aqrwVar == null) {
            aqrwVar = aqrw.a;
        }
        return aqrwVar.g;
    }

    public final int s() {
        aqkp aqkpVar = this.c.u;
        if (aqkpVar == null) {
            aqkpVar = aqkp.a;
        }
        return aqkpVar.b;
    }

    public final int t() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.v;
        if (i > 0) {
            return i;
        }
        return 2500;
    }

    public final String toString() {
        int hashCode = this.c.hashCode();
        StringBuilder sb = new StringBuilder(29);
        sb.append("PlayerConfigModel@");
        sb.append(hashCode);
        return sb.toString();
    }

    public final int u() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.ae;
    }

    public final int v() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqrw aqrwVar = aqfnVar.c;
        if (aqrwVar == null) {
            aqrwVar = aqrw.a;
        }
        int i = aqrwVar.c;
        if (i != 0) {
            return i;
        }
        return 120000;
    }

    public final int w() {
        aqfn aqfnVar = this.c.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqrw aqrwVar = aqfnVar.c;
        if (aqrwVar == null) {
            aqrwVar = aqrw.a;
        }
        return aqrwVar.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(bb());
    }

    public final int x() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.w;
        if (i > 0) {
            return i;
        }
        return 5000;
    }

    public final int y() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.D;
        if (i != 0) {
            return i;
        }
        return 3;
    }

    public final int z() {
        aqwu aqwuVar = this.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i = aqwuVar.q;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final List U() {
        atzv atzvVar = this.c;
        if ((atzvVar.c & 64) == 0) {
            return Collections.emptyList();
        }
        aqke aqkeVar = atzvVar.z;
        if (aqkeVar == null) {
            aqkeVar = aqke.b;
        }
        aops<athb> aopsVar = new aops(aqkeVar.e, aqke.a);
        ArrayList arrayList = new ArrayList(aopsVar.size());
        for (athb athbVar : aopsVar) {
            arrayList.add(Integer.valueOf(athbVar.n));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
