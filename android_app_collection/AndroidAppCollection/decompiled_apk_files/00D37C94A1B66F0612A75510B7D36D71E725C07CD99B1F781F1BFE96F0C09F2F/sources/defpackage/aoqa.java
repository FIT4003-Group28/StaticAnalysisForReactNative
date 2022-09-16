package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aoqa  reason: default package */
/* loaded from: classes.dex */
final class aoqa implements Map.Entry {
    public final Map.Entry a;

    public aoqa(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((aoqc) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof aoqu)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        aoqc aoqcVar = (aoqc) this.a.getValue();
        aoqu aoquVar = aoqcVar.a;
        aoqcVar.b = null;
        aoqcVar.a = (aoqu) obj;
        return aoquVar;
    }
}
