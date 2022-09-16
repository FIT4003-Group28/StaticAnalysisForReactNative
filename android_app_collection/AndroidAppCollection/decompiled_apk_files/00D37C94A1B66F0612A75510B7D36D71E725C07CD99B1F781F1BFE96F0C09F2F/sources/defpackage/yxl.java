package defpackage;
/* compiled from: PG */
/* renamed from: yxl  reason: default package */
/* loaded from: classes4.dex */
public final class yxl implements amlw {
    public final yxb a;
    public final yxj b;

    public yxl(yxb yxbVar) {
        this.a = yxbVar;
        yxj yxjVar = new yxj("SPAWN", yxbVar.f, 2);
        this.b = yxjVar;
        yxbVar.a(yxjVar);
    }

    @Override // defpackage.amlw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.a();
        yxd.j(this.a);
    }
}
