package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gmm.ugc.hashtags.util.HashtagTextTransformer$HashtagSpan;
/* compiled from: PG */
@Deprecated
/* renamed from: ccam  reason: default package */
/* loaded from: classes4.dex */
public class ccam extends TextView {
    private static final dbsg<ccan> a = dbsg.i(new ccaj());
    public static final /* synthetic */ int k = 0;
    private dbsg<ccaf> b;
    private dbsg<CharSequence> c;
    private dbsg<CharSequence> d;
    public dbsg<ccan> e;
    public Boolean f;
    public cbzu g;
    public cbzo h;
    public ccae i;
    public boolean j;
    private dbsg<CharSequence> l;
    private dbsg<ccar> m;
    private dbsg<CharSequence> n;
    private ccag o;
    private ccaq p;
    private dbsg<Integer> q;
    private final View.OnClickListener r;

    public ccam(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.e = dbsg.i(new ccak(this));
        this.f = false;
        this.d = dbpy.a;
        this.l = dbpy.a;
        this.m = dbpy.a;
        this.n = dbpy.a;
        this.o = ccag.a;
        this.p = ccaq.a;
        this.i = ccae.a;
        this.q = dbpy.a;
        this.r = new ccal(this);
        ((ccao) bttc.a(ccao.class, this)).xG(this);
    }

