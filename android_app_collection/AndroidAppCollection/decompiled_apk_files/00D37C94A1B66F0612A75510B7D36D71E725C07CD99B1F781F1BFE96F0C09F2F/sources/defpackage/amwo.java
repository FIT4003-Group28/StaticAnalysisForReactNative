package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amwo  reason: default package */
/* loaded from: classes.dex */
final class amwo extends amrt {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ amwu b;

    public amwo(Map.Entry entry, amwu amwuVar) {
        this.a = entry;
        this.b = amwuVar;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getValue() {
        amwu amwuVar = this.b;
        this.a.getKey();
        return amwuVar.a(this.a.getValue());
    }
}
