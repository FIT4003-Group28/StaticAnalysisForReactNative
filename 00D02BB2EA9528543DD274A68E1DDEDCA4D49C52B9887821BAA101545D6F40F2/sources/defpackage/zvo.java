package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zvo  reason: default package */
/* loaded from: classes7.dex */
public final class zvo extends ViewGroup {
    private final cjqy a;
    private final cjqq b;
    private cjql c;
    private CharSequence d;
    private int e;
    private boolean f;
    private zvn g;
    private dafk h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cjqy tr = ((cjqz) btsr.a(cjqz.class)).tr();
        cjqq tp = ((cjqr) btsr.a(cjqr.class)).tp();
        this.d = "";
        this.e = 0;
        this.f = false;
        this.g = null;
        this.h = null;
        super.setVisibility(4);
        dbsk.s(tr);
        this.a = tr;
        dbsk.s(tp);
        this.b = tp;
    }

    public static Button c(dafk dafkVar) {
        return (Button) dafkVar.e.findViewById(R.id.snackbar_action);
    }

    public static CharSequence d(CharSequence charSequence) {
        return charSequence != null ? charSequence : "";
    }

    private final void f() {
        dafk dafkVar = this.h;
        if (dafkVar != null) {
            dafkVar.r(this.d);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        dbsk.b(view instanceof zvn, "Only child allowed by snackbar CurvularViewNode is snackbarAction");
        dbsk.b(this.g == null, "Only one action is allowed inside a snackbar");
        this.g = (zvn) view;
        a();
        super.addView(view);
    }

    public final void b(View view) {
        View.OnClickListener onClickListener;
        cjtd k = cjqg.k(view);
        cjql cjqlVar = this.c;
        if (cjqlVar != null && k != null) {
            this.a.j(cjqlVar, k);
        }
        zvn zvnVar = this.g;
        if (zvnVar == null || (onClickListener = zvnVar.c) == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        dbsk.a(view == this.g);
        this.g = null;
        a();
        super.removeView(view);
    }

    public void setText(CharSequence charSequence) {
        CharSequence d = d(charSequence);
        if (!this.d.toString().contentEquals(d)) {
            this.d = d;
            f();
        }
    }

    public void setTextAndVisibility(CharSequence charSequence) {
        setText(charSequence);
        setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.e != i) {
            this.e = i;
            e();
        }
    }

    private final void e() {
        if (!this.f || this.e != 0) {
            dafk dafkVar = this.h;
            if (dafkVar == null) {
                return;
            }
            dafkVar.d();
            this.h = null;
        } else if (this.h != null) {
        } else {
            dafk a = ckos.a(this, this.d, -2);
            this.h = a;
            cjqg.h(a.e, cjqg.k(this));
            this.b.f(this).e(a.e);
            f();
            a();
            a.c();
        }
    }

    public final void a() {
        dafk dafkVar = this.h;
        if (dafkVar != null) {
            zvn zvnVar = this.g;
            if (zvnVar == null || zvnVar.b != 0) {
                dafkVar.p("", new View.OnClickListener(this) { // from class: zvm
                    private final zvo a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.b(view);
                    }
                });
                return;
            }
            dafkVar.p(zvnVar.a, new View.OnClickListener(this) { // from class: zvl
                private final zvo a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(view);
                }
            });
            cjqg.h(c(dafkVar), cjqg.k(zvnVar));
            this.c = this.b.f(this).e(c(dafkVar));
        }
    }
}
