package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: croz  reason: default package */
/* loaded from: classes5.dex */
public final class croz {
    public static final croz a = new croz();
    private final List<croy> b = new ArrayList();

    public final synchronized List<ddvr> a() {
        if (this.b.isEmpty()) {
            return dcdc.e();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<croy> it = this.b.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        this.b.clear();
        return dcdc.r(arrayList);
    }

    public final synchronized void b() {
    }
}
