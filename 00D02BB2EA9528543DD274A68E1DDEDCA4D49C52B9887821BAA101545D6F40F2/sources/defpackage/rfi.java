package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rfi  reason: default package */
/* loaded from: classes7.dex */
public class rfi implements izy {
    final /* synthetic */ rfn a;

    public rfi(rfn rfnVar) {
        this.a = rfnVar;
    }

    @Override // defpackage.izy
    public cqkl b() {
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.izy
    public void c() {
        this.a.m.a();
    }

    @Override // defpackage.izy
    public void d() {
        this.a.m.c();
    }

    @Override // defpackage.izy
    public long e() {
        return TimeUnit.MINUTES.toMillis(1L);
    }
}
