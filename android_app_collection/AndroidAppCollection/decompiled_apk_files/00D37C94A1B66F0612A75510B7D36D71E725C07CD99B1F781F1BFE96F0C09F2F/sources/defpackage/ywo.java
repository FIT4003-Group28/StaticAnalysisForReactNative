package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ywo  reason: default package */
/* loaded from: classes4.dex */
public final class ywo extends ywi {
    final ywn a = new ywn();
    final ywn b = new ywn();
    private final long[] c;
    private final long[] d;

    public ywo(long[] jArr, long[] jArr2) {
        this.c = jArr;
        this.d = jArr2;
    }

    @Override // defpackage.ywi
    public final void b(ywj ywjVar) {
        boolean z = true;
        this.a.c(ywjVar, ywg.a(this.c, ywjVar.c) != 0);
        ywn ywnVar = this.b;
        if (ywg.a(this.d, ywjVar.c) == 0) {
            z = false;
        }
        ywnVar.c(ywjVar, z);
    }

    @Override // defpackage.ywi
    public final void c(ywj ywjVar) {
        this.a.b(ywjVar, ywg.a(this.c, ywjVar.c));
        this.b.b(ywjVar, ywg.a(this.d, ywjVar.c));
    }
}
