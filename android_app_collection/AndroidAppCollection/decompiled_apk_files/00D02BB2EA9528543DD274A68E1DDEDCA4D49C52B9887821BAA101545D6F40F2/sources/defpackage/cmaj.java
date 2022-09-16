package defpackage;
/* compiled from: PG */
/* renamed from: cmaj  reason: default package */
/* loaded from: classes5.dex */
public final class cmaj {
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;

    public cmaj(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    private final void d() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final void a() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i2);
        this.e = sb.toString();
    }

    public final int b() {
        d();
        return this.d;
    }

    public final String c() {
        d();
        return this.e;
    }

    public cmaj(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
