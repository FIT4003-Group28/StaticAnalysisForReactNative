package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: degz  reason: default package */
/* loaded from: classes.dex */
public final class degz<V> extends deeo<V> implements Runnable {
    private dehn<V> a;

    public degz(dehn<V> dehnVar) {
        this.a = dehnVar;
    }

    @Override // defpackage.dees
    protected final void OO() {
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        dehn<V> dehnVar = this.a;
        if (dehnVar != null) {
            String valueOf = String.valueOf(dehnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("delegate=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dehn<V> dehnVar = this.a;
        if (dehnVar != null) {
            p(dehnVar);
        }
    }
}
