package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcoe  reason: default package */
/* loaded from: classes5.dex */
final class dcoe extends dcbo {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ dcof b;

    public dcoe(dcof dcofVar, Map.Entry entry) {
        this.b = dcofVar;
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
    public final /* bridge */ /* synthetic */ Object getValue() {
        return dcos.e((Collection) this.a.getValue(), this.b.a.g);
    }
}
