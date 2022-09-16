package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: anmy  reason: default package */
/* loaded from: classes.dex */
public final class anmy {
    public final ConcurrentMap a = new ConcurrentHashMap();
    public anmw b;
    public final Class c;

    public anmy(Class cls) {
        this.c = cls;
    }

    public final List a(byte[] bArr) {
        List list = (List) this.a.get(new anmx(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
