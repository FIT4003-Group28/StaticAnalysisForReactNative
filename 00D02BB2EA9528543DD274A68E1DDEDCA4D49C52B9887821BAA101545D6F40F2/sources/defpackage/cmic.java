package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cmic  reason: default package */
/* loaded from: classes5.dex */
final class cmic implements cmga {
    private final cmhy a;
    private final long[] b;
    private final Map<String, cmib> c;
    private final Map<String, cmhz> d;
    private final Map<String, String> e;

    public cmic(cmhy cmhyVar, Map<String, cmib> map, Map<String, cmhz> map2, Map<String, String> map3) {
        this.a = cmhyVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        cmhyVar.e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.cmga
    public final int a(long j) {
        int ac = cmny.ac(this.b, j, false);
        if (ac < this.b.length) {
            return ac;
        }
        return -1;
    }

    @Override // defpackage.cmga
    public final int b() {
        return this.b.length;
    }

    @Override // defpackage.cmga
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.cmga
    public final List<cmfw> d(long j) {
        cmht[] cmhtVarArr;
        cmhy cmhyVar = this.a;
        Map<String, cmib> map = this.c;
        Map<String, cmhz> map2 = this.d;
        Map<String, String> map3 = this.e;
        ArrayList arrayList = new ArrayList();
        cmhyVar.f(j, cmhyVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cmhyVar.g(j, false, cmhyVar.h, treeMap);
        cmhyVar.h(j, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                cmhz cmhzVar = map2.get(pair.first);
                cmmn.f(cmhzVar);
                cmfv cmfvVar = new cmfv();
                cmfvVar.b = decodeByteArray;
                cmfvVar.e = cmhzVar.b;
                cmfvVar.f = 0;
                cmfvVar.b(cmhzVar.c, 0);
                cmfvVar.d = cmhzVar.e;
                cmfvVar.i = cmhzVar.f;
                cmfvVar.j = cmhzVar.g;
                cmfvVar.m = cmhzVar.j;
                arrayList2.add(cmfvVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            cmhz cmhzVar2 = map2.get(entry.getKey());
            cmmn.f(cmhzVar2);
            cmfv cmfvVar2 = (cmfv) entry.getValue();
            CharSequence charSequence = cmfvVar2.a;
            cmmn.f(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (cmht cmhtVar : (cmht[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cmht.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(cmhtVar), spannableStringBuilder.getSpanEnd(cmhtVar), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            cmfvVar2.b(cmhzVar2.c, cmhzVar2.d);
            cmfvVar2.d = cmhzVar2.e;
            cmfvVar2.e = cmhzVar2.b;
            cmfvVar2.i = cmhzVar2.f;
            float f = cmhzVar2.i;
            int i10 = cmhzVar2.h;
            cmfvVar2.h = f;
            cmfvVar2.g = i10;
            cmfvVar2.m = cmhzVar2.j;
            arrayList2.add(cmfvVar2.a());
        }
        return arrayList2;
    }
}
