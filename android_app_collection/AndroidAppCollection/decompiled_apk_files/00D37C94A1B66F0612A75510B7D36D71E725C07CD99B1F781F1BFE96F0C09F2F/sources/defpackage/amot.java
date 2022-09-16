package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amot  reason: default package */
/* loaded from: classes.dex */
public final class amot extends amor {
    private final char a;

    public amot(char c) {
        this.a = c;
    }

    @Override // defpackage.amoy
    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        String d = amoy.d(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(d);
        sb.append("')");
        return sb.toString();
    }
}
