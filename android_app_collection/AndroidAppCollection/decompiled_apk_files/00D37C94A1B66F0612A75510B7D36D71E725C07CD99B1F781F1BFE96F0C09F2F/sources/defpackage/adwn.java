package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adwn  reason: default package */
/* loaded from: classes.dex */
public final class adwn implements ynl {
    final /* synthetic */ adwt a;

    public adwn(adwt adwtVar) {
        this.a = adwtVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        int i2 = 2;
        if (i != -1) {
            if (i == 0) {
                if (((adlj) obj) != adlj.CONNECTED_ONLY) {
                    return null;
                }
                this.a.h(0, 0);
                adwt adwtVar = this.a;
                adwi b = adwtVar.i.b();
                b.d = null;
                adwtVar.m(b);
                return null;
            } else if (i == 1) {
                adwt adwtVar2 = this.a;
                adnm a = ((adnn) obj).a();
                if (a == adnm.UNSTARTED) {
                    i2 = 0;
                } else if (!a.b()) {
                    i2 = 1;
                }
                adwtVar2.f(i2);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{adlj.class, adnn.class};
    }
}
