package defpackage;
/* compiled from: PG */
/* renamed from: axqv  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class axqv implements vbq {
    private final /* synthetic */ int d;
    public static final /* synthetic */ axqv c = new axqv(2);
    public static final /* synthetic */ axqv b = new axqv(1);
    public static final /* synthetic */ axqv a = new axqv();

    private /* synthetic */ axqv() {
    }

    private /* synthetic */ axqv(int i) {
        this.d = i;
    }

    @Override // defpackage.vbq
    public final Object a(byte[] bArr) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return (axit) aopi.parseFrom(axit.a, bArr);
            }
            return (aoto) aopi.parseFrom(aoto.a, bArr);
        }
        return (aoto) aopi.parseFrom(aoto.a, bArr);
    }
}
