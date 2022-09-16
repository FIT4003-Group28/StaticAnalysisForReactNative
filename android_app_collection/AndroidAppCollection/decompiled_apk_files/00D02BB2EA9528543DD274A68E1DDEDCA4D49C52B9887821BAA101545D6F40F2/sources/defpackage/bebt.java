package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bebt  reason: default package */
/* loaded from: classes3.dex */
public final class bebt {
    private final gga a;
    private final dxio<bvvw> b;
    private final dxio<afha> c;
    private final dxio<afef> d;
    private final dxio<afec> e;
    @dzsi
    private final Intent f;
    @dzsi
    private final WebViewCallbacks g;
    private final String h;
    private final ddho i;
    private final boolean j;

    public bebt(gga ggaVar, dxio<bvvw> dxioVar, dxio<afha> dxioVar2, dxio<afef> dxioVar3, dxio<afec> dxioVar4, @dzsi Intent intent, @dzsi WebViewCallbacks webViewCallbacks, dnxf dnxfVar, ddho ddhoVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dxioVar4;
        this.f = intent;
        this.g = webViewCallbacks;
        dqdk dqdkVar = dnxfVar.g;
        dqmk dqmkVar = (dqdkVar == null ? dqdk.e : dqdkVar).c;
        this.h = (dqmkVar == null ? dqmk.c : dqmkVar).a;
        this.i = ddhoVar;
        this.j = !dnxfVar.c;
    }

    public final void a() {
        if (!this.e.a().a() || this.j) {
            if (this.f == null) {
                b();
                return;
            }
            this.c.a().n(this.a, this.f, 4, new Runnable(this) { // from class: bebs
                private final bebt a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
            return;
        }
        afdt afdtVar = afdt.a;
        this.d.a().r();
    }

    public final void b() {
        String str = this.h;
        if (str == null || Uri.parse(str).getQueryParameter("oiwv") == null) {
            this.a.D(gfk.i(this.h, "mail"));
            return;
        }
        bvvw a = this.b.a();
        bvxn bZ = bvxu.A.bZ();
        String str2 = this.h;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str2.getClass();
        bvxuVar.a |= 1;
        bvxuVar.b = str2;
        boolean z = Uri.parse(this.h).getQueryParameter("allowGuest") == null;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        int i = bvxuVar2.a | 4;
        bvxuVar2.a = i;
        bvxuVar2.d = z;
        bvxuVar2.a = i | 32;
        bvxuVar2.g = true;
        bvxu.b(bvxuVar2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        bvxuVar3.a |= 8;
        bvxuVar3.e = true;
        bvxp f = bvoa.f(ibm.b(), this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar4.x = f;
        bvxuVar4.a |= 4194304;
        bvxp f2 = bvoa.f(ibm.b(), this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        f2.getClass();
        bvxuVar5.y = f2;
        int i2 = bvxuVar5.a | 8388608;
        bvxuVar5.a = i2;
        bvxuVar5.a = i2 | ImageMetadata.LENS_APERTURE;
        bvxuVar5.u = 0;
        bvxu.e(bvxuVar5);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu.d((bvxu) bZ.b);
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.c((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar6 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar6.j = bK;
        bvxuVar6.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar7 = (bvxu) bZ.b;
        bvxuVar7.a |= 512;
        bvxuVar7.k = true;
        bvxu.c(bvxuVar7);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar8 = (bvxu) bZ.b;
        bvxuVar8.a |= 2048;
        bvxuVar8.m = true;
        a.k(bZ.bK(), this.g, this.i);
    }
}
