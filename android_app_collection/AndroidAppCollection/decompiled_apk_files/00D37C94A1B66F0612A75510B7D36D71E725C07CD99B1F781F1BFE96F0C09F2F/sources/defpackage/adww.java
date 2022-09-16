package defpackage;
/* compiled from: PG */
/* renamed from: adww  reason: default package */
/* loaded from: classes.dex */
public final class adww implements afvu, ynl {
    public final afvt a;
    public final yni b;
    public final afex c;
    private final aeov d;
    private final aeai e;
    private final aeln f;
    private final aeaf g;
    private final axnm h;
    private final afjz i;

    public adww(aeov aeovVar, aeai aeaiVar, aeln aelnVar, aeaf aeafVar, afvt afvtVar, afjz afjzVar, axnm axnmVar, yni yniVar, afex afexVar) {
        this.d = aeovVar;
        this.e = aeaiVar;
        this.f = aelnVar;
        this.g = aeafVar;
        this.a = afvtVar;
        this.i = afjzVar;
        this.h = axnmVar;
        this.b = yniVar;
        this.c = afexVar;
    }

    public final void a(boolean z) {
        this.d.A(z);
    }

    @Override // defpackage.afvu
    public final void j() {
    }

    @Override // defpackage.afvu
    public final void k() {
        if (this.i.o().aD) {
            this.e.j();
            this.f.a.evictAll();
            this.g.a.c();
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    afwb afwbVar = (afwb) obj;
                    ((afig) this.h.get()).d();
                    return null;
                } else if (i == 2) {
                    afwd afwdVar = (afwd) obj;
                    ((afig) this.h.get()).d();
                    return null;
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
            afvq afvqVar = (afvq) obj;
            if (!this.i.o().aG) {
                return null;
            }
            aeai aeaiVar = this.e;
            aeaiVar.j();
            apfg a = apfh.a();
            apfi apfiVar = apfi.ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED;
            a.copyOnWrite();
            ((apfh) a.instance).d(apfiVar);
            arrf a2 = arrh.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).cg((apfh) a.mo39build());
            aeaiVar.c.c((arrh) a2.mo39build());
            return null;
        }
        return new Class[]{afvq.class, afwb.class, afwd.class};
    }

    @Override // defpackage.afvu
    public final /* synthetic */ void l() {
    }
}
