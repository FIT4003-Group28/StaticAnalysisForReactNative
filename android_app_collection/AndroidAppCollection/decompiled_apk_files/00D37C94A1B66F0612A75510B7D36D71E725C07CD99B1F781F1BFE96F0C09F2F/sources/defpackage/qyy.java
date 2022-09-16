package defpackage;
/* compiled from: PG */
/* renamed from: qyy  reason: default package */
/* loaded from: classes4.dex */
public final class qyy implements Runnable {
    final /* synthetic */ qze a;
    final /* synthetic */ long b;
    final /* synthetic */ qzc c;

    public qyy(qzc qzcVar, qze qzeVar, long j) {
        this.c = qzcVar;
        this.a = qzeVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qze qzeVar = this.a;
        qzi qziVar = this.c.a;
        qziVar.getClass();
        long j = this.b;
        StringBuilder sb = new StringBuilder(48);
        sb.append("getResults init timeout: ");
        sb.append(j);
        sb.append(" ms");
        qzeVar.b(new qzh(qziVar, sb.toString(), this.a.f));
    }
}
