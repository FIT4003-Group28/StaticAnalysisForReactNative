package defpackage;

import android.net.Uri;
import com.google.android.apps.gmm.reportmapissue.webview.RapWizardWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bovx  reason: default package */
/* loaded from: classes3.dex */
public final class bovx implements aket {
    public transient bvvw a;
    public transient btvo b;
    public transient bvjj c;
    public transient dxio<boxa> d;
    @dzsi
    private final bwrs<ilo> e;
    private final bvrt<dnqe> f;

    public bovx(@dzsi bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        this.e = bwrsVar;
        this.f = bvrt.b(bpun.a(dnqeVar, dnpv.RAP_WIZARD_VERSION, "webview"));
    }

    private final boolean e() {
        return this.b.getUgcParameters().Z();
    }

    private final boolean f() {
        dnqb b = dnqb.b(d().b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        return b == dnqb.ACCOUNT_PARTICLE;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        c(ggaVar);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }

    public final void c(gga ggaVar) {
        String string;
        ((bovy) btsq.b(bovy.class, ggaVar)).xu(this);
        String Y = this.b.getUgcParameters().Y();
        boolean z = false;
        if (this.c.m(bvjk.hW, false)) {
            Y = this.c.z(bvjk.hV, Y);
        }
        Uri.Builder buildUpon = Uri.parse(Y).buildUpon();
        if (this.e != null) {
            ddae h = ddae.e.h();
            bwrs<ilo> bwrsVar = this.e;
            ilo c = bwrsVar.c();
            dbsk.s(c);
            doaz cd = c.cd();
            dgnm bZ = dgnn.o.bZ();
            String str = cd.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgnn dgnnVar = (dgnn) bZ.b;
            str.getClass();
            dgnnVar.a |= 1;
            dgnnVar.b = str;
            doay b = doay.b(cd.b);
            if (b == null) {
                b = doay.UNSUPPORTED;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgnn dgnnVar2 = (dgnn) bZ.b;
            dgnnVar2.d = b.j;
            dgnnVar2.a |= 4;
            boolean z2 = this.b.getUgcParameters().aa() && this.d.a().o(bwrsVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgnn dgnnVar3 = (dgnn) bZ.b;
            dgnnVar3.a |= 32;
            dgnnVar3.g = z2;
            boolean z3 = this.b.getUgcParameters().aA() && this.d.a().r(bwrsVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgnn dgnnVar4 = (dgnn) bZ.b;
            dgnnVar4.a |= 64;
            dgnnVar4.h = z3;
            if ((cd.a & 4) != 0) {
                dnoh dnohVar = cd.d;
                if (dnohVar == null) {
                    dnohVar = dnoh.d;
                }
                dhjz i = akqq.e(dnohVar).i();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgnn dgnnVar5 = (dgnn) bZ.b;
                i.getClass();
                dgnnVar5.c = i;
                dgnnVar5.a |= 2;
            }
            if (c.i && c.aj() != null) {
                dhjz i2 = c.aj().i();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgnn dgnnVar6 = (dgnn) bZ.b;
                i2.getClass();
                dgnnVar6.e = i2;
                dgnnVar6.a |= 8;
            }
            dnqb dnqbVar = dnqb.UNKNOWN_ENTRY_POINT;
            doay b2 = doay.b(cd.b);
            if (b2 == null) {
                b2 = doay.UNSUPPORTED;
            }
            int ordinal = b2.ordinal();
            if (ordinal == 0) {
                dodc dodcVar = cd.e;
                if (dodcVar == null) {
                    dodcVar = dodc.i;
                }
                boolean z4 = !dodcVar.h.isEmpty();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgnn dgnnVar7 = (dgnn) bZ.b;
                dgnnVar7.a |= 16;
                dgnnVar7.f = z4;
            } else if (ordinal == 4) {
                dnnc dnncVar = cd.i;
                if (dnncVar == null) {
                    dnncVar = dnnc.e;
                }
                if ((dnncVar.a & 2) != 0) {
                    String str2 = dnncVar.d;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dgnn dgnnVar8 = (dgnn) bZ.b;
                    str2.getClass();
                    dgnnVar8.a |= 128;
                    dgnnVar8.i = str2;
                }
            }
            buildUpon.appendQueryParameter("f", h.i(bZ.bK().bS()));
        }
        buildUpon.appendQueryParameter("c", ddae.e.h().i(d().bS()));
        dgmw bZ2 = dgmx.f.bZ();
        boolean e = e();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgmx dgmxVar = (dgmx) bZ2.b;
        dgmxVar.a |= 1;
        dgmxVar.b = e;
        boolean n = this.d.a().n();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgmx dgmxVar2 = (dgmx) bZ2.b;
        dgmxVar2.a |= 2;
        dgmxVar2.c = n;
        boolean z5 = this.b.getEnableFeatureParameters().bp;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgmx dgmxVar3 = (dgmx) bZ2.b;
        dgmxVar3.a |= 4;
        dgmxVar3.d = z5;
        boolean f = f();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgmx dgmxVar4 = (dgmx) bZ2.b;
        dgmxVar4.a |= 8;
        dgmxVar4.e = f;
        buildUpon.appendQueryParameter("ca", ddae.e.h().i(bZ2.bK().bS()));
        bvxn bZ3 = bvxu.A.bZ();
        String uri = buildUpon.build().toString();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ3.b;
        uri.getClass();
        bvxuVar.a |= 1;
        bvxuVar.b = uri;
        boolean z6 = !e();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ3.b;
        int i3 = 4 | bvxuVar2.a;
        bvxuVar2.a = i3;
        bvxuVar2.d = z6;
        bvxuVar2.a = i3 | 32;
        bvxuVar2.g = true;
        bvxu.b(bvxuVar2);
        bvxp f2 = bvoa.f(ibm.b(), ggaVar);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ3.b;
        f2.getClass();
        bvxuVar3.x = f2;
        int i4 = bvxuVar3.a | 4194304;
        bvxuVar3.a = i4;
        bvxuVar3.a = i4 | 512;
        bvxuVar3.k = true;
        dkyw bZ4 = dkyx.f.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dkyx.b((dkyx) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dkyx.c((dkyx) bZ4.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ3.b;
        dkyx bK = bZ4.bK();
        bK.getClass();
        bvxuVar4.j = bK;
        bvxuVar4.a |= 256;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ3.b;
        bvxuVar5.a |= 64;
        bvxuVar5.h = "aGmm.RapWizard";
        doay doayVar = doay.TYPE_ROAD;
        dnqb dnqbVar2 = dnqb.UNKNOWN_ENTRY_POINT;
        dnqb b3 = dnqb.b(d().b);
        if (b3 == null) {
            b3 = dnqb.UNKNOWN_ENTRY_POINT;
        }
        int ordinal2 = b3.ordinal();
        if (ordinal2 == 1 || ordinal2 == 51) {
            String string2 = ggaVar.getString(R.string.RAP_DISAMBIGUATION_TITLE);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bvxu bvxuVar6 = (bvxu) bZ3.b;
            string2.getClass();
            bvxuVar6.a |= 8192;
            bvxuVar6.o = string2;
        } else {
            if (f()) {
                string = ggaVar.getString(R.string.HELP_AND_FEEDBACK);
            } else {
                string = ggaVar.getString(R.string.SEND_FEEDBACK);
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bvxu bvxuVar7 = (bvxu) bZ3.b;
            string.getClass();
            bvxuVar7.a |= 8192;
            bvxuVar7.o = string;
        }
        bvvr e2 = bvvs.e();
        e2.b(bZ3.bK());
        bwrs<ilo> bwrsVar2 = this.e;
        dnqb b4 = dnqb.b(d().b);
        if (b4 == null) {
            b4 = dnqb.UNKNOWN_ENTRY_POINT;
        }
        if (b4 != dnqb.ACCOUNT_PARTICLE_INTERMEDIATE) {
            z = true;
        }
        RapWizardWebViewCallbacks rapWizardWebViewCallbacks = new RapWizardWebViewCallbacks(bwrsVar2, z);
        bvvn bvvnVar = (bvvn) e2;
        bvvnVar.b = rapWizardWebViewCallbacks;
        bvvnVar.a = bovh.class;
        bvvs a = e2.a();
        ((ckhe) ((ckcu) btsr.a(ckcu.class)).rU().a(ckji.a)).a();
        this.a.r(a, dtya.n);
    }

    final dnqe d() {
        return this.f.e((dssr) dnqe.i.cu(7), dnqe.i);
    }
}
