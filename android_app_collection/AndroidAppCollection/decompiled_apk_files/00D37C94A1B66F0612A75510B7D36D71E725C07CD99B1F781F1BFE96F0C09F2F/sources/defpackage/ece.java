package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ece  reason: default package */
/* loaded from: classes3.dex */
public final class ece extends fdm implements ajpz, ynl {
    public final afvn a;
    public final aafo b;
    public final feb c;
    public final azqb d;
    public final ezh e;
    public boolean f;
    private final yni g;
    private final ajqa h;

    public ece(feh fehVar, yni yniVar, afvn afvnVar, aafo aafoVar, ajqa ajqaVar, feb febVar, azqb azqbVar, ezh ezhVar) {
        super(fehVar);
        this.g = yniVar;
        this.a = afvnVar;
        this.b = aafoVar;
        this.h = ajqaVar;
        this.c = febVar;
        this.d = azqbVar;
        this.e = ezhVar;
        this.f = afvnVar.t();
    }

    @Override // defpackage.ajpz
    public final void kA(Uri uri, Uri uri2) {
        iiq iiqVar;
        if (akzj.f(uri, iiq.a) && (iiqVar = (iiq) this.h.b(uri2)) != null && iiqVar.g && iiqVar.f) {
            this.c.a();
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        this.g.m(this);
        this.h.e(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!((gaf) obj).c()) {
                    return null;
                }
                this.c.a();
                return null;
            } else if (i == 1) {
                if (((vxm) obj).a()) {
                    return null;
                }
                this.c.h();
                return null;
            } else if (i == 2) {
                wgh wghVar = (wgh) obj;
                if (wghVar.a() != wgg.FINISHED || !wghVar.c()) {
                    return null;
                }
                apzg b = wghVar.b();
                if (b == null || !etk.i(b)) {
                    boolean t = this.a.t();
                    if (this.f || !t || !this.e.g().b()) {
                        ((niw) this.d.get()).f();
                    } else {
                        this.c.b();
                    }
                    this.f = t;
                    return null;
                }
                ((niw) this.d.get()).f();
                this.b.c(b, null);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{gaf.class, vxm.class, wgh.class};
    }

    @Override // defpackage.feg
    public final void nr() {
        this.g.g(this);
        this.h.h(iiq.a, this);
    }
}
