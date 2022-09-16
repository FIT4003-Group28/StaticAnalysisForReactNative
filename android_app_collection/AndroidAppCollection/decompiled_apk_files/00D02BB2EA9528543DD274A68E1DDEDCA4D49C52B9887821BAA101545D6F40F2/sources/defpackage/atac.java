package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atac  reason: default package */
/* loaded from: classes2.dex */
public final class atac extends LinkedHashMap<String, aszw> {
    private final int a;

    public atac() {
        super(14, 0.7f, true);
        this.a = 10;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<String, aszw> entry) {
        return size() > this.a;
    }
}
