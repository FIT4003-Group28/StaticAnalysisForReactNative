package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bvsw  reason: default package */
/* loaded from: classes4.dex */
public class bvsw {
    final ArrayList<CharacterStyle> a = new ArrayList<>();

    public final void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        int i4 = (i << 16) | 33;
        ArrayList<CharacterStyle> arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(arrayList.get(i5)), i2, i3, i4);
        }
    }

    public final void b(bvsw bvswVar) {
        this.a.addAll(bvswVar.a);
    }

    public final void c() {
        this.a.add(new StyleSpan(1));
    }

    public final void d(CharacterStyle characterStyle) {
        this.a.add(characterStyle);
    }

    public final void e(int i) {
        this.a.add(new ForegroundColorSpan(i));
    }

    public final void f(float f) {
        this.a.add(new RelativeSizeSpan(f));
    }
}
