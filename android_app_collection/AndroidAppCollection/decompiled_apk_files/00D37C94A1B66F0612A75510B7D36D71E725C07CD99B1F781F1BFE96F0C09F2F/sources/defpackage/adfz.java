package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adfz  reason: default package */
/* loaded from: classes.dex */
public final class adfz implements ynl {
    final /* synthetic */ adga a;

    public adfz(adga adgaVar) {
        this.a = adgaVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ypy ypyVar = (ypy) obj;
                this.a.a();
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
