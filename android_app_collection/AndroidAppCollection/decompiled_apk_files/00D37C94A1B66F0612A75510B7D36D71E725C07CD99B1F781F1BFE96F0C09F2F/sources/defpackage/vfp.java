package defpackage;
/* compiled from: PG */
/* renamed from: vfp  reason: default package */
/* loaded from: classes4.dex */
public final class vfp {
    public static final vfp a;
    public static final vfp b;
    public final boolean c;
    public final boolean d = false;
    public final amuk e;

    static {
        vfo a2 = a();
        boolean z = false;
        aqxo.z(a2.a == null, "A SourcePolicy can only set internal() or external() once.");
        a2.a = false;
        a = a2.a();
        vfo a3 = a();
        if (a3.a == null) {
            z = true;
        }
        aqxo.z(z, "A SourcePolicy can only set internal() or external() once.");
        a3.a = true;
        b = a3.a();
    }

    public vfp(boolean z, amuk amukVar) {
        this.c = z;
        this.e = amukVar;
    }

    public static vfo a() {
        return new vfo();
    }
}
