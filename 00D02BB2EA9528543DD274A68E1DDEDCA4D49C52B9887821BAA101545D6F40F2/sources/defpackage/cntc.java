package defpackage;

import com.google.android.gms.common.Feature;
import defpackage.cnnq;
/* compiled from: PG */
/* renamed from: cntc  reason: default package */
/* loaded from: classes.dex */
public final class cntc<A extends cnnq, ResultT> {
    public cnsr<A, cpct<ResultT>> a;
    public Feature[] b;
    private boolean d = true;
    public int c = 0;

    public final cntd<A, ResultT> a() {
        cnwc.e(this.a != null, "execute parameter required");
        return new cntb(this, this.b, this.d, this.c);
    }

    @Deprecated
    public final void b(final cnxk<A, cpct<ResultT>> cnxkVar) {
        this.a = new cnsr(cnxkVar) { // from class: cnta
            private final cnxk a;

            {
                this.a = cnxkVar;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                this.a.a(obj, obj2);
            }
        };
    }

    public final void c() {
        this.d = false;
    }
}
