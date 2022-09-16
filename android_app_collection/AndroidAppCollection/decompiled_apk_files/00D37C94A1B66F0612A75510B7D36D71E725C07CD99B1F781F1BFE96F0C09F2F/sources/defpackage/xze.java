package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xze  reason: default package */
/* loaded from: classes4.dex */
public final class xze implements ajru {
    public final xzd a;
    public final View b;
    public final EditText c;
    public boolean d;
    private final TextInputLayout e;
    private final int f;

    public xze(Context context, xzd xzdVar, ViewGroup viewGroup) {
        this.a = xzdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.coupon_layout, viewGroup, false);
        this.b = inflate;
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.coupon_edit_wrapper);
        this.e = textInputLayout;
        this.c = (EditText) inflate.findViewById(R.id.coupon_edit);
        this.f = zew.i(textInputLayout.getResources().getDisplayMetrics(), 8);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    public final void d() {
        this.e.w(false);
        this.e.v(null);
    }

    public final void e() {
        if (this.c.hasFocus() || this.c.getText().length() > 0) {
            this.e.setPadding(0, this.f, 0, 0);
        } else {
            this.e.setPadding(0, 0, 0, 0);
        }
    }

    public final void f(avlo avloVar) {
        arag aragVar;
        this.c.addTextChangedListener(new xzc(this));
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: xza
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Drawable drawable;
                xze xzeVar = xze.this;
                if (motionEvent.getAction() != 1 || (drawable = xzeVar.c.getCompoundDrawables()[2]) == null || !xzeVar.d || motionEvent.getX() < xzeVar.c.getRight() - drawable.getBounds().width()) {
                    zag.p(xzeVar.c);
                    return false;
                }
                xzeVar.c.setText("");
                return true;
            }
        });
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xzb
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                xze xzeVar = xze.this;
                if (i == 6) {
                    ((irh) xzeVar.a).aK(xzeVar.c.getText().toString());
                    xzeVar.c.clearFocus();
                    return true;
                }
                return false;
            }
        });
        this.c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xyz
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                xze.this.e();
                if (!z) {
                    zag.i(view);
                }
            }
        });
        this.e.o = !((avloVar.b & 2) != 0);
        this.c.setText(avloVar.d);
        TextInputLayout textInputLayout = this.e;
        if ((avloVar.b & 1) != 0) {
            aragVar = avloVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textInputLayout.B(ajgl.b(aragVar));
        if ((avloVar.b & 4) == 0) {
            if (!avloVar.d.isEmpty()) {
                this.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232422, 0);
                this.d = false;
            }
            d();
            this.c.clearFocus();
            return;
        }
        TextInputLayout textInputLayout2 = this.e;
        arag aragVar2 = avloVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textInputLayout2.v(ajgl.b(aragVar2));
        EditText editText = this.c;
        editText.setSelection(editText.getText().length());
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        f((avlo) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
