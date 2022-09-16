package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ykn  reason: default package */
/* loaded from: classes4.dex */
final class ykn extends LinkedHashMap {
    final /* synthetic */ yko a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykn(yko ykoVar, int i) {
        super(i, 0.75f, true);
        this.a = ykoVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int size = this.a.b.size();
        yko ykoVar = this.a;
        if (size > ykoVar.a) {
            ykoVar.b(entry.getKey());
            return false;
        }
        return false;
    }
}
