package defpackage;
/* compiled from: PG */
/* renamed from: afj  reason: default package */
/* loaded from: classes.dex */
public final class afj {
    static final my<afj> d = new mz(20);
    public int a;
    public abm b;
    public abm c;

    private afj() {
    }

    public static afj a() {
        afj a = d.a();
        return a == null ? new afj() : a;
    }

    public static void b(afj afjVar) {
        afjVar.a = 0;
        afjVar.b = null;
        afjVar.c = null;
        d.b(afjVar);
    }

    public static void c() {
        do {
        } while (d.a() != null);
    }
}
