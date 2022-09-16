package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amwp  reason: default package */
/* loaded from: classes.dex */
final class amwp implements ampg {
    final /* synthetic */ amwu a;

    public amwp(amwu amwuVar) {
        this.a = amwuVar;
    }

    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        amwu amwuVar = this.a;
        entry.getClass();
        return new amwo(entry, amwuVar);
    }
}
