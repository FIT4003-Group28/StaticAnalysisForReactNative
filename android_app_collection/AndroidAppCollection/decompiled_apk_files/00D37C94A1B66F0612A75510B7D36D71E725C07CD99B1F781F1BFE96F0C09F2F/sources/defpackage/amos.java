package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amos  reason: default package */
/* loaded from: classes.dex */
public final class amos extends amor {
    private final char a;
    private final char b;

    public amos(char c, char c2) {
        aqxo.p(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.amoy
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        String d = amoy.d(this.a);
        String d2 = amoy.d(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 27 + String.valueOf(d2).length());
        sb.append("CharMatcher.inRange('");
        sb.append(d);
        sb.append("', '");
        sb.append(d2);
        sb.append("')");
        return sb.toString();
    }
}
