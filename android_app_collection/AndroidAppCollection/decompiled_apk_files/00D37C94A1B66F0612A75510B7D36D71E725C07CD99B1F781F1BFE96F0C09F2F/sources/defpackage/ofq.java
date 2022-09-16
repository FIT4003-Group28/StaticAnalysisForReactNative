package defpackage;
/* compiled from: PG */
/* renamed from: ofq  reason: default package */
/* loaded from: classes3.dex */
public final class ofq extends fdm implements ynl {
    public final azqb a;
    public boolean b;
    private final yni c;

    public ofq(feh fehVar, yni yniVar, azqb azqbVar) {
        super(fehVar);
        this.c = yniVar;
        this.a = azqbVar;
    }

    @Override // defpackage.feg
    public final void kF() {
        this.c.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                yhq yhqVar = (yhq) obj;
                if (this.b) {
                    ((airr) this.a.get()).b();
                }
                this.b = false;
                return null;
            } else if (i == 1) {
                yhr yhrVar = (yhr) obj;
                boolean d = ((airr) this.a.get()).d();
                this.b = d;
                if (!d) {
                    return null;
                }
                ((airr) this.a.get()).a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{yhq.class, yhr.class};
    }

    @Override // defpackage.feg
    public final void nr() {
        this.c.g(this);
    }
}
