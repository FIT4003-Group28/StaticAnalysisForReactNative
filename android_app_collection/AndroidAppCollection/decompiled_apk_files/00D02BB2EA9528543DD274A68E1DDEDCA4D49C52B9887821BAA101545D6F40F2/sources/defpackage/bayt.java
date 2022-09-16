package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bayt  reason: default package */
/* loaded from: classes3.dex */
public final class bayt implements View.OnClickListener {
    final /* synthetic */ bayu a;

    public bayt(bayu bayuVar) {
        this.a = bayuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bayu bayuVar = this.a;
        dvvh bZ = dvvi.k.bZ();
        dvvb bZ2 = dvvc.d.bZ();
        dndr dndrVar = bayuVar.g;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvvc dvvcVar = (dvvc) bZ2.b;
        dvvcVar.b = dndrVar.h;
        dvvcVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvi dvviVar = (dvvi) bZ.b;
        dvvc bK = bZ2.bK();
        bK.getClass();
        dvviVar.c = bK;
        dvviVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvi dvviVar2 = (dvvi) bZ.b;
        dvviVar2.b = 0;
        dvviVar2.a |= 1;
        dvvd bZ3 = dvve.e.bZ();
        akqq akqqVar = bayuVar.m;
        if (akqqVar != null) {
            dpum h = akqqVar.h();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvve dvveVar = (dvve) bZ3.b;
            h.getClass();
            dvveVar.c = h;
            dvveVar.b = 3;
        }
        if (akqi.d(bayuVar.l)) {
            String o = bayuVar.l.o();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvve dvveVar2 = (dvve) bZ3.b;
            o.getClass();
            dvveVar2.b = 2;
            dvveVar2.c = o;
            String str = bayuVar.i;
            if (str != null) {
                str.getClass();
                dvveVar2.a |= 1;
                dvveVar2.d = str;
            }
        }
        dvve bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvi dvviVar3 = (dvvi) bZ.b;
        bK2.getClass();
        dvviVar3.d = bK2;
        int i = dvviVar3.a | 4;
        dvviVar3.a = i;
        String str2 = bayuVar.j;
        if (str2 != null) {
            str2.getClass();
            dvviVar3.a = i | 32;
            dvviVar3.g = str2;
        }
        if (bayuVar.x()) {
            int i2 = bayuVar.k.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvvi dvviVar4 = (dvvi) bZ.b;
            dvviVar4.a |= 64;
            dvviVar4.h = i2;
        }
        axwy a = bayuVar.d.a();
        dndr dndrVar2 = bayuVar.g;
        long longValue = bayuVar.h.longValue();
        dvve dvveVar3 = ((dvvi) bZ.b).d;
        if (dvveVar3 == null) {
            dvveVar3 = dvve.e;
        }
        a.P(dndrVar2, longValue, dvveVar3.b == 3 ? null : bayuVar.m, bZ.bK(), bayuVar.o);
    }
}