    private final void a() {
        cbzu cbzuVar = this.g;
        ccag ccagVar = this.o;
        dbsg<ccan> d = this.e.d(a);
        dbsg<ccaf> dbsgVar = this.b;
        dbsg<ccar> dbsgVar2 = this.m;
        Context a2 = cbzuVar.a.a();
        cbzu.a(a2, 1);
        cbzj a3 = cbzuVar.b.a();
        cbzu.a(a3, 2);
        cbzu.a(ccagVar, 3);
        cbzu.a(d, 4);
        cbzu.a(dbsgVar, 5);
        cbzu.a(dbsgVar2, 6);
        final cbzt cbztVar = new cbzt(a2, a3, ccagVar, d, dbsgVar, dbsgVar2);
        CharSequence charSequence = (CharSequence) cbztVar.f.h(new dbrn() { // from class: cbzp
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ((ccar) obj).a();
            }
        }).c(this.c.c(""));
        if (cbztVar.c.c) {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            cbztVar.b.a(charSequence.toString(), new cbzi(cbztVar, spannableStringBuilder) { // from class: cbzq
                private final cbzt a;
                private final SpannableStringBuilder b;

                {
                    this.a = cbztVar;
                    this.b = spannableStringBuilder;
                }

                @Override // defpackage.cbzi
                public final void a(int i, int i2, String str) {
                    Object hashtagTextTransformer$HashtagSpan;
                    cbzt cbztVar2 = this.a;
                    SpannableStringBuilder spannableStringBuilder2 = this.b;
                    if (cbztVar2.c.d) {
                        hashtagTextTransformer$HashtagSpan = new cbzr(cbztVar2.a, str, cbztVar2.e, cbztVar2.d);
                    } else {
                        hashtagTextTransformer$HashtagSpan = new HashtagTextTransformer$HashtagSpan(cbztVar2.a);
                    }
                    spannableStringBuilder2.setSpan(hashtagTextTransformer$HashtagSpan, i, i2, 33);
                }
            });
            charSequence = spannableStringBuilder;
        }
        this.n = dbsg.i(charSequence);
    }

    private final void b() {
        if (!this.f.booleanValue() || hasOnClickListeners()) {
            return;
        }
        setOnClickListener(this.r);
    }

    private final CharSequence c(boolean z, int i) {
        if (!z) {
            return "";
        }
        return (CharSequence) (i == 2 ? this.l : this.d).h(ccah.a).c("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        CharSequence concat;
        final cbzh cbzhVar;
        int a2;
        if (!this.n.a()) {
            super.onMeasure(i, i2);
            return;
        }
        final CharSequence c = c(this.p.b(), 2);
        setText((CharSequence) this.n.h(new dbrn(c) { // from class: ccai
            private final CharSequence a;

            {
                this.a = c;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                CharSequence charSequence = this.a;
                int i3 = ccam.k;
                return TextUtils.concat((CharSequence) obj, charSequence);
            }
        }).c(""));
        int intValue = this.q.c(Integer.valueOf(getMaxLines())).intValue();
        this.q = dbsg.i(Integer.valueOf(intValue));
        if (true == this.j) {
            intValue = Integer.MAX_VALUE;
        }
        setMaxLines(intValue);
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || length() <= 0) {
            return;
        }
        if (layout.getLineCount() > intValue) {
            CharSequence c2 = c(this.p.a(), 1);
            cbzo cbzoVar = this.h;
            ccag ccagVar = this.o;
            cbzj a3 = cbzoVar.a.a();
            cbzo.a(a3, 1);
            cbzo.a(ccagVar, 2);
            cbzo.a(layout, 3);
            float width = layout.getWidth();
            TextPaint paint = layout.getPaint();
            CharSequence b = this.n.b();
            if (layout.getLineCount() < intValue || b.length() == 0) {
                concat = TextUtils.concat(b, c2);
            } else {
                float measureText = width - paint.measureText(c2.toString());
                if (measureText > 0.0f || intValue <= 1) {
                    width = measureText;
                } else {
                    intValue--;
                }
                TextPaint paint2 = layout.getPaint();
                int i3 = intValue - 1;
                int lineStart = layout.getLineStart(i3);
                if (lineStart >= b.length()) {
                    cbzhVar = new cbzh(b, dbpy.a, paint2);
                } else {
                    int lineEnd = layout.getLineEnd(i3);
                    cbzhVar = new cbzh(b.subSequence(0, lineStart), dbsg.i(TextUtils.concat(b.subSequence(lineStart, lineEnd < b.length() ? lineEnd - 1 : b.length()), "…")), paint2);
                }
                final Float valueOf = Float.valueOf(width);
                CharSequence charSequence = (CharSequence) cbzhVar.b.h(new dbrn(cbzhVar, valueOf) { // from class: cbzk
                    private final cbzm a;
                    private final Float b;

                    {
                        this.a = cbzhVar;
                        this.b = valueOf;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        cbzh cbzhVar2 = (cbzh) this.a;
                        return TextUtils.concat(cbzhVar2.a, TextUtils.ellipsize((CharSequence) obj, cbzhVar2.c, this.b.floatValue(), TextUtils.TruncateAt.END));
                    }
                }).e(new dbty(cbzhVar) { // from class: cbzl
                    private final cbzm a;

                    {
                        this.a = cbzhVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return ((cbzh) this.a).a;
                    }
                });
                CharSequence[] charSequenceArr = new CharSequence[2];
                if (!(b instanceof Spanned) || !(charSequence instanceof Spanned)) {
                    a2 = cbzn.a(a3, b, charSequence);
                } else {
                    Spanned spanned = (Spanned) b;
                    Spanned spanned2 = (Spanned) charSequence;
                    if (!ccagVar.c) {
                        a2 = cbzn.a(a3, spanned, spanned2);
                    } else {
                        Object[] spans = spanned2.getSpans(spanned2.length() - 2, spanned2.length() - 2, cbzs.class);
                        if (spans.length == 1) {
                            Object obj = spans[0];
                            int spanStart = spanned2.getSpanStart(obj);
                            if (spanned.getSpanEnd(obj) != spanned2.getSpanEnd(obj)) {
                                a2 = spanStart;
                            }
                        }
                        a2 = -1;
                    }
                }
                if (a2 >= 0) {
                    charSequence = TextUtils.concat(charSequence.subSequence(0, a2), "…");
                }
                charSequenceArr[0] = charSequence;
                charSequenceArr[1] = c2;
                concat = TextUtils.concat(charSequenceArr);
            }
            setText(concat);
        } else if (layout.getLineCount() > this.q.c(Integer.valueOf(getMaxLines())).intValue() || !this.p.equals(ccaq.d)) {
        } else {
            setText(this.n.c(""));
        }
    }

    public void setCollapsedLabel(@dzsi CharSequence charSequence) {
        dbsg<CharSequence> dbsgVar;
        if (charSequence == null || charSequence.length() == 0) {
            dbsgVar = dbpy.a;
        } else {
            dbsgVar = dbsg.i(charSequence);
        }
        this.d = dbsgVar;
        requestLayout();
    }

    public void setExpandedLabel(@dzsi CharSequence charSequence) {
        dbsg<CharSequence> dbsgVar;
        if (charSequence == null || charSequence.length() == 0) {
            dbsgVar = dbpy.a;
        } else {
            dbsgVar = dbsg.i(charSequence);
        }
        this.l = dbsgVar;
        requestLayout();
    }

    public void setExpandingOption(ccae ccaeVar) {
        this.i = ccaeVar;
        this.j = !ccaeVar.d;
        requestLayout();
    }

    public void setFullText(@dzsi CharSequence charSequence) {
        this.c = dbsg.j(charSequence);
        a();
        requestLayout();
    }

    public void setHashtagClickHandler(@dzsi ccaf ccafVar) {
        this.b = dbsg.j(ccafVar);
        a();
        requestLayout();
    }

    public void setHashtagSupport(ccag ccagVar) {
        this.o = ccagVar;
        a();
        requestLayout();
    }

    public void setHashtagTextViewClickHandler(@dzsi ccan ccanVar) {
        this.e = dbsg.j(ccanVar);
        b();
        a();
        requestLayout();
    }

    public void setHashtagTextViewClickHandlerEnabled(Boolean bool) {
        this.f = bool;
        b();
    }

    public void setLabel(@dzsi CharSequence charSequence) {
        setCollapsedLabel(charSequence);
        setExpandedLabel(charSequence);
        requestLayout();
    }

    public void setLabelPresentation(ccaq ccaqVar) {
        this.p = ccaqVar;
        requestLayout();
    }

    public void setTextFormatter(@dzsi ccar ccarVar) {
        this.m = dbsg.j(ccarVar);
        a();
        requestLayout();
    }
}
