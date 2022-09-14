package defpackage;
/* compiled from: PG */
/* renamed from: bvlv  reason: default package */
/* loaded from: classes.dex */
public abstract class bvlv {
    public abstract bvlw a();

    public abstract void b(boolean z);

    public final bvlw c() {
        bvlw a = a();
        boolean z = false;
        dbsk.b(a.a() == null || a.a().intValue() > 0, "width <= 0");
        if (a.b() == null || a.b().intValue() > 0) {
            z = true;
        }
        dbsk.b(z, "height <= 0");
        return a;
    }
}
