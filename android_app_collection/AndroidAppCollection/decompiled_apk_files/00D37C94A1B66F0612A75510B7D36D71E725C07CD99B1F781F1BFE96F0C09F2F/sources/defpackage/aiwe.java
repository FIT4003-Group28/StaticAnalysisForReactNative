package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
/* compiled from: PG */
/* renamed from: aiwe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiwe implements ayqb {
    public final /* synthetic */ aiwf a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiwe(aiwf aiwfVar, int i) {
        this.b = i;
        this.a = aiwfVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            aiwf aiwfVar = this.a;
            ahhp ahhpVar = (ahhp) obj;
            SubtitleTrack a = ahhpVar.a();
            if (!ahhpVar.c() || a == null) {
                return;
            }
            aiwfVar.a.add(a.c());
            return;
        }
        aiwf aiwfVar2 = this.a;
        if (((ahgk) obj).a()) {
            return;
        }
        aiwfVar2.a.clear();
    }
}
