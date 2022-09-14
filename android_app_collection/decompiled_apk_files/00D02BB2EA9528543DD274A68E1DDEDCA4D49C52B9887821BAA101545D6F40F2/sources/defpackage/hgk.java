package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: hgk  reason: default package */
/* loaded from: classes6.dex */
public final class hgk extends cqiw<jbs> {
    private final cqnf<jbs> a;
    private final cqnf<jbs> b;
    private final int c;

    public hgk() {
        this(null, 0);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, jbs jbsVar, Context context, cqiv cqivVar) {
        for (jbt jbtVar : jbsVar.a()) {
            jbtVar.j(cqivVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jbs> a() {
        return cqgr.fY(this.a, this.b, cqgr.dF(cqrp.d(this.c)), cqgr.ck(C()));
    }

    public hgk(@dzsi cqjb<jbs, Integer> cqjbVar, int i) {
        super(cqjbVar, Integer.valueOf(i), null);
        this.a = cqjbVar == null ? cqgr.cd(-1) : cqgr.cf(cqjbVar);
        this.b = cqgr.bp(-1);
        this.c = i;
    }
}
