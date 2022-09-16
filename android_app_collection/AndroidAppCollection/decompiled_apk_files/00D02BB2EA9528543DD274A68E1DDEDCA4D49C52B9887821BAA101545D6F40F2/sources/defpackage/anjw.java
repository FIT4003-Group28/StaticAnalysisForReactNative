package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: anjw  reason: default package */
/* loaded from: classes2.dex */
final class anjw implements anks<duyc, duye, dcdc<anhm>> {
    final /* synthetic */ List a;

    public anjw(List list) {
        this.a = list;
    }

    @Override // defpackage.anks
    /* renamed from: a */
    public final void b(duyc duycVar) {
        for (ango angoVar : this.a) {
            angoVar.f(duycVar);
        }
    }

    @Override // defpackage.anks
    public final /* bridge */ /* synthetic */ void c(duyc duycVar, duye duyeVar) {
        duye duyeVar2 = duyeVar;
        int a = dnsh.a(duyeVar2.b);
        if (a != 0 && a != 1) {
            b(duycVar);
            return;
        }
        for (ango angoVar : this.a) {
            angoVar.e(duycVar, duyeVar2);
        }
    }

    @Override // defpackage.anks
    public final /* bridge */ /* synthetic */ void d(dcdc<anhm> dcdcVar) {
        for (ango angoVar : this.a) {
            angoVar.c(dcdcVar);
        }
        for (ango angoVar2 : this.a) {
            angoVar2.d(dcdcVar);
        }
    }
}
