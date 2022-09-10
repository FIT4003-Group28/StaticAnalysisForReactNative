package defpackage;
/* compiled from: PG */
/* renamed from: cxno  reason: default package */
/* loaded from: classes5.dex */
public final class cxno {
    public static final cxno a;
    public final boolean b;
    public final boolean c = false;
    public final dcdc<cxnt> d;

    static {
        cxnn a2 = a();
        boolean z = false;
        dbsk.m(a2.a == null, "A SourcePolicy can only set internal() or external() once.");
        a2.a = false;
        a = a2.a();
        cxnn a3 = a();
        if (a3.a == null) {
            z = true;
        }
        dbsk.m(z, "A SourcePolicy can only set internal() or external() once.");
        a3.a = true;
        a3.a();
    }

    public cxno(boolean z, dcdc<cxnt> dcdcVar) {
        this.b = z;
        this.d = dcdcVar;
    }

    public static cxnn a() {
        return new cxnn();
    }
}
