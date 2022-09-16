package defpackage;

import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import java.util.List;
/* compiled from: PG */
/* renamed from: mdo  reason: default package */
/* loaded from: classes3.dex */
public final class mdo implements yiw {
    final /* synthetic */ mdp a;

    public mdo(mdp mdpVar) {
        this.a = mdpVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r1 = (Void) obj;
        ((jyu) this.a.d.get()).c();
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r1 = (Void) obj;
        ((SubtitleButtonController) this.a.e.get()).u((List) obj2);
    }
}
