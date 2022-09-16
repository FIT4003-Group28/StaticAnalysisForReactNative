package defpackage;
/* compiled from: PG */
/* renamed from: egp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class egp implements ayqb {
    public final /* synthetic */ egt a;
    private final /* synthetic */ int b;

    public /* synthetic */ egp(egt egtVar, int i) {
        this.b = i;
        this.a = egtVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        boolean z = true;
        if (this.b == 0) {
            egt egtVar = this.a;
            if (((ahia) obj).a() == 7) {
                z = false;
            }
            egtVar.j = z;
            return;
        }
        egt egtVar2 = this.a;
        ahhw ahhwVar = (ahhw) obj;
        egn egnVar = (egn) egtVar2.d.get();
        if (((ezh) egtVar2.h.get()).g().d() || !ahhwVar.c().a(aika.VIDEO_PLAYING, aika.ENDED)) {
            return;
        }
        if (!egnVar.a().equals(egm.ON_HOLD) && !egnVar.a().equals(egm.SYSTEM_ON_HOLD)) {
            return;
        }
        egnVar.f();
    }
}
