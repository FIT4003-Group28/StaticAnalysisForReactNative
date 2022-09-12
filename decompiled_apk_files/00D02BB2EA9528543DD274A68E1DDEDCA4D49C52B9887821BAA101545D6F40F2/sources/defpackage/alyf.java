package defpackage;
/* compiled from: PG */
/* renamed from: alyf  reason: default package */
/* loaded from: classes.dex */
public abstract class alyf {
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 16;
    public static final int l = 8;
    public static final alyf m = j(-16777216, Integer.MAX_VALUE, 12, 2.8f, 1.0f, 0.0f, 0, false);

    public static alyf j(int i2, int i3, int i4, float f, float f2, float f3, int i5, boolean z) {
        alvs alvsVar = new alvs();
        alvsVar.a = Integer.valueOf(i2);
        alvsVar.b = Integer.valueOf(i3);
        alvsVar.c(i4);
        alvsVar.c = Float.valueOf(f);
        alvsVar.d = Float.valueOf(f2);
        alvsVar.e = Float.valueOf(f3);
        alvsVar.b(i5);
        alvsVar.f = Boolean.valueOf(z);
        return alvsVar.a();
    }

    public static alyf k(dmut dmutVar) {
        return j(dmutVar.d(), dmutVar.e(), dmutVar.l().d(), alww.e(dmutVar.l().h()), alww.f(dmutVar.l().f()), alww.g(dmutVar.l().g()), dmutVar.l().e(), dmutVar.t());
    }

    public static alyf l(dmpv dmpvVar) {
        int i2 = dmpvVar.b;
        int i3 = dmpvVar.c;
        dmob dmobVar = dmpvVar.e;
        if (dmobVar == null) {
            dmobVar = dmob.g;
        }
        int i4 = dmobVar.b;
        dmob dmobVar2 = dmpvVar.e;
        if (dmobVar2 == null) {
            dmobVar2 = dmob.g;
        }
        float e = alww.e(dmobVar2.f);
        dmob dmobVar3 = dmpvVar.e;
        if (dmobVar3 == null) {
            dmobVar3 = dmob.g;
        }
        float f = alww.f(dmobVar3.d);
        dmob dmobVar4 = dmpvVar.e;
        if (dmobVar4 == null) {
            dmobVar4 = dmob.g;
        }
        float g = alww.g(dmobVar4.e);
        dmob dmobVar5 = dmpvVar.e;
        if (dmobVar5 == null) {
            dmobVar5 = dmob.g;
        }
        return j(i2, i3, i4, e, f, g, dmobVar5.c, dmpvVar.j);
    }

    public static boolean m(int i2) {
        return alww.h(i, i2);
    }

    public static boolean n(int i2) {
        return alww.h(j, i2);
    }

    public static boolean o(int i2) {
        return alww.h(k, i2);
    }

    public static boolean p(int i2) {
        return alww.h(l, i2);
    }

    public static boolean q(int i2) {
        return alww.h(64, i2);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract float d();

    public abstract float e();

    public abstract float f();

    public abstract int g();

    public abstract boolean h();

    public abstract alye i();

    public final String toString() {
        return "TextStyle{color=" + Integer.toHexString(a()) + ", outlineColor=" + Integer.toHexString(b()) + ", size=" + c() + ", outlineWidth=" + d() + ", leadingRatio=" + e() + ", trackingRatio=" + f() + ", attributes=" + g() + ", off=" + h() + '}';
    }
}
