package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afmo  reason: default package */
/* loaded from: classes.dex */
final class afmo extends LinkedHashMap {
    public afmo() {
        super(16, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 16;
    }
}
