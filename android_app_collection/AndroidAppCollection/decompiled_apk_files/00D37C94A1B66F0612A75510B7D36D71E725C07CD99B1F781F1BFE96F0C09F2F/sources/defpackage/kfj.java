package defpackage;

import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
/* compiled from: PG */
/* renamed from: kfj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kfj implements ayqb {
    public final /* synthetic */ MiniPlayerErrorOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kfj(MiniPlayerErrorOverlay miniPlayerErrorOverlay, int i) {
        this.b = i;
        this.a = miniPlayerErrorOverlay;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            MiniPlayerErrorOverlay miniPlayerErrorOverlay = this.a;
            boolean z = miniPlayerErrorOverlay.b;
            boolean d = aiqa.d(((aikd) obj).i);
            miniPlayerErrorOverlay.b = d;
            if (z == d) {
                return;
            }
            miniPlayerErrorOverlay.g();
            return;
        }
        MiniPlayerErrorOverlay miniPlayerErrorOverlay2 = this.a;
        boolean z2 = miniPlayerErrorOverlay2.b;
        boolean z3 = ((ahia) obj).a() == 8;
        miniPlayerErrorOverlay2.b = z3;
        if (z2 == z3) {
            return;
        }
        miniPlayerErrorOverlay2.g();
    }
}
