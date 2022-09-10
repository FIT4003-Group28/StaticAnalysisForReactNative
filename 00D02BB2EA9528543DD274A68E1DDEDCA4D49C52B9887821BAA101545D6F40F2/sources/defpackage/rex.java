package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: rex  reason: default package */
/* loaded from: classes7.dex */
class rex implements izy {
    final /* synthetic */ rez a;

    public rex(rez rezVar) {
        this.a = rezVar;
    }

    @Override // defpackage.izy
    public cqkl b() {
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.izy
    public void c() {
        this.a.a.a();
    }

    @Override // defpackage.izy
    public void d() {
        this.a.a.c();
    }

    @Override // defpackage.izy
    public long e() {
        return TimeUnit.MINUTES.toMillis(1L);
    }
}
