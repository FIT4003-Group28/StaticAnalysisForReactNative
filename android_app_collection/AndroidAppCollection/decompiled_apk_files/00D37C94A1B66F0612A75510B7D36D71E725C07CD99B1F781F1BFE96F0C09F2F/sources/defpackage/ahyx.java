package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: ahyx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahyx implements ayqb {
    public final /* synthetic */ ahyy a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahyx(ahyy ahyyVar) {
        this.a = ahyyVar;
    }

    public /* synthetic */ ahyx(ahyy ahyyVar, int i) {
        this.b = i;
        this.a = ahyyVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                this.a.b((aesr) obj);
                return;
            case 1:
                ahyy ahyyVar = this.a;
                Pair pair = (Pair) obj;
                if (pair.second == null) {
                    return;
                }
                ahyyVar.a((ajff) pair.first, (aikd) pair.second);
                return;
            case 2:
                this.a.c((ahgn) obj);
                return;
            case 3:
                ahyy ahyyVar2 = this.a;
                if (((ahhj) obj).b() != aijw.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                    return;
                }
                ahyyVar2.a.s.f(ControlsState.a());
                return;
            case 4:
                this.a.d((ahhm) obj);
                return;
            case 5:
                ahhs ahhsVar = (ahhs) obj;
                this.a.j();
                return;
            case 6:
                this.a.e((ahhw) obj);
                return;
            case 7:
                this.a.h((ahhx) obj);
                return;
            default:
                this.a.i((ahia) obj);
                return;
        }
    }
}
