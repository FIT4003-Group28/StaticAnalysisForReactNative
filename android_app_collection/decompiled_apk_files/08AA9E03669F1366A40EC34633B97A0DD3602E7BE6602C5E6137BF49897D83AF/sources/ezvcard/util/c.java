package ezvcard.util;
/* compiled from: ClearableStringBuilder.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f5612a = new StringBuilder();

    public c a() {
        this.f5612a.setLength(0);
        return this;
    }

    public String b() {
        return this.f5612a.toString();
    }

    public String c() {
        String b2 = b();
        a();
        return b2;
    }

    public c a(char c2) {
        this.f5612a.append(c2);
        return this;
    }
}
