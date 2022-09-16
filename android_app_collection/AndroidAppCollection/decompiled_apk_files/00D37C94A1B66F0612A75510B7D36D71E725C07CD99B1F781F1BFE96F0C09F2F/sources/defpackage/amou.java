package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amou  reason: default package */
/* loaded from: classes.dex */
public final class amou extends amor {
    private final char a;
    private final char b;

    public amou(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.amoy
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        String d = amoy.d(this.a);
        String d2 = amoy.d(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
        sb.append("CharMatcher.anyOf(\"");
        sb.append(d);
        sb.append(d2);
        sb.append("\")");
        return sb.toString();
    }
}
