package defpackage;

import android.app.Application;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crdr  reason: default package */
/* loaded from: classes5.dex */
public final class crdr implements creq {
    public static final dcqe a = dcqe.c("crdr");
    public final Application b;
    public final bvrb c;
    public final Executor d;
    public final crox e;
    public final deig<Void> f = deig.d();
    @dzsi
    public TextToSpeech g;
    @dzsi
    public Locale h;
    private final dwkj i;

    public crdr(Application application, bvrb bvrbVar, Executor executor, dwkj dwkjVar, crox croxVar) {
        this.b = application;
        this.c = bvrbVar;
        this.d = executor;
        this.i = dwkjVar;
        this.e = croxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(@dzsi Locale locale, @dzsi Locale locale2) {
        return locale != null && locale2 != null && f(locale, locale2) && g(locale, locale2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(@dzsi Locale locale, @dzsi Locale locale2) {
        if (locale2 != null) {
            boolean equals = locale.getLanguage().equals(locale2.getLanguage());
            try {
                return equals | locale.getISO3Language().equals(locale2.getLanguage());
            } catch (MissingResourceException unused) {
                return equals;
            }
        }
        return false;
    }

    static boolean g(@dzsi Locale locale, @dzsi Locale locale2) {
        boolean equals = locale.getCountry().equals(locale2.getCountry());
        try {
            return equals | locale.getISO3Country().equals(locale2.getCountry());
        } catch (MissingResourceException unused) {
            return equals;
        }
    }

    @Override // defpackage.creq
    @dzsi
    public final Locale a() {
        try {
            TextToSpeech textToSpeech = this.g;
            if (textToSpeech == null) {
                return null;
            }
            return textToSpeech.getLanguage();
        } catch (Exception e) {
            bvoo.f(new RuntimeException("Exception calling getLanguage()", e));
            return new Locale("crash");
        }
    }

    @Override // defpackage.creq
    public final int b(UtteranceProgressListener utteranceProgressListener) {
        TextToSpeech textToSpeech = this.g;
        if (textToSpeech != null) {
            return textToSpeech.setOnUtteranceProgressListener(utteranceProgressListener);
        }
        return -1;
    }

    @Override // defpackage.creq
    public final void c() {
        TextToSpeech textToSpeech = this.g;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
    }

    @Override // defpackage.creq
    public final int d(String str, String str2, String str3) {
        Locale a2 = a();
        if (a2 != null && a2.equals(this.h)) {
            HashMap<String, String> f = dcjz.f(this.i.g.size() + 2);
            f.put("utteranceId", str2);
            f.put("com.google.android.tts:Mode", "LocalOnly");
            for (dwkd dwkdVar : this.i.g) {
                f.put(dwkdVar.a, dwkdVar.b);
            }
            this.e.c();
            this.e.k(str);
            TextToSpeech textToSpeech = this.g;
            if (textToSpeech != null) {
                return textToSpeech.synthesizeToFile(str, f, str3);
            }
        }
        return -1;
    }

    @dzsi
    public final String h() {
        if (this.g != null) {
            try {
                return (String) TextToSpeech.class.getMethod("getCurrentEngine", new Class[0]).invoke(this.g, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.creq
    public final void i() {
        TextToSpeech textToSpeech = this.g;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }
}
