package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.crypto.tls.CipherSuite;
/* compiled from: ReactEditText.java */
/* loaded from: classes.dex */
public class c extends EditText {
    private static final KeyListener u = QwertyKeyListener.getInstanceForFullKeyboard();

    /* renamed from: a  reason: collision with root package name */
    private final InputMethodManager f4131a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4132b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4133c;

    /* renamed from: d  reason: collision with root package name */
    private int f4134d;
    private int e;
    private int f;
    private int g;
    private ArrayList<TextWatcher> h;
    private b i;
    private int j;
    private boolean k;
    private Boolean l;
    private boolean m;
    private String n;
    private p o;
    private com.facebook.react.views.textinput.a p;
    private o q;
    private final a r;
    private boolean s;
    private com.facebook.react.views.view.e t;

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    public c(Context context) {
        super(context);
        this.s = false;
        setFocusableInTouchMode(false);
        this.t = new com.facebook.react.views.view.e(this);
        this.f4131a = (InputMethodManager) com.facebook.j.a.a.b(getContext().getSystemService("input_method"));
        this.f4134d = getGravity() & 8388615;
        this.e = getGravity() & 112;
        this.f = 0;
        this.g = 0;
        this.f4132b = false;
        this.f4133c = false;
        this.l = null;
        this.m = false;
        this.h = null;
        this.i = null;
        this.j = getInputType();
        this.r = new a();
        this.q = null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        j();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.s = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.s) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.s = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 66 && !h()) {
            g();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.q != null) {
            this.q.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        d dVar = new d(super.onCreateInputConnection(editorInfo), (aj) getContext(), this);
        if (h() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return dVar;
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        g();
    }

    @Override // android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (!this.f4133c) {
            return false;
        }
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(i, rect);
        f();
        return requestFocus;
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.h == null) {
            this.h = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.h.add(textWatcher);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        if (this.h != null) {
            this.h.remove(textWatcher);
            if (!this.h.isEmpty()) {
                return;
            }
            this.h = null;
            super.removeTextChangedListener(getTextWatcherDelegator());
        }
    }

    public void setContentSizeWatcher(com.facebook.react.views.textinput.a aVar) {
        this.p = aVar;
    }

    public void setScrollWatcher(o oVar) {
        this.q = oVar;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        if (this.g < this.f) {
            return;
        }
        super.setSelection(i, i2);
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.o == null || !hasFocus()) {
            return;
        }
        this.o.a(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z || this.o == null) {
            return;
        }
        this.o.a(getSelectionStart(), getSelectionEnd());
    }

    public void setSelectionWatcher(p pVar) {
        this.o = pVar;
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.l = bool;
    }

    public boolean getBlurOnSubmit() {
        if (this.l == null) {
            return !h();
        }
        return this.l.booleanValue();
    }

    public void setDisableFullscreenUI(boolean z) {
        this.m = z;
        l();
    }

    public boolean getDisableFullscreenUI() {
        return this.m;
    }

    public void setReturnKeyType(String str) {
        this.n = str;
        l();
    }

    public String getReturnKeyType() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedInputType(int i) {
        this.j = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (getInputType() != this.j) {
            setInputType(this.j);
        }
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.j = i;
        super.setTypeface(typeface);
        this.r.a(i);
        setKeyListener(this.r);
    }

    public void b() {
        this.f4133c = true;
        requestFocus();
        this.f4133c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        clearFocus();
    }

    public int d() {
        int i = this.f + 1;
        this.f = i;
        return i;
    }

    public void a(com.facebook.react.views.text.j jVar) {
        if (!i() || !TextUtils.equals(getText(), jVar.a())) {
            this.g = jVar.b();
            if (this.g < this.f) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jVar.a());
            a(spannableStringBuilder);
            this.k = jVar.c();
            this.f4132b = true;
            getText().replace(0, length(), spannableStringBuilder);
            this.f4132b = false;
            if (Build.VERSION.SDK_INT < 23 || getBreakStrategy() == jVar.i()) {
                return;
            }
            setBreakStrategy(jVar.i());
        }
    }

    private void a(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i = 0; i < spans.length; i++) {
            if (ForegroundColorSpan.class.isInstance(spans[i]) || BackgroundColorSpan.class.isInstance(spans[i]) || AbsoluteSizeSpan.class.isInstance(spans[i]) || com.facebook.react.views.text.b.class.isInstance(spans[i]) || com.facebook.react.views.text.g.class.isInstance(spans[i])) {
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

    private boolean f() {
        return this.f4131a.showSoftInput(this, 0);
    }

    private void g() {
        this.f4131a.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private b getTextWatcherDelegator() {
        if (this.i == null) {
            this.i = new b();
        }
        return this.i;
    }

    private boolean h() {
        return (getInputType() & 131072) != 0;
    }

    private boolean i() {
        return (getInputType() & CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.p != null) {
            this.p.a();
        }
        k();
    }

    private void k() {
        ((UIManagerModule) ((aj) getContext()).b(UIManagerModule.class)).setViewLocalData(getId(), new k(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f4134d;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.e;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l() {
        /*
            r9 = this;
            java.lang.String r0 = r9.n
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 5
            r6 = 6
            if (r0 == 0) goto L6a
            java.lang.String r0 = r9.n
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L51;
                case -906336856: goto L47;
                case 3304: goto L3d;
                case 3089282: goto L33;
                case 3377907: goto L29;
                case 3387192: goto L1f;
                case 3526536: goto L15;
                default: goto L14;
            }
        L14:
            goto L5b
        L15:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 5
            goto L5c
        L1f:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 2
            goto L5c
        L29:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 1
            goto L5c
        L33:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 6
            goto L5c
        L3d:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 0
            goto L5c
        L47:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 4
            goto L5c
        L51:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 3
            goto L5c
        L5b:
            r0 = -1
        L5c:
            switch(r0) {
                case 0: goto L68;
                case 1: goto L66;
                case 2: goto L64;
                case 3: goto L62;
                case 4: goto L6b;
                case 5: goto L60;
                case 6: goto L6a;
                default: goto L5f;
            }
        L5f:
            goto L6a
        L60:
            r1 = 4
            goto L6b
        L62:
            r1 = 7
            goto L6b
        L64:
            r1 = 1
            goto L6b
        L66:
            r1 = 5
            goto L6b
        L68:
            r1 = 2
            goto L6b
        L6a:
            r1 = 6
        L6b:
            boolean r0 = r9.m
            if (r0 == 0) goto L76
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            goto L79
        L76:
            r9.setImeOptions(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.c.l():void");
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.k && (getText() instanceof Spanned)) {
            Editable text = getText();
            for (com.facebook.react.views.text.n nVar : (com.facebook.react.views.text.n[]) text.getSpans(0, text.length(), com.facebook.react.views.text.n.class)) {
                if (nVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.k && (getText() instanceof Spanned)) {
            Editable text = getText();
            for (com.facebook.react.views.text.n nVar : (com.facebook.react.views.text.n[]) text.getSpans(0, text.length(), com.facebook.react.views.text.n.class)) {
                if (nVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.k || !(getText() instanceof Spanned)) {
            return;
        }
        Editable text = getText();
        for (com.facebook.react.views.text.n nVar : (com.facebook.react.views.text.n[]) text.getSpans(0, text.length(), com.facebook.react.views.text.n.class)) {
            nVar.b();
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (!this.k || !(getText() instanceof Spanned)) {
            return;
        }
        Editable text = getText();
        for (com.facebook.react.views.text.n nVar : (com.facebook.react.views.text.n[]) text.getSpans(0, text.length(), com.facebook.react.views.text.n.class)) {
            nVar.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.k || !(getText() instanceof Spanned)) {
            return;
        }
        Editable text = getText();
        for (com.facebook.react.views.text.n nVar : (com.facebook.react.views.text.n[]) text.getSpans(0, text.length(), com.facebook.react.views.text.n.class)) {
            nVar.d();
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (!this.k || !(getText() instanceof Spanned)) {
            return;
        }
        Editable text = getText();
        for (com.facebook.react.views.text.n nVar : (com.facebook.react.views.text.n[]) text.getSpans(0, text.length(), com.facebook.react.views.text.n.class)) {
            nVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.t.a(i);
    }

    public void a(int i, float f) {
        this.t.a(i, f);
    }

    public void a(int i, float f, float f2) {
        this.t.a(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.t.a(f);
    }

    public void a(float f, int i) {
        this.t.a(f, i);
    }

    public void setBorderStyle(String str) {
        this.t.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactEditText.java */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (c.this.f4132b || c.this.h == null) {
                return;
            }
            Iterator it = c.this.h.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!c.this.f4132b && c.this.h != null) {
                Iterator it = c.this.h.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            c.this.j();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (c.this.f4132b || c.this.h == null) {
                return;
            }
            Iterator it = c.this.h.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactEditText.java */
    /* loaded from: classes.dex */
    public static class a implements KeyListener {

        /* renamed from: a  reason: collision with root package name */
        private int f4135a = 0;

        public void a(int i) {
            this.f4135a = i;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f4135a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return c.u.onKeyDown(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return c.u.onKeyUp(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return c.u.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i) {
            c.u.clearMetaKeyState(view, editable, i);
        }
    }
}
