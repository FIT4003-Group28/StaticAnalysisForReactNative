package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aeha  reason: default package */
/* loaded from: classes.dex */
public final class aeha {
    public static final amvn a = amyg.a;
    public static final amvn b = amyg.a;
    public final aegt c;
    public final afjz d;
    private final afmw e;
    private final yrj f;

    public aeha(aegt aegtVar, afmw afmwVar, yrj yrjVar, afjz afjzVar) {
        afms.a(aegtVar);
        this.c = aegtVar;
        afms.a(afmwVar);
        this.e = afmwVar;
        afms.a(yrjVar);
        this.f = yrjVar;
        afms.a(afjzVar);
        this.d = afjzVar;
    }

    public static int a(aegx aegxVar, int i, int i2, float f, boolean z) {
        int i3 = aegxVar.b;
        if (z) {
            int g = (int) (FormatStreamModel.g(i, i2) / f);
            return FormatStreamModel.O(g) ? Math.min(g, i3) : i3;
        }
        return i3;
    }

    public static int b(aegx aegxVar, int i, int i2, float f, boolean z) {
        int i3 = aegxVar.c;
        if (z) {
            int g = (int) (FormatStreamModel.g(i, i2) / f);
            return FormatStreamModel.O(g) ? Math.max(g, i3) : i3;
        }
        return i3;
    }

    @Deprecated
    public static List d(Collection collection, Set set, String str) {
        if (set == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        if (set.isEmpty()) {
            return arrayList;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            if (set.contains(Integer.valueOf(formatStreamModel.e()))) {
                arrayList.add(formatStreamModel);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                FormatStreamModel formatStreamModel2 = (FormatStreamModel) it2.next();
                if (str.equals(formatStreamModel2.v())) {
                    arrayList.add(formatStreamModel2);
                }
            }
        }
        return arrayList;
    }

    public static boolean e(long j, int i, aegx aegxVar, PlayerConfigModel playerConfigModel, boolean z, int i2) {
        return aegxVar.d() || z || !playerConfigModel.U().contains(Integer.valueOf(i2)) || j + ((long) i) <= playerConfigModel.K();
    }

    public static boolean f(int i, int i2, int i3, int i4, float f) {
        if (i3 <= 0 || i * f <= i3) {
            return i4 <= 0 || ((float) i2) * f <= ((float) i4);
        }
        return false;
    }

    public static boolean g(int i, yrj yrjVar, int i2) {
        return i > i2 && yrjVar.i();
    }

    public static aalv[] h(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            String q = formatStreamModel.q();
            String p = formatStreamModel.p();
            if (!TextUtils.isEmpty(q) && !TextUtils.isEmpty(p) && !hashMap.containsKey(q)) {
                hashMap.put(q, new aalv(q, p, false));
            }
        }
        aalv[] aalvVarArr = (aalv[]) hashMap.values().toArray(new aalv[0]);
        Arrays.sort(aalvVarArr);
        return aalvVarArr;
    }

    public static FormatStreamModel j(List list, aegx aegxVar, yrj yrjVar, PlayerConfigModel playerConfigModel, afjz afjzVar, int i, int i2, int i3, float f, float f2, int i4, awan awanVar) {
        int length;
        int i5;
        if (list.isEmpty()) {
            return null;
        }
        float f3 = awanVar == awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY ? f2 : f;
        FormatStreamModel[] formatStreamModelArr = (FormatStreamModel[]) list.toArray(new FormatStreamModel[0]);
        Arrays.sort(formatStreamModelArr, new aegz(afjzVar.F()));
        int a2 = a(aegxVar, i2, i3, f3, false);
        if (awan.VIDEO_QUALITY_SETTING_DATA_SAVER.equals(awanVar)) {
            a2 = Math.min(a2, afjzVar.b());
        }
        int length2 = formatStreamModelArr.length - 1;
        int i6 = 0;
        while (true) {
            length = formatStreamModelArr.length;
            if (i6 >= length) {
                break;
            } else if (formatStreamModelArr[i6].d() <= a2) {
                length2 = i6;
                break;
            } else {
                i6++;
            }
        }
        int b2 = b(aegxVar, i2, i3, f3, false);
        while (true) {
            length--;
            if (length >= 0) {
                if (formatStreamModelArr[length].d() >= b2) {
                    i5 = length;
                    break;
                }
            } else {
                i5 = 0;
                break;
            }
        }
        if (length2 < i5) {
            for (int i7 = length2; i7 <= i5; i7++) {
                FormatStreamModel formatStreamModel = formatStreamModelArr[i7];
                if (f(formatStreamModel.i(), formatStreamModel.d(), i2, i3, f3) && e(formatStreamModel.f, i, aegxVar, playerConfigModel, false, i4)) {
                    if (!g(formatStreamModel.d(), yrjVar, afjzVar.aq())) {
                        return formatStreamModel;
                    }
                }
            }
            return formatStreamModelArr[i5];
        }
        return formatStreamModelArr[length2];
    }

