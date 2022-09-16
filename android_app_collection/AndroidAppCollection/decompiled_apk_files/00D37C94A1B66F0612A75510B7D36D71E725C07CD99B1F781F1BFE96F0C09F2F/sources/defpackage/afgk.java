package defpackage;
/* compiled from: PG */
/* renamed from: afgk  reason: default package */
/* loaded from: classes.dex */
public final class afgk implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ long b;
    final /* synthetic */ afgm c;

    public afgk(afgm afgmVar, byte[] bArr, long j) {
        this.c = afgmVar;
        this.a = bArr;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afge afgeVar = this.c.c;
        byte[] bArr = this.a;
        long j = this.b;
        affx affxVar = ((afgd) afgeVar).a;
        if (j < affxVar.i) {
            affxVar.d();
        }
        affxVar.b();
        affxVar.g.add(bArr);
        affxVar.h.add(Long.valueOf(j));
        affxVar.i = j;
        if (affxVar.g()) {
            affxVar.a();
        }
    }
}
