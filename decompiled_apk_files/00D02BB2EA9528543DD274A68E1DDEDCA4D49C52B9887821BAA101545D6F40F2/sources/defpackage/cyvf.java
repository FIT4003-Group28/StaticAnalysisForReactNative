package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyvf  reason: default package */
/* loaded from: classes5.dex */
public final class cyvf extends cyva {
    public cyvf a = null;
    final /* synthetic */ cyvg b;
    private final cyem c;

    public cyvf(cyvg cyvgVar, cyem cyemVar) {
        this.b = cyvgVar;
        this.c = cyemVar;
    }

    @Override // defpackage.cyva
    protected final void b(Object obj) {
        this.c.a(obj);
        synchronized (this.b.a) {
            cyvf cyvfVar = this.a;
            if (cyvfVar != null) {
                cyvfVar.c();
            } else {
                this.b.b = null;
            }
        }
    }
}
