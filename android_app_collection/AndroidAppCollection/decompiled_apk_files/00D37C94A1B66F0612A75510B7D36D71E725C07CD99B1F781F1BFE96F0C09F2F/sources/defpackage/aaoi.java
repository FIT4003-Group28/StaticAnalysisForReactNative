package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aaoi  reason: default package */
/* loaded from: classes.dex */
public final class aaoi implements ynl {
    public final Executor a;
    public final afuw b;

    public aaoi(Executor executor, afuw afuwVar) {
        executor.getClass();
        this.a = executor;
        afuwVar.getClass();
        this.b = afuwVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aaof aaofVar = (aaof) obj;
                if (aaofVar.a() == null) {
                    this.b.f();
                    return null;
                }
                this.a.execute(new aaoh(this, aaofVar));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aaof.class};
    }
}
