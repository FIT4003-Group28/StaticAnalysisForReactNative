package defpackage;
/* compiled from: PG */
/* renamed from: iut  reason: default package */
/* loaded from: classes3.dex */
final class iut implements ynl {
    final /* synthetic */ iuv a;

    public iut(iuv iuvVar) {
        this.a = iuvVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        assn assnVar;
        assn assnVar2;
        int i2 = 2;
        boolean z = false;
        if (i != -1) {
            if (i == 0) {
                abjv abjvVar = (abjv) obj;
                boolean b = abjvVar.b();
                Object f = ((ampq) abjvVar.h()).f();
                iuv iuvVar = this.a;
                if (f == iuvVar) {
                    iuq iuqVar = iuvVar.a;
                    if (b && !iuvVar.i) {
                        z = true;
                    }
                    iuqVar.f(z);
                    assn assnVar3 = this.a.f;
                    if (assnVar3 != null) {
                        acte acteVar = new acte(assnVar3.j);
                        if (b) {
                            this.a.e.u(acteVar, null);
                        } else {
                            this.a.e.q(acteVar, null);
                        }
                    }
                } else {
                    iuq iuqVar2 = iuvVar.a;
                    if (b && !iuvVar.i) {
                        z = true;
                    }
                    iuqVar2.i(z);
                }
                abkg abkgVar = this.a.b;
                if (true == b) {
                    i2 = 1;
                }
                abkgVar.d(i2);
                if (!((ampq) abjvVar.h()).h()) {
                    return null;
                }
                iuv iuvVar2 = this.a;
                iuvVar2.d.b(iuvVar2, b);
                return null;
            } else if (i == 1) {
                if (!((ahgn) obj).c().equals(aijs.FULLSCREEN)) {
                    iuv iuvVar3 = this.a;
                    if (iuvVar3.h && iuvVar3.a.j() && (assnVar2 = this.a.f) != null) {
                        this.a.e.q(new acte(assnVar2.j), null);
                    }
                    this.a.h = false;
                    return null;
                }
                iuv iuvVar4 = this.a;
                if (iuvVar4.h) {
                    return null;
                }
                iuvVar4.h = true;
                if (!iuvVar4.a.j() || (assnVar = this.a.f) == null) {
                    return null;
                }
                this.a.e.u(new acte(assnVar.j), null);
                return null;
            } else if (i == 2) {
                iuq iuqVar3 = this.a.a;
                boolean z2 = ((ahhv) obj).a;
                if (!iuqVar3.f) {
                    return null;
                }
                iuqVar3.g = z2;
                iuqVar3.g();
                return null;
            } else if (i == 3) {
                this.a.i = ((ahhw) obj).c().a(aika.PLAYBACK_INTERRUPTED, aika.INTERSTITIAL_REQUESTED, aika.INTERSTITIAL_PLAYING, aika.ENDED);
                iuv iuvVar5 = this.a;
                if (!iuvVar5.i) {
                    return null;
                }
                iuvVar5.a.f(false);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{abjv.class, ahgn.class, ahhv.class, ahhw.class};
    }
}
