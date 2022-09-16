package defpackage;

import android.media.MediaCodecInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.filament.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmbo  reason: default package */
/* loaded from: classes5.dex */
public final class cmbo {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<cmbi, List<cmaz>> c = new HashMap<>();
    private static int d = -1;

    public static cmaz a() {
        return f("audio/raw");
    }

    public static synchronized List<cmaz> b(String str, boolean z, boolean z2) {
        cmbk cmblVar;
        synchronized (cmbo.class) {
            cmbi cmbiVar = new cmbi(str, z, z2);
            HashMap<cmbi, List<cmaz>> hashMap = c;
            List<cmaz> list = hashMap.get(cmbiVar);
            if (list != null) {
                return list;
            }
            if (cmny.a >= 21) {
                cmblVar = new cmbm(z, z2);
            } else {
                cmblVar = new cmbl();
            }
            ArrayList<cmaz> g = g(cmbiVar, cmblVar);
            if (z && g.isEmpty() && cmny.a >= 21 && cmny.a <= 23) {
                g = g(cmbiVar, new cmbl());
                if (!g.isEmpty()) {
                    String str2 = g.get(0).a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + str2.length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    sb.toString();
                }
            }
            if ("audio/raw".equals(str)) {
                if (cmny.a < 26 && cmny.b.equals("R9") && g.size() == 1 && g.get(0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    g.add(cmaz.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false));
                }
                i(g, cmbf.a);
            }
            if (cmny.a < 21 && g.size() > 1) {
                String str3 = g.get(0).a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    i(g, cmbg.a);
                }
            }
            if (cmny.a < 30 && g.size() > 1 && "OMX.qti.audio.decoder.flac".equals(g.get(0).a)) {
                g.add(g.remove(0));
            }
            List<cmaz> unmodifiableList = Collections.unmodifiableList(g);
            hashMap.put(cmbiVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List<cmaz> c(List<cmaz> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        i(arrayList, new cmbn(format) { // from class: cmbe
            private final Format a;

            {
                this.a = format;
            }

            @Override // defpackage.cmbn
            public final int a(Object obj) {
                Format format2 = this.a;
                cmaz cmazVar = (cmaz) obj;
                int i = cmbo.a;
                try {
                    return !cmazVar.b(format2) ? 0 : 1;
                } catch (cmbj unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    public static int d() {
        int i;
        if (d == -1) {
            cmaz f = f("video/avc");
            int i2 = 0;
            if (f != null) {
                MediaCodecInfo.CodecProfileLevel[] a2 = f.a();
                int length = a2.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = a2[i2].level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                i = 101376;
                                continue;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case ImageMetadata.CONTROL_AE_ANTIBANDING_MODE /* 65536 */:
                                i = 9437184;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, cmny.a >= 21 ? 345600 : 172800);
            }
            d = i2;
        }
        return d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0485, code lost:
        if (r1.equals("L150") != false) goto L278;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02bd A[Catch: NumberFormatException -> 0x02cc, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x02cc, blocks: (B:164:0x0263, B:166:0x0275, B:177:0x0291, B:192:0x02bd), top: B:543:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:549:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> e(com.google.android.exoplayer2.Format r19) {
        /*
            Method dump skipped, instructions count: 2500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmbo.e(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    public static cmaz f(String str) {
        List<cmaz> b2 = b(str, false, false);
        if (b2.isEmpty()) {
            return null;
        }
        return b2.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cf A[Catch: Exception -> 0x0316, TryCatch #3 {Exception -> 0x0316, blocks: (B:163:0x02ab, B:169:0x02b6, B:175:0x02c9, B:177:0x02cf, B:179:0x02d6, B:181:0x02df, B:184:0x02e8, B:189:0x02f1, B:182:0x02e3, B:178:0x02d3), top: B:224:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d3 A[Catch: Exception -> 0x0316, TryCatch #3 {Exception -> 0x0316, blocks: (B:163:0x02ab, B:169:0x02b6, B:175:0x02c9, B:177:0x02cf, B:179:0x02d6, B:181:0x02df, B:184:0x02e8, B:189:0x02f1, B:182:0x02e3, B:178:0x02d3), top: B:224:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02df A[Catch: Exception -> 0x0316, TryCatch #3 {Exception -> 0x0316, blocks: (B:163:0x02ab, B:169:0x02b6, B:175:0x02c9, B:177:0x02cf, B:179:0x02d6, B:181:0x02df, B:184:0x02e8, B:189:0x02f1, B:182:0x02e3, B:178:0x02d3), top: B:224:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02e3 A[Catch: Exception -> 0x0316, TryCatch #3 {Exception -> 0x0316, blocks: (B:163:0x02ab, B:169:0x02b6, B:175:0x02c9, B:177:0x02cf, B:179:0x02d6, B:181:0x02df, B:184:0x02e8, B:189:0x02f1, B:182:0x02e3, B:178:0x02d3), top: B:224:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e8 A[Catch: Exception -> 0x0316, TryCatch #3 {Exception -> 0x0316, blocks: (B:163:0x02ab, B:169:0x02b6, B:175:0x02c9, B:177:0x02cf, B:179:0x02d6, B:181:0x02df, B:184:0x02e8, B:189:0x02f1, B:182:0x02e3, B:178:0x02d3), top: B:224:0x02ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<defpackage.cmaz> g(defpackage.cmbi r17, defpackage.cmbk r18) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmbo.g(cmbi, cmbk):java.util.ArrayList");
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        if (cmny.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String x = cmny.x(mediaCodecInfo.getName());
        if (x.startsWith("arc.")) {
            return false;
        }
        return x.startsWith("omx.google.") || x.startsWith("omx.ffmpeg.") || (x.startsWith("omx.sec.") && x.contains(".sw.")) || x.equals("omx.qcom.video.decoder.hevcswvdec") || x.startsWith("c2.android.") || x.startsWith("c2.google.") || (!x.startsWith("omx.") && !x.startsWith("c2."));
    }

    private static <T> void i(List<T> list, final cmbn<T> cmbnVar) {
        Collections.sort(list, new Comparator(cmbnVar) { // from class: cmbh
            private final cmbn a;

            {
                this.a = cmbnVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                cmbn cmbnVar2 = this.a;
                int i = cmbo.a;
                return cmbnVar2.a(obj2) - cmbnVar2.a(obj);
            }
        });
    }
}
