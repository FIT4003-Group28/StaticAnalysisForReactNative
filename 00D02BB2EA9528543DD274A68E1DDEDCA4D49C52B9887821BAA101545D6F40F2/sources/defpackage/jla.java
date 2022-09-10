package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jla  reason: default package */
/* loaded from: classes7.dex */
public final class jla extends TextView {
    private final String a;
    private final Rect b;
    private final Paint c;
    private CharSequence d;
    private CharSequence e;
    private boolean f;
    private final SpannableStringBuilder g;
    private final SpannableStringBuilder h;

    public jla(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = new Paint();
        this.a = getContext().getString(R.string.ELLIPSIS);
        this.d = "";
        this.e = "";
        this.f = true;
        this.g = new SpannableStringBuilder();
        this.h = new SpannableStringBuilder();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jla.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(Boolean bool) {
        return cqjv.j(iug.SHOW_LABEL_ALWAYS, bool);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, CharSequence> cqlcVar) {
        return cqjv.f(iug.EXPANDABLE_FULL_TEXT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, CharSequence> cqlcVar) {
        return cqjv.f(iug.LABEL_TEXT, cqlcVar);
    }

    private final String e(String str) {
        String str2;
        int i = i(str);
        String valueOf = String.valueOf(this.a);
        if (this.e.length() > 0) {
            String valueOf2 = String.valueOf(this.e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 1);
            sb.append(" ");
            sb.append(valueOf2);
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        String valueOf3 = String.valueOf(str2);
        String concat = valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
        String trim = str.substring(0, str.length() - concat.length()).trim();
        while (true) {
            String valueOf4 = String.valueOf(trim);
            String valueOf5 = String.valueOf(concat);
            if (i(valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4)) > i) {
                trim = trim.substring(0, trim.length() - 1).trim();
            } else {
                return trim;
            }
        }
    }

    private static boolean f(Layout layout) {
        return layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() + (-1)) > 0;
    }

    private final void g(SpannableStringBuilder spannableStringBuilder) {
        if (this.e.length() > 0) {
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(this.e);
        }
    }

    private final String h(CharSequence charSequence) {
        Layout layout = getLayout();
        int lineStart = layout.getLineStart(0);
        int lineCount = getLineCount() - 1;
        return charSequence.toString().substring(lineStart, layout.getLineStart(lineCount) + layout.getEllipsisStart(lineCount)).trim();
    }

    private final int i(String str) {
        this.c.setTextSize(getTextSize());
        this.c.getTextBounds(str, 0, str.length(), this.b);
        return (int) Math.ceil(this.b.width());
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        Layout layout;
        this.g.clear();
        this.g.clearSpans();
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            this.g.append(charSequence);
            setText(this.g);
        }
        super.onMeasure(i, i2);
        if (length() == 0 || (layout = getLayout()) == null) {
            return;
        }
        this.h.clear();
        this.h.clearSpans();
        if (f(layout)) {
            this.h.append((CharSequence) e(h(this.d))).append((CharSequence) this.a);
            g(this.h);
            super.setText(this.h);
        } else if (!this.f) {
            this.h.append(this.d);
            super.setText(this.h);
        } else {
            if (this.e != null) {
                this.g.append((CharSequence) " ").append(this.e);
                setText(this.g);
            }
            super.onMeasure(i, i2);
            if (f(getLayout())) {
                this.h.append((CharSequence) e(h(this.g.toString()))).append((CharSequence) this.a);
            } else {
                this.h.append(this.d);
            }
            g(this.h);
            super.setText(this.h);
        }
    }

    public void setFullText(@dzsi CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.d = charSequence;
        requestLayout();
    }

    public void setLabelText(@dzsi CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.e = charSequence;
        requestLayout();
    }

    public void setShowLabelAlways(boolean z) {
        this.f = z;
        requestLayout();
    }
}
