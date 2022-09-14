package c.e.a.b.d.e;
/* loaded from: classes.dex */
final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    private final char f3896a = '.';

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(char c2) {
    }

    @Override // c.e.a.b.d.e.d
    public final boolean a(char c2) {
        return c2 == this.f3896a;
    }

    public final String toString() {
        String c2;
        c2 = d.c(this.f3896a);
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(c2);
        sb.append("')");
        return sb.toString();
    }
}
