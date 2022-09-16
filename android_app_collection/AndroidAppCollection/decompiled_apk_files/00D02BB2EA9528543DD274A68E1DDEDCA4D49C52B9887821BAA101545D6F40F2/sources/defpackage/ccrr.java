package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ccrr  reason: default package */
/* loaded from: classes4.dex */
final class ccrr implements degu<List<drax>> {
    final /* synthetic */ bvqg a;
    final /* synthetic */ dcdc b;
    final /* synthetic */ ccru c;

    public ccrr(ccru ccruVar, bvqg bvqgVar, dcdc dcdcVar) {
        this.c = ccruVar;
        this.a = bvqgVar;
        this.b = dcdcVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.size();
        this.c.d(this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<drax> list) {
        List<drax> list2 = list;
        list2.size();
        this.a.NU(list2);
    }
}
