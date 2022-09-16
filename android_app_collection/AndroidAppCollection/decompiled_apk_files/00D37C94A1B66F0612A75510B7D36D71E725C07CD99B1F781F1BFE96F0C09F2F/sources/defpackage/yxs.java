package defpackage;
/* compiled from: PG */
/* renamed from: yxs  reason: default package */
/* loaded from: classes4.dex */
public final class yxs extends yxr implements ynl {
    public static final String e = "yxs";
    private final yrj f;

    public yxs(yni yniVar, yrj yrjVar) {
        super(yniVar);
        yrjVar.getClass();
        this.f = yrjVar;
        yniVar.g(this);
    }

    @Override // defpackage.ylz
    public final void b() {
    }

    @Override // defpackage.ylz
    public final boolean c() {
        aqxo.y(!this.b);
        return this.f.o();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!((ypy) obj).a()) {
                    return null;
                }
                this.d.f(new yxq(e));
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
