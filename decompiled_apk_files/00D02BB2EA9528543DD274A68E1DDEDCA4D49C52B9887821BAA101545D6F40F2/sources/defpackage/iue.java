package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: iue  reason: default package */
/* loaded from: classes.dex */
public final class iue {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_card_internal, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(@dzsi cjtd cjtdVar) {
        return cqjv.j(iug.UE3_PARAMS, cjtdVar);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, cjtd> cqlcVar) {
        return cqjv.f(iug.UE3_PARAMS, cqlcVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> d(final cqlc<T, cjtd> cqlcVar, final cqlc<T, ddho> cqlcVar2) {
        return cqjv.f(iug.UE3_PARAMS_WITH_CLIENT_LEAF_VE, new cqlc(cqlcVar, cqlcVar2) { // from class: iuc
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return dbsi.a((cjtd) this.a.a(cqkpVar), (ddho) ((cqlb) this.b).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, cjwu> cqlcVar) {
        return cqjv.f(iug.LOGGED_IMPRESSION_SINK, cqlcVar);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_singlelinetextboxtextview_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_containerlinearlayout_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(cqmp<T>... cqmpVarArr) {
        cqmj<T> gs = cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrt.d(R.dimen.shadow_height)), cqgr.x(ibp.a()));
        gs.f(cqmpVarArr);
        return gs;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> i(cqmp<T>... cqmpVarArr) {
        cqmj<T> gs = cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrt.d(R.dimen.shadow_height)), cqgr.x(ibp.b()));
        gs.f(cqmpVarArr);
        return gs;
    }
}
