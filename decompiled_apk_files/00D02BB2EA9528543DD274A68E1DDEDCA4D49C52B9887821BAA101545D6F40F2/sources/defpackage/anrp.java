package defpackage;
/* compiled from: PG */
/* renamed from: anrp  reason: default package */
/* loaded from: classes2.dex */
public final class anrp {
    public final int a;
    public final dcdc<Object> b;

    public anrp(int i, dcdc<Object> dcdcVar) {
        this.a = i;
        this.b = dcdcVar;
    }

    public static anrp a(int i, Object... objArr) {
        return new anrp(i, dcdc.t(objArr));
    }
}
