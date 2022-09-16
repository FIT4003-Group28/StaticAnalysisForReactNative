package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcnw  reason: default package */
/* loaded from: classes5.dex */
final class dcnw extends dcbo {
    final /* synthetic */ Map.Entry a;

    public dcnw(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.dcbo, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbo
    protected final Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.dcbo, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return dbsd.a(getKey(), entry.getKey()) && dbsd.a(getValue(), entry.getValue());
        }
        return false;
    }

    @Override // defpackage.dcbo, java.util.Map.Entry
    public final Object setValue(Object obj) {
        dbsk.s(obj);
        return super.setValue(obj);
    }
}
