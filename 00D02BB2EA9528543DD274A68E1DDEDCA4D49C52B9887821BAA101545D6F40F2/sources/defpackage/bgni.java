package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.gmm.base.views.util.UiHelper$URLSpanNoUnderline;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgni  reason: default package */
/* loaded from: classes3.dex */
public final class bgni {
    public final dxio<cbzd> a;
    public final cjqy b;
    public final cjtd c;
    public final cjtd d;
    private final cbze e;
    private final int f;
    private final dipk g;

    public bgni(Activity activity, cbze cbzeVar, dxio<cbzd> dxioVar, cjqy cjqyVar, dipk dipkVar, cjtd cjtdVar, cjtd cjtdVar2) {
        this.g = dipkVar;
        this.e = cbzeVar;
        this.a = dxioVar;
        this.b = cjqyVar;
        this.c = cjtdVar;
        this.d = cjtdVar2;
        this.f = activity.getResources().getColor(R.color.mod_daynight_blue600);
    }

    public final CharSequence a(boolean z) {
        int a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        dipf dipfVar = this.g.h;
        if (dipfVar == null) {
            dipfVar = dipf.b;
        }
        boolean z2 = false;
        for (dipe dipeVar : dipfVar.a) {
            if (z2) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String str = dipeVar.b;
            if (!z) {
                str = str.replace('\n', ' ');
            }
            spannableStringBuilder.append((CharSequence) str);
            int a2 = dipd.a(dipeVar.c);
            if (a2 != 0 && a2 == 3 && (dipeVar.a & 4) != 0) {
                final String str2 = dipeVar.d;
                final int i = this.f;
                spannableStringBuilder.setSpan(new UiHelper$URLSpanNoUnderline(str2, i) { // from class: com.google.android.apps.gmm.place.localposts.util.PostSummaryHelper$SummaryURLSpan
                    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        bgni bgniVar = bgni.this;
                        bgniVar.b.i(bgniVar.c);
                        super.onClick(view);
                    }
                }, spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 17);
            }
            if (this.e.a && (a = dipd.a(dipeVar.c)) != 0 && a == 4 && (dipeVar.a & 8) != 0) {
                spannableStringBuilder.setSpan(new bgnh(this, dipeVar.e, this.f), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 17);
            }
            z2 = true;
        }
        return spannableStringBuilder;
    }
}
