package defpackage;
/* compiled from: PG */
/* renamed from: nvs  reason: default package */
/* loaded from: classes3.dex */
public final class nvs implements ahih {
    public nvp b;
    public nvw c;
    public boolean d = false;
    public final afy a = new afy();

    @Override // defpackage.ahih
    public final void kT() {
        if (this.d) {
            this.c.b(false);
            nvp nvpVar = this.b;
            if (nvpVar.w) {
                nvpVar.g.removeCallbacks(nvpVar.s);
                nvpVar.g.setSelected(false);
            }
            nvpVar.f(nvpVar.z);
        }
    }

    @Override // defpackage.ahih
    public final void l(auaz auazVar, boolean z) {
        arag aragVar;
        nvw nvwVar = this.c;
        if (nvwVar != null) {
            nvwVar.b(true);
            nvp nvpVar = this.b;
            if ((auazVar.b & 2) != 0) {
                aragVar = auazVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            nvpVar.f(ajgl.b(aragVar));
            if (!nvpVar.w) {
                return;
            }
            nvpVar.g.removeCallbacks(nvpVar.s);
            nvpVar.g.setSelected(false);
            nvpVar.g.postDelayed(nvpVar.s, nvp.a);
        }
    }

    @Override // defpackage.ahih
    public final void m(long j, long j2) {
        if (this.d) {
            this.c.a.c((int) j2, (int) j);
        }
    }
}
