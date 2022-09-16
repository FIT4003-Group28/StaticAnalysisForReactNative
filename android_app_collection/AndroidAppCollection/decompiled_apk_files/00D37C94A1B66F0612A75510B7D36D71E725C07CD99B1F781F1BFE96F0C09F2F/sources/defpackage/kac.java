package defpackage;
/* compiled from: PG */
/* renamed from: kac  reason: default package */
/* loaded from: classes3.dex */
public final class kac extends ahvq implements ynl {
    final /* synthetic */ kad a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kac(kad kadVar) {
        super(kadVar);
        this.a = kadVar;
    }

    @Override // defpackage.ahvq
    public final void a(ahhv ahhvVar) {
        kad kadVar = this.a;
        boolean z = kadVar.a;
        boolean z2 = ahhvVar.a;
        if (z == z2) {
            return;
        }
        kadVar.a = z2;
        kadVar.c();
    }

    @Override // defpackage.ahvq, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == kac.class) {
            if (i == -1) {
                return new Class[]{ahhv.class};
            }
            if (i == 0) {
                a((ahhv) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return ahfn.a(this, obj, i);
    }
}
