package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: kqb  reason: default package */
/* loaded from: classes7.dex */
final class kqb implements afnu {
    final /* synthetic */ kqf a;

    public kqb(kqf kqfVar) {
        this.a = kqfVar;
    }

    @Override // defpackage.afnu
    public final Runnable a(dvzj dvzjVar) {
        akqq akqqVar;
        String a;
        Resources resources = this.a.c.getResources();
        if ((dvzjVar.a & 4) != 0) {
            dhjz dhjzVar = dvzjVar.d;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqqVar = akqq.j(dhjzVar);
        } else {
            akqqVar = null;
        }
        if ((dvzjVar.a & 2) != 0) {
            a = dvzjVar.c;
        } else {
            a = akqqVar != null ? akqqVar.a() : null;
        }
        amvg P = amvh.P();
        P.b = a;
        P.c = akqi.f(dvzjVar.b);
        P.d = akqqVar;
        return new kqe(this.a, ldm.f(P.a(), resources, null), false);
    }

    @Override // defpackage.afnu
    public final Runnable b(ilo iloVar, boolean z) {
        return new kqe(this.a, ldm.a(iloVar), false);
    }
}
