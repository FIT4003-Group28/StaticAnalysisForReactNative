package defpackage;

import android.content.Context;
import defpackage.chlz;
/* compiled from: PG */
/* renamed from: chcj  reason: default package */
/* loaded from: classes4.dex */
public abstract class chcj<T extends chlz> extends cqiw<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    public chcj(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        chmr b = ((chlz) cqkpVar).b();
        if (b != null) {
            b.q(cqivVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmp<T> e() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C()));
    }
}
