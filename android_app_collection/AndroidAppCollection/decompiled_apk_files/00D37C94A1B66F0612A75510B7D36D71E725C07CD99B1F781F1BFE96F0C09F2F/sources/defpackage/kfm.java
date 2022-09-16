package defpackage;

import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
/* compiled from: PG */
/* renamed from: kfm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kfm implements ayqb {
    public final /* synthetic */ NoSoundMemoOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kfm(NoSoundMemoOverlay noSoundMemoOverlay, int i) {
        this.b = i;
        this.a = noSoundMemoOverlay;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            Integer num = (Integer) obj;
            this.a.l();
            return;
        }
        this.a.j((ahhw) obj);
    }
}
