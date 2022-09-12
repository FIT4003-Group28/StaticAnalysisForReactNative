package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: bvsu  reason: default package */
/* loaded from: classes4.dex */
public final class bvsu extends bvsv {
    private bvsw f;

    public bvsu(bvsx bvsxVar, CharSequence charSequence) {
        super(bvsxVar, charSequence);
        this.f = new bvsw();
    }

    private final CharSequence q(String str, Object obj) {
        if (!(obj instanceof bvsv)) {
            return (!str.equals("%s") || !(obj instanceof CharSequence)) ? String.format(str, obj) : (CharSequence) obj;
        }
        bvsv bvsvVar = (bvsv) obj;
        this.d = Math.max(bvsvVar.d + 1, this.d);
        return super.d(str);
    }

    public final void a(Object... objArr) {
        int i;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.toString());
        if (!spannableStringBuilder.toString().contains("{0}")) {
            Matcher matcher = bvsx.b.matcher(spannableStringBuilder.toString());
            int i2 = 0;
            int i3 = 0;
            while (matcher.find()) {
                String group = matcher.group();
                if (group.equals("%%")) {
                    spannableStringBuilder.replace(matcher.start() + i2, matcher.end() + i2, (CharSequence) "%");
                    i2--;
                } else {
                    String group2 = matcher.group(1);
                    if (group2 != null) {
                        i = Integer.parseInt(group2.substring(0, group2.length() - 1)) - 1;
                        String valueOf = String.valueOf(group.substring(group2.length() + 1));
                        str = valueOf.length() != 0 ? "%".concat(valueOf) : new String("%");
                    } else {
                        i = i3;
                        str = group;
                    }
                    if (i < objArr.length) {
                        CharSequence q = q(str, objArr[i]);
                        spannableStringBuilder.replace(matcher.start() + i2, matcher.end() + i2, q);
                        spannableStringBuilder.setSpan(new bvss(), matcher.start() + i2, matcher.start() + i2 + q.length(), 0);
                        i2 += q.length() - group.length();
                        i3++;
                    } else {
                        throw new MissingFormatArgumentException(group);
                    }
                }
            }
        } else {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                StringBuilder sb = new StringBuilder(13);
                sb.append("{");
                sb.append(i4);
                sb.append("}");
                String sb2 = sb.toString();
                int indexOf = spannableStringBuilder.toString().indexOf(sb2);
                if (indexOf >= 0) {
                    CharSequence q2 = q("%s", objArr[i4]);
                    spannableStringBuilder.replace(indexOf, sb2.length() + indexOf, q2);
                    spannableStringBuilder.setSpan(new bvss(), indexOf, q2.length() + indexOf, 0);
                } else {
                    throw new MissingFormatArgumentException(sb2);
                }
            }
        }
        if (this.f.a.size() != 0) {
            bvss[] bvssVarArr = (bvss[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bvss.class);
            int length = bvssVarArr.length;
            int[] iArr = new int[length];
            int[] iArr2 = new int[length];
            for (int i5 = 0; i5 < bvssVarArr.length; i5++) {
                iArr[i5] = spannableStringBuilder.getSpanStart(bvssVarArr[i5]);
                iArr2[i5] = spannableStringBuilder.getSpanEnd(bvssVarArr[i5]);
            }
            Arrays.sort(iArr);
            Arrays.sort(iArr2);
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i6) {
                    this.f.a(spannableStringBuilder, this.d, i6, i8);
                }
                i6 = iArr2[i7];
            }
            if (i6 < spannableStringBuilder.length()) {
                this.f.a(spannableStringBuilder, this.d, i6, spannableStringBuilder.length());
            }
        }
        for (bvss bvssVar : (bvss[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bvss.class)) {
            spannableStringBuilder.removeSpan(bvssVar);
        }
        this.a = spannableStringBuilder;
    }

    public final void b(bvsw bvswVar) {
        bvsw bvswVar2 = this.f;
        bvswVar2.b(bvswVar);
        this.f = bvswVar2;
    }
}
