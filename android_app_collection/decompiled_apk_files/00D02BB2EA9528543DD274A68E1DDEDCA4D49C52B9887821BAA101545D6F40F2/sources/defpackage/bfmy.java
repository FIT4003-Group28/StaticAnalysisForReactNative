package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.base.webcontent.WebContentWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfmy  reason: default package */
/* loaded from: classes3.dex */
public class bfmy implements bfmx {
    private final dxio<bvvw> a;
    private final Resources b;
    private final dosu c;
    private final Runnable d;
    private final int e;

    public bfmy(dxio<bvvw> dxioVar, Resources resources, dosu dosuVar, Runnable runnable, int i) {
        this.a = dxioVar;
        this.b = resources;
        this.c = dosuVar;
        this.d = runnable;
        this.e = i;
    }

    @Override // defpackage.bfmx
    public cqkl a() {
        bvvw a = this.a.a();
        bvxn bZ = bvxu.A.bZ();
        String str = this.c.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        bvxuVar.a |= 1;
        bvxuVar.b = str;
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
        bvxj bZ3 = bvxm.e.bZ();
        String b = b();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxm bvxmVar = (bvxm) bZ3.b;
        b.getClass();
        bvxmVar.a |= 1;
        bvxmVar.b = b;
        bvxm bvxmVar2 = (bvxm) bZ3.b;
        bvxmVar2.c = 1;
        bvxmVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        bvxm bK2 = bZ3.bK();
        bK2.getClass();
        bvxuVar3.t = bK2;
        bvxuVar3.a |= 262144;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i = bvxuVar4.a | 4;
        bvxuVar4.a = i;
        bvxuVar4.d = false;
        bvxuVar4.a = i | 16;
        bvxuVar4.f = 1;
        bvxu.b(bvxuVar4);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        bvxuVar5.a |= 2048;
        bvxuVar5.m = true;
        a.k(bZ.bK(), new WebContentWebViewCallbacks(), dtxr.ch);
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.bfmx
    public String b() {
        return this.b.getQuantityString(R.plurals.HOTEL_WHY_THIS_AD_LINK, Math.max(1, this.e));
    }

    @Override // defpackage.bfmx
    public cjtd c() {
        return cjtd.a(dtxy.iQ);
    }
}
