package defpackage;
/* compiled from: PG */
/* renamed from: cmjr  reason: default package */
/* loaded from: classes5.dex */
public final class cmjr {
    public final int a;
    public final cloo[] b;
    public final cmjn c;
    public final Object d;

    public cmjr(cloo[] clooVarArr, cmjm[] cmjmVarArr, Object obj) {
        this.b = clooVarArr;
        this.c = new cmjn(cmjmVarArr);
        this.d = obj;
        this.a = clooVarArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public final boolean b(cmjr cmjrVar, int i) {
        return cmjrVar != null && cmny.b(this.b[i], cmjrVar.b[i]) && cmny.b(this.c.a(i), cmjrVar.c.a(i));
    }
}
