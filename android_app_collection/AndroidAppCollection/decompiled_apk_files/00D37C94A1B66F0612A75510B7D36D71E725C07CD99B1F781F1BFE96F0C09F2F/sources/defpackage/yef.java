package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yef  reason: default package */
/* loaded from: classes4.dex */
public final class yef implements ajrx {
    public View a;
    private final yen b;
    private View.OnClickListener c;
    private boolean d;

    public yef(Context context) {
        TypedValue typedValue = new TypedValue();
        this.b = new yen(context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? akf.a(context, typedValue.resourceId) : null, zhn.j(context, R.attr.cmtDivider).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.separator_height));
    }

    @Override // defpackage.ajrx
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajrx
    public final void b(boolean z) {
        this.d = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.ajrx
    public final void c(View view) {
        view.getClass();
        this.a = view;
        view.setOnClickListener(this.c);
        this.a.setClickable(this.d);
    }

    @Override // defpackage.ajrx
    public final void d(View.OnClickListener onClickListener) {
        this.c = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.ajrx
    public final void e(ajrs ajrsVar) {
        this.a.getClass();
        ajqx a = ajqx.a(ajrsVar);
        boolean z = false;
        boolean j = ajrsVar.j("showLineSeparator", false);
        yen yenVar = this.b;
        if (a.b() && j) {
            z = true;
        }
        if (yenVar.a != z) {
            yenVar.a = z;
            yenVar.invalidateSelf();
        }
        zav.c(this.a, this.b);
    }
}
