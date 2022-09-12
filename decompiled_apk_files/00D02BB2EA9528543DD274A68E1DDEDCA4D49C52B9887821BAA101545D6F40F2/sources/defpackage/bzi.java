package defpackage;
/* compiled from: PG */
/* renamed from: bzi  reason: default package */
/* loaded from: classes4.dex */
final class bzi<Data> implements buj<Data> {
    private final byte[] a;
    private final bzh<Data> b;

    public bzi(byte[] bArr, bzh<Data> bzhVar) {
        this.a = bArr;
        this.b = bzhVar;
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super Data> buiVar) {
        buiVar.f((Data) this.b.b(this.a));
    }

    @Override // defpackage.buj
    public final void b() {
    }

    @Override // defpackage.buj
    public final void c() {
    }

    @Override // defpackage.buj
    public final Class<Data> d() {
        return this.b.a();
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }
}
