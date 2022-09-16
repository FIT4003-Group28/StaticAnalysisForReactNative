package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ofk  reason: default package */
/* loaded from: classes3.dex */
public final class ofk extends fdm implements ynl {
    public final azqb a;
    private final yni b;
    private final azqb c;
    private final azqb d;

    public ofk(feh fehVar, yni yniVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        super(fehVar);
        this.b = yniVar;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
    }

    public final void a(String str) {
        ezw a = ((oez) this.c.get()).a();
        airr airrVar = (airr) this.a.get();
        if (a == null || !TextUtils.equals(a.c(), str) || airrVar == null || airrVar.n() == null || airrVar.n().c() == null || airrVar.n().c().c == null || !airrVar.n().c().c.D()) {
            if (!d()) {
                return;
            }
            airrVar.aa();
            return;
        }
        ((niw) this.d.get()).f();
    }

    public final boolean d() {
        ezw a = ((oez) this.c.get()).a();
        if (a == null || !a.e()) {
            return false;
        }
        String b = a.b();
        return b == null || TextUtils.equals("", b) || TextUtils.equals("PPSV", a.b());
    }

    @Override // defpackage.feg
    public final void kF() {
        this.b.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a(((jiy) obj).a);
                return null;
            } else if (i == 1) {
                agnt agntVar = (agnt) obj;
                if (!d()) {
                    return null;
                }
                ((airr) this.a.get()).aa();
                return null;
            } else if (i == 2) {
                a(((agoa) obj).a);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{jiy.class, agnt.class, agoa.class};
    }

    @Override // defpackage.feg
    public final void nr() {
        this.b.g(this);
    }
}
