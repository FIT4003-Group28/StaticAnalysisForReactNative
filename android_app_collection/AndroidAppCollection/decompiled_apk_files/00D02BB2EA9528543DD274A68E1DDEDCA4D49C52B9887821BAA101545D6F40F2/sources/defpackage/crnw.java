package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: crnw  reason: default package */
/* loaded from: classes5.dex */
final class crnw implements degu<List<Boolean>> {
    final /* synthetic */ crny a;
    final /* synthetic */ btlu b;
    final /* synthetic */ crnz c;

    public crnw(crnz crnzVar, crny crnyVar, btlu btluVar) {
        this.c = crnzVar;
        this.a = crnyVar;
        this.b = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = this.a.a;
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 54);
        sb.append("NAVLOG: Session ");
        sb.append(i);
        sb.append(" cancelled with exception: ");
        sb.append(message);
        sb.toString();
        bvoo.j(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi List<Boolean> list) {
        List<Boolean> list2 = list;
        bvrj.NAVIGATION_INTERNAL.c();
        dcdc<bzqb> dcdcVar = crnz.a;
        int i = this.a.a;
        crnz crnzVar = this.c;
        if (i != crnzVar.f) {
            crnzVar.hashCode();
            return;
        }
        int i2 = 1;
        if (list2 == null || list2.size() != 2 || list2.get(0) == null || list2.get(1) == null || !list2.get(0).booleanValue() || !list2.get(1).booleanValue()) {
            i2 = 2;
        }
        crnz crnzVar2 = this.c;
        crnzVar2.e = crnzVar2.j(i2, this.a);
        crnz crnzVar3 = this.c;
        crnzVar3.h(i2, this.b, this.a, crnzVar3.e);
    }
}
