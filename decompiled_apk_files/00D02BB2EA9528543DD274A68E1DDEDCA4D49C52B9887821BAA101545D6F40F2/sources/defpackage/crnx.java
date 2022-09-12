package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: crnx  reason: default package */
/* loaded from: classes5.dex */
final class crnx implements degu<List<Boolean>> {
    final /* synthetic */ int a;
    final /* synthetic */ crnz b;

    public crnx(crnz crnzVar, int i) {
        this.b = crnzVar;
        this.a = i;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi List<Boolean> list) {
        List<Boolean> list2 = list;
        bvrj.NAVIGATION_INTERNAL.c();
        dcdc<bzqb> dcdcVar = crnz.a;
        int i = this.a;
        crnz crnzVar = this.b;
        if (i != crnzVar.f) {
            crnzVar.hashCode();
        } else if (list2 != null && list2.size() == 2 && list2.get(0) != null && list2.get(1) != null && list2.get(0).booleanValue() && list2.get(1).booleanValue()) {
            this.b.g();
        } else {
            crnz crnzVar2 = this.b;
            crnzVar2.c(true, crnzVar2.f);
        }
    }
}
