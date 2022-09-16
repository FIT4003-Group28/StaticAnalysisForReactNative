package defpackage;
/* compiled from: PG */
/* renamed from: aicq  reason: default package */
/* loaded from: classes.dex */
public final class aicq implements ynl {
    final /* synthetic */ aict a;

    public aicq(aict aictVar) {
        this.a = aictVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.a.c.b(((ahhv) obj).a);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhv.class};
    }
}
