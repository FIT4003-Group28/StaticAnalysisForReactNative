package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: puc  reason: default package */
/* loaded from: classes4.dex */
final class puc {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final pue f;
    public final String[] g;
    public final String h;
    public final String i;
    public final puc j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    public puc(String str, String str2, long j, long j2, pue pueVar, String[] strArr, String str3, String str4, puc pucVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = pueVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        ptx.a(str3);
        this.h = str3;
        this.j = pucVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            psf psfVar = new psf();
            psfVar.a = new SpannableStringBuilder();
            map.put(str, psfVar);
        }
        CharSequence charSequence = ((psf) map.get(str)).a;
        ptx.a(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void c(puc pucVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(pucVar);
    }

    public final void d(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                puc pucVar = (puc) this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                pucVar.d(treeSet, z2);
            }
        }
    }

    public final void e(long j, String str, List list) {
        String str2;
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (!h(j) || !"div".equals(this.a) || (str2 = this.i) == null) {
            for (int i = 0; i < a(); i++) {
                b(i).e(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    public final void f(long j, Map map, Map map2, String str, Map map3) {
        puc pucVar;
        if (!h(j)) {
            return;
        }
        String str2 = !"".equals(this.h) ? this.h : str;
        for (Map.Entry entry : this.l.entrySet()) {
            String str3 = (String) entry.getKey();
            int intValue = this.k.containsKey(str3) ? ((Integer) this.k.get(str3)).intValue() : 0;
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if (intValue != intValue2) {
                psf psfVar = (psf) map3.get(str3);
                ptx.a(psfVar);
                ptx.a((pud) map2.get(str2));
                pue d = pnr.d(this.f, this.g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) psfVar.a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    psfVar.a = spannableStringBuilder;
                }
                if (d != null) {
                    puc pucVar2 = this.j;
                    if (d.a() != -1) {
                        spannableStringBuilder.setSpan(new StyleSpan(d.a()), intValue, intValue2, 33);
                    }
                    if (d.f == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                    }
                    if (d.g == 1) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                    }
                    if (d.c) {
                        pnq.d(spannableStringBuilder, new ForegroundColorSpan(d.b), intValue, intValue2);
                    }
                    if (d.e) {
                        pnq.d(spannableStringBuilder, new BackgroundColorSpan(d.d), intValue, intValue2);
                    }
                    String str4 = d.a;
                    if (str4 != null) {
                        pnq.d(spannableStringBuilder, new TypefaceSpan(str4), intValue, intValue2);
                    }
                    if (d.r != null) {
                        pnq.d(spannableStringBuilder, new pnr(), intValue, intValue2);
                    }
                    int i = d.m;
                    if (i == 2) {
                        while (true) {
                            if (pucVar2 == null) {
                                pucVar2 = null;
                                break;
                            }
                            pue d2 = pnr.d(pucVar2.f, pucVar2.g, map);
                            if (d2 != null && d2.m == 1) {
                                break;
                            }
                            pucVar2 = pucVar2.j;
                        }
                        if (pucVar2 != null) {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            arrayDeque.push(pucVar2);
                            while (true) {
                                if (arrayDeque.isEmpty()) {
                                    pucVar = null;
                                    break;
                                }
                                puc pucVar3 = (puc) arrayDeque.pop();
                                pue d3 = pnr.d(pucVar3.f, pucVar3.g, map);
                                if (d3 != null && d3.m == 3) {
                                    pucVar = pucVar3;
                                    break;
                                }
                                for (int a = pucVar3.a() - 1; a >= 0; a--) {
                                    arrayDeque.push(pucVar3.b(a));
                                }
                            }
                            if (pucVar != null && pucVar.a() == 1 && pucVar.b(0).b != null) {
                                String str5 = pucVar.b(0).b;
                                int i2 = pxi.a;
                                pue d4 = pnr.d(pucVar.f, pucVar.g, map);
                                if (d4 == null || d4.n == -1) {
                                    pnr.d(pucVar2.f, pucVar2.g, map);
                                }
                                spannableStringBuilder.setSpan(new pnq(), intValue, intValue2, 33);
                            }
                        }
                    } else if (i == 3 || i == 4) {
                        spannableStringBuilder.setSpan(new ptx(), intValue, intValue2, 33);
                    }
                    if (d.q == 1) {
                        pnq.d(spannableStringBuilder, new poa(), intValue, intValue2);
                    }
                    int i3 = d.j;
                    if (i3 == 1) {
                        pnq.d(spannableStringBuilder, new AbsoluteSizeSpan((int) d.k, true), intValue, intValue2);
                    } else if (i3 == 2) {
                        pnq.d(spannableStringBuilder, new RelativeSizeSpan(d.k), intValue, intValue2);
                    } else if (i3 == 3) {
                        pnq.d(spannableStringBuilder, new RelativeSizeSpan(d.k / 100.0f), intValue, intValue2);
                    }
                    if ("p".equals(this.a)) {
                        float f = d.s;
                        if (f != Float.MAX_VALUE) {
                            psfVar.m = (f * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = d.o;
                        if (alignment != null) {
                            psfVar.c = alignment;
                        }
                        Layout.Alignment alignment2 = d.p;
                        if (alignment2 != null) {
                            psfVar.d = alignment2;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < a(); i4++) {
            b(i4).f(j, map, map2, str2, map3);
        }
    }

    public final void g(long j, boolean z, String str, Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (!this.c || !z) {
            if (!"br".equals(this.a) || !z) {
                if (!h(j)) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence charSequence = ((psf) entry.getValue()).a;
                    ptx.a(charSequence);
                    this.k.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(this.a);
                for (int i = 0; i < a(); i++) {
                    b(i).g(j, z || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder i2 = i(str, map);
                    int length = i2.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (i2.charAt(length) == ' ');
                    if (length >= 0 && i2.charAt(length) != '\n') {
                        i2.append('\n');
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence charSequence2 = ((psf) entry2.getValue()).a;
                    ptx.a(charSequence2);
                    this.l.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
                return;
            }
            i(str, map).append('\n');
            return;
        }
        SpannableStringBuilder i3 = i(str, map);
        String str2 = this.b;
        ptx.a(str2);
        i3.append((CharSequence) str2);
    }

    public final boolean h(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    public final puc b(int i) {
        List list = this.m;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return (puc) list.get(i);
    }
}
