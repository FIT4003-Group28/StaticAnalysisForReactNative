package com.b.a.a.b;
/* compiled from: Buffer.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f1432a = new StringBuilder(1024);

    public a a() {
        this.f1432a.setLength(0);
        return this;
    }

    public String b() {
        return this.f1432a.toString();
    }

    public String c() {
        String b2 = b();
        a();
        return b2;
    }

    public a a(char c2) {
        this.f1432a.append(c2);
        return this;
    }

    public a a(CharSequence charSequence) {
        this.f1432a.append(charSequence);
        return this;
    }

    public a d() {
        if (e() > 0) {
            this.f1432a.setLength(this.f1432a.length() - 1);
        }
        return this;
    }

    public int e() {
        return this.f1432a.length();
    }
}
