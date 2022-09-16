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
/* renamed from: puf  reason: default package */
/* loaded from: classes4.dex */
final class puf implements psk {
    private final puc a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public puf(puc pucVar, Map map, Map map2, Map map3) {
        this.a = pucVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        pucVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.psk
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.psk
    public final int b(long j) {
        int ae = pxi.ae(this.b, j, false);
        if (ae < this.b.length) {
            return ae;
        }
        return -1;
    }

    @Override // defpackage.psk
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.psk
    public final List d(long j) {
        ptx[] ptxVarArr;
        puc pucVar = this.a;
        Map map = this.c;
        Map map2 = this.d;
        Map map3 = this.e;
        ArrayList arrayList = new ArrayList();
        pucVar.e(j, pucVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        pucVar.g(j, false, pucVar.h, treeMap);
        pucVar.f(j, map, map2, pucVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                pud pudVar = (pud) map2.get(pair.first);
                ptx.a(pudVar);
                psf psfVar = new psf();
                psfVar.b = decodeByteArray;
                psfVar.f = pudVar.b;
                psfVar.g = 0;
                psfVar.b(pudVar.c, 0);
                psfVar.e = pudVar.e;
                psfVar.h = pudVar.f;
                psfVar.i = pudVar.g;
                psfVar.l = pudVar.j;
                arrayList2.add(psfVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            pud pudVar2 = (pud) map2.get(entry.getKey());
            ptx.a(pudVar2);
            psf psfVar2 = (psf) entry.getValue();
            CharSequence charSequence = psfVar2.a;
            ptx.a(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ptx ptxVar : (ptx[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ptx.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ptxVar), spannableStringBuilder.getSpanEnd(ptxVar), (CharSequence) "");
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
            psfVar2.b(pudVar2.c, pudVar2.d);
            psfVar2.e = pudVar2.e;
            psfVar2.f = pudVar2.b;
            psfVar2.h = pudVar2.f;
            psfVar2.c(pudVar2.i, pudVar2.h);
            psfVar2.l = pudVar2.j;
            arrayList2.add(psfVar2.a());
        }
        return arrayList2;
    }
}
