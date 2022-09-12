package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ayrm  reason: default package */
/* loaded from: classes3.dex */
public final class ayrm {
    private final Context a;
    private final btvo b;

    public ayrm(Context context, btvo btvoVar) {
        this.a = context;
        this.b = btvoVar;
    }

    public final bvxu a(String str, int i) {
        int i2 = i - 1;
        boolean z = i2 == 1;
        bvxn bZ = bvxu.A.bZ();
        debv a = debv.a(this.b.getPlaceListsParameters().c);
        a.c = "/local/userlists/related";
        a.d("list_id", str);
        a.d("page_type", Integer.toString(i2));
        String debvVar = a.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        debvVar.getClass();
        int i3 = bvxuVar.a | 1;
        bvxuVar.a = i3;
        bvxuVar.b = debvVar;
        bvxuVar.a = i3 | 4;
        bvxuVar.d = false;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        bvxuVar2.a |= 8;
        bvxuVar2.e = true;
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
        dkyx dkyxVar = (dkyx) bZ2.b;
        dkyxVar.a |= 4;
        dkyxVar.d = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar3.j = bK;
        bvxuVar3.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i4 = bvxuVar4.a | 64;
        bvxuVar4.a = i4;
        bvxuVar4.h = "aGMM.PlaceListDetailsRelatedLists";
        int i5 = i4 | 131072;
        bvxuVar4.a = i5;
        bvxuVar4.s = z;
        bvxuVar4.a = i5 | 16;
        bvxuVar4.f = 1;
        bvxp f = bvoa.f(ibm.a(), this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar5.x = f;
        int i6 = bvxuVar5.a | 4194304;
        bvxuVar5.a = i6;
        bvxuVar5.a = i6 | 512;
        bvxuVar5.k = !z;
        return bZ.bK();
    }
}
