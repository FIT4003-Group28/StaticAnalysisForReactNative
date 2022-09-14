package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dsse  reason: default package */
/* loaded from: classes.dex */
final class dsse {
    public static final dssb<?, ?> a(Object obj) {
        return ((dssc) obj).a;
    }

    public static final int b(int i, Object obj, Object obj2) {
        dssd dssdVar = (dssd) obj;
        dssc dsscVar = (dssc) obj2;
        int i2 = 0;
        if (!dssdVar.isEmpty()) {
            for (Map.Entry entry : dssdVar.entrySet()) {
                i2 += dspp.Y(i) + dspp.ak(dssc.c(dsscVar.a, entry.getKey(), entry.getValue()));
            }
        }
        return i2;
    }

    public static final boolean c(Object obj) {
        return !((dssd) obj).a;
    }

    public static final Object d(Object obj, Object obj2) {
        dssd dssdVar = (dssd) obj;
        dssd dssdVar2 = (dssd) obj2;
        if (!dssdVar2.isEmpty()) {
            if (!dssdVar.a) {
                dssdVar = dssdVar.a();
            }
            dssdVar.c();
            if (!dssdVar2.isEmpty()) {
                dssdVar.putAll(dssdVar2);
            }
        }
        return dssdVar;
    }

    public static final Object e() {
        return dssd.b.a();
    }
}
