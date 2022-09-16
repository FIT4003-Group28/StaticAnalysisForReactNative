package defpackage;
/* compiled from: PG */
/* renamed from: pvo  reason: default package */
/* loaded from: classes4.dex */
public final class pvo {
    public final int a;
    public final pkf[] b;
    public final pvf[] c;
    public final Object d;

    public pvo(pkf[] pkfVarArr, pvf[] pvfVarArr, Object obj) {
        this.b = pkfVarArr;
        this.c = (pvf[]) pvfVarArr.clone();
        this.d = obj;
        this.a = pkfVarArr.length;
    }

    public final boolean a(pvo pvoVar, int i) {
        return pvoVar != null && pxi.M(this.b[i], pvoVar.b[i]) && pxi.M(this.c[i], pvoVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
