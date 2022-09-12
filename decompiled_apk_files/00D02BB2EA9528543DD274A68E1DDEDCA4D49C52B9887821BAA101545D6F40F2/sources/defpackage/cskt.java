package defpackage;
/* compiled from: PG */
/* renamed from: cskt  reason: default package */
/* loaded from: classes5.dex */
public abstract class cskt {
    private static final ThreadLocal<cskt> a = new cskp();

    public static cskt c() {
        return a.get();
    }

    public abstract void a(cskr cskrVar);

    public abstract void b(cskr cskrVar);
}
