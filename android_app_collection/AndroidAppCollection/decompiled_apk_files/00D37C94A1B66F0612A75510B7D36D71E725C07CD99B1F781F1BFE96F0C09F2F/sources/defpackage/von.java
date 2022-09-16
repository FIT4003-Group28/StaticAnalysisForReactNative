package defpackage;
/* compiled from: PG */
/* renamed from: von  reason: default package */
/* loaded from: classes4.dex */
public abstract class von extends anie implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final vnu b;

    public von(vnu vnuVar) {
        this.b = vnuVar;
    }

    protected abstract void b(vnu vnuVar);

    @Override // defpackage.anie
    public final String c() {
        String str = this.b.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
        sb.append("query=[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!isCancelled()) {
            try {
                String valueOf = String.valueOf(this.b.b);
                amlp l = amna.l(valueOf.length() != 0 ? "Query: ".concat(valueOf) : new String("Query: "));
                b(this.b);
                l.close();
            } catch (Throwable th) {
                e(th);
            }
        }
    }
}
