package defpackage;
/* compiled from: PG */
/* renamed from: jzl  reason: default package */
/* loaded from: classes3.dex */
public final class jzl implements ajrv, ynl {
    public final yni a;
    public final ajyx b;
    public ajyv c;
    public final /* synthetic */ aigi d;

    public jzl(aigi aigiVar, yni yniVar, ajyx ajyxVar) {
        this.d = aigiVar;
        this.a = yniVar;
        this.b = ajyxVar;
    }

    public final ajyv a(ajxf ajxfVar) {
        ajyu a = ajyv.a();
        a.a = ajxfVar;
        a.b = this.d.k.u;
        return a.a();
    }

    public final void b(ajxf ajxfVar) {
        ajyv ajyvVar = this.c;
        if (ajyvVar == null) {
            this.c = a(ajxfVar);
        } else if (ajyvVar.a != ajxfVar) {
            this.c = ajyvVar.b(ajxfVar);
        }
        if (ajxfVar instanceof ajwz) {
            if (this.d.k.af(ajfy.NEXT)) {
                ajyv b = this.c.b(ajxe.a());
                this.c = b;
                this.b.q(b);
                return;
            }
            this.b.q(null);
            return;
        }
        this.b.q(this.c);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((ajwz) obj);
                return null;
            } else if (i == 1) {
                b((ajxd) obj);
                return null;
            } else if (i == 2) {
                b((ajxe) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ajwz.class, ajxd.class, ajxe.class};
    }

    @Override // defpackage.ajrv
    public final void m(ajru ajruVar, Object obj) {
        if (obj == this.c) {
            this.d.k.lr(this.d.k.U(ajfy.NEXT));
        }
    }
}
