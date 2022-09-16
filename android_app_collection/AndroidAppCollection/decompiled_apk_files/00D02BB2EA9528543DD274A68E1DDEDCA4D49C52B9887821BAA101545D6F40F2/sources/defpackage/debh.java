package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: debh  reason: default package */
/* loaded from: classes6.dex */
final class debh extends dcbo {
    final /* synthetic */ Map.Entry a;

    public debh(Map.Entry entry) {
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
    public final Object setValue(Object obj) {
        dbsk.x(obj, "null value in entry (%s, %s)", getKey(), obj);
        return this.a.setValue(obj);
    }
}
