package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbyk  reason: default package */
/* loaded from: classes5.dex */
class dbyk extends dcks {
    final /* synthetic */ dbyn a;

    public dbyk(dbyn dbynVar) {
        this.a = dbynVar;
    }

    @Override // defpackage.dcks
    public final dcka a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry> iterator() {
        return this.a.w();
    }
}
