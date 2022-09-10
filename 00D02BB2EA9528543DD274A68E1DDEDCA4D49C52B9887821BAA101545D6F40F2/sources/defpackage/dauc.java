package defpackage;

import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dauc  reason: default package */
/* loaded from: classes5.dex */
final class dauc implements Map.Entry<String, Object> {
    final /* synthetic */ dauf a;
    private Object b;
    private final dauh c;

    public dauc(dauf daufVar, dauh dauhVar, Object obj) {
        this.a = daufVar;
        this.c = dauhVar;
        dbsk.s(obj);
        this.b = obj;
    }

    @Override // java.util.Map.Entry
    /* renamed from: a */
    public final String getKey() {
        String str = this.c.c;
        return this.a.b.b ? str.toLowerCase(Locale.US) : str;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return getKey().equals(entry.getKey()) && this.b.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return getKey().hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.b;
        dbsk.s(obj);
        this.b = obj;
        this.c.f(this.a.a, obj);
        return obj2;
    }
}
