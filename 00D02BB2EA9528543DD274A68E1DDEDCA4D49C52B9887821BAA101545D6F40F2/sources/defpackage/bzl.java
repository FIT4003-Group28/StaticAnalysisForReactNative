package defpackage;
/* compiled from: PG */
/* renamed from: bzl  reason: default package */
/* loaded from: classes4.dex */
public final class bzl<Data> implements cap<byte[], Data> {
    private final bzh<Data> a;

    public bzl(bzh<Data> bzhVar) {
        this.a = bzhVar;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(byte[] bArr, int i, int i2, bua buaVar) {
        byte[] bArr2 = bArr;
        return new cao(new ciy(bArr2), new bzi(bArr2, this.a));
    }
}
