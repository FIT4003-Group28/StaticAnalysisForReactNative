package defpackage;
/* compiled from: PG */
/* renamed from: adfa  reason: default package */
/* loaded from: classes.dex */
public final class adfa {
    private final afvn a;
    private final azqb b;
    private final boolean c;
    private final boolean d;
    private final eo e;
    private final azqb f;

    public adfa(afvn afvnVar, aczr aczrVar, eo eoVar, azqb azqbVar, azqb azqbVar2) {
        this.a = afvnVar;
        this.b = azqbVar;
        this.c = aczrVar.c.equals("cl");
        this.d = aczrVar.c.equals("m");
        this.e = eoVar;
        this.f = azqbVar2;
    }

    public final boolean a(boolean z, final adez adezVar, String str) {
        boolean z2 = this.c;
        if ((z2 || this.d) && this.e != null) {
            if (z2) {
                if (!this.a.c().g()) {
                    if (!this.a.c().y()) {
                        return false;
                    }
                    aden adenVar = new aden();
                    adenVar.ae = adezVar;
                    adenVar.qv(this.e, "youtube.mdx.mediaroute.MdxLoggedOutWatchHistoryDialogFragment");
                } else {
                    wpu.e(this.e, new afve() { // from class: adey
                        @Override // defpackage.afve
                        public final void a() {
                            adez.this.a();
                        }
                    }, null);
                }
                return true;
            }
            if (this.d) {
                if (!z && ((Boolean) this.f.get()).booleanValue()) {
                    adek adekVar = new adek();
                    adekVar.ae = str;
                    adekVar.qv(this.e, "youtube.mdx.mediaroute.MdxMatAvodHandoffDialogFragment");
                    return true;
                } else if (z) {
                    ((Boolean) this.b.get()).booleanValue();
                }
            }
            return false;
        }
        return false;
    }
}
