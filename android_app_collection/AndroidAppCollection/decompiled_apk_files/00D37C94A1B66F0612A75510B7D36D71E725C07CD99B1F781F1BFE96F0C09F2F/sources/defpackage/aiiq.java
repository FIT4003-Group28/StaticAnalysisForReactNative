package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aiiq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiiq implements ayqb {
    public final /* synthetic */ aiis a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiiq(aiis aiisVar) {
        this.a = aiisVar;
    }

    public /* synthetic */ aiiq(aiis aiisVar, int i) {
        this.b = i;
        this.a = aiisVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            aiis aiisVar = this.a;
            ahie ahieVar = (ahie) obj;
            String str = aiisVar.d;
            if (str == null || !TextUtils.equals(str, ahieVar.b())) {
                return;
            }
            aiisVar.d = null;
            return;
        }
        aiis aiisVar2 = this.a;
        ahic ahicVar = (ahic) obj;
        ahicVar.a();
        String str2 = aiisVar2.d;
        if (str2 == null || !str2.equals(ahicVar.a().Z())) {
            return;
        }
        PlaybackStartDescriptor g = ahicVar.a().g();
        ailu ailuVar = aiisVar2.c;
        PlayerResponseModel c = ahicVar.a().c();
        ailuVar.l(aijx.VIDEO_LOADING);
        ailuVar.o = g;
        ailuVar.n = null;
        ailuVar.q = null;
        ailuVar.p = c;
        ailuVar.l(aijx.VIDEO_PLAYBACK_LOADED);
        aiisVar2.c.t(ahicVar.a().Z(), new aiir(aiisVar2));
        aiisVar2.d = null;
    }
}
