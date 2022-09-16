package defpackage;
/* compiled from: PG */
/* renamed from: cmu  reason: default package */
/* loaded from: classes2.dex */
public final class cmu implements cnq {
    private final cmq a;

    public cmu(cmq cmqVar) {
        this.a = cmqVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        byte[] bArr = (byte[]) obj;
        return new cnp(new cup(bArr), new cmr(bArr, this.a));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
