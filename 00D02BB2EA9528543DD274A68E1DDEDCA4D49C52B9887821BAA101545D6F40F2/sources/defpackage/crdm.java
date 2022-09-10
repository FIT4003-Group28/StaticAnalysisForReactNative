package defpackage;

import android.speech.tts.TextToSpeech;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: crdm  reason: default package */
/* loaded from: classes5.dex */
final class crdm implements TextToSpeech.OnInitListener {
    final /* synthetic */ creo a;
    final /* synthetic */ crdn b;

    public crdm(crdn crdnVar, creo creoVar) {
        this.b = crdnVar;
        this.a = creoVar;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        this.b.a = i;
        this.b.b(i, Locale.getDefault(), this.a);
    }
}
