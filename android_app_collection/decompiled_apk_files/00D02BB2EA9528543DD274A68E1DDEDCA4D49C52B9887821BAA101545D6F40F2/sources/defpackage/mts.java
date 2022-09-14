package defpackage;

import com.google.android.gms.car.CarUiInfo;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: mts  reason: default package */
/* loaded from: classes7.dex */
public final class mts implements Factory<jzp> {
    public static jzp b(cli cliVar) {
        try {
            cnhy M = cliVar.M();
            if (M != null) {
                CarUiInfo carUiInfo = new cnhx(M.a.a()).a;
                return key.k(carUiInfo.b, carUiInfo.a, carUiInfo.f, carUiInfo.e, carUiInfo.d);
            }
            CarUiInfo c = ((cnic) cliVar.N()).a.c();
            dbsk.s(c);
            CarUiInfo carUiInfo2 = new cnib(c).a;
            return key.k(carUiInfo2.b, carUiInfo2.a, carUiInfo2.f, carUiInfo2.e, carUiInfo2.d);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
