package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ncj  reason: default package */
/* loaded from: classes7.dex */
public final class ncj implements kcz<dcdc<ldm>> {
    final /* synthetic */ ksu a;
    final /* synthetic */ ldm b;

    public ncj(ksu ksuVar, ldm ldmVar) {
        this.a = ksuVar;
        this.b = ldmVar;
    }

    @Override // defpackage.kcz
    public final void a(@dzsi bttq bttqVar) {
        ksu ksuVar = this.a;
        if (ksuVar != null) {
            ksuVar.a(this.b);
        }
    }

    @Override // defpackage.kcz
    public final void b() {
        ksu ksuVar = this.a;
        if (ksuVar != null) {
            ksuVar.a(this.b);
        }
    }

    @Override // defpackage.kcz
    public final /* bridge */ /* synthetic */ void c(dcdc<ldm> dcdcVar, int i) {
        ksu ksuVar;
        dcdc<ldm> dcdcVar2 = dcdcVar;
        if (dcdcVar2.isEmpty()) {
            ksuVar = this.a;
            if (ksuVar == null) {
                return;
            }
        } else {
            this.b.p(dcdcVar2.get(0).d);
            ksuVar = this.a;
            if (ksuVar == null) {
                return;
            }
        }
        ksuVar.a(this.b);
    }
}
