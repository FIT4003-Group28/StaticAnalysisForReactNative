package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fpm  reason: default package */
/* loaded from: classes3.dex */
public final class fpm extends ahyf implements aizf {
    public boolean a;
    public CharSequence b;
    private final Rect c;
    private TextView d;

    public fpm(Context context) {
        super(context);
        this.c = new Rect();
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.trailer_overlay, (ViewGroup) null);
        this.d = (TextView) inflate.findViewById(R.id.message);
        return inflate;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
        if (aa(1)) {
            this.d.setText(this.b, TextView.BufferType.SPANNABLE);
        }
        if (aa(2)) {
            view.setPadding(this.c.left, this.c.top, this.c.right, this.c.bottom);
        }
    }

    public final void e() {
        this.b = "";
        g();
    }

    public final void f(boolean z) {
        this.a = z;
        g();
    }

    public final void g() {
        if (mZ()) {
            Z();
        } else {
            W();
        }
    }

    public final void i(int i, int i2) {
        this.c.set(i, 0, 0, i2);
        Y(2);
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.a && !TextUtils.isEmpty(this.b);
    }
}
