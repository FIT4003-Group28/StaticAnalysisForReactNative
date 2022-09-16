package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aeag  reason: default package */
/* loaded from: classes.dex */
final class aeag extends LinkedHashMap {
    public aeag() {
        super(10, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
