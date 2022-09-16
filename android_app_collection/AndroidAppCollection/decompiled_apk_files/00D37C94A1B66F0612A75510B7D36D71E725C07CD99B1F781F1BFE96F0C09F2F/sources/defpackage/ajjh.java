package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ajjh  reason: default package */
/* loaded from: classes.dex */
public class ajjh {
    public static boolean A(ajff ajffVar) {
        PlaybackStartDescriptor g = ajffVar.g();
        PlayerResponseModel c = ajffVar.c();
        VideoStreamingData videoStreamingData = c != null ? c.c : null;
        return g != null && g.t() && videoStreamingData != null && !videoStreamingData.t();
    }

    public static List B(PlayerResponseModel playerResponseModel, int i) {
        SubtitleTrack a;
        ArrayList arrayList = new ArrayList();
        for (FormatStreamModel formatStreamModel : playerResponseModel.c.n) {
            if (formatStreamModel.e() == i) {
                aiyg m = SubtitleTrack.m();
                String str = formatStreamModel.b;
                if (str != null) {
                    m.j(str);
                }
                if (formatStreamModel.s().isEmpty()) {
                    String displayName = new Locale("en").getDisplayName(Locale.getDefault());
                    m.e("en");
                    m.k(".en");
                    m.i("");
                    m.b = displayName;
                    m.f(displayName);
                    m.h("");
                    m.b(formatStreamModel.e());
                    m.g(formatStreamModel.e);
                    a = m.a();
                } else {
                    m.e(formatStreamModel.s());
                    appr apprVar = formatStreamModel.a.B;
                    if (apprVar == null) {
                        apprVar = appr.a;
                    }
                    m.k(apprVar.c);
                    m.i("");
                    m.b = formatStreamModel.r();
                    m.f(new Locale(formatStreamModel.s()).getDisplayName(Locale.getDefault()));
                    m.h(formatStreamModel.r());
                    m.b(formatStreamModel.e());
                    m.g(formatStreamModel.e);
                    a = m.a();
                }
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public static tcr c(Object obj) {
        return d(obj, null);
    }

    public static tcr d(Object obj, asjj asjjVar) {
        ajje a = ajjf.a();
        a.a = obj;
        if (asjjVar != null) {
            a.b = asjjVar;
        }
        final ajjf a2 = a.a();
        return new tcr() { // from class: ajjg
            @Override // defpackage.tcr
            public final tcq a(tcq tcqVar) {
                tcqVar.d = ajjf.this;
                return tcqVar;
            }
        };
    }

    public static void e(int i, aoob aoobVar, tcs tcsVar) {
        int i2;
        ampq b = ajna.b(tcsVar);
        if (b.h()) {
            switch (i - 1) {
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 1025;
                    break;
                case 3:
                    i2 = 9;
                    break;
                case 4:
                    i2 = 65;
                    break;
                case 5:
                    i2 = 4097;
                    break;
                case 6:
                    i2 = 8193;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            if (i2 == 1) {
                return;
            }
            ((acti) b.c()).H(i2, new acte(aoobVar), null);
        }
    }

    public static apoj f(aqft aqftVar) {
        if ((aqftVar.b & 64) != 0) {
            apok apokVar = aqftVar.i;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            return apojVar == null ? apoj.a : apojVar;
        }
        return null;
    }

    public static apoj g(aqft aqftVar) {
        if ((aqftVar.b & 32) != 0) {
            apok apokVar = aqftVar.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            return apojVar == null ? apoj.a : apojVar;
        }
        return null;
    }

    public static CharSequence h(aqft aqftVar) {
        arag aragVar;
        apoj f = f(aqftVar);
        if (f == null) {
            if ((aqftVar.b & 4194304) != 0) {
                aragVar = aqftVar.q;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            return ajgl.b(aragVar);
        }
        arag aragVar2 = f.i;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        return ajgl.b(aragVar2);
    }

    public static CharSequence i(aqft aqftVar) {
        arag aragVar;
        apoj g = g(aqftVar);
        if (g == null) {
            if ((aqftVar.b & 2097152) != 0) {
                aragVar = aqftVar.p;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            return ajgl.b(aragVar);
        }
        arag aragVar2 = g.i;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        return ajgl.b(aragVar2);
    }

    public static CharSequence j(aqft aqftVar, aafo aafoVar) {
        CharSequence[] charSequenceArr;
        CharSequence charSequence = null;
        if (aqftVar.g.size() != 0) {
            charSequenceArr = new CharSequence[aqftVar.g.size()];
            for (int i = 0; i < aqftVar.g.size(); i++) {
                charSequenceArr[i] = aafv.a((arag) aqftVar.g.get(i), aafoVar, false);
            }
        } else {
            charSequenceArr = null;
        }
        if (charSequenceArr == null) {
            return null;
        }
        CharSequence concat = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
        for (CharSequence charSequence2 : charSequenceArr) {
            charSequence = charSequence == null ? charSequence2 : TextUtils.concat(charSequence, concat, charSequence2);
        }
        return charSequence;
    }

    public static aoqu k(aunb aunbVar) {
        if (aunbVar != null && !aunbVar.equals(aunbVar.mo50getDefaultInstanceForType())) {
            try {
                return (aoqu) aunbVar.qm(aoos.b().d(aunb.a, apdw.g(aunbVar)));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object l(aunb aunbVar, aooq aooqVar) {
        if (aunbVar == null || !aunbVar.qn(aooqVar)) {
            return null;
        }
        return aunbVar.qm(aooqVar);
    }

    public static void m(int i, int i2, asaa asaaVar, acrr acrrVar) {
        aopa createBuilder = arfx.a.createBuilder();
        createBuilder.copyOnWrite();
        arfx arfxVar = (arfx) createBuilder.instance;
        arfxVar.c = i - 1;
        arfxVar.b |= 1;
        createBuilder.copyOnWrite();
        arfx arfxVar2 = (arfx) createBuilder.instance;
        arfxVar2.d = i2 - 1;
        arfxVar2.b |= 2;
        if (asaaVar != null) {
            aoob aoobVar = asaaVar.p;
            createBuilder.copyOnWrite();
            arfx arfxVar3 = (arfx) createBuilder.instance;
            aoobVar.getClass();
            arfxVar3.b |= 4;
            arfxVar3.e = aoobVar;
        }
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cD((arfx) createBuilder.mo39build());
        acrrVar.c((arrh) a.mo39build());
    }

    public static int n(ajff ajffVar) {
        if (ajffVar != null) {
            return ajffVar.p().k;
        }
        return 4;
    }

    public static long o(ajff ajffVar) {
        return ajffVar.p().i;
    }

    public static long p(ajff ajffVar) {
        return ajffVar.p().h;
    }

    public static long q(ajff ajffVar) {
        return ajffVar.p().e;
    }

    public static long r(aeov aeovVar) {
        return Math.max(aeovVar.i().b, 0L);
    }

    public static aeos s(aeov aeovVar, PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null || playerResponseModel.c == null || playerResponseModel.c() == null) {
            return aeov.c;
        }
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        PlayerConfigModel c = playerResponseModel.c();
        afgg afggVar = aeovVar.d;
        afms.a(videoStreamingData);
        afms.a(c);
        return new aeos(afggVar.c(videoStreamingData, c));
    }

    public static void t(ajff ajffVar, long j) {
        ajffVar.p().h = j;
    }

    public static void u(ajff ajffVar, long j) {
        ajffVar.p().e = j;
    }

    public static void v(ajff ajffVar, int i) {
        ajffVar.p().k = i;
    }

    public static boolean w(ajff ajffVar) {
        PlayerResponseModel c = ajffVar.c();
        return c != null && c.c().aw();
    }

    public static boolean x(ajff ajffVar) {
        PlayerResponseModel c = ajffVar.c();
        VideoStreamingData videoStreamingData = c == null ? null : c.c;
        return videoStreamingData != null && videoStreamingData.B();
    }

    public static boolean y(ajff ajffVar) {
        return ajffVar.p().k == 9;
    }

    public static boolean z(aijf aijfVar, PlayerResponseModel playerResponseModel) {
        return aijfVar.j && !aiqa.c(playerResponseModel);
    }

    public Uri a(Uri uri) {
        return uri;
    }

    public boolean b(Uri uri) {
        return false;
    }
}
