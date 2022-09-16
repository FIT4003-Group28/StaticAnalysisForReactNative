package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: scy  reason: default package */
/* loaded from: classes7.dex */
final class scy implements degu<List<dbsg<dopk>>> {
    final /* synthetic */ scz a;

    public scy(scz sczVar) {
        this.a = sczVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi List<dbsg<dopk>> list) {
        List<dbsg<dopk>> list2 = list;
        if (list2 == null) {
            a(new NullPointerException());
            return;
        }
        scz sczVar = this.a;
        sczVar.a.j(sdv.d(sczVar.b, sczVar.d, list2));
    }
}
