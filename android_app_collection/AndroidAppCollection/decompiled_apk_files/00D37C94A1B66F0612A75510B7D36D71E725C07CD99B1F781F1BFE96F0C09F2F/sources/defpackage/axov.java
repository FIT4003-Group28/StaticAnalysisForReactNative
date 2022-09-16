package defpackage;
/* compiled from: PG */
/* renamed from: axov  reason: default package */
/* loaded from: classes2.dex */
public final class axov implements axou, axnm {
    private static final axov b = new axov(null);
    public final Object a;

    private axov(Object obj) {
        this.a = obj;
    }

    public static axou a(Object obj) {
        obj.getClass();
        return new axov(obj);
    }

    public static axou b(Object obj) {
        return obj == null ? b : new axov(obj);
    }

    @Override // defpackage.azqb
    public final Object get() {
        return this.a;
    }
}
