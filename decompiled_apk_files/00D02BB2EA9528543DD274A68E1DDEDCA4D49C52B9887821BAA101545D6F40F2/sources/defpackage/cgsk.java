package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cgsk  reason: default package */
/* loaded from: classes4.dex */
public abstract class cgsk {
    public abstract dwqg a();

    public abstract dwqc b();

    public abstract dvyw c();

    public final boolean d(int i, Set<dspd> set) {
        int i2 = i - 1;
        if (i2 == 1) {
            for (dwpn dwpnVar : a().d) {
                if (set.contains(dwpnVar.b)) {
                    return true;
                }
            }
            return false;
        } else if (i2 != 2) {
            return true;
        } else {
            for (dwpv dwpvVar : b().d) {
                if (set.contains(dwpvVar.a)) {
                    return true;
                }
            }
            return false;
        }
    }
}
