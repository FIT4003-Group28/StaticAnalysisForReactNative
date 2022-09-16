package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: yxz  reason: default package */
/* loaded from: classes4.dex */
public final class yxz extends UtteranceProgressListener implements TextToSpeech.OnInitListener, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int f = 0;
    public TextToSpeech a;
    final AudioManager b;
    public final azpo c = azpo.W();
    final List d = new ArrayList();
    public final zha e = new zha(amyg.a);
    private final Context g;
    private String h;

    public yxz(Context context) {
        this.g = context;
        this.a = new TextToSpeech(context, this);
        this.b = (AudioManager) context.getSystemService("audio");
    }

    private final void c(String str) {
        this.c.b(new Throwable(str));
    }

    private final void d(String str) {
        this.d.remove(str);
        if (this.d.isEmpty()) {
            this.b.abandonAudioFocus(this);
        }
    }

    public final void a(String str, int i, String str2) {
        if (this.a != null) {
            this.d.add(str2);
            this.b.requestAudioFocus(this, 3, 2);
            if (this.a.speak(str, i, null, str2) != -1) {
                return;
            }
            zep.l("TTS failed during speaking");
            return;
        }
        this.h = str;
        this.a = new TextToSpeech(this.g, this);
    }

    public final void b() {
        TextToSpeech textToSpeech = this.a;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -3 || i == -2 || i == -1) {
            b();
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.e.a(new yxx(str, 1));
        d(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.e.a(new yxx(str));
        d(str);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        if (i == 0) {
            Locale locale = Locale.getDefault();
            if (this.a.isLanguageAvailable(locale) < 0 || this.a.setLanguage(locale) == -1) {
                zep.l("TTS failed during initialization: LANG_MISSING_DATA");
                c("TTS failed during initialization with code: LANG_MISSING_DATA");
                return;
            }
            this.a.setOnUtteranceProgressListener(this);
            String str = this.h;
            if (str != null) {
                a(str, 0, "TextToSpeechController");
            }
            this.h = null;
            this.c.sm();
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("TTS failed during initialization with code: ");
        sb.append(i);
        zep.l(sb.toString());
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("TTS failed during initialization with code: ");
        sb2.append(i);
        c(sb2.toString());
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        this.e.a(new khv(12));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(final String str, final int i) {
        this.e.a(new Consumer() { // from class: yxy
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                String str2 = str;
                int i2 = i;
                int i3 = yxz.f;
                ((ssz) obj).a(str2, i2);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
        d(str);
    }
}
