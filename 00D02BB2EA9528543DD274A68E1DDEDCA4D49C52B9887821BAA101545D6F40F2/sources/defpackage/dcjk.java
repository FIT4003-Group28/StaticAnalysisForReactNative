package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjk  reason: default package */
/* loaded from: classes5.dex */
final class dcjk extends dcbo {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ dcjl b;

    public dcjk(dcjl dcjlVar, Map.Entry entry) {
        this.b = dcjlVar;
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
        dbsk.a(this.b.a.a.b(getKey(), obj));
        return super.setValue(obj);
    }
}
