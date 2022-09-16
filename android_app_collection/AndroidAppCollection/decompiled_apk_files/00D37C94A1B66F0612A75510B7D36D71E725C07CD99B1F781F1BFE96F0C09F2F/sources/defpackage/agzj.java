package defpackage;

import android.os.Binder;
/* compiled from: PG */
/* renamed from: agzj  reason: default package */
/* loaded from: classes.dex */
public final class agzj extends ylm {
    final /* synthetic */ agxd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agzj(Class cls, agxd agxdVar) {
        super(cls);
        this.e = agxdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ylm
    public final /* bridge */ /* synthetic */ void e(Binder binder) {
        agxm agxmVar = (agxm) binder;
        if (agxmVar != null) {
            agxmVar.a.p(this.e);
        }
    }

    @Override // defpackage.ylm
    protected final /* bridge */ /* synthetic */ void f(Binder binder) {
        ((agxm) binder).a.d.remove(this.e);
    }
}
