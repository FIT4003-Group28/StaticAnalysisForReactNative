package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvoa  reason: default package */
/* loaded from: classes5.dex */
public final class cvoa extends cvob<drzm, drzo> {
    private final cvmy b;

    public cvoa(cvmy cvmyVar) {
        this.b = cvmyVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "RemoveTargetCallback";
    }

    @Override // defpackage.cvob
    public final cvmr<drzm, drzo> b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        cvmy cvmyVar = this.b;
        try {
            cvnh cvnhVar = cvmyVar.h;
            drzl bZ = drzm.e.bZ();
            String a = cvnhVar.a.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drzm drzmVar = (drzm) bZ.b;
            a.getClass();
            drzmVar.a |= 1;
            drzmVar.b = a;
            dsay a2 = cvnhVar.c.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drzm drzmVar2 = (drzm) bZ.b;
            a2.getClass();
            drzmVar2.c = a2;
            drzmVar2.a |= 2;
            dsaf bZ2 = dsai.c.bZ();
            dsag bZ3 = dsah.d.bZ();
            long parseLong = Long.parseLong(cvnhVar.a.c());
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dsah dsahVar = (dsah) bZ3.b;
            dsahVar.a |= 1;
            dsahVar.b = parseLong;
            String a3 = cvnhVar.b.a();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dsah dsahVar2 = (dsah) bZ3.b;
            a3.getClass();
            dsahVar2.a |= 2;
            dsahVar2.c = a3;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dsai dsaiVar = (dsai) bZ2.b;
            dsah bK = bZ3.bK();
            bK.getClass();
            dsaiVar.b = bK;
            dsaiVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drzm drzmVar3 = (drzm) bZ.b;
            dsai bK2 = bZ2.bK();
            bK2.getClass();
            drzmVar3.d = bK2;
            drzmVar3.a |= 4;
            drzm bK3 = bZ.bK();
            cvty<drzo> b = cvmyVar.b.b(string, bK3);
            cvmyVar.a(string, b, 16);
            return cvmr.f(bK3, b);
        } catch (cvml e) {
            cvmp g = cvmr.g();
            g.c = e;
            g.b(true);
            return g.a();
        }
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_REMOVE_TARGET";
    }
}
