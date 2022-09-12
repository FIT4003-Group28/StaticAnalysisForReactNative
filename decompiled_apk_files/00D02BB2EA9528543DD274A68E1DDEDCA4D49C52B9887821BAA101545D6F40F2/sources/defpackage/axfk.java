package defpackage;
/* compiled from: PG */
/* renamed from: axfk  reason: default package */
/* loaded from: classes3.dex */
public abstract class axfk {
    public static axfk c() {
        return new axew(1, dbpy.a);
    }

    public static axfk d(int i) {
        return new axew(1, dbsg.i(Integer.valueOf(i)));
    }

    public static axfk e(axfk axfkVar) {
        return new axew(2, axfkVar.a());
    }

    public abstract dbsg<Integer> a();

    public abstract int b();
}
