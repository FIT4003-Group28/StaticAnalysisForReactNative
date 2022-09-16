package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: altw  reason: default package */
/* loaded from: classes.dex */
public final class altw implements Serializable {
    public final List<altv> a;

    public altw(List<altv> list) {
        this.a = list;
    }

    public static altw a(@dzsi dmjo dmjoVar) {
        dccx F = dcdc.F();
        if (dmjoVar != null) {
            int size = dmjoVar.a.size();
            for (int i = 0; i < size; i++) {
                altv d = altv.d(dmjoVar.a.get(i));
                if (d != null) {
                    F.g(d);
                }
            }
        }
        return new altw(F.f());
    }
}
