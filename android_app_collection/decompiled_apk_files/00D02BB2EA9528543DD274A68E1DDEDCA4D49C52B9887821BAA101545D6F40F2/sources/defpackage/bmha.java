package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bmha  reason: default package */
/* loaded from: classes3.dex */
public final class bmha implements bmgw {
    private static final dcqe d = dcqe.c("bmha");
    private static final Set<String> e = dcep.G("sq", "bn", "bs", "zh", "ca", "hr", "cs", "da", "nl", "en", "et", "fil", "fi", "fr", "hi", "hu", "id", "it", "ja", "jv", "km", "ko", "ku", "la", "ne", "no", "pl", "pt", "ro", "ru", "sr", "si", "sk", "es", "su", "sw", "sv", "ta", "th", "tr", "uk", "vi", "cy");
    public final bmez a;
    public String b = "";
    public dehn<Boolean> c;
    private final dxio<TextToSpeech> f;
    private final dehp g;

    public bmha(dxio<TextToSpeech> dxioVar, bmez bmezVar, dehp dehpVar) {
        this.f = dxioVar;
        this.a = bmezVar;
        this.g = dehpVar;
    }

    private static boolean g() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @Override // defpackage.bmgw
    public final dehn<Boolean> a(final Locale locale) {
        if (this.c == null) {
            dehn<Boolean> c = this.g.c(new Callable(this, locale) { // from class: bmgx
                private final bmha a;
                private final Locale b;

                {
                    this.a = this;
                    this.b = locale;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.a.f(this.b));
                }
            });
            this.c = c;
            c.Pk(new Runnable(this) { // from class: bmgy
                private final bmha a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c = null;
                }
            }, this.g);
        }
        return this.c;
    }

    @Override // defpackage.bmgw
    public final boolean b(String str) {
        return str.equals(this.b);
    }

    @Override // defpackage.bmgw
    public final void c() {
        this.b = "";
        this.a.b();
        this.a.d();
        this.f.a().stop();
    }

    @Override // defpackage.bmgw
    public final boolean d(Locale locale) {
        if (!g() || locale == null) {
            return false;
        }
        return e.contains(locale.getLanguage());
    }

    @Override // defpackage.bmgw
    public final void e(Locale locale, String str, UtteranceProgressListener utteranceProgressListener) {
        ckjz ckjzVar;
        TextToSpeech a = this.f.a();
        if (!g()) {
            bvoo.h("Called onSpeechClick from an unsupported API.", new Object[0]);
        } else if (this.b.equals(str)) {
            c();
        } else {
            this.b = str;
            f(locale);
            a.setOnUtteranceProgressListener(new bmgz(this, utteranceProgressListener));
            bmez bmezVar = this.a;
            String language = locale.getLanguage();
            String language2 = locale.getLanguage();
            String languageTag = locale.toLanguageTag();
            if (languageTag.matches("bn-BD")) {
                ckjzVar = ckjz.BANGLA_BANGLADESH;
            } else if (language2.equals("bn") || language2.startsWith("bn") || languageTag.startsWith("bn-")) {
                ckjzVar = ckjz.BANGLA_INDIA;
            } else if (locale.equals(Locale.TRADITIONAL_CHINESE) || languageTag.equals("zh-TW")) {
                ckjzVar = ckjz.CHINESE_TAIWAN;
            } else if (languageTag.matches("(zh-(HK|AN)|yue-HK)")) {
                ckjzVar = ckjz.CHINESE_CANTONESE;
            } else if (locale.equals(Locale.SIMPLIFIED_CHINESE) || language2.equals("zh") || language2.startsWith("zh") || languageTag.startsWith("zh-")) {
                ckjzVar = ckjz.CHINESE_CHINA;
            } else if (languageTag.matches("pt-PT")) {
                ckjzVar = ckjz.PORTUGUESE_PORTUGAL;
            } else if (language2.equals("pt") || language2.startsWith("pt") || languageTag.startsWith("pt-")) {
                ckjzVar = ckjz.PORTUGUESE_BRAZIL;
            } else if (languageTag.matches("es-US")) {
                ckjzVar = ckjz.SPANISH_US;
            } else if (languageTag.matches("es-419")) {
                ckjzVar = ckjz.SPANISH_LATAM;
            } else if (language2.equals("es") || language2.startsWith("es") || languageTag.startsWith("es-")) {
                ckjzVar = ckjz.SPANISH_SPAIN;
            } else {
                ckjzVar = ckjz.UNKNOWN;
            }
            if (ckjzVar.equals(ckjz.UNKNOWN)) {
                ckjzVar = bmez.a.getOrDefault(language, ckjz.UNKNOWN);
                if (ckjzVar.equals(ckjz.UNKNOWN)) {
                    if (language.contains("-")) {
                        language = (String) dcft.p(dbtm.a('-').g(language), 0);
                    } else if (language.contains("_")) {
                        language = (String) dcft.p(dbtm.a('_').g(language), 0);
                    }
                    ckjzVar = bmez.a.getOrDefault(language, ckjz.UNKNOWN);
                }
            }
            ((ckco) bmezVar.b.a(ckka.a)).a(ckjzVar.ordinal());
            if (ckjzVar.equals(ckjz.UNKNOWN)) {
                locale.toLanguageTag();
                bvoo.k(new Throwable());
            }
            a.speak(str, 0, new Bundle(), str);
        }
    }

    public final boolean f(Locale locale) {
        TextToSpeech a = this.f.a();
        if (a.getVoice() == null || !locale.equals(a.getVoice().getLocale())) {
            a.setLanguage(locale);
        }
        if (a.getVoice() == null || a.getVoice().getLocale() == null) {
            return false;
        }
        return a.getVoice().getLocale().equals(locale);
    }
}
