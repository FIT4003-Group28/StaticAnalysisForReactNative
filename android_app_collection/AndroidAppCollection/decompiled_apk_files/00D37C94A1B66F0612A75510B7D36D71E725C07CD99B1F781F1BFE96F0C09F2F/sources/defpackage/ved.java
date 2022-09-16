package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ved  reason: default package */
/* loaded from: classes4.dex */
final class ved extends LinkedHashMap {
    public ved() {
        super(134, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }
}
