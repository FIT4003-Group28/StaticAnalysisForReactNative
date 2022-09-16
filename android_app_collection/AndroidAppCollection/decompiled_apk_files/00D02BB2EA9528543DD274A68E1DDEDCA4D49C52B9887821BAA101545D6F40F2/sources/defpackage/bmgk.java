package defpackage;

import android.speech.tts.UtteranceProgressListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmgk  reason: default package */
/* loaded from: classes3.dex */
public final class bmgk extends UtteranceProgressListener {
    final /* synthetic */ bmgl a;

    public bmgk(bmgl bmglVar) {
        this.a = bmglVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        cqkx.p(this.a);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        cqkx.p(this.a);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        cqkx.p(this.a);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStop(String str, boolean z) {
        cqkx.p(this.a);
    }
}
