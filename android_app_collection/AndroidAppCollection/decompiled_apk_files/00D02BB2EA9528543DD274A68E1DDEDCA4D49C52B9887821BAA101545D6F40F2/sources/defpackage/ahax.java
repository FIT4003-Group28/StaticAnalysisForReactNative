package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahax  reason: default package */
/* loaded from: classes2.dex */
final class ahax implements degu<List<cqix<?>>> {
    final /* synthetic */ ahay a;

    public ahax(ahay ahayVar) {
        this.a = ahayVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ahbb ahbbVar = this.a.a;
        ahbbVar.d = false;
        cqkx.p(ahbbVar);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<cqix<?>> list) {
        List<cqix<?>> list2 = list;
        this.a.a.a.addAll(list2);
        ahbb ahbbVar = this.a.a;
        ahbbVar.b = new ArrayList(ahbbVar.b);
        this.a.a.b.addAll(dchl.k(list2, ahaw.a));
        ahbb ahbbVar2 = this.a.a;
        ahbbVar2.d = false;
        cqkx.p(ahbbVar2);
    }
}
