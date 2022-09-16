package defpackage;

import android.media.MediaCodecInfo;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: awn  reason: default package */
/* loaded from: classes2.dex */
public final class awn {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap c = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0301 A[Catch: NumberFormatException -> 0x0311, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0311, blocks: (B:168:0x02a6, B:170:0x02b8, B:181:0x02d4, B:197:0x0301), top: B:554:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(com.google.android.exoplayer2.Format r17) {
        /*
            Method dump skipped, instructions count: 2744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awn.a(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    public static avz b() {
        List c2 = c("audio/raw", false, false);
        if (c2.isEmpty()) {
            return null;
        }
        return (avz) c2.get(0);
    }

    public static synchronized List c(String str, boolean z, boolean z2) {
        synchronized (awn.class) {
            awh awhVar = new awh(str, z, z2);
            HashMap hashMap = c;
            List list = (List) hashMap.get(awhVar);
            if (list != null) {
                return list;
            }
            int i = pxi.a;
            ArrayList e = e(awhVar, new awl(z, z2));
            if (z && e.isEmpty() && pxi.a <= 23) {
                e = e(awhVar, new awk());
                if (!e.isEmpty()) {
                    String str2 = ((avz) e.get(0)).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + str2.length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (pxi.a < 26 && pxi.b.equals("R9") && e.size() == 1 && ((avz) e.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    e.add(avz.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false));
                }
                f(e, awf.a);
            }
            if (pxi.a < 30 && e.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((avz) e.get(0)).a)) {
                e.add((avz) e.remove(0));
            }
            List unmodifiableList = Collections.unmodifiableList(e);
            hashMap.put(awhVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List d(List list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        f(arrayList, new awm() { // from class: awe
            @Override // defpackage.awm
            public final int a(Object obj) {
                Format format2 = Format.this;
                avz avzVar = (avz) obj;
                int i = awn.a;
                try {
                    return !avzVar.c(format2) ? 0 : 1;
                } catch (awi unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0190 A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:77:0x0139, B:83:0x0144, B:89:0x0157, B:91:0x015d, B:93:0x0164, B:95:0x016d, B:102:0x0190, B:107:0x0199, B:96:0x0171, B:98:0x0181, B:100:0x0189, B:92:0x0161), top: B:141:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:77:0x0139, B:83:0x0144, B:89:0x0157, B:91:0x015d, B:93:0x0164, B:95:0x016d, B:102:0x0190, B:107:0x0199, B:96:0x0171, B:98:0x0181, B:100:0x0189, B:92:0x0161), top: B:141:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161 A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:77:0x0139, B:83:0x0144, B:89:0x0157, B:91:0x015d, B:93:0x0164, B:95:0x016d, B:102:0x0190, B:107:0x0199, B:96:0x0171, B:98:0x0181, B:100:0x0189, B:92:0x0161), top: B:141:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016d A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:77:0x0139, B:83:0x0144, B:89:0x0157, B:91:0x015d, B:93:0x0164, B:95:0x016d, B:102:0x0190, B:107:0x0199, B:96:0x0171, B:98:0x0181, B:100:0x0189, B:92:0x0161), top: B:141:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171 A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:77:0x0139, B:83:0x0144, B:89:0x0157, B:91:0x015d, B:93:0x0164, B:95:0x016d, B:102:0x0190, B:107:0x0199, B:96:0x0171, B:98:0x0181, B:100:0x0189, B:92:0x0161), top: B:141:0x0139 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList e(defpackage.awh r17, defpackage.awj r18) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awn.e(awh, awj):java.util.ArrayList");
    }

    private static void f(List list, final awm awmVar) {
        Collections.sort(list, new Comparator() { // from class: awg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                awm awmVar2 = awm.this;
                int i = awn.a;
                return awmVar2.a(obj2) - awmVar2.a(obj);
            }
        });
    }

    private static void g(MediaCodecInfo mediaCodecInfo) {
        if (pxi.a >= 29) {
            mediaCodecInfo.isSoftwareOnly();
            return;
        }
        String g = akzj.g(mediaCodecInfo.getName());
        if (g.startsWith("arc.") || g.startsWith("omx.google.") || g.startsWith("omx.ffmpeg.")) {
            return;
        }
        if ((g.startsWith("omx.sec.") && g.contains(".sw.")) || g.equals("omx.qcom.video.decoder.hevcswvdec") || g.startsWith("c2.android.") || g.startsWith("c2.google.") || g.startsWith("omx.")) {
            return;
        }
        g.startsWith("c2.");
    }
}
