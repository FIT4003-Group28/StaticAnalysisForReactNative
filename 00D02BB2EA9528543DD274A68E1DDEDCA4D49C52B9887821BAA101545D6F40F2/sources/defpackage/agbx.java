package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: agbx  reason: default package */
/* loaded from: classes2.dex */
final class agbx implements akey {
    final /* synthetic */ dspd a;
    final /* synthetic */ deig b;
    final /* synthetic */ agby c;

    public agbx(agby agbyVar, dspd dspdVar, deig deigVar) {
        this.c = agbyVar;
        this.a = dspdVar;
        this.b = deigVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        bvrj.UI_THREAD.c();
        this.c.c.a().p(false);
        this.c.l(this.a, this.b);
    }

    @Override // defpackage.akey
    public final void b() {
        this.b.k(new CancellationException());
    }
}
