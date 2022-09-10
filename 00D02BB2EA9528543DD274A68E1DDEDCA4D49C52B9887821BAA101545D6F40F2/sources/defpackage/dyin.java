package defpackage;

import java.net.URI;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyin  reason: default package */
/* loaded from: classes6.dex */
public final class dyin extends dyif {
    final /* synthetic */ dyip a;

    public dyin(dyip dyipVar) {
        this.a = dyipVar;
    }

    @Override // defpackage.dyif
    @dzsi
    public final dyik a(URI uri, dyid dyidVar) {
        for (dyil dyilVar : this.a.b()) {
            dyik a = dyilVar.a(uri, dyidVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // defpackage.dyif
    public final String b() {
        List<dyil> b = this.a.b();
        return b.isEmpty() ? "unknown" : b.get(0).b();
    }
}
