package defpackage;
/* compiled from: PG */
/* renamed from: aiae  reason: default package */
/* loaded from: classes.dex */
public final class aiae implements ynl {
    final /* synthetic */ aiah a;

    public aiae(aiah aiahVar) {
        this.a = aiahVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.a.l = ((aaof) obj).a();
                return null;
            } else if (i == 1) {
                this.a.m = ((aaog) obj).a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aaof.class, aaog.class};
    }
}
