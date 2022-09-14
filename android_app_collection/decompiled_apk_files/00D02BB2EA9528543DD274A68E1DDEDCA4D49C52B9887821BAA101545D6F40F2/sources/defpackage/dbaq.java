package defpackage;

import com.google.ar.core.AugmentedFace;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbaq  reason: default package */
/* loaded from: classes5.dex */
final class dbaq extends LinkedHashMap<Long, AugmentedFace> {
    public dbaq() {
        super(1, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<Long, AugmentedFace> entry) {
        return size() > 10;
    }
}
