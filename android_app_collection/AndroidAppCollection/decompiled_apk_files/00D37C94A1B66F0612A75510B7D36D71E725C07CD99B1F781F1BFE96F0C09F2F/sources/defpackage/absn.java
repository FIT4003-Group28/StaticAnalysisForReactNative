package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: absn  reason: default package */
/* loaded from: classes.dex */
public final class absn implements Runnable {
    final /* synthetic */ abss a;

    public absn(abss abssVar) {
        this.a = abssVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        absr absrVar = this.a.b;
        synchronized (absrVar) {
            for (absu absuVar : absrVar.f) {
                try {
                    absuVar.c(absrVar.b);
                } catch (Exception e) {
                    String valueOf = String.valueOf(absuVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("error on RenderScheduler thread while releasing ");
                    sb.append(valueOf);
                    zep.d(sb.toString(), e);
                }
            }
            abry abryVar = absrVar.b;
            if (abryVar != null) {
                abryVar.e();
                absrVar.b = null;
            }
        }
    }
}
