package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.List;
/* compiled from: PG */
/* renamed from: jky  reason: default package */
/* loaded from: classes7.dex */
public final class jky extends TextView {
    private static final cqkv c = new jkz(cqlg.a);
    public CharSequence a;
    public dcdc<? extends CharSequence> b;

    public jky(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jky.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, List<? extends CharSequence>> cqlcVar) {
        return cqjv.g(jkx.FIELDS, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> c() {
        return cqjv.i(jkx.DELIMITER, "  •  ", c);
    }

    private final void d(CharSequence charSequence, int i, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        sb.append(TextUtils.ellipsize(charSequence, getPaint(), i, TextUtils.TruncateAt.END));
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (!this.b.isEmpty()) {
            int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : (View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd();
            StringBuilder sb = new StringBuilder();
            int maxLines = getMaxLines();
            StringBuilder sb2 = new StringBuilder();
            dcpe<? extends CharSequence> listIterator = this.b.listIterator();
            while (listIterator.hasNext() && maxLines > 0) {
                CharSequence next = listIterator.next();
                if (!TextUtils.isEmpty(next)) {
                    int length = sb2.length();
                    if (length > 0) {
                        sb2.append(this.a);
                    }
                    int length2 = sb2.length();
                    sb2.append(next);
                    if (maxLines == 1 || length == 0) {
                        length = sb2.length();
                        length2 = length;
                    }
                    if (getPaint().measureText(sb2.toString()) > size) {
                        d(sb2.subSequence(0, length), size, sb);
                        sb2.delete(0, length2);
                        maxLines--;
                    }
                }
            }
            if (maxLines > 0 && sb2.length() > 0) {
                d(sb2, size, sb);
            }
            setText(sb.toString());
        }
        super.onMeasure(i, i2);
    }

    public jky(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jky(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = "  •  ";
        this.b = dcdc.e();
    }
}
