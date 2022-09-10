package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: jef  reason: default package */
/* loaded from: classes.dex */
public class jef extends TextView {
    public boolean a;
    public boolean b;
    private int c;

    public jef(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpj.d);
        this.c = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        setOnClickListener(new jed(this));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jef.class, cqmpVarArr);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        setMaxLines(this.b ? Integer.MAX_VALUE : this.c);
    }

    public void setCollapsedLineCount(int i) {
        this.c = i;
        if (true == this.b) {
            i = Integer.MAX_VALUE;
        }
        setMaxLines(i);
        requestLayout();
    }

    public void setExpanded(boolean z, @dzsi jee jeeVar) {
        if (this.a || z == this.b) {
            return;
        }
        this.b = z;
        setMaxLines(z ? Integer.MAX_VALUE : this.c);
        if (jeeVar != null) {
            jeeVar.b = this.a;
            jeeVar.a = this.b;
        }
        cjqy tr = ((cjqz) btsr.a(cjqz.class)).tr();
        cjtd k = cjqg.k(this);
        if (k == null) {
            return;
        }
        tr.i(cjqg.a(z, k));
    }
}
