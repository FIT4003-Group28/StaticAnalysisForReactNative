package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: zvn  reason: default package */
/* loaded from: classes7.dex */
public final class zvn extends View {
    public CharSequence a;
    public int b;
    public View.OnClickListener c;

    public zvn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "";
        this.b = 0;
        this.c = null;
        super.setVisibility(4);
    }

    public static <T extends cqkp> cqnf<T> a(Integer num) {
        return cqjv.i(cqfe.TEXT, num, zth.a);
    }

    private final void b() {
        ViewParent parent = getParent();
        if (parent instanceof zvo) {
            ((zvo) parent).a();
        }
    }

    public void setOnClick(View.OnClickListener onClickListener) {
        if (this.c != onClickListener) {
            this.c = onClickListener;
            b();
        }
    }

    public void setText(CharSequence charSequence) {
        CharSequence d = zvo.d(charSequence);
        if (!this.a.toString().contentEquals(d)) {
            this.a = d;
            b();
        }
    }

    public void setTextAndVisibility(CharSequence charSequence) {
        CharSequence d = zvo.d(charSequence);
        if (!this.a.toString().contentEquals(d)) {
            this.a = d;
            this.b = true != TextUtils.isEmpty(d) ? 0 : 8;
            b();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.b != i) {
            this.b = i;
            b();
        }
    }
}
