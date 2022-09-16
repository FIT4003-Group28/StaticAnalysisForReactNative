package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: zhe  reason: default package */
/* loaded from: classes7.dex */
public final class zhe {
    public final btvo a;
    public final zhi b;

    public zhe(btvo btvoVar, zhi zhiVar) {
        this.a = btvoVar;
        this.b = zhiVar;
    }

    public static dcdc<GmmNotice> a(vnk vnkVar) {
        amte p = vnkVar.l().d().p();
        if (p == null) {
            return dcdc.e();
        }
        return b(p.a);
    }

    public static dcdc<GmmNotice> b(amsy amsyVar) {
        dccx F = dcdc.F();
        dvzu dvzuVar = amsyVar.a().b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        for (int i = 0; i < dvzuVar.m.size(); i++) {
            dozz dozzVar = dvzuVar.m.get(i);
            dozy b = dozy.b(dozzVar.f);
            if (b == null) {
                b = dozy.UNKNOWN;
            }
            F.g(GmmNotice.e(dozzVar, b == dozy.BUSYNESS ? (dwag) Collections.unmodifiableMap(dvzuVar.n).get(Integer.valueOf(i)) : null));
        }
        return F.f();
    }
}
