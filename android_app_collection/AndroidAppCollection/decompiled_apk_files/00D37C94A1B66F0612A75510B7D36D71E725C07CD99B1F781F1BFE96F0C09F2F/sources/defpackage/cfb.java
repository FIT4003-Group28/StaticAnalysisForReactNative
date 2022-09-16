package defpackage;
/* compiled from: PG */
/* renamed from: cfb  reason: default package */
/* loaded from: classes2.dex */
public final class cfb {
    public final Object a;
    public final cer b;
    public final cff c;

    private cfb(cff cffVar) {
        this.a = null;
        this.b = null;
        this.c = cffVar;
    }

    private cfb(Object obj, cer cerVar) {
        this.a = obj;
        this.b = cerVar;
        this.c = null;
    }

    public static cfb a(cff cffVar) {
        return new cfb(cffVar);
    }

    public static cfb b(Object obj, cer cerVar) {
        return new cfb(obj, cerVar);
    }

    public final boolean c() {
        return this.c == null;
    }
}
