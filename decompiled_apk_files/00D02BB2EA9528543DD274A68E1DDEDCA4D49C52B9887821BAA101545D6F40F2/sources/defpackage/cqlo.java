package defpackage;

import android.view.View;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqlo  reason: default package */
/* loaded from: classes.dex */
public final class cqlo<M extends cqkp> extends cqlh<M> {
    private final cqkj a;
    private final cqiw<M> d;

    public cqlo(cqkj cqkjVar, cqiw<M> cqiwVar) {
        dbsk.s(cqkjVar);
        this.a = cqkjVar;
        this.d = cqiwVar;
    }

    @Override // defpackage.cqlh
    protected final void t(View view) {
        this.a.h(view);
    }

    @Override // defpackage.cqlh
    protected final View z(M m) {
        return this.a.c(this.d, null).c();
    }
}
