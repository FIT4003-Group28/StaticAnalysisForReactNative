package defpackage;
/* compiled from: PG */
/* renamed from: dcpk  reason: default package */
/* loaded from: classes.dex */
final class dcpk extends dcpj {
    private final char[][] a;
    private final int b;

    public dcpk(char[][] cArr) {
        this.a = cArr;
        this.b = cArr.length;
    }

    @Override // defpackage.dcpj, defpackage.dcpn
    public final String a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char[][] cArr = this.a;
            if (charAt < cArr.length && cArr[charAt] != null) {
                return d(str, i);
            }
        }
        return str;
    }

    @Override // defpackage.dcpj
    protected final char[] b(char c) {
        if (c < this.b) {
            return this.a[c];
        }
        return null;
    }
}
