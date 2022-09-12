package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdj  reason: default package */
/* loaded from: classes5.dex */
final class dcdj extends dbyj {
    final /* synthetic */ Map.Entry a;

    public dcdj(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return dcep.B(this.a.getValue());
    }
}
