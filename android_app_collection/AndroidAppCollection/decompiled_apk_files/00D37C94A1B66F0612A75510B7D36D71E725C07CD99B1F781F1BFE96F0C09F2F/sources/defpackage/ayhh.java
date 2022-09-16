package defpackage;
/* compiled from: PG */
/* renamed from: ayhh  reason: default package */
/* loaded from: classes2.dex */
final class ayhh implements axzt {
    private final /* synthetic */ int a;

    public ayhh() {
    }

    public ayhh(int i) {
        this.a = i;
    }

    @Override // defpackage.ayas
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        if (this.a != 0) {
            return bArr;
        }
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        String str = new String(bArr, axzu.a);
        throw new NumberFormatException(str.length() != 0 ? "Malformed status code ".concat(str) : new String("Malformed status code "));
    }

    @Override // defpackage.ayas
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        if (this.a == 0) {
            Integer num = (Integer) obj;
            throw new UnsupportedOperationException();
        }
        return (byte[]) obj;
    }
}
