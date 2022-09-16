package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: acsv  reason: default package */
/* loaded from: classes.dex */
public final class acsv implements axou {
    private final /* synthetic */ int a;

    public acsv() {
    }

    public acsv(int i) {
        this.a = i;
    }

    public static acst a() {
        return new acst();
    }

    public static Choreographer b() {
        Choreographer choreographer = Choreographer.getInstance();
        axzl.o(choreographer);
        return choreographer;
    }

    public static actb c() {
        return new actb();
    }

    public static actr d() {
        return new actr();
    }

    public static acuh e() {
        return new acuh();
    }

    public static aeaf f() {
        return new aeaf();
    }

    public static pwx g() {
        return new pwx();
    }

    public static axdi h() {
        return new axdi();
    }

    public static afaa i() {
        return new afaa();
    }

    public static afhd j() {
        return new afhd();
    }

    public static afhw k() {
        return new afhw();
    }

    public static afio l() {
        return new afio();
    }

    public static afiy m() {
        return new afiy();
    }

    public static afkd n() {
        return new afkd();
    }

    public static afbz o() {
        return new afbz();
    }

    public static afca p() {
        return new afca();
    }

    public static afeu q() {
        return new afeu();
    }

    public static afgn r() {
        return new afgn();
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                throw null;
            case 2:
                return c();
            case 3:
                return d();
            case 4:
                return new acuf();
            case 5:
                throw null;
            case 6:
                return f();
            case 7:
                return g();
            case 8:
                return h();
            case 9:
                return o();
            case 10:
                return p();
            case 11:
                return q();
            case 12:
                return r();
            case 13:
                return new aeob();
            case 14:
                return new agrb(1);
            case 15:
                return i();
            case 16:
                return j();
            case 17:
                return k();
            case 18:
                return l();
            case 19:
                return m();
            default:
                return n();
        }
    }
}
