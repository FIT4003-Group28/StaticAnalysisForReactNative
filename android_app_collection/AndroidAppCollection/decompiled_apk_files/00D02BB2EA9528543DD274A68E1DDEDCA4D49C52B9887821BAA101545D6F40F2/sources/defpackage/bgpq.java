package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bgpq  reason: default package */
/* loaded from: classes3.dex */
final class bgpq implements cqfc {
    final /* synthetic */ bgpt a;

    public bgpq(bgpt bgptVar) {
        this.a = bgptVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        bgnd bgndVar;
        bgpt bgptVar = this.a;
        if (bgptVar.s || (bgndVar = bgptVar.m) == null) {
            return;
        }
        bgptVar.s = true;
        bvrj.UI_THREAD.c();
        if (bgndVar.f != null) {
            return;
        }
        dipp bZ = dipt.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dipt diptVar = (dipt) bZ.b;
        diptVar.b = 2;
        int i = diptVar.a | 1;
        diptVar.a = i;
        String str = bgndVar.b;
        str.getClass();
        int i2 = i | 4;
        diptVar.a = i2;
        diptVar.d = str;
        diptVar.a = i2 | 32;
        diptVar.g = 10;
        dspd dspdVar = bgndVar.h;
        if (dspdVar != null) {
            dipt diptVar2 = (dipt) bZ.b;
            dspdVar.getClass();
            diptVar2.a |= 16;
            diptVar2.f = dspdVar;
        }
        Long l = bgndVar.c;
        if (l != null) {
            long longValue = l.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dipt diptVar3 = (dipt) bZ.b;
            diptVar3.a = 2 | diptVar3.a;
            diptVar3.c = longValue;
        }
        if (bgndVar.d != null) {
            dipr bZ2 = dips.c.bZ();
            long longValue2 = bgndVar.d.longValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dips dipsVar = (dips) bZ2.b;
            dipsVar.a |= 1;
            dipsVar.b = longValue2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dipt diptVar4 = (dipt) bZ.b;
            dips bK = bZ2.bK();
            bK.getClass();
            dsrj<dips> dsrjVar = diptVar4.h;
            if (!dsrjVar.a()) {
                diptVar4.h = dsqw.cl(dsrjVar);
            }
            diptVar4.h.add(bK);
        }
        if (bgndVar.a.l(bwrs.a(bgndVar.e))) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dipt diptVar5 = (dipt) bZ.b;
            diptVar5.a |= 256;
            diptVar5.i = true;
        }
        bgndVar.f = bZ.bK();
        bvrj.UI_THREAD.c();
        dipt diptVar6 = bgndVar.f;
        if (diptVar6 == null) {
            return;
        }
        btzc btzcVar = bgndVar.g;
        if (btzcVar != null) {
            btzcVar.a();
        }
        bgndVar.g = bgndVar.i.a(diptVar6, bgndVar, bvrj.UI_THREAD);
    }
}
