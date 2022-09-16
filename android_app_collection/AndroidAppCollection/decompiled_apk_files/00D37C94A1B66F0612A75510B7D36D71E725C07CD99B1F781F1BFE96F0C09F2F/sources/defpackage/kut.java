package defpackage;

import android.media.AudioManager;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.google.android.apps.youtube.app.search.OnlineSearchController;
/* compiled from: PG */
/* renamed from: kut  reason: default package */
/* loaded from: classes3.dex */
final class kut extends UtteranceProgressListener implements TextToSpeech.OnInitListener, AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ OnlineSearchController a;
    private final CharSequence b;

    public kut(OnlineSearchController onlineSearchController, CharSequence charSequence) {
        this.a = onlineSearchController;
        this.b = charSequence;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        TextToSpeech textToSpeech;
        if ((i == -3 || i == -2 || i == -1) && (textToSpeech = this.a.e) != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
            this.a.e = null;
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        TextToSpeech textToSpeech = this.a.e;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.a.e = null;
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i) {
        StringBuilder sb = new StringBuilder(27);
        sb.append("Error speaking: ");
        sb.append(i);
        zep.m("OnlineSearchController", sb.toString());
        TextToSpeech textToSpeech = this.a.e;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.a.e = null;
        }
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        OnlineSearchController onlineSearchController = this.a;
        TextToSpeech textToSpeech = onlineSearchController.e;
        if (textToSpeech != null) {
            if (i == -1) {
                zep.m("OnlineSearchController", "Failed to initialize TextToSpeech");
                textToSpeech.shutdown();
                this.a.e = null;
                return;
            }
            AudioManager audioManager = (AudioManager) onlineSearchController.y.getSystemService("audio");
            if (audioManager != null) {
                audioManager.requestAudioFocus(this, 3, 2);
            }
            textToSpeech.setOnUtteranceProgressListener(this);
            textToSpeech.speak(this.b, 0, Bundle.EMPTY, "utteranceId");
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
