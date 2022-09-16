package defpackage;
/* compiled from: PG */
/* renamed from: aorv  reason: default package */
/* loaded from: classes.dex */
final class aorv implements aoqr {
    public final aord a;
    public final int[] b;
    public final aoou[] c;
    public final aoqu d;
    private final boolean e;

    public aorv(aord aordVar, boolean z, int[] iArr, aoou[] aoouVarArr, Object obj) {
        this.a = aordVar;
        this.e = z;
        this.b = iArr;
        this.c = aoouVarArr;
        aopv.i(obj, "defaultInstance");
        this.d = (aoqu) obj;
    }

    @Override // defpackage.aoqr
    public final aoqu a() {
        return this.d;
    }

    @Override // defpackage.aoqr
    public final aord b() {
        return this.a;
    }

    @Override // defpackage.aoqr
    public final boolean c() {
        return this.e;
    }
}
