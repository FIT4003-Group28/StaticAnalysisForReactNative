package defpackage;

import android.content.Context;
/* renamed from: cqkz  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cqkz {
    public static <V extends cqkp, X> cqlc<V, X> a(X x) {
        return new cqlb(x);
    }

    public static <V extends cqkp, X> cqlc<V, X> b(final cqjb<V, X> cqjbVar) {
        return new cqlc(cqjbVar) { // from class: cqla
            private final cqjb a;

            {
                this.a = cqjbVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqjb cqjbVar2 = this.a;
                Context a = cqgx.a();
                if (a == null) {
                    throw new IllegalStateException("VmFunction.apply() may not be called from here. VmFunctions must only be invoked by Curvular internals or from within other VmFunctions, because correct execution depends on private state managed by Curvular.");
                }
                return cqjbVar2.a(cqkpVar, a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }
}
