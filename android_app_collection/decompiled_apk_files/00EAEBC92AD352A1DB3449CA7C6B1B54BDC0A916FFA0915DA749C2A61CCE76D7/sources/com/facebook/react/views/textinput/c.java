package com.facebook.react.views.textinput;

import a.g.m.v;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.j0;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.s;
import com.facebook.react.views.text.x;
import com.facebook.react.views.text.y;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends EditText {
    private static final KeyListener E = QwertyKeyListener.getInstanceForFullKeyboard();
    private com.facebook.react.views.view.e A;
    protected JavaOnlyMap B;
    protected j0 C;
    protected boolean D;

    /* renamed from: b  reason: collision with root package name */
    private final InputMethodManager f6347b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f6348c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6349d;

    /* renamed from: e  reason: collision with root package name */
    private int f6350e;

    /* renamed from: f  reason: collision with root package name */
    private int f6351f;

    /* renamed from: g  reason: collision with root package name */
    protected int f6352g;

    /* renamed from: h  reason: collision with root package name */
    protected int f6353h;
    private ArrayList<TextWatcher> i;
    private C0135c j;
    private int k;
    protected boolean l;
    private Boolean m;
    private boolean n;
    private String o;
    private p p;
    private com.facebook.react.views.textinput.a q;
    private o r;
    private final b s;
    private boolean t;
    private boolean u;
    private x v;
    private boolean w;
    private String x;
    private int y;
    private int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a.g.m.a {
        a() {
        }

        @Override // a.g.m.a
        public boolean a(View view, int i, Bundle bundle) {
            if (i == 16) {
                c.this.f6349d = true;
                c.this.requestFocus();
                c.this.f6349d = false;
                return true;
            }
            return super.a(view, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements KeyListener {

        /* renamed from: b  reason: collision with root package name */
        private int f6355b = 0;

        public void a(int i) {
            this.f6355b = i;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i) {
            c.E.clearMetaKeyState(view, editable, i);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f6355b;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return c.E.onKeyDown(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return c.E.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return c.E.onKeyUp(view, editable, i, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.textinput.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0135c implements TextWatcher {
        private C0135c() {
        }

        /* synthetic */ C0135c(c cVar, a aVar) {
            this();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            c cVar = c.this;
            if (cVar.f6348c || cVar.i == null) {
                return;
            }
            Iterator it = c.this.i.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            if (cVar.f6348c || cVar.i == null) {
                return;
            }
            Iterator it = c.this.i.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            if (!cVar.f6348c && cVar.i != null) {
                Iterator it = c.this.i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            c.this.l();
        }
    }

    public c(Context context) {
        super(context);
        this.t = false;
        this.u = false;
        this.w = false;
        this.x = null;
        this.y = -1;
        this.z = -1;
        this.B = null;
        this.C = null;
        this.D = false;
        setFocusableInTouchMode(false);
        this.A = new com.facebook.react.views.view.e(this);
        Object systemService = getContext().getSystemService("input_method");
        c.d.k.a.a.a(systemService);
        this.f6347b = (InputMethodManager) systemService;
        this.f6350e = getGravity() & 8388615;
        this.f6351f = getGravity() & 112;
        this.f6352g = 0;
        this.f6353h = 0;
        this.f6348c = false;
        this.f6349d = false;
        this.m = null;
        this.n = false;
        this.i = null;
        this.j = null;
        this.k = getInputType();
        this.s = new b();
        this.r = null;
        this.v = new x();
        a();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27) {
            setLayerType(1, null);
        }
        v.a(this, new a());
    }

    private void a(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i = 0; i < spans.length; i++) {
            if (spans[i] instanceof com.facebook.react.views.text.l) {
                getText().removeSpan(spans[i]);
            }
            if ((getText().getSpanFlags(spans[i]) & 33) == 33) {
                Object obj = spans[i];
                int spanStart = getText().getSpanStart(spans[i]);
                int spanEnd = getText().getSpanEnd(spans[i]);
                int spanFlags = getText().getSpanFlags(spans[i]);
                getText().removeSpan(spans[i]);
                if (a(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private static boolean a(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private C0135c getTextWatcherDelegator() {
        if (this.j == null) {
            this.j = new C0135c(this, null);
        }
        return this.j;
    }

    private boolean k() {
        return (getInputType() & 144) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.facebook.react.views.textinput.a aVar = this.q;
        if (aVar != null) {
            aVar.a();
        }
        m();
    }

    private void m() {
        if (this.C == null) {
            ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new k(this));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n() {
        /*
            r9 = this;
            java.lang.String r0 = r9.o
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 5
            r5 = 2
            r6 = 6
            if (r0 == 0) goto L68
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L4f;
                case -906336856: goto L45;
                case 3304: goto L3b;
                case 3089282: goto L31;
                case 3377907: goto L27;
                case 3387192: goto L1d;
                case 3526536: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 5
            goto L5a
        L1d:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 2
            goto L5a
        L27:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L31:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 6
            goto L5a
        L3b:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 0
            goto L5a
        L45:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 4
            goto L5a
        L4f:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 3
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L66;
                case 1: goto L64;
                case 2: goto L62;
                case 3: goto L60;
                case 4: goto L5e;
                case 5: goto L69;
                case 6: goto L68;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            r1 = 3
            goto L69
        L60:
            r1 = 7
            goto L69
        L62:
            r1 = 1
            goto L69
        L64:
            r1 = 5
            goto L69
        L66:
            r1 = 2
            goto L69
        L68:
            r1 = 6
        L69:
            boolean r0 = r9.n
            if (r0 == 0) goto L74
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            goto L77
        L74:
            r9.setImeOptions(r1)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.c.n():void");
    }

    protected void a() {
        setTextSize(0, this.v.b());
        if (Build.VERSION.SDK_INT >= 21) {
            float c2 = this.v.c();
            if (Float.isNaN(c2)) {
                return;
            }
            setLetterSpacing(c2);
        }
    }

    public void a(float f2, int i) {
        this.A.a(f2, i);
    }

    public void a(int i, float f2) {
        this.A.a(i, f2);
    }

    public void a(int i, float f2, float f3) {
        this.A.a(i, f2, f3);
    }

    public void a(q qVar) {
        if (!k() || !TextUtils.equals(getText(), qVar.j())) {
            this.f6353h = qVar.b();
            if (this.f6353h < this.f6352g) {
                return;
            }
            ReadableMap readableMap = qVar.m;
            if (readableMap != null) {
                this.B = JavaOnlyMap.deepClone(readableMap);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.j());
            a(spannableStringBuilder);
            this.l = qVar.a();
            this.D = true;
            if (qVar.j().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.D = false;
            if (Build.VERSION.SDK_INT < 23 || getBreakStrategy() == qVar.l()) {
                return;
            }
            setBreakStrategy(qVar.l());
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.i == null) {
            this.i = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.i.add(textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        clearFocus();
    }

    public void b(q qVar) {
        this.f6348c = true;
        a(qVar);
        this.f6348c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (getInputType() != this.k) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.k);
            setSelection(selectionStart, selectionEnd);
        }
    }

    public void c(q qVar) {
        a(qVar);
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        d();
    }

    protected void d() {
        this.f6347b.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int e() {
        int i = this.f6352g + 1;
        this.f6352g = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return (getInputType() & 131072) != 0;
    }

    public void g() {
        if (!this.w) {
            return;
        }
        this.w = false;
        setTypeface(s.a(getTypeface(), this.z, this.y, this.x, getContext().getAssets()));
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.m;
        return bool == null ? !f() : bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.n;
    }

    public String getReturnKeyType() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.k;
    }

    public void h() {
        this.f6349d = true;
        requestFocus();
        this.f6349d = false;
    }

    protected boolean i() {
        return this.f6347b.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.l) {
            Editable text = getText();
            for (y yVar : (y[]) text.getSpans(0, text.length(), y.class)) {
                if (yVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            Editable text = getText();
            for (y yVar : (y[]) text.getSpans(0, text.length(), y.class)) {
                yVar.c();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = (ReactContext) getContext();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.u) {
            onCreateInputConnection = new d(onCreateInputConnection, reactContext, this);
        }
        if (f() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.l) {
            Editable text = getText();
            for (y yVar : (y[]) text.getSpans(0, text.length(), y.class)) {
                yVar.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.l) {
            Editable text = getText();
            for (y yVar : (y[]) text.getSpans(0, text.length(), y.class)) {
                yVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        p pVar;
        super.onFocusChanged(z, i, rect);
        if (!z || (pVar = this.p) == null) {
            return;
        }
        pVar.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || f()) {
            return super.onKeyUp(i, keyEvent);
        }
        d();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        l();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        o oVar = this.r;
        if (oVar != null) {
            oVar.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.p == null || !hasFocus()) {
            return;
        }
        this.p.a(i, i2);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.l) {
            Editable text = getText();
            for (y yVar : (y[]) text.getSpans(0, text.length(), y.class)) {
                yVar.f();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.t = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.t) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.t = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.i;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (!this.i.isEmpty()) {
                return;
            }
            this.i = null;
            super.removeTextChangedListener(getTextWatcherDelegator());
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (!this.f6349d) {
            return false;
        }
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(i, rect);
        if (getShowSoftInputOnFocus()) {
            i();
        }
        return requestFocus;
    }

    public void setAllowFontScaling(boolean z) {
        if (this.v.a() != z) {
            this.v.a(z);
            a();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A.a(i);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.m = bool;
    }

    public void setBorderRadius(float f2) {
        this.A.a(f2);
    }

    public void setBorderStyle(String str) {
        this.A.a(str);
    }

    public void setContentSizeWatcher(com.facebook.react.views.textinput.a aVar) {
        this.q = aVar;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.n = z;
        n();
    }

    public void setFontFamily(String str) {
        this.x = str;
        this.w = true;
    }

    public void setFontSize(float f2) {
        this.v.a(f2);
        a();
    }

    public void setFontStyle(String str) {
        int a2 = s.a(str);
        if (a2 != this.z) {
            this.z = a2;
            this.w = true;
        }
    }

    public void setFontWeight(String str) {
        int b2 = s.b(str);
        if (b2 != this.y) {
            this.y = b2;
            this.w = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f6350e;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f6351f;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.k = i;
        super.setTypeface(typeface);
        if (f()) {
            setSingleLine(false);
        }
        this.s.a(i);
        setKeyListener(this.s);
    }

    public void setLetterSpacingPt(float f2) {
        this.v.c(f2);
        a();
    }

    public void setMaxFontSizeMultiplier(float f2) {
        if (f2 != this.v.j()) {
            this.v.e(f2);
            a();
        }
    }

    public void setMostRecentEventCount(int i) {
        this.f6353h = i;
    }

    public void setOnKeyPress(boolean z) {
        this.u = z;
    }

    public void setReturnKeyType(String str) {
        this.o = str;
        n();
    }

    public void setScrollWatcher(o oVar) {
        this.r = oVar;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        if (this.f6353h < this.f6352g) {
            return;
        }
        super.setSelection(i, i2);
    }

    public void setSelectionWatcher(p pVar) {
        this.p = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedInputType(int i) {
        this.k = i;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.l) {
            Editable text = getText();
            for (y yVar : (y[]) text.getSpans(0, text.length(), y.class)) {
                if (yVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
