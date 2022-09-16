package defpackage;
/* compiled from: PG */
/* renamed from: zih  reason: default package */
/* loaded from: classes4.dex */
public final class zih {
    public final snc a;
    public final acrr b;

    public zih(snc sncVar, acrr acrrVar) {
        this.a = sncVar;
        this.b = acrrVar;
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str.substring(0, 3));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(str.substring(3));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }
}
