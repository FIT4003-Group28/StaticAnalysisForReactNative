package defpackage;
/* compiled from: PG */
/* renamed from: aeqi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aeqi implements akra {
    private final /* synthetic */ int c;
    public static final /* synthetic */ aeqi b = new aeqi(1);
    public static final /* synthetic */ aeqi a = new aeqi();

    private /* synthetic */ aeqi() {
    }

    private /* synthetic */ aeqi(int i) {
        this.c = i;
    }

    @Override // defpackage.akra
    public final Object a(byte[] bArr) {
        if (this.c != 0) {
            return (aurq) aopi.parseFrom(aurq.a, bArr, aoos.b());
        }
        return bArr;
    }
}
