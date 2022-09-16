package defpackage;
/* compiled from: PG */
/* renamed from: onf  reason: default package */
/* loaded from: classes3.dex */
public final class onf implements ynl {
    public final ooc a;
    public final yni b;
    public final yrj c;
    public final airr d;
    public boolean e;
    public boolean f;
    public aypg g;

    public onf(ooc oocVar, yni yniVar, yrj yrjVar, airr airrVar) {
        this.a = oocVar;
        this.b = yniVar;
        this.c = yrjVar;
        this.d = airrVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!((ypy) obj).a()) {
                    this.a.e();
                    return null;
                } else if (!this.d.d()) {
                    return null;
                } else {
                    this.a.d();
                    return null;
                }
            } else if (i == 1) {
                if (((ahia) obj).a() != 2 || !this.c.o()) {
                    this.a.e();
                    return null;
                }
                this.a.d();
                this.f = false;
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ypy.class, ahia.class};
    }
}
