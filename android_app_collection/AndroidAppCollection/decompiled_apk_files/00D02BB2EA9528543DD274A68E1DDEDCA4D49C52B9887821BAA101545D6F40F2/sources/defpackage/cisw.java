package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
/* compiled from: PG */
/* renamed from: cisw  reason: default package */
/* loaded from: classes4.dex */
final class cisw implements cqsn {
    final /* synthetic */ int a;

    public cisw(int i) {
        this.a = i;
    }

    @Override // defpackage.cqsn
    public final CharSequence a(Context context) {
        SpannableStringBuilder append = SpannableStringBuilder.valueOf(context.getString(this.a)).append((CharSequence) " ");
        Drawable a = iut.a(cqrt.h(2131232709, ibm.m())).a(context);
        int a2 = jmj.a(context, 14);
        a.setBounds(0, 0, a2, a2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new ImageSpan(a), 0, 1, 33);
        return append.append((CharSequence) spannableStringBuilder);
    }
}
