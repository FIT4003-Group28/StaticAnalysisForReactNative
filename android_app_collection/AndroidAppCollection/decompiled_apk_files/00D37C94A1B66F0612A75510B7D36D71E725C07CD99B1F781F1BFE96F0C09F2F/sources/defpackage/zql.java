package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zql  reason: default package */
/* loaded from: classes4.dex */
public final class zql implements Runnable {
    final /* synthetic */ zqq a;
    private final /* synthetic */ int b;

    public zql(zqq zqqVar) {
        this.a = zqqVar;
    }

    public /* synthetic */ zql(zqq zqqVar, int i) {
        this.b = i;
        this.a = zqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            zqq zqqVar = this.a;
            haj hajVar = zqqVar.t;
            if (hajVar != null) {
                hajVar.b();
            }
            zqqVar.i.k.a(null);
            zqqVar.i.m(true);
        } else if (this.a.n || !this.a.o) {
        } else {
            zqq zqqVar2 = this.a;
            if (!zqqVar2.i.D || !zqqVar2.C() || !this.a.j.h()) {
                this.a.A();
                return;
            }
            zqq zqqVar3 = this.a;
            zpe zpeVar = zqqVar3.j;
            zpeVar.g = zqqVar3.p;
            zpeVar.e.clear();
            List list = zpeVar.j;
            if (list == null) {
                return;
            }
            zpeVar.e.addAll(list);
            zpeVar.b.k();
        }
    }
}