    private static void k(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            if (formatStreamModel.H()) {
                hashSet.add(Integer.valueOf(formatStreamModel.f()));
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        int intValue = ((Integer) Collections.min(hashSet)).intValue();
        while (it2.hasNext()) {
            FormatStreamModel formatStreamModel2 = (FormatStreamModel) it2.next();
            if (!formatStreamModel2.H() && formatStreamModel2.f() >= intValue) {
                it2.remove();
            }
        }
    }

    private static void l(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int f = ((FormatStreamModel) it.next()).f();
            if (f == -1 || f > i) {
                it.remove();
            }
        }
    }

    private final boolean m(String str) {
        return str != null && str.equals(this.d.at());
    }

    private final VideoQuality[] n(List list, String str, aegx aegxVar) {
        HashMap hashMap = new HashMap();
        if (this.d.ak() && !m(str)) {
            ArrayList arrayList = new ArrayList(list);
            k(arrayList);
            list = arrayList;
        }
        for (FormatStreamModel formatStreamModel : list) {
            int f = formatStreamModel.f();
            String u = formatStreamModel.u();
            if (f != -1 && !TextUtils.isEmpty(u) && (aegxVar == null || aegxVar.a(f) == 0)) {
                if (!hashMap.containsKey(u) || formatStreamModel.J()) {
                    hashMap.put(u, formatStreamModel);
                }
            }
        }
        VideoQuality[] videoQualityArr = new VideoQuality[hashMap.size()];
        int i = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            FormatStreamModel formatStreamModel2 = (FormatStreamModel) entry.getValue();
            videoQualityArr[i] = new VideoQuality(formatStreamModel2.f(), formatStreamModel2.u(), formatStreamModel2.J());
            i++;
        }
        afjz afjzVar = this.d;
        Arrays.sort(videoQualityArr, (afjzVar.n().g || afjzVar.i.f()) ? Collections.reverseOrder() : null);
        return videoQualityArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x049b, code lost:
        if (r14 < Integer.MAX_VALUE) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168 A[Catch: Exception -> 0x0245, TryCatch #0 {Exception -> 0x0245, blocks: (B:66:0x014e, B:68:0x0168, B:73:0x017e, B:74:0x0184, B:76:0x018a, B:78:0x01a0, B:87:0x01ba, B:89:0x01c9, B:91:0x01cd, B:93:0x01d3, B:97:0x0222, B:98:0x022f, B:100:0x0235, B:102:0x0241, B:81:0x01a9, B:84:0x01b2, B:69:0x016b, B:71:0x0179), top: B:265:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016b A[Catch: Exception -> 0x0245, TryCatch #0 {Exception -> 0x0245, blocks: (B:66:0x014e, B:68:0x0168, B:73:0x017e, B:74:0x0184, B:76:0x018a, B:78:0x01a0, B:87:0x01ba, B:89:0x01c9, B:91:0x01cd, B:93:0x01d3, B:97:0x0222, B:98:0x022f, B:100:0x0235, B:102:0x0241, B:81:0x01a9, B:84:0x01b2, B:69:0x016b, B:71:0x0179), top: B:265:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a A[Catch: Exception -> 0x0245, TryCatch #0 {Exception -> 0x0245, blocks: (B:66:0x014e, B:68:0x0168, B:73:0x017e, B:74:0x0184, B:76:0x018a, B:78:0x01a0, B:87:0x01ba, B:89:0x01c9, B:91:0x01cd, B:93:0x01d3, B:97:0x0222, B:98:0x022f, B:100:0x0235, B:102:0x0241, B:81:0x01a9, B:84:0x01b2, B:69:0x016b, B:71:0x0179), top: B:265:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0222 A[Catch: Exception -> 0x0245, TryCatch #0 {Exception -> 0x0245, blocks: (B:66:0x014e, B:68:0x0168, B:73:0x017e, B:74:0x0184, B:76:0x018a, B:78:0x01a0, B:87:0x01ba, B:89:0x01c9, B:91:0x01cd, B:93:0x01d3, B:97:0x0222, B:98:0x022f, B:100:0x0235, B:102:0x0241, B:81:0x01a9, B:84:0x01b2, B:69:0x016b, B:71:0x0179), top: B:265:0x014e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aegu c(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r29, java.util.Collection r30, defpackage.aegs r31, java.util.Set r32, java.util.Set r33, int r34, int r35, java.lang.String r36, defpackage.aeub r37) {
        /*
            Method dump skipped, instructions count: 1455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeha.c(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, java.util.Collection, aegs, java.util.Set, java.util.Set, int, int, java.lang.String, aeub):aegu");
    }

    public final VideoQuality[] i(List list, String str) {
        return n(list, str, null);
    }
}
