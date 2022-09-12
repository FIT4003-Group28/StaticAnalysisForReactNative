package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcli  reason: default package */
/* loaded from: classes5.dex */
final class dcli extends dcbo {
    final /* synthetic */ Map.Entry a;

    public dcli(Map.Entry entry) {
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
        return super.setValue(dclm.d((Class) getKey(), obj));
    }
}
