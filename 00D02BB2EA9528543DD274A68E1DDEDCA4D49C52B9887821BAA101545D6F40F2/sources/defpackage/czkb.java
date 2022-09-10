package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: czkb  reason: default package */
/* loaded from: classes5.dex */
final class czkb implements degu<Void> {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ dbtp c;
    final /* synthetic */ czke d;
    final /* synthetic */ Integer e;
    final /* synthetic */ czkf f;

    public czkb(czkf czkfVar, AtomicBoolean atomicBoolean, Set set, dbtp dbtpVar, czke czkeVar, Integer num) {
        this.f = czkfVar;
        this.a = atomicBoolean;
        this.b = set;
        this.c = dbtpVar;
        this.d = czkeVar;
        this.e = num;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r4) {
        if (this.a.get()) {
            this.b.size();
            this.c.d(czkf.a);
            return;
        }
        this.b.size();
        dcep.K(this.d.b);
        czkf.a.convert(this.e.intValue(), this.f.f);
    }
}
