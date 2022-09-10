package defpackage;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.gmm.place.riddler.webview.RiddlerWebViewCallbacks;
/* compiled from: PG */
/* renamed from: blpf  reason: default package */
/* loaded from: classes3.dex */
public final class blpf extends itb implements blpp {
    public static final dcdn<blpo, dspd> j = dcdn.m(blpo.YES, dspd.B("yes"), blpo.NO, dspd.B("no"), blpo.UNSURE, dspd.B("unsure"));
    public final gga a;
    public final blpg b;
    public final dxio<akfa> c;
    public final eeu d;
    public final bwqv e;
    public final bvrb f;
    public final akfc g;
    public final cqat h;
    public final cjqy i;
    public blwk k;
    private final bvvw o;
    private final ckcw p;
    private final blwh q;
    private final btvo r;
    private final auhi s;
    private final bvjj t;
    private dvrc u;
    private final bvft v;

    public blpf(gga ggaVar, eeu eeuVar, bvft bvftVar, bwqv bwqvVar, bvrb bvrbVar, blpg blpgVar, dxio dxioVar, akfc akfcVar, cqat cqatVar, cjqy cjqyVar, bvvw bvvwVar, ckcw ckcwVar, blwh blwhVar, btvo btvoVar, auhi auhiVar, bvjj bvjjVar) {
        this.a = ggaVar;
        this.d = eeuVar;
        this.v = bvftVar;
        this.e = bwqvVar;
        this.f = bvrbVar;
        this.b = blpgVar;
        this.c = dxioVar;
        this.g = akfcVar;
        this.h = cqatVar;
        this.i = cjqyVar;
        this.o = bvvwVar;
        this.p = ckcwVar;
        this.q = blwhVar;
        this.r = btvoVar;
        this.s = auhiVar;
        this.t = bvjjVar;
    }

