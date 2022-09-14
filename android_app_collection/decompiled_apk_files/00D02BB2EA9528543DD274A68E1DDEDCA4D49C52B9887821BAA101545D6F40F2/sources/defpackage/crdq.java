package defpackage;

import android.speech.tts.TextToSpeech;
/* compiled from: PG */
/* renamed from: crdq  reason: default package */
/* loaded from: classes5.dex */
final class crdq implements TextToSpeech.OnInitListener {
    final /* synthetic */ TextToSpeech.OnInitListener a;
    final /* synthetic */ crdr b;

    public crdq(crdr crdrVar, TextToSpeech.OnInitListener onInitListener) {
        this.b = crdrVar;
        this.a = onInitListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, TextToSpeech.OnInitListener onInitListener) {
        crdr crdrVar = this.b;
        dbsk.l(crdrVar.f.isDone());
        if (i == 0) {
            try {
                crdrVar.h = crdrVar.a();
                String h = crdrVar.h();
                i = (h == null || !h.equals("com.google.android.tts")) ? -1 : 0;
                crdrVar.e.a(crdrVar.h());
            } catch (Exception e) {
                bvoo.f(new RuntimeException("Exception after TTS reported init SUCCESS", e));
                i = -1;
            }
        }
        onInitListener.onInit(i);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(final int i) {
        deig<Void> deigVar = this.b.f;
        final TextToSpeech.OnInitListener onInitListener = this.a;
        deigVar.Pk(new Runnable(this, i, onInitListener) { // from class: crdp
            private final crdq a;
            private final int b;
            private final TextToSpeech.OnInitListener c;

            {
                this.a = this;
                this.b = i;
                this.c = onInitListener;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b, this.c);
            }
        }, this.b.d);
    }
}
