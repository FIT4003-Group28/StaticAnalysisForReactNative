package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yhz  reason: default package */
/* loaded from: classes7.dex */
public final class yhz implements degu<List<ysz>> {
    final /* synthetic */ boolean a;
    final /* synthetic */ akqs b;
    final /* synthetic */ yib c;

    public yhz(yib yibVar, boolean z, akqs akqsVar) {
        this.c = yibVar;
        this.a = z;
        this.b = akqsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!this.a || this.c.g == null) {
            if (th instanceof qdy) {
                this.c.i = true;
            }
            this.c.p(false);
            this.c.o(dcdc.e(), null, this.a);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi List<ysz> list) {
        List<ysz> list2 = list;
        this.c.p(false);
        yib yibVar = this.c;
        yibVar.i = false;
        long e = yibVar.e();
        if (list2 == null || list2.isEmpty()) {
            a(new NullPointerException("TransitLine list is null or empty"));
            return;
        }
        this.c.c.e();
        yib yibVar2 = this.c;
        akqi akqiVar = yibVar2.j;
        yibVar2.j = null;
        if (akqiVar == null) {
            akqiVar = yibVar2.m();
        }
        this.c.o(list2, akqiVar, this.a);
        yib yibVar3 = this.c;
        yibVar3.k = this.b;
        if (e == yibVar3.e()) {
            return;
        }
        this.c.c();
    }
}
