package defpackage;
/* compiled from: PG */
/* renamed from: ador  reason: default package */
/* loaded from: classes.dex */
final class ador implements ynl {
    final /* synthetic */ ados a;

    public ador(ados adosVar) {
        this.a = adosVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ypy ypyVar = (ypy) obj;
                if (this.a.h != 1 || !ypyVar.a()) {
                    return null;
                }
                ados adosVar = this.a;
                if (adosVar.g && !adosVar.c.r()) {
                    return null;
                }
                zep.h(ados.a, "network connectivity restored: continuing with recovery");
                this.a.e.removeMessages(1);
                this.a.e.sendEmptyMessage(1);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }
}
