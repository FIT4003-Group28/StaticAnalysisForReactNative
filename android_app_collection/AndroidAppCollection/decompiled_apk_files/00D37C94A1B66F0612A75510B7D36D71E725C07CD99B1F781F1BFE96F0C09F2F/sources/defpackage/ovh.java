package defpackage;
/* compiled from: PG */
/* renamed from: ovh  reason: default package */
/* loaded from: classes4.dex */
final class ovh implements Runnable {
    final /* synthetic */ ovm a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ ovj d;

    public ovh(ovj ovjVar, ovm ovmVar, int i, long j) {
        this.d = ovjVar;
        this.a = ovmVar;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ovj ovjVar = this.d;
        ovjVar.c.a(ovjVar.b, this.a, this.b, this.c / 1000);
    }
}
