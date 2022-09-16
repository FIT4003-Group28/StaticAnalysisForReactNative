package defpackage;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wzd  reason: default package */
/* loaded from: classes4.dex */
public final class wzd implements afzn {
    public InstreamAd a;
    public Map b;
    public ahgn c = null;
    public boolean d;
    public long e;
    private final String g;
    private final Random h;
    private final wxb i;
    private String j;
    private String k;
    private InstreamAdBreak l;

    public wzd(String str, Random random, wxb wxbVar) {
        this.h = random;
        String valueOf = String.valueOf(str);
        this.g = valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        this.i = wxbVar;
        wxbVar.a();
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        aalg aalgVar;
        Integer num = (Integer) wzc.a.get(str);
        SurveyAd surveyAd = null;
        if (num == null) {
            return null;
        }
        if (!afzo.h(this.b, str, uri)) {
            return (String) wzc.b.get(str);
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            InstreamAd instreamAd = this.a;
            return (instreamAd == null || instreamAd.d() == null) ? "" : this.a.d().toString();
        } else if (intValue == 2) {
            return Integer.toString(this.h.nextInt(89999999) + 10000000);
        } else {
            if (intValue == 3) {
                return "00:00:00.000";
            }
            if (intValue == 11) {
                InstreamAdBreak instreamAdBreak = this.l;
                return instreamAdBreak != null ? Integer.toString(instreamAdBreak.b().d) : "0";
            } else if (intValue == 32) {
                return "0";
            } else {
                if (intValue == 59) {
                    if (this.a == null) {
                        return "0";
                    }
                    long j = this.e;
                    return j > 0 ? Long.toString(j) : "0";
                } else if (intValue == 65) {
                    return "";
                } else {
                    switch (intValue) {
                        case 5:
                            return TextUtils.join(",", (Iterable) null);
                        case 6:
                            if (this.a == null) {
                                return "";
                            }
                            return null;
                        case 7:
                            InstreamAd instreamAd2 = this.a;
                            return instreamAd2 != null ? Integer.toString(((InstreamAdImpl) instreamAd2).b.c() * 1000) : "0";
                        case 8:
                            if (this.a == null) {
                                return "";
                            }
                            return null;
                        case 9:
                            InstreamAd instreamAd3 = this.a;
                            return (instreamAd3 == null || TextUtils.isEmpty(instreamAd3.i())) ? "0" : this.a.i();
                        default:
                            switch (intValue) {
                                case 13:
                                    return "0";
                                case 14:
                                    String str2 = this.k;
                                    return str2 != null ? str2 : "";
                                case 15:
                                    String str3 = this.j;
                                    return str3 != null ? str3 : "";
                                default:
                                    switch (intValue) {
                                        case 18:
                                            return "detailpage";
                                        case 19:
                                            InstreamAd instreamAd4 = this.a;
                                            return (instreamAd4 == null || instreamAd4.f() == null) ? "0" : this.a.f().g;
                                        case 20:
                                            InstreamAd instreamAd5 = this.a;
                                            if (instreamAd5 == null) {
                                                return "0";
                                            }
                                            InstreamAdImpl instreamAdImpl = (InstreamAdImpl) instreamAd5;
                                            PlayerAd playerAd = instreamAdImpl.b;
                                            if (playerAd instanceof SurveyAd) {
                                                surveyAd = (SurveyAd) playerAd;
                                            }
                                            if (surveyAd != null) {
                                                aalgVar = aalg.SURVEY;
                                            } else if (instreamAdImpl.m()) {
                                                aalgVar = aalg.SKIPPABLE;
                                            } else {
                                                aalgVar = aalg.NONE;
                                            }
                                            return aalgVar.d;
                                        case 21:
                                            return this.a != null ? "2" : "0";
                                        default:
                                            switch (intValue) {
                                                case 26:
                                                    InstreamAdBreak instreamAdBreak2 = this.l;
                                                    return (instreamAdBreak2 == null || instreamAdBreak2.b() != xdb.MID_ROLL) ? "0" : Long.toString(TimeUnit.MILLISECONDS.toSeconds(this.l.a()));
                                                case 27:
                                                    ahgn ahgnVar = this.c;
                                                    if (ahgnVar != null) {
                                                        return Integer.toString(ahgnVar.a());
                                                    }
                                                    return Integer.toString(-1);
                                                case 28:
                                                    ahgn ahgnVar2 = this.c;
                                                    return ahgnVar2 != null ? ahgnVar2.d().a() : "0";
                                                case 29:
                                                    ahgn ahgnVar3 = this.c;
                                                    if (ahgnVar3 != null) {
                                                        return Integer.toString(ahgnVar3.b());
                                                    }
                                                    return Integer.toString(-1);
                                                case 30:
                                                    return "";
                                                default:
                                                    switch (intValue) {
                                                        case 35:
                                                            InstreamAd instreamAd6 = this.a;
                                                            return (instreamAd6 == null || instreamAd6.l()) ? "0" : "1";
                                                        case 36:
                                                            return (this.b == null || this.i.b == null) ? "" : this.i.b;
                                                        case 37:
                                                            return "DROID";
                                                        case 38:
                                                            return Build.VERSION.RELEASE;
                                                        case 39:
                                                            return "UNWN";
                                                        case 40:
                                                            return "MBL";
                                                        case 41:
                                                            return this.g;
                                                        case 42:
                                                            return "a";
                                                        case 43:
                                                            return "android";
                                                        case 44:
                                                            return Build.MODEL;
                                                        case 45:
                                                            return (this.b == null || this.i.b == null) ? "none" : this.i.b;
                                                        default:
                                                            switch (intValue) {
                                                                case 50:
                                                                    if (this.a == null || this.e <= 0) {
                                                                        return "0.0";
                                                                    }
                                                                    Locale locale = Locale.US;
                                                                    double d = this.e;
                                                                    Double.isNaN(d);
                                                                    return String.format(locale, "%.1f", Double.valueOf(d / 1000.0d));
                                                                case 51:
                                                                    InstreamAd instreamAd7 = this.a;
                                                                    return instreamAd7 != null ? ((InstreamAdImpl) instreamAd7).b.l : "";
                                                                case 52:
                                                                    return this.a != null ? this.d ? "playing" : "pause" : "";
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
            }
        }
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wzd";
    }

    public final wza c(tjt tjtVar) {
        return new wza(tjtVar, this.b);
    }

    public final void d(InstreamAdBreak instreamAdBreak) {
        this.l = instreamAdBreak;
        this.b = instreamAdBreak != null ? afzo.c(InstreamAdBreak.a) : null;
    }

    public final void e(String str, String str2) {
        this.j = str2;
        this.k = str;
    }
}
