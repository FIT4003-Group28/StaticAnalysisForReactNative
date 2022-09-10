package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
/* compiled from: PG */
/* renamed from: bwsf  reason: default package */
/* loaded from: classes4.dex */
public final class bwsf extends itb implements bwsh {
    public final btvo a;
    public final dxio<afwr> b;
    public final dxio<bwuy> c;
    public final cjqy d;
    public final boolean e;
    public cjql f;
    public cjql g;
    public boolean h;
    private final gga i;
    private final bwqv j;
    private final hwe k;
    private final dxio<btrm> o;
    private final cjqq p;
    private final bwse q = new bwse(this);

    public bwsf(gga ggaVar, bwqv bwqvVar, btvo btvoVar, hwe hweVar, dxio<afwr> dxioVar, dxio<btrm> dxioVar2, dxio<bwuy> dxioVar3, cjqy cjqyVar, cjqq cjqqVar) {
        this.i = ggaVar;
        this.j = bwqvVar;
        this.a = btvoVar;
        this.k = hweVar;
        this.b = dxioVar;
        this.o = dxioVar2;
        this.c = dxioVar3;
        this.d = cjqyVar;
        this.p = cjqqVar;
        this.e = btvoVar.getEnableFeatureParameters().bl;
        if (!btvoVar.getStreetViewLayerParameters().a) {
            this.h = true;
        } else if (dxioVar.a().l().d(afwm.STREETVIEW)) {
            this.h = true;
        } else {
            this.h = false;
        }
    }

