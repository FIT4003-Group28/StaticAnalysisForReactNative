package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qzs  reason: default package */
/* loaded from: classes4.dex */
public final class qzs {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());

    public final Object a(Object obj) {
        return this.a.get(obj);
    }
}
