package defpackage;

import android.speech.tts.UtteranceProgressListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckrs  reason: default package */
/* loaded from: classes4.dex */
public final class ckrs extends UtteranceProgressListener {
    final /* synthetic */ ckrt a;

    public ckrs(ckrt ckrtVar) {
        this.a = ckrtVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.a.i(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.a.g(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStop(String str, boolean z) {
        this.a.g(str);
    }
}
