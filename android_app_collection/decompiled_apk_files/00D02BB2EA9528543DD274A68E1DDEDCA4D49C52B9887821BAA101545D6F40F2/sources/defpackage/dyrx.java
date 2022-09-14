package defpackage;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dyrx  reason: default package */
/* loaded from: classes6.dex */
final class dyrx extends dykq {
    final dygv a;
    final dygo b;
    final dylf c;
    final dylg d;
    dypz e;
    boolean f;
    boolean g;
    dyjh h;
    final /* synthetic */ dyrz i;

    public dyrx(dyrz dyrzVar, dygv dygvVar) {
        this.i = dyrzVar;
        this.a = dygvVar;
        dygo b = dygo.b("Subchannel", dyrzVar.b());
        this.b = b;
        long a = dyrzVar.l.a();
        String valueOf = String.valueOf(dygvVar.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Subchannel for ");
        sb.append(valueOf);
        dylg dylgVar = new dylg(b, a, sb.toString());
        this.d = dylgVar;
        this.c = new dylf(dylgVar, dyrzVar.l);
    }

    @Override // defpackage.dyhc
    public final void a() {
        this.i.u("Subchannel.shutdown()");
        this.i.m.execute(new dyrw(this));
    }

    @Override // defpackage.dyhc
    public final void b() {
        this.i.u("Subchannel.requestConnection()");
        dbsk.m(this.f, "not started");
        this.e.a();
    }

    @Override // defpackage.dyhc
    public final void c(List<dyfw> list) {
        this.i.m.c();
        dypz dypzVar = this.e;
        dbsk.t(list, "newAddressGroups");
        dypz.h(list, "newAddressGroups contains null entry");
        dbsk.b(!list.isEmpty(), "newAddressGroups is empty");
        dypzVar.e.execute(new dypk(dypzVar, list));
    }

    @Override // defpackage.dyhc
    public final Object d() {
        dbsk.m(this.f, "Subchannel is not started");
        return this.e;
    }

    @Override // defpackage.dyhc
    public final void e(dysz dyszVar) {
        this.i.m.c();
        dbsk.m(!this.f, "already started");
        dbsk.m(!this.g, "already shutdown");
        this.f = true;
        if (this.i.C) {
            this.i.m.execute(new dyrs(dyszVar));
            return;
        }
        List<dyfw> list = this.a.a;
        String b = this.i.b();
        dyrz dyrzVar = this.i;
        String str = dyrzVar.r;
        dylx dylxVar = dyrzVar.i;
        ScheduledExecutorService b2 = dylxVar.b();
        dyji dyjiVar = this.i.m;
        dyrt dyrtVar = new dyrt(this, dyszVar);
        dyrz dyrzVar2 = this.i;
        dypz dypzVar = new dypz(list, b, str, dylxVar, b2, dyjiVar, dyrtVar, dyrzVar2.H, dyrzVar2.X.a(), this.b, this.c);
        dylg dylgVar = this.i.F;
        dygf dygfVar = new dygf();
        dygfVar.a = "Child Subchannel started";
        dygfVar.b = dygg.CT_INFO;
        dygfVar.b(this.i.l.a());
        dygfVar.c = dypzVar;
        dylgVar.a(dygfVar.a());
        this.e = dypzVar;
        this.i.m.execute(new dyrv(this, dypzVar));
    }

    public final String toString() {
        return this.b.toString();
    }
}
