package defpackage;
/* compiled from: PG */
/* renamed from: nyt  reason: default package */
/* loaded from: classes3.dex */
public final class nyt implements ynl {
    final /* synthetic */ nyv a;

    public nyt(nyv nyvVar) {
        this.a = nyvVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.a.j = ((ahhv) obj).a;
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
