package defpackage;
/* compiled from: PG */
/* renamed from: cztf  reason: default package */
/* loaded from: classes5.dex */
final class cztf implements czsx {
    private static final int[] a = {-8875876, -7508381, -1294214, -5552196, -8497214, -10720320, -16611119, -16738393, -16742021, -9920712, -1086464, -765666, -12232092, -10665929, -4056997, -8708190, -11457112, -16689253, -16757440, -13407970, -4246004};

    @Override // defpackage.czsx
    public final int a(String str) {
        return str == null ? a[0] : a[Math.abs(str.hashCode()) % 21];
    }
}
