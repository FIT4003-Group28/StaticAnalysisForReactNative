package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
/* compiled from: PG */
/* renamed from: czcy  reason: default package */
/* loaded from: classes5.dex */
final class czcy {
    public int a = -1;
    public char b = 0;
    public final dccx<MatchInfo> c = dcdc.F();
    public boolean d = false;
    public int e = -1;
    public int f = -1;
    private final String g;

    public czcy(String str) {
        dbsk.s(str);
        this.g = str;
    }

    public final void a() {
        g(this.g.length());
        h();
    }

    public final void b() {
        g(-1);
        i();
    }

    public final boolean c() {
        int i = this.a;
        return i >= 0 && i < this.g.length();
    }

    public final boolean d() {
        char c = this.b;
        return c >= '0' && c <= '9';
    }

    public final boolean e() {
        return g(this.a + 1);
    }

    public final void f() {
        if (this.d) {
            this.c.g(MatchInfo.c(this.e, this.f));
            this.d = false;
            this.e = -1;
            this.f = -1;
        }
    }

    public final boolean g(int i) {
        this.a = i;
        if (c()) {
            this.b = this.g.charAt(this.a);
            return true;
        }
        this.b = (char) 0;
        return false;
    }

    public final void h() {
        while (g(this.a - 1) && !d()) {
        }
    }

    public final void i() {
        while (e() && !d()) {
        }
    }
}
