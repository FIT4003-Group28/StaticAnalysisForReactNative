package defpackage;
/* compiled from: PG */
/* renamed from: dyoz  reason: default package */
/* loaded from: classes6.dex */
final class dyoz implements dygp<Integer> {
    @Override // defpackage.dyhv
    public final /* bridge */ /* synthetic */ byte[] a(Object obj) {
        Integer num = (Integer) obj;
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dyhv
    public final /* bridge */ /* synthetic */ Object b(byte[] bArr) {
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        String str = new String(bArr, dygq.a);
        throw new NumberFormatException(str.length() != 0 ? "Malformed status code ".concat(str) : new String("Malformed status code "));
    }
}
