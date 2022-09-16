package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
/* compiled from: PG */
/* renamed from: xer  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xer implements ayqb {
    public final /* synthetic */ xes a;
    private final /* synthetic */ int b;

    public /* synthetic */ xer(xes xesVar) {
        this.a = xesVar;
    }

    public /* synthetic */ xer(xes xesVar, int i) {
        this.b = i;
        this.a = xesVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            xes xesVar = this.a;
            ahia ahiaVar = (ahia) obj;
            if (!xesVar.e) {
                return;
            }
            xesVar.a.i(ahiaVar.a());
        } else if (i == 1) {
            this.a.e = ((ahhw) obj).c().c(aika.PLAYBACK_LOADED);
        } else if (i == 2) {
            xes xesVar2 = this.a;
            ahid ahidVar = (ahid) obj;
            ahidVar.a().G().aa(new xer(xesVar2, 3), new ab(15));
            ahidVar.a().W().aa(new xer(xesVar2), new ab(15));
            ahidVar.a().U().aa(new xer(xesVar2, 1), new ab(15));
        } else {
            aikd aikdVar = (aikd) obj;
            this.a.a.i(8);
        }
    }
}
