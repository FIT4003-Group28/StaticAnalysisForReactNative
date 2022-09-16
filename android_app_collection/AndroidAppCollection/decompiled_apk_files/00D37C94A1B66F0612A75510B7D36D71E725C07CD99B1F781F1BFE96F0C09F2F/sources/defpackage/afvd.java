package defpackage;
/* compiled from: PG */
/* renamed from: afvd  reason: default package */
/* loaded from: classes.dex */
public final class afvd implements ynl {
    private final afvn a;
    private final Object b = new Object();
    private afvc c;
    private final ampg d;

    public afvd(afvn afvnVar, ampg ampgVar) {
        this.a = afvnVar;
        this.d = ampgVar;
    }

    public final ampq a(afvm afvmVar) {
        synchronized (this.b) {
            if (this.c == null) {
                b();
            }
            if (!this.c.b.equals(afvmVar)) {
                return amon.a;
            }
            return ampq.j(this.c.a);
        }
    }

    public final void b() {
        afvm c = this.a.c();
        synchronized (this.b) {
            afvc afvcVar = this.c;
            if (afvcVar != null && afvcVar.b.equals(c)) {
                return;
            }
            afvc afvcVar2 = this.c;
            if (afvcVar2 != null) {
                afvcVar2.a.a();
            }
            this.c = new afvc((afuz) this.d.apply(c), c);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                b();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                b();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