    private final void q(boolean z, boolean z2, @dzsi String str, @dzsi dggg dgggVar, @dzsi akqq akqqVar, @dzsi UserOrientation userOrientation, @dzsi dhjx dhjxVar, @dzsi dwfl dwflVar, @dzsi ilo iloVar) {
        fd bwtrVar;
        bwzp k = k();
        if (k == null || z) {
            boolean z3 = this.a.getEnableFeatureParameters().y;
            if (z) {
                bwtrVar = new bwtq();
            } else {
                bwtrVar = new bwtr();
            }
            bwtrVar.B(l(z3, z2, str, null, dgggVar, akqqVar, userOrientation, dhjxVar, dwflVar, iloVar));
            try {
                this.i.C(bwtrVar, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
                return;
            } catch (IllegalStateException e) {
                bvoo.i(e);
                return;
            }
        }
        k.aR(dgggVar, akqqVar, iloVar);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        bwse bwseVar = this.q;
        dceq a = dcet.a();
        a.b(alih.class, new bwsg(0, alih.class, bwseVar, bvrj.UI_THREAD));
        a.b(alij.class, new bwsg(1, alij.class, bwseVar, bvrj.UI_THREAD));
        a.b(alhx.class, new bwsg(2, alhx.class, bwseVar, bvrj.UI_THREAD));
        this.o.a().g(bwseVar, a.a());
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.o.a().a(this.q);
        super.Nu();
    }

    @Override // defpackage.bwsh
    public final void e(dwfl dwflVar, @dzsi dhjx dhjxVar, @dzsi ilo iloVar) {
        dggg dgggVar;
        dgge dggeVar;
        int a;
        if (dhjxVar == null && (dwflVar.a & 4096) != 0 && (dhjxVar = dwflVar.m) == null) {
            dhjxVar = dhjx.f;
        }
        dhjx dhjxVar2 = dhjxVar;
        int i = dwflVar.a;
        boolean z = true;
        if ((32768 & i) != 0) {
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
        } else if ((i & 4) != 0) {
            dggf bZ = dggg.d.bZ();
            String str = dwflVar.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dggg dgggVar2 = (dggg) bZ.b;
            str.getClass();
            dgggVar2.a |= 2;
            dgggVar2.c = str;
            if ((dwflVar.a & 256) == 0 || (a = dwfk.a(dwflVar.i)) == 0 || a != 2) {
                dggeVar = dgge.IMAGE_ALLEYCAT;
            } else {
                dggeVar = dgge.IMAGE_FIFE;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dggg dgggVar3 = (dggg) bZ.b;
            dgggVar3.b = dggeVar.l;
            dgggVar3.a |= 1;
            dgggVar = bZ.bK();
        } else {
            dgggVar = null;
        }
        int a2 = dwfc.a(dwflVar.f);
        if (a2 == 0 || a2 != 2) {
            z = false;
        }
        String G = iloVar == null ? null : iloVar.G();
        akqq a3 = ckob.a(dwflVar);
        dhjx dhjxVar3 = dwflVar.m;
        if (dhjxVar3 == null) {
            dhjxVar3 = dhjx.f;
        }
        q(z, true, G, dgggVar, a3, new UserOrientation(dhjxVar3), dhjxVar2, dwflVar, iloVar);
    }

    @Override // defpackage.bwsh
    public final void f(amuo amuoVar, amub amubVar, dwfl dwflVar, CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi CharSequence charSequence3) {
        dpec dpecVar = amuoVar.a;
        if (dpecVar == null) {
            return;
        }
        doyf doyfVar = dpecVar.h;
        if (doyfVar == null) {
            doyfVar = doyf.c;
        }
        doyb doybVar = doyfVar.b;
        if (doybVar == null) {
            doybVar = doyb.d;
        }
        dnoh dnohVar = doybVar.b;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        double d = dnohVar.b;
        doyf doyfVar2 = dpecVar.h;
        if (doyfVar2 == null) {
            doyfVar2 = doyf.c;
        }
        doyb doybVar2 = doyfVar2.b;
        if (doybVar2 == null) {
            doybVar2 = doyb.d;
        }
        dnoh dnohVar2 = doybVar2.b;
        if (dnohVar2 == null) {
            dnohVar2 = dnoh.d;
        }
        akqq akqqVar = new akqq(d, dnohVar2.c);
        doyf doyfVar3 = dpecVar.h;
        if (doyfVar3 == null) {
            doyfVar3 = doyf.c;
        }
        doyb doybVar3 = doyfVar3.b;
        if (doybVar3 == null) {
            doybVar3 = doyb.d;
        }
        dnoh dnohVar3 = doybVar3.c;
        if (dnohVar3 == null) {
            dnohVar3 = dnoh.d;
        }
        double d2 = dnohVar3.b;
        doyf doyfVar4 = dpecVar.h;
        if (doyfVar4 == null) {
            doyfVar4 = doyf.c;
        }
        doyb doybVar4 = doyfVar4.b;
        if (doybVar4 == null) {
            doybVar4 = doyb.d;
        }
        dnoh dnohVar4 = doybVar4.c;
        if (dnohVar4 == null) {
            dnohVar4 = dnoh.d;
        }
        UserOrientation userOrientation = new UserOrientation(akqo.h(akqqVar, new akqq(d2, dnohVar4.c)), 0.0f, 90.0f);
        bwuf bwufVar = new bwuf();
        String obj = amuoVar.p.toString();
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dggg dgggVar = dizhVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        Bundle l = l(true, true, obj, amubVar, dgggVar, null, userOrientation, null, dwflVar, null);
        l.putDouble("arrowIn", amuoVar.n);
        l.putDouble("arrowOut", amuoVar.o);
        l.putCharSequence("arrowtext", charSequence);
        if (charSequence2 != null) {
            l.putCharSequence("2ndtext", charSequence2);
        }
        if (charSequence3 != null) {
            l.putCharSequence("disttext", charSequence3);
        }
        l.putParcelable("maneuver", vrv.c(amuoVar));
        bwufVar.B(l);
        try {
            this.i.C(bwufVar, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
        } catch (IllegalStateException e) {
            bvoo.i(e);
        }
    }

    @Override // defpackage.bwsh
    public final boolean i() {
        return this.b.a().l().d(afwm.STREETVIEW);
    }

    @Override // defpackage.bwsh
    public final void j() {
        this.h = true;
        this.b.a().l().e(afwm.STREETVIEW);
        if (i()) {
            m();
        }
    }

    @dzsi
    public final bwzp k() {
        fd J = this.i.J(gfu.ACTIVITY_FRAGMENT);
        if (J instanceof bwzp) {
            return (bwzp) J;
        }
        return null;
    }

    final Bundle l(boolean z, boolean z2, @dzsi String str, @dzsi amub amubVar, @dzsi dggg dgggVar, @dzsi akqq akqqVar, @dzsi UserOrientation userOrientation, @dzsi dhjx dhjxVar, @dzsi dwfl dwflVar, @dzsi ilo iloVar) {
        Bundle bundle = new Bundle();
        bundle.putString("address", str);
        if (dgggVar != null) {
            bundle.putString("panoId", dgggVar.c);
            dgge b = dgge.b(dgggVar.b);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            bundle.putInt("panoFrontend", b.l);
        }
        bundle.putBoolean("addressChip", z2);
        bundle.putBoolean("swipe", z);
        if (akqqVar != null) {
            bvrs.k(bundle, "latLng", akqqVar.s());
        }
        akqq f = this.k.f();
        if (f != null) {
            bundle.putSerializable("placemarkLatLng", f);
        }
        if (amubVar != null) {
            bundle.putSerializable("routeDescription", amubVar.d());
        }
        if (dhjxVar != null) {
            bundle.putParcelable("userOrientation", new UserOrientation(dhjxVar));
        } else if (userOrientation != null) {
            bundle.putParcelable("userOrientation", userOrientation);
        }
        this.j.c(bundle, "placemark", bwrs.a(iloVar));
        if (dwflVar != null) {
            bundle.putByteArray("photoDescription", dwflVar.bS());
        }
        return bundle;
    }

    public final void m() {
        this.f = this.p.g().d(cjtd.a(dtyb.ec));
        this.g = this.p.g().d(cjtd.a(dtyb.eb));
    }

    @Override // defpackage.bwsh
    public final void o(@dzsi String str, @dzsi dggg dgggVar, @dzsi akqq akqqVar, @dzsi UserOrientation userOrientation) {
        q(false, true, str, dgggVar, akqqVar, userOrientation, null, null, null);
    }

    @Override // defpackage.bwsh
    public final void p(@dzsi dggg dgggVar, @dzsi akqq akqqVar, @dzsi UserOrientation userOrientation) {
        q(false, false, null, dgggVar, akqqVar, userOrientation, null, null, null);
    }
}
