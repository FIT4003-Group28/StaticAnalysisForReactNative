package defpackage;
/* compiled from: PG */
/* renamed from: afmp  reason: default package */
/* loaded from: classes2.dex */
public final class afmp implements Runnable {
    final /* synthetic */ dwfl a;
    final /* synthetic */ dhjx b;
    final /* synthetic */ afmq c;

    public afmp(afmq afmqVar, dwfl dwflVar, dhjx dhjxVar) {
        this.c = afmqVar;
        this.a = dwflVar;
        this.b = dhjxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a().e(this.a, this.b, null);
    }
}
