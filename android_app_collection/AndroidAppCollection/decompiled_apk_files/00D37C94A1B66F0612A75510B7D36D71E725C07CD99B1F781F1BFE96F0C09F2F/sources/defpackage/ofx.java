package defpackage;
/* compiled from: PG */
/* renamed from: ofx  reason: default package */
/* loaded from: classes3.dex */
public final class ofx implements ynl {
    private final acth a;

    public ofx(acth acthVar) {
        this.a = acthVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                acte acteVar = new acte(((wxy) obj).a.a.e.I());
                acti oi = this.a.oi();
                if (oi == null) {
                    return null;
                }
                oi.D(acteVar);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{wxy.class};
    }
}
