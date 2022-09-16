package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dciy  reason: default package */
/* loaded from: classes5.dex */
final class dciy extends dbyj {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ dcjj b;

    public dciy(Map.Entry entry, dcjj dcjjVar) {
        this.a = entry;
        this.b = dcjjVar;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object getValue() {
        return this.b.a(this.a.getKey(), this.a.getValue());
    }
}
