package com.facebook.react.views.textinput;

import a.g.m.v;
import android.annotation.TargetApi;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.text.q;
@TargetApi(23)
/* loaded from: classes.dex */
public class m extends com.facebook.react.views.text.h implements com.facebook.yoga.m {
    private EditText a0;
    private k b0;
    private int Z = -1;
    private String c0 = null;
    private String d0 = null;
    private int e0 = -1;
    private int f0 = -1;

    public m() {
        this.H = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        U();
    }

    private void U() {
        a((com.facebook.yoga.m) this);
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean J() {
        return true;
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean K() {
        return true;
    }

    protected EditText R() {
        return new EditText(i());
    }

    public String S() {
        return this.d0;
    }

    public String T() {
        return this.c0;
    }

    @Override // com.facebook.yoga.m
    public long a(com.facebook.yoga.p pVar, float f2, com.facebook.yoga.n nVar, float f3, com.facebook.yoga.n nVar2) {
        EditText editText = this.a0;
        c.d.k.a.a.a(editText);
        EditText editText2 = editText;
        k kVar = this.b0;
        if (kVar != null) {
            kVar.a(editText2);
        } else {
            editText2.setTextSize(0, this.A.b());
            int i = this.F;
            if (i != -1) {
                editText2.setLines(i);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                int breakStrategy = editText2.getBreakStrategy();
                int i2 = this.H;
                if (breakStrategy != i2) {
                    editText2.setBreakStrategy(i2);
                }
            }
        }
        editText2.setHint(S());
        editText2.measure(com.facebook.react.views.view.b.a(f2, nVar), com.facebook.react.views.view.b.a(f3, nVar2));
        return com.facebook.yoga.o.a(editText2.getMeasuredWidth(), editText2.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void a(k0 k0Var) {
        super.a(k0Var);
        EditText R = R();
        b(4, v.u(R));
        b(1, R.getPaddingTop());
        b(5, v.t(R));
        b(3, R.getPaddingBottom());
        this.a0 = R;
        this.a0.setPadding(0, 0, 0, 0);
        this.a0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.facebook.react.uimanager.b0
    public void a(v0 v0Var) {
        super.a(v0Var);
        if (this.Z != -1) {
            v0Var.a(t(), new q(a((com.facebook.react.views.text.h) this, T(), false, (com.facebook.react.uimanager.n) null), this.Z, this.X, f(0), f(1), f(2), f(3), this.G, this.H, this.J, this.e0, this.f0));
        }
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void a(Object obj) {
        c.d.k.a.a.a(obj instanceof k);
        this.b0 = (k) obj;
        g();
    }

    @Override // com.facebook.react.uimanager.b0
    public void e(int i, float f2) {
        super.e(i, f2);
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.Z = i;
    }

    @com.facebook.react.uimanager.e1.a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.d0 = str;
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "selection")
    public void setSelection(ReadableMap readableMap) {
        this.f0 = -1;
        this.e0 = -1;
        if (readableMap != null && readableMap.hasKey("start") && readableMap.hasKey("end")) {
            this.e0 = readableMap.getInt("start");
            this.f0 = readableMap.getInt("end");
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "text")
    public void setText(String str) {
        int i;
        this.c0 = str;
        if (str != null) {
            if (this.e0 > str.length()) {
                this.e0 = str.length();
            }
            if (this.f0 > str.length()) {
                i = str.length();
            }
            M();
        }
        i = -1;
        this.e0 = -1;
        this.f0 = i;
        M();
    }

    @Override // com.facebook.react.views.text.h
    public void setTextBreakStrategy(String str) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "simple".equals(str)) {
            i = 0;
        } else if ("highQuality".equals(str)) {
            i = 1;
        } else if (!"balanced".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
        } else {
            i = 2;
        }
        this.H = i;
    }
}