    private final bvxu r(String str, int i, blpq blpqVar) {
        bvxn bZ = bvxu.A.bZ();
        bvxo bZ2 = bvxp.d.bZ();
        int i2 = bvxp.d.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxp bvxpVar = (bvxp) bZ2.b;
        bvxpVar.a |= 2;
        bvxpVar.c = i2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        bvxp bK = bZ2.bK();
        bK.getClass();
        bvxuVar.x = bK;
        bvxuVar.a |= 4194304;
        bvxq bZ3 = bvxt.c.bZ();
        bvxr bZ4 = bvxs.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        bvxs bvxsVar = (bvxs) bZ4.b;
        int i3 = bvxsVar.a | 1;
        bvxsVar.a = i3;
        bvxsVar.b = "cs";
        bvxsVar.a = i3 | 2;
        bvxsVar.c = "1";
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxt bvxtVar = (bvxt) bZ3.b;
        bvxs bK2 = bZ4.bK();
        bK2.getClass();
        bvxtVar.b = bK2;
        bvxtVar.a = 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        bvxt bK3 = bZ3.bK();
        bK3.getClass();
        bvxuVar2.w = bK3;
        bvxuVar2.a |= 2097152;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        str.getClass();
        int i4 = bvxuVar3.a | 1;
        bvxuVar3.a = i4;
        bvxuVar3.b = str;
        int i5 = i4 | 16;
        bvxuVar3.a = i5;
        bvxuVar3.f = i;
        int i6 = i5 | 4;
        bvxuVar3.a = i6;
        bvxuVar3.d = true;
        bvxuVar3.a = i6 | 8;
        bvxuVar3.e = true;
        bvxu.b(bvxuVar3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i7 = bvxuVar4.a | 2048;
        bvxuVar4.a = i7;
        bvxuVar4.m = true;
        String str2 = blpqVar.h;
        str2.getClass();
        bvxuVar4.a = i7 | 64;
        bvxuVar4.h = str2;
        if ((this.r.getEnableFeatureParameters().b & 4194304) != 0) {
            dkyx dkyxVar = this.r.getEnableFeatureParameters().as;
            if (dkyxVar == null) {
                dkyxVar = dkyx.f;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar5 = (bvxu) bZ.b;
            dkyxVar.getClass();
            bvxuVar5.j = dkyxVar;
            bvxuVar5.a |= 256;
        }
        return bZ.bK();
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        this.f.b(new blpa(this), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.blpp
    public final void e() {
    }

    @Override // defpackage.blpp
    @dzsi
    public final bvxh f(String str, int i, blpq blpqVar) {
        return this.o.l(r(str, i, blpqVar), new RiddlerWebViewCallbacks(), false);
    }

    @Override // defpackage.blpp
    public final void i(String str, int i, blpq blpqVar) {
        ((ckhe) this.p.a(blpqVar.g)).a();
        this.o.j(r(str, i, blpqVar), new RiddlerWebViewCallbacks(), dtxz.H);
        if (blpqVar == blpq.NOTIFICATION_ENTRYPOINT) {
            avac.bp(this.a, Integer.valueOf(dpyv.RIDDLER.dm), this.t, this.f, this.s);
        }
    }

    @Override // defpackage.blpp
    public final void j(bvxh bvxhVar, blpq blpqVar) {
        ((ckhe) this.p.a(blpqVar.g)).a();
        this.o.n(bvxhVar, dtxz.H);
    }

    @Override // defpackage.blpp
    public final synchronized void k(@dzsi akqi akqiVar, btzi<dvrc, dvre> btziVar) {
        dvrb bZ = dvrc.d.bZ();
        if (akqiVar != null) {
            String o = akqiVar.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvrc dvrcVar = (dvrc) bZ.b;
            o.getClass();
            dvrcVar.a |= 1;
            dvrcVar.b = o;
        }
        dvrp bZ2 = dvrs.c.bZ();
        dvrq bZ3 = dvrr.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvrr dvrrVar = (dvrr) bZ3.b;
        dvrrVar.a |= 1;
        dvrrVar.b = true;
        dvrr dvrrVar2 = (dvrr) bZ3.b;
        dvrrVar2.a |= 2;
        dvrrVar2.c = 5;
        dvrr dvrrVar3 = (dvrr) bZ3.b;
        dvrrVar3.a |= 16;
        dvrrVar3.d = true;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvrs dvrsVar = (dvrs) bZ2.b;
        dvrr bK = bZ3.bK();
        bK.getClass();
        dvrsVar.b = bK;
        dvrsVar.a = 1 | dvrsVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvrc dvrcVar2 = (dvrc) bZ.b;
        dvrs bK2 = bZ2.bK();
        bK2.getClass();
        dvrcVar2.c = bK2;
        dvrcVar2.a |= 2;
        dvrc bK3 = bZ.bK();
        this.u = bK3;
        this.v.a(bK3, new blpe(this, bK3, btziVar), bvrj.BACKGROUND_THREADPOOL);
    }

    public final synchronized void l() {
        this.u = null;
    }

    @Override // defpackage.blpp
    public final void m(blvu blvuVar, blpo blpoVar, blpk blpkVar) {
        blwk blwkVar = this.k;
        byte[] bArr = new byte[16];
        dbsy.b.nextBytes(bArr);
        blwkVar.a(Base64.encodeToString(bArr, 0)).a(blvuVar, j.get(blpoVar), blpkVar);
    }

    public final synchronized boolean n(dvrc dvrcVar) {
        dvrc dvrcVar2;
        dvrcVar2 = this.u;
        return dvrcVar2 != null && dvrcVar2 == dvrcVar;
    }

    @Override // defpackage.blpp
    public final blwh o() {
        return this.q;
    }

    @Override // defpackage.blpp
    public final void p(blvw blvwVar, boolean z, @dzsi String str, boolean z2, @dzsi akqi akqiVar, String str2, blpk blpkVar, int i) {
        if (blpk.NOTIFICATION_RIDDLER.equals(blpkVar)) {
            ((ckhe) this.p.a(ckjw.K)).a();
        }
        btlu j2 = this.c.a().j();
        if (!btlu.i(j2).equals(btlt.GOOGLE) || !btlu.h(j2).equals(str2)) {
            this.g.f(str2, new blpb(this, blvwVar, z, str, z2, akqiVar, blpkVar, i));
        } else {
            q(blvwVar, z, str, z2, akqiVar, false, blpkVar, i);
        }
    }

    public final void q(final blvw blvwVar, final boolean z, final String str, final boolean z2, final akqi akqiVar, final boolean z3, final blpk blpkVar, final int i) {
        this.f.b(new Runnable(this, blvwVar, z, str, z2, akqiVar, z3, blpkVar, i) { // from class: bloy
            private final blpf a;
            private final blvw b;
            private final boolean c;
            private final String d;
            private final boolean e;
            private final akqi f;
            private final boolean g;
            private final blpk h;
            private final int i;

            {
                this.a = this;
                this.b = blvwVar;
                this.c = z;
                this.d = str;
                this.e = z2;
                this.f = akqiVar;
                this.g = z3;
                this.h = blpkVar;
                this.i = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final blpf blpfVar = this.a;
                blvw blvwVar2 = this.b;
                final boolean z4 = this.c;
                final String str2 = this.d;
                final boolean z5 = this.e;
                final akqi akqiVar2 = this.f;
                final boolean z6 = this.g;
                final blpk blpkVar2 = this.h;
                final int i2 = this.i;
                final blvw a = blwl.a(blpfVar.b, blvwVar2, blpfVar.c.a().o());
                if (!((efh) blpfVar.d).b || a.a()) {
                    return;
                }
                blpfVar.f.b(new Runnable(blpfVar, a, z4, str2, z5, akqiVar2, blpkVar2, i2, z6) { // from class: bloz
                    private final blpf a;
                    private final blvw b;
                    private final boolean c;
                    private final String d;
                    private final boolean e;
                    private final akqi f;
                    private final blpk g;
                    private final boolean h;
                    private final int i;

                    {
                        this.a = blpfVar;
                        this.b = a;
                        this.c = z4;
                        this.d = str2;
                        this.e = z5;
                        this.f = akqiVar2;
                        this.g = blpkVar2;
                        this.i = i2;
                        this.h = z6;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        blpf blpfVar2 = this.a;
                        blvw blvwVar3 = this.b;
                        boolean z7 = this.c;
                        String str3 = this.d;
                        boolean z8 = this.e;
                        akqi akqiVar3 = this.f;
                        blpk blpkVar3 = this.g;
                        int i3 = this.i;
                        boolean z9 = this.h;
                        bwqv bwqvVar = blpfVar2.e;
                        cqat cqatVar = blpfVar2.h;
                        cjqy cjqyVar = blpfVar2.i;
                        Bundle bundle = new Bundle();
                        bwqvVar.c(bundle, "riddler_questions", blvwVar3);
                        bundle.putBoolean("show_settings_button", z7);
                        bundle.putString("server_ei", str3);
                        bundle.putBoolean("request_follow_on_questions", z8);
                        bundle.putString("riddler_source", blpkVar3.toString());
                        bundle.putString("feature_id", akqiVar3 == null ? null : akqiVar3.o());
                        blox bloxVar = new blox();
                        byte[] bArr = new byte[16];
                        dbsy.b.nextBytes(bArr);
                        String encodeToString = Base64.encodeToString(bArr, 0);
                        cjtk[] cjtkVarArr = new cjtk[1];
                        cjtkVarArr[0] = new blwc(blpkVar3, encodeToString, cqatVar, i3, blvwVar3.a() ? dbpy.a : blvwVar3.a.get(0).c(), cjqyVar.b());
                        cjqyVar.u(cjtkVarArr);
                        bundle.putString("riddler_session_id", encodeToString);
                        bloxVar.B(bundle);
                        if (!((efh) blpfVar2.d).b || !gei.a(blpfVar2.a, bloxVar) || !z9) {
                            return;
                        }
                        blpfVar2.g.p(false);
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }
}
