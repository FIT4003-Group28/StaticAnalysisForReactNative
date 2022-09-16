package defpackage;
/* compiled from: PG */
/* renamed from: ankj  reason: default package */
/* loaded from: classes.dex */
public final class ankj extends ania implements Runnable {
    private ankt a;

    public ankj(ankt anktVar) {
        this.a = anktVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        ankt anktVar = this.a;
        if (anktVar != null) {
            String valueOf = String.valueOf(anktVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("delegate=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return null;
    }

    @Override // defpackage.anie
    protected final void qu() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ankt anktVar = this.a;
        if (anktVar != null) {
            lV(anktVar);
        }
    }
}
