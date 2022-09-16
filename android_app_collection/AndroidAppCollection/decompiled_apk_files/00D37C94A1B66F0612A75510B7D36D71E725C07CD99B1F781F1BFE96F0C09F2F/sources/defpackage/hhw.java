package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import java.io.File;
import java.io.FileOutputStream;
/* compiled from: PG */
/* renamed from: hhw  reason: default package */
/* loaded from: classes3.dex */
public final class hhw {
    public static int a(hhq hhqVar) {
        hhqVar.d();
        return (int) ((ShortsVideoMetadata) ((ampv) hhqVar.d()).a).c();
    }

    public static aqsv b(zrk zrkVar, hdi hdiVar) {
        aqst aqstVar;
        aopa createBuilder = aqsv.a.createBuilder();
        aopa createBuilder2 = aqsu.a.createBuilder();
        aopa createBuilder3 = aqsw.a.createBuilder();
        String str = zrkVar.b;
        createBuilder3.copyOnWrite();
        aqsw aqswVar = (aqsw) createBuilder3.instance;
        str.getClass();
        aqswVar.b |= 2;
        aqswVar.d = str;
        String str2 = zrkVar.e;
        createBuilder3.copyOnWrite();
        aqsw aqswVar2 = (aqsw) createBuilder3.instance;
        str2.getClass();
        aqswVar2.b |= 1;
        aqswVar2.c = str2;
        createBuilder3.copyOnWrite();
        aqsw aqswVar3 = (aqsw) createBuilder3.instance;
        aqswVar3.b |= 4;
        aqswVar3.e = "SHORTS_PRESETS";
        aqsw aqswVar4 = (aqsw) createBuilder3.mo39build();
        createBuilder2.copyOnWrite();
        aqsu aqsuVar = (aqsu) createBuilder2.instance;
        aqswVar4.getClass();
        aqsuVar.c = aqswVar4;
        aqsuVar.b |= 1;
        createBuilder2.copyOnWrite();
        aqsu aqsuVar2 = (aqsu) createBuilder2.instance;
        aqsuVar2.b |= 2;
        aqsuVar2.d = 1.0d;
        createBuilder.copyOnWrite();
        aqsv aqsvVar = (aqsv) createBuilder.instance;
        aqsu aqsuVar3 = (aqsu) createBuilder2.mo39build();
        aqsuVar3.getClass();
        aqsvVar.c = aqsuVar3;
        aqsvVar.b |= 1;
        if (hdiVar != null) {
            if (!hdiVar.a) {
                aqstVar = null;
            } else {
                aopa createBuilder4 = aqst.a.createBuilder();
                if ("".equals(hdiVar.d)) {
                    createBuilder4.copyOnWrite();
                    aqst aqstVar2 = (aqst) createBuilder4.instance;
                    aqstVar2.c = 1;
                    aqstVar2.b |= 1;
                } else {
                    createBuilder4.copyOnWrite();
                    aqst aqstVar3 = (aqst) createBuilder4.instance;
                    aqstVar3.c = 2;
                    aqstVar3.b |= 1;
                }
                if (hdiVar.e.containsKey(hdiVar.d)) {
                    int intValue = ((Integer) hdiVar.e.get(hdiVar.d)).intValue();
                    createBuilder4.copyOnWrite();
                    aqst aqstVar4 = (aqst) createBuilder4.instance;
                    aqstVar4.b |= 2;
                    aqstVar4.d = intValue;
                }
                aqstVar = (aqst) createBuilder4.mo39build();
            }
            if (aqstVar != null) {
                createBuilder.copyOnWrite();
                aqsv aqsvVar2 = (aqsv) createBuilder.instance;
                aqsvVar2.d = aqstVar;
                aqsvVar2.b |= 2;
            }
        }
        return (aqsv) createBuilder.mo39build();
    }

    public static avxh c(int i, int i2) {
        aopa createBuilder = avxh.a.createBuilder();
        createBuilder.copyOnWrite();
        avxh avxhVar = (avxh) createBuilder.instance;
        avxhVar.b |= 1;
        avxhVar.c = i;
        aooo b = aost.b(i2);
        createBuilder.copyOnWrite();
        avxh avxhVar2 = (avxh) createBuilder.instance;
        b.getClass();
        avxhVar2.d = b;
        avxhVar2.b |= 2;
        return (avxh) createBuilder.mo39build();
    }

    public static final void d(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        bitmap.compress(compressFormat, 100, new FileOutputStream(file));
    }

    public static long e(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand) {
        if (sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.f.isEmpty()) {
            return 0L;
        }
        return ((aust) sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.f.get(0)).b;
    }

    public static long f(auus auusVar) {
        auur auurVar = auusVar.f;
        if (auurVar == null) {
            auurVar = auur.a;
        }
        return auurVar.c;
    }

    public static long g(axcw axcwVar) {
        axcz axczVar = axcwVar.d;
        if (axczVar == null) {
            axczVar = axcz.a;
        }
        return axczVar.c;
    }

    public static auuv h(apzg apzgVar) {
        if (apzgVar.qn(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) apzgVar.qm(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
            if ((shortsCreationEndpointOuterClass$ShortsCreationEndpoint.b & 2) != 0) {
                auuv b = auuv.b(shortsCreationEndpointOuterClass$ShortsCreationEndpoint.d);
                return b == null ? auuv.SHORTS_CREATION_SURFACE_UNKNOWN : b;
            }
            afus.b(1, 6, "[ShortsCreation][Android][ProjectState]No creation surface specified");
        } else {
            afus.b(1, 6, "[ShortsCreation][Android][ProjectState]No shorts creation endpoint specified");
        }
        return auuv.SHORTS_CREATION_SURFACE_UNKNOWN;
    }

    public static boolean i(apzg apzgVar) {
        return apzgVar != null && apzgVar.qn(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint) && !((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) apzgVar.qm(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).c.isEmpty();
    }

    public static atqa j(agqf agqfVar) {
        atrp atrpVar = agqfVar.l;
        if (atrpVar != null && atrpVar.j.size() != 0) {
            for (atro atroVar : atrpVar.j) {
                if ((atroVar.b & 2) != 0) {
                    atqa atqaVar = atroVar.c;
                    return atqaVar == null ? atqa.a : atqaVar;
                }
            }
        }
        return null;
    }

    public static awbp k(String str, fbw fbwVar) {
        try {
            asxp asxpVar = fbwVar.a.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.aS) {
                aoob b = aakj.b(str);
                if (b.H()) {
                    return null;
                }
                return (awbp) aopi.parseFrom(awbp.a, b, aoos.b());
            }
            return (awbp) aopi.parseFrom(awbp.a, aakj.b(str), aoos.b());
        } catch (aopx unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Found entityKey=`");
            sb.append(str);
            sb.append("` that does not contain a ViewModelEntityId message as it's identifier.");
            zep.b(sb.toString());
            return null;
        }
    }

    public static void l(akaf akafVar) {
        wjr wjrVar = new wjr();
        akafVar.u(new emt(wjrVar));
        akafVar.x(new emu(wjrVar));
    }
}
