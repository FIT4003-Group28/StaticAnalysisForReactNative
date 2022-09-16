package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: axyj  reason: default package */
/* loaded from: classes2.dex */
public abstract class axyj extends axzf {
    public axyg b;

    /* JADX INFO: Access modifiers changed from: protected */
    public axyj(axyg axygVar) {
        this.b = axygVar;
    }

    protected abstract void a(axzl axzlVar, ayat ayatVar);

    @Override // defpackage.axzf, defpackage.aybl
    protected final axyg f() {
        return this.b;
    }

    @Override // defpackage.axzf, defpackage.axyg
    public final void k(axzl axzlVar, ayat ayatVar) {
        try {
            a(axzlVar, ayatVar);
        } catch (Exception e) {
            this.b = axyl.a;
            axzlVar.a(Status.b(e), new ayat());
        }
    }
}
