package defpackage;

import com.google.android.youtube.R;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahdp  reason: default package */
/* loaded from: classes.dex */
public final class ahdp {
    public static final Comparator a = ahdo.b;
    public static final Comparator b = ahdo.a;
    public static final Comparator c = utr.q;
    public static final Comparator d = utr.r;
    public static final Comparator e = utr.s;
    public static final Comparator f = utr.t;
    public static final Map g;
    public static final Map h;
    private static final Map i;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        HashMap hashMap2 = new HashMap();
        i = hashMap2;
        HashMap hashMap3 = new HashMap();
        h = hashMap3;
        hashMap.put(attl.AUDIO_ONLY, 0);
        hashMap.put(attl.LD, 144);
        hashMap.put(attl.LD_240, 240);
        hashMap.put(attl.SD, 360);
        hashMap.put(attl.SD_480, 480);
        hashMap.put(attl.HD, 720);
        hashMap.put(attl.HD_1080, 1080);
        hashMap.put(attl.HD_1440, 1440);
        hashMap.put(attl.HD_2160, 2160);
        hashMap2.put(0, attl.AUDIO_ONLY);
        hashMap2.put(144, attl.LD);
        hashMap2.put(240, attl.LD_240);
        hashMap2.put(360, attl.SD);
        hashMap2.put(480, attl.SD_480);
        hashMap2.put(720, attl.HD);
        hashMap2.put(1080, attl.HD_1080);
        hashMap2.put(1440, attl.HD_1440);
        hashMap2.put(2160, attl.HD_2160);
        hashMap3.put(attl.AUDIO_ONLY, Integer.valueOf((int) R.string.offline_video_quality_audio_only));
        hashMap3.put(attl.LD, Integer.valueOf((int) R.string.offline_video_quality_144p));
        hashMap3.put(attl.SD, Integer.valueOf((int) R.string.offline_video_quality_360p));
        hashMap3.put(attl.HD, Integer.valueOf((int) R.string.offline_video_quality_720p));
        hashMap3.put(attl.HD_1080, Integer.valueOf((int) R.string.offline_video_quality_1080p));
    }

    public static int a(attl attlVar, int i2) {
        Map map = g;
        return map.containsKey(attlVar) ? ((Integer) map.get(attlVar)).intValue() : i2;
    }

    public static attl b(int i2) {
        attl attlVar = (attl) i.get(Integer.valueOf(i2));
        return attlVar != null ? attlVar : attl.UNKNOWN_FORMAT_TYPE;
    }
}
