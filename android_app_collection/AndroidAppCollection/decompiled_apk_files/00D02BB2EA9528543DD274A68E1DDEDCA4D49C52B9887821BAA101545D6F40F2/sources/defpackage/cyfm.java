package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cyfm  reason: default package */
/* loaded from: classes5.dex */
final class cyfm extends LinkedHashMap {
    final /* synthetic */ cyfn a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyfm(cyfn cyfnVar) {
        super(0, 0.75f, true);
        this.a = cyfnVar;
        this.b = 500;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.b || ((cyfl) entry.getValue()).a();
    }
}
