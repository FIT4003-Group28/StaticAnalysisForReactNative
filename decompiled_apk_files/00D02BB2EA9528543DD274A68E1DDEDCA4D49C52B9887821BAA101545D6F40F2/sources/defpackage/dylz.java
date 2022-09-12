package defpackage;
/* compiled from: PG */
/* renamed from: dylz  reason: default package */
/* loaded from: classes6.dex */
final class dylz extends dyma {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ byte[] c;

    public dylz(int i, byte[] bArr) {
        this.b = i;
        this.c = bArr;
        this.a = i;
    }

    @Override // defpackage.dyma
    public final int a(dytj dytjVar, int i) {
        dytjVar.e(this.c, this.a, i);
        this.a += i;
        return 0;
    }
}
