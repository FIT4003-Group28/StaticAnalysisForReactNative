package defpackage;

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
/* renamed from: cmhy  reason: default package */
/* loaded from: classes5.dex */
final class cmhy {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final cmib f;
    public final String[] g;
    public final String h;
    public final String i;
    public final cmhy j;
    private final HashMap<String, Integer> k;
    private final HashMap<String, Integer> l;
    private List<cmhy> m;

    public cmhy(String str, String str2, long j, long j2, cmib cmibVar, String[] strArr, String str3, String str4, cmhy cmhyVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = cmibVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        cmmn.f(str3);
        this.h = str3;
        this.j = cmhyVar;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    private static SpannableStringBuilder i(String str, Map<String, cmfv> map) {
        if (!map.containsKey(str)) {
            cmfv cmfvVar = new cmfv();
            cmfvVar.a = new SpannableStringBuilder();
            map.put(str, cmfvVar);
        }
        CharSequence charSequence = map.get(str).a;
        cmmn.f(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean a(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    public final void b(cmhy cmhyVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(cmhyVar);
    }

    public final int d() {
        List<cmhy> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void e(TreeSet<Long> treeSet, boolean z) {
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
                cmhy cmhyVar = this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                cmhyVar.e(treeSet, z2);
            }
        }
    }

    public final void g(long j, boolean z, String str, Map<String, cmfv> map) {
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
                if (!a(j)) {
                    return;
                }
                for (Map.Entry<String, cmfv> entry : map.entrySet()) {
                    CharSequence charSequence = entry.getValue().a;
                    cmmn.f(charSequence);
                    this.k.put(entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(this.a);
                for (int i = 0; i < d(); i++) {
                    c(i).g(j, z || equals, str, map);
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
                for (Map.Entry<String, cmfv> entry2 : map.entrySet()) {
                    CharSequence charSequence2 = entry2.getValue().a;
                    cmmn.f(charSequence2);
                    this.l.put(entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
                return;
            }
            i(str, map).append('\n');
            return;
        }
        SpannableStringBuilder i3 = i(str, map);
        String str2 = this.b;
        cmmn.f(str2);
        i3.append((CharSequence) str2);
    }

    public final void h(long j, Map<String, cmib> map, Map<String, cmfv> map2) {
        cmhy cmhyVar;
        if (!a(j)) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.l.entrySet()) {
            String key = entry.getKey();
            int intValue = this.k.containsKey(key) ? this.k.get(key).intValue() : 0;
            int intValue2 = entry.getValue().intValue();
            if (intValue != intValue2) {
                cmfv cmfvVar = map2.get(key);
                cmmn.f(cmfvVar);
                cmib a = cmia.a(this.f, this.g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) cmfvVar.a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    cmfvVar.a = spannableStringBuilder;
                }
                if (a != null) {
                    cmhy cmhyVar2 = this.j;
                    if (a.a() != -1) {
                        spannableStringBuilder.setSpan(new StyleSpan(a.a()), intValue, intValue2, 33);
                    }
                    if (a.f == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                    }
                    if (a.g == 1) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                    }
                    if (a.c) {
                        cmhk.a(spannableStringBuilder, new ForegroundColorSpan(a.b), intValue, intValue2);
                    }
                    if (a.e) {
                        cmhk.a(spannableStringBuilder, new BackgroundColorSpan(a.d), intValue, intValue2);
                    }
                    String str = a.a;
                    if (str != null) {
                        cmhk.a(spannableStringBuilder, new TypefaceSpan(str), intValue, intValue2);
                    }
                    int i = a.m;
                    if (i == 2) {
                        while (true) {
                            if (cmhyVar2 == null) {
                                cmhyVar2 = null;
                                break;
                            }
                            cmib a2 = cmia.a(cmhyVar2.f, cmhyVar2.g, map);
                            if (a2 != null && a2.m == 1) {
                                break;
                            }
                            cmhyVar2 = cmhyVar2.j;
                        }
                        if (cmhyVar2 != null) {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            arrayDeque.push(cmhyVar2);
                            while (true) {
                                if (arrayDeque.isEmpty()) {
                                    cmhyVar = null;
                                    break;
                                }
                                cmhy cmhyVar3 = (cmhy) arrayDeque.pop();
                                cmib a3 = cmia.a(cmhyVar3.f, cmhyVar3.g, map);
                                if (a3 != null && a3.m == 3) {
                                    cmhyVar = cmhyVar3;
                                    break;
                                }
                                for (int d = cmhyVar3.d() - 1; d >= 0; d--) {
                                    arrayDeque.push(cmhyVar3.c(d));
                                }
                            }
                            if (cmhyVar != null && cmhyVar.d() == 1 && cmhyVar.c(0).b != null) {
                                String str2 = cmhyVar.c(0).b;
                                int i2 = cmny.a;
                                spannableStringBuilder.setSpan(new cmhj(), intValue, intValue2, 33);
                            }
                        }
                    } else if (i == 3 || i == 4) {
                        spannableStringBuilder.setSpan(new cmht(), intValue, intValue2, 33);
                    }
                    if (a.p == 1) {
                        cmhk.a(spannableStringBuilder, new cmhi(), intValue, intValue2);
                    }
                    int i3 = a.j;
                    if (i3 == 1) {
                        cmhk.a(spannableStringBuilder, new AbsoluteSizeSpan((int) a.k, true), intValue, intValue2);
                    } else if (i3 == 2) {
                        cmhk.a(spannableStringBuilder, new RelativeSizeSpan(a.k), intValue, intValue2);
                    } else if (i3 == 3) {
                        cmhk.a(spannableStringBuilder, new RelativeSizeSpan(a.k / 100.0f), intValue, intValue2);
                    }
                    cmfvVar.c = a.o;
                }
            }
        }
        for (int i4 = 0; i4 < d(); i4++) {
            c(i4).h(j, map, map2);
        }
    }

    public final cmhy c(int i) {
        List<cmhy> list = this.m;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i);
    }

    public final void f(long j, String str, List<Pair<String, String>> list) {
        String str2;
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (!a(j) || !"div".equals(this.a) || (str2 = this.i) == null) {
            for (int i = 0; i < d(); i++) {
                c(i).f(j, str, list);
            }
            return;
        }
        list.add(new Pair<>(str, str2));
    }
}
