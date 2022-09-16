package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajsn  reason: default package */
/* loaded from: classes.dex */
public final class ajsn implements ajrx {
    public View a;
    private View.OnClickListener b;
    private boolean c;

    public ajsn() {
    }

    public ajsn(View view) {
        view.getClass();
        this.a = view;
    }

    @Override // defpackage.ajrx
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajrx
    public final void b(boolean z) {
        this.c = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.ajrx
    public final void c(View view) {
        view.getClass();
        this.a = view;
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        this.a.setClickable(this.c);
    }

    @Override // defpackage.ajrx
    public final void d(View.OnClickListener onClickListener) {
        this.b = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.ajrx
    public final void e(ajrs ajrsVar) {
        this.a.getClass();
    }
}
