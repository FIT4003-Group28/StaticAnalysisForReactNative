package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.maps.R;
import java.lang.reflect.Method;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchView$SearchAutoComplete extends xb {
    public adv a;
    public boolean b;
    final Runnable c;
    private int d;

    public SearchView$SearchAutoComplete(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (!z) {
            this.b = false;
            removeCallbacks(this.c);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else if (!inputMethodManager.isActive(this)) {
            this.b = true;
        } else {
            this.b = false;
            removeCallbacks(this.c);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 29) {
            setInputMethodMode(1);
            if (!enoughToFilter()) {
                return;
            }
            showDropDown();
            return;
        }
        adr adrVar = adv.v;
        adr.a();
        Method method = adrVar.c;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this, true);
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.d <= 0 || super.enoughToFilter();
    }

    @Override // defpackage.xb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.b) {
            removeCallbacks(this.c);
            post(this.c);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        setMinWidth((int) TypedValue.applyDimension(1, (i < 960 || configuration.screenHeightDp < 720 || configuration.orientation != 2) ? i < 600 ? 160 : 192 : 256, displayMetrics));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        adv advVar = this.a;
        advVar.c(advVar.q);
        advVar.j();
        if (advVar.a.hasFocus()) {
            advVar.u();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.a.clearFocus();
                        a(false);
                        return true;
                    }
                }
                i = 4;
            } else {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z || !this.a.hasFocus() || getVisibility() != 0) {
            return;
        }
        this.b = true;
        if (!adv.v(getContext())) {
            return;
        }
        b();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    protected final void replaceText(CharSequence charSequence) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.d = i;
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new adt(this);
        this.d = getThreshold();
    }
}
