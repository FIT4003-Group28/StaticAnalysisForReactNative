package defpackage;
/* compiled from: PG */
/* renamed from: aopb  reason: default package */
/* loaded from: classes.dex */
public final class aopb extends aonm {
    private final aopi a;

    public aopb(aopi aopiVar) {
        this.a = aopiVar;
    }

    @Override // defpackage.aonm
    public final /* bridge */ /* synthetic */ aoqu f(byte[] bArr, int i, int i2, aoos aoosVar) {
        return aopi.parsePartialFrom(this.a, bArr, i, i2, aoosVar);
    }

    @Override // defpackage.aorb
    public final /* bridge */ /* synthetic */ Object q(aoog aoogVar, aoos aoosVar) {
        return aopi.parsePartialFrom(this.a, aoogVar, aoosVar);
    }
}
