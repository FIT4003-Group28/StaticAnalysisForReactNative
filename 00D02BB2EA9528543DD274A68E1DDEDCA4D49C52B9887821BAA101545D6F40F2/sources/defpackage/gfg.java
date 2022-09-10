package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gfg  reason: default package */
/* loaded from: classes6.dex */
public final class gfg extends ClickableSpan {
    final /* synthetic */ cjtd a;
    final /* synthetic */ cjqy b;
    final /* synthetic */ String c;
    final /* synthetic */ gga d;

    public gfg(cjtd cjtdVar, cjqy cjqyVar, String str, gga ggaVar) {
        this.a = cjtdVar;
        this.b = cjqyVar;
        this.c = str;
        this.d = ggaVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        cjtd cjtdVar = this.a;
        if (cjtdVar != null) {
            this.b.i(cjtdVar);
        }
        gfk g = gfk.g(this.c, true);
        g.o.putBoolean("fullScreen", true);
        this.d.C(g, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.d.getResources().getColor(R.color.gmm_blue));
    }
}
