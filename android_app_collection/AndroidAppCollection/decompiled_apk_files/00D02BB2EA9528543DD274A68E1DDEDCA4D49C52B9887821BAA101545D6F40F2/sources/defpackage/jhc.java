package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: jhc  reason: default package */
/* loaded from: classes.dex */
public final class jhc extends jgz {
    public static final cqkv f = new jhd();

    public jhc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(jhc.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, jht> cqlcVar) {
        return cqjv.g(iug.OVERFLOW_MENU_PROPERTIES, cqlcVar, f);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(final cqlc<T, jht> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> b = b(c(cqlcVar), e(), iue.c(new cqlc(cqlcVar) { // from class: jhb
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return jhc.f((jht) this.a.a(cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        b.f(cqmpVarArr);
        return b;
    }

    public static <T extends cqkp> cqmn<T> e() {
        cqrp d = cqrp.d(12.0d);
        return cqmn.a(cqgr.ch(ibn.a()), cqgr.dz(d, d, d, d), cqgr.x(ibo.b()));
    }

    @dzsi
    public static cjtd f(@dzsi jht jhtVar) {
        if (jhtVar == null || cjtd.b.equals(jhtVar.a())) {
            return null;
        }
        return jhtVar.a();
    }
}
