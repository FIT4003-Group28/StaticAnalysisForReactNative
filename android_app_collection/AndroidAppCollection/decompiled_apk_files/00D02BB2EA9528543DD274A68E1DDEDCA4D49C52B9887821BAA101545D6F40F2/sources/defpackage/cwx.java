package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cwx  reason: default package */
/* loaded from: classes5.dex */
public final class cwx implements cwv {
    public final dxio<ckcw> a;
    private final Context b;
    private final dxio<cvv> c;
    private final dxio<afha> d;
    private final dxio<bvvw> e;

    public cwx(Context context, dxio<cvv> dxioVar, dxio<afha> dxioVar2, dxio<bvvw> dxioVar3, dxio<ckcw> dxioVar4) {
        this.b = context;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.a = dxioVar4;
    }

    private final String c(String str) {
        ckz ckzVar = new ckz(Uri.parse(str));
        dbsg<String> b = !ckzVar.a() ? dbpy.a : ckzVar.b(dcdn.l(ckx.SONIC_ASYNC_KEY, "1", ckx.REQUEST_SENDER_INFO_KEY, cky.XHR_REQUEST.e));
        if (ckzVar.a() && b.a()) {
            ((ckcn) this.a.a().a(ckfc.b)).a();
            this.c.a().b(b.b(), new cww(this));
        }
        if (!ckzVar.a()) {
            return ckzVar.a.toString();
        }
        return ckzVar.b(dcdn.k(ckx.SONIC_FOREGROUND_KEY, "1")).c(ckzVar.a.toString());
    }

    @Override // defpackage.cwv
    public final void a(String str) {
        this.d.a().k(this.b, c(str), 1);
    }

    @Override // defpackage.cwv
    public final void b(String str, ddho ddhoVar) {
        bvvw a = this.e.a();
        String c = c(str);
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        c.getClass();
        bvxuVar.a |= 1;
        bvxuVar.b = c;
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar2.j = bK;
        bvxuVar2.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        int i = bvxuVar3.a | 4;
        bvxuVar3.a = i;
        bvxuVar3.d = false;
        bvxuVar3.a = i | 16;
        bvxuVar3.f = 1;
        bvxu.b(bvxuVar3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i2 = bvxuVar4.a | 512;
        bvxuVar4.a = i2;
        bvxuVar4.k = true;
        bvxuVar4.a = i2 | 2048;
        bvxuVar4.m = true;
        a.k(bZ.bK(), null, ddhoVar);
    }
}
