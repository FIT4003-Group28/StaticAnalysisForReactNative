package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqnj  reason: default package */
/* loaded from: classes.dex */
public final class cqnj<T extends cqkp> implements cqmp<T> {
    public final cqjb<T, Boolean> a;
    public final boolean b;
    public final cqmp<T>[] c;
    @dzsi
    public final cqnf<T> d;

    public cqnj(cqjb<T, Boolean> cqjbVar, boolean z, boolean z2, cqmp<T>[] cqmpVarArr) {
        this.a = cqjbVar;
        this.b = z;
        this.c = cqmpVarArr;
        this.d = z2 ? cqgr.aE(cqjbVar) : null;
    }

    public static <T extends cqkp> cqnj<T> a(cqjb<T, Boolean> cqjbVar, boolean z, cqmp<T>[] cqmpVarArr) {
        return new cqnj<>(cqjbVar, false, z, cqmpVarArr);
    }
}
