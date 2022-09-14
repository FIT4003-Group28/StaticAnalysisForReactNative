package defpackage;

import android.speech.tts.UtteranceProgressListener;
/* compiled from: PG */
/* renamed from: bmgz  reason: default package */
/* loaded from: classes3.dex */
final class bmgz extends UtteranceProgressListener {
    final /* synthetic */ UtteranceProgressListener a;
    final /* synthetic */ bmha b;

    public bmgz(bmha bmhaVar, UtteranceProgressListener utteranceProgressListener) {
        this.b = bmhaVar;
        this.a = utteranceProgressListener;
    }

    private final void a(String str) {
        if (this.b.b.equals(str)) {
            this.b.b = "";
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.b.a.d();
        a(str);
        this.a.onDone(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.b.a.d();
        a(str);
        this.a.onError(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        this.b.a.b();
        this.b.a.c();
        this.a.onStart(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStop(String str, boolean z) {
        this.b.a.d();
        a(str);
        this.a.onStop(str, z);
    }
}
