package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
/* compiled from: PG */
/* renamed from: lds  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lds implements zdt {
    public final /* synthetic */ VoiceSearchActivityV2 a;
    private final /* synthetic */ int b;

    public /* synthetic */ lds(VoiceSearchActivityV2 voiceSearchActivityV2, int i) {
        this.b = i;
        this.a = voiceSearchActivityV2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            Throwable th = (Throwable) obj;
            this.a.j("");
            return;
        }
        this.a.j((String) obj);
    }
}
