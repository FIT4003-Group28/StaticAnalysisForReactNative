package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cjqb  reason: default package */
/* loaded from: classes4.dex */
public final class cjqb extends abx {
    private final cqat a;
    private final cjqy b;
    private final cjtd c;
    private long d = 0;
    private boolean e = false;

    public cjqb(cqat cqatVar, cjqy cjqyVar, cjtd cjtdVar) {
        this.a = cqatVar;
        this.b = cjqyVar;
        this.c = cjtdVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (!this.e && i != 0) {
            long e = this.a.e();
            if (e - this.d > 500) {
                this.d = e;
                this.b.n(cjql.a, new cjte(deaf.DRAG), this.c);
            }
        }
        this.e = i != 0;
    }
}
