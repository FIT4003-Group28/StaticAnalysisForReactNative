package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: aixy  reason: default package */
/* loaded from: classes.dex */
public final class aixy {
    public final transient List a;
    private final List b;

    public aixy(List list) {
        this.b = Collections.unmodifiableList(list);
        TreeSet treeSet = new TreeSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aiyk aiykVar = (aiyk) it.next();
            treeSet.addAll(aiykVar.b.b);
            treeSet.addAll(aiykVar.b.c);
            treeSet.addAll(aiykVar.c.a);
        }
        this.a = Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static amuk a(zdt zdtVar, long j) {
        return amuk.r(new aixw(j, j, new ArrayList(), zdtVar));
    }

    public final List b(long j) {
        Pair pair;
        ArrayList arrayList = new ArrayList();
        for (aiyk aiykVar : this.b) {
            SubtitleWindowSettings a = aiykVar.c.a(j);
            if (a == null || !a.f) {
                aiyo aiyoVar = aiykVar.b;
                int a2 = aiyoVar.a(j, false);
                if (a2 == -1) {
                    pair = aiyo.a;
                } else {
                    CharSequence charSequence = (CharSequence) aiyoVar.d.get(a2);
                    long longValue = ((Long) aiyoVar.c.get(a2)).longValue();
                    while (true) {
                        int i = a2 + 1;
                        if (i >= aiyoVar.b.size() || ((Long) aiyoVar.c.get(i)).longValue() != longValue) {
                            break;
                        }
                        a2 = i;
                    }
                    pair = new Pair(charSequence, (CharSequence) aiyoVar.d.get(a2));
                }
            } else {
                aiyo aiyoVar2 = aiykVar.b;
                int a3 = aiyoVar2.a(j, true);
                if (a3 == -1) {
                    pair = aiyo.a;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    while (true) {
                        int i2 = a3 + 1;
                        if (i2 >= aiyoVar2.b.size() || ((Long) aiyoVar2.b.get(i2)).longValue() > j || ((Long) aiyoVar2.c.get(i2)).longValue() <= j) {
                            break;
                        }
                        CharSequence charSequence2 = (CharSequence) aiyoVar2.d.get(a3);
                        if (charSequence2.length() > 0 && charSequence2.charAt(charSequence2.length() - 1) == '\n') {
                            spannableStringBuilder.append(charSequence2);
                            spannableStringBuilder2.append(charSequence2);
                        }
                        a3 = i2;
                    }
                    spannableStringBuilder.append((CharSequence) aiyoVar2.d.get(a3));
                    long longValue2 = ((Long) aiyoVar2.c.get(a3)).longValue();
                    while (a3 < aiyoVar2.b.size() && ((Long) aiyoVar2.c.get(a3)).longValue() == longValue2) {
                        CharSequence charSequence3 = (CharSequence) aiyoVar2.d.get(a3);
                        if ((charSequence3.length() > 0 && charSequence3.charAt(charSequence3.length() - 1) == '\n') || (a3 = a3 + 1) >= aiyoVar2.b.size() || ((Long) aiyoVar2.c.get(a3)).longValue() > longValue2) {
                            spannableStringBuilder2.append(charSequence3);
                            break;
                        }
                    }
                    pair = new Pair(spannableStringBuilder, spannableStringBuilder2);
                }
            }
            arrayList.add(new SubtitleWindowSnapshot(aiykVar.a, j, (CharSequence) pair.first, (CharSequence) pair.second, a));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (aiyk aiykVar : this.b) {
            sb.append("[");
            sb.append(aiykVar);
            sb.append("]");
        }
        return sb.toString();
    }
}
