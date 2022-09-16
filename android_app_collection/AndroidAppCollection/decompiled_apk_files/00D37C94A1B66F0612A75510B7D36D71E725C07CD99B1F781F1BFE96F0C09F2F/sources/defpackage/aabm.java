package defpackage;
/* compiled from: PG */
/* renamed from: aabm  reason: default package */
/* loaded from: classes.dex */
public class aabm {
    private final Object a;
    private final ampt b;

    private aabm(Object obj, ampt amptVar) {
        this.a = obj;
        this.b = amptVar;
    }

    public static aabm a(ampt amptVar) {
        amptVar.getClass();
        return new aabm(null, amptVar);
    }

    public static aabm b(Object obj) {
        obj.getClass();
        return new aabm(obj, null);
    }

    public ampt c() {
        return this.b;
    }

    public Object d() {
        return this.a;
    }
}
