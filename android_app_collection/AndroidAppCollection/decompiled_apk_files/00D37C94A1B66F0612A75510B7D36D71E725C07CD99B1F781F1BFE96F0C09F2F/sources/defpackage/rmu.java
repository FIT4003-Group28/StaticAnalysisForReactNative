package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rmu  reason: default package */
/* loaded from: classes4.dex */
public final class rmu implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ rng e;

    public rmu(rng rngVar, String str, String str2, Object obj, long j) {
        this.e = rngVar;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.T(this.a, this.b, this.c, this.d);
    }
}
