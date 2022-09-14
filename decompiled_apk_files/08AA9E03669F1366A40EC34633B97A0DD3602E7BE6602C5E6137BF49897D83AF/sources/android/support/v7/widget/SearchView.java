package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.a.a;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.util.CrashUtils;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
/* loaded from: classes.dex */
public class SearchView extends y implements android.support.v7.view.b {
    static final a i = new a();
    private View.OnClickListener A;
    private boolean B;
    private boolean C;
    private boolean D;
    private CharSequence E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private CharSequence J;
    private boolean K;
    private int L;
    private Bundle M;
    private final Runnable N;
    private Runnable O;
    private final WeakHashMap<String, Drawable.ConstantState> P;

    /* renamed from: a  reason: collision with root package name */
    final SearchAutoComplete f836a;

    /* renamed from: b  reason: collision with root package name */
    final ImageView f837b;

    /* renamed from: c  reason: collision with root package name */
    final ImageView f838c;

    /* renamed from: d  reason: collision with root package name */
    final ImageView f839d;
    final ImageView e;
    View.OnFocusChangeListener f;
    android.support.v4.widget.e g;
    SearchableInfo h;
    private final View j;
    private final View k;
    private f l;
    private Rect m;
    private Rect n;
    private int[] o;
    private int[] p;
    private final ImageView q;
    private final Drawable r;
    private final int s;
    private final int t;
    private final Intent u;
    private final Intent v;
    private final CharSequence w;
    private c x;
    private b y;
    private d z;

    /* loaded from: classes.dex */
    public interface b {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(String str);
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.t;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.h = searchableInfo;
        if (this.h != null) {
            p();
            o();
        }
        this.I = j();
        if (this.I) {
            this.f836a.setPrivateImeOptions("nm");
        }
        a(c());
    }

    public void setAppSearchData(Bundle bundle) {
        this.M = bundle;
    }

    public void setImeOptions(int i2) {
        this.f836a.setImeOptions(i2);
    }

    public int getImeOptions() {
        return this.f836a.getImeOptions();
    }

    public void setInputType(int i2) {
        this.f836a.setInputType(i2);
    }

    public int getInputType() {
        return this.f836a.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (!this.G && isFocusable()) {
            if (!c()) {
                boolean requestFocus = this.f836a.requestFocus(i2, rect);
                if (requestFocus) {
                    a(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.G = true;
        super.clearFocus();
        this.f836a.clearFocus();
        this.f836a.setImeVisibility(false);
        this.G = false;
    }

    public void setOnQueryTextListener(c cVar) {
        this.x = cVar;
    }

    public void setOnCloseListener(b bVar) {
        this.y = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f = onFocusChangeListener;
    }

    public void setOnSuggestionListener(d dVar) {
        this.z = dVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A = onClickListener;
    }

    public CharSequence getQuery() {
        return this.f836a.getText();
    }

    public void a(CharSequence charSequence, boolean z) {
        this.f836a.setText(charSequence);
        if (charSequence != null) {
            this.f836a.setSelection(this.f836a.length());
            this.J = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        d();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.E = charSequence;
        o();
    }

    public CharSequence getQueryHint() {
        if (this.E != null) {
            return this.E;
        }
        if (this.h != null && this.h.getHintId() != 0) {
            return getContext().getText(this.h.getHintId());
        }
        return this.w;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.B == z) {
            return;
        }
        this.B = z;
        a(z);
        o();
    }

    public void setIconified(boolean z) {
        if (z) {
            e();
        } else {
            f();
        }
    }

    public boolean c() {
        return this.C;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.D = z;
        a(c());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.F = z;
        if (this.g instanceof af) {
            ((af) this.g).a(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(android.support.v4.widget.e eVar) {
        this.g = eVar;
        this.f836a.setAdapter(this.g);
    }

    public android.support.v4.widget.e getSuggestionsAdapter() {
        return this.g;
    }

    public void setMaxWidth(int i2) {
        this.H = i2;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.y, android.view.View
    public void onMeasure(int i2, int i3) {
        if (c()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size = this.H > 0 ? Math.min(this.H, size) : Math.min(getPreferredWidth(), size);
        } else if (mode != 0) {
            if (mode == 1073741824 && this.H > 0) {
                size = Math.min(this.H, size);
            }
        } else {
            size = this.H > 0 ? this.H : getPreferredWidth();
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.y, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            a(this.f836a, this.m);
            this.n.set(this.m.left, 0, this.m.right, i5 - i3);
            if (this.l == null) {
                this.l = new f(this.n, this.m, this.f836a);
                setTouchDelegate(this.l);
                return;
            }
            this.l.a(this.n, this.m);
        }
    }

    private void a(View view, Rect rect) {
        view.getLocationInWindow(this.o);
        getLocationInWindow(this.p);
        int i2 = this.o[1] - this.p[1];
        int i3 = this.o[0] - this.p[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_height);
    }

    private void a(boolean z) {
        this.C = z;
        int i2 = 8;
        boolean z2 = false;
        int i3 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f836a.getText());
        this.f837b.setVisibility(i3);
        b(z3);
        this.j.setVisibility(z ? 8 : 0);
        if (this.q.getDrawable() != null && !this.B) {
            i2 = 0;
        }
        this.q.setVisibility(i2);
        m();
        if (!z3) {
            z2 = true;
        }
        c(z2);
        l();
    }

    private boolean j() {
        if (this.h != null && this.h.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.h.getVoiceSearchLaunchWebSearch()) {
                intent = this.u;
            } else if (this.h.getVoiceSearchLaunchRecognizer()) {
                intent = this.v;
            }
            return (intent == null || getContext().getPackageManager().resolveActivity(intent, PKIFailureInfo.notAuthorized) == null) ? false : true;
        }
        return false;
    }

    private boolean k() {
        return (this.D || this.I) && !c();
    }

    private void b(boolean z) {
        this.f838c.setVisibility((!this.D || !k() || !hasFocus() || (!z && this.I)) ? 8 : 0);
    }

    private void l() {
        this.k.setVisibility((!k() || !(this.f838c.getVisibility() == 0 || this.e.getVisibility() == 0)) ? 8 : 0);
    }

    private void m() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f836a.getText());
        int i2 = 0;
        if (!z2 && (!this.B || this.K)) {
            z = false;
        }
        ImageView imageView = this.f839d;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.f839d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void n() {
        post(this.N);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.N);
        post(this.O);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    private CharSequence b(CharSequence charSequence) {
        if (!this.B || this.r == null) {
            return charSequence;
        }
        int textSize = (int) (this.f836a.getTextSize() * 1.25d);
        this.r.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.r), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f836a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(b(queryHint));
    }

    private void p() {
        this.f836a.setThreshold(this.h.getSuggestThreshold());
        this.f836a.setImeOptions(this.h.getImeOptions());
        int inputType = this.h.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.h.getSuggestAuthority() != null) {
                inputType = inputType | PKIFailureInfo.notAuthorized | PKIFailureInfo.signerNotTrusted;
            }
        }
        this.f836a.setInputType(inputType);
        if (this.g != null) {
            this.g.a((Cursor) null);
        }
        if (this.h.getSuggestAuthority() != null) {
            this.g = new af(getContext(), this, this.h, this.P);
            this.f836a.setAdapter(this.g);
            af afVar = (af) this.g;
            if (this.F) {
                i2 = 2;
            }
            afVar.a(i2);
        }
    }

    private void c(boolean z) {
        int i2;
        if (!this.I || c() || !z) {
            i2 = 8;
        } else {
            i2 = 0;
            this.f838c.setVisibility(8);
        }
        this.e.setVisibility(i2);
    }

    void d() {
        Editable text = this.f836a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.x != null && this.x.a(text.toString())) {
            return;
        }
        if (this.h != null) {
            a(0, null, text.toString());
        }
        this.f836a.setImeVisibility(false);
        q();
    }

    private void q() {
        this.f836a.dismissDropDown();
    }

    void e() {
        if (TextUtils.isEmpty(this.f836a.getText())) {
            if (!this.B) {
                return;
            }
            if (this.y != null && this.y.a()) {
                return;
            }
            clearFocus();
            a(true);
            return;
        }
        this.f836a.setText("");
        this.f836a.requestFocus();
        this.f836a.setImeVisibility(true);
    }

    void f() {
        a(false);
        this.f836a.requestFocus();
        this.f836a.setImeVisibility(true);
        if (this.A != null) {
            this.A.onClick(this);
        }
    }

    void h() {
        a(c());
        n();
        if (this.f836a.hasFocus()) {
            i();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        n();
    }

    @Override // android.support.v7.view.b
    public void b() {
        a("", false);
        clearFocus();
        a(true);
        this.f836a.setImeOptions(this.L);
        this.K = false;
    }

    @Override // android.support.v7.view.b
    public void a() {
        if (this.K) {
            return;
        }
        this.K = true;
        this.L = this.f836a.getImeOptions();
        this.f836a.setImeOptions(this.L | 33554432);
        this.f836a.setText("");
        setIconified(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends android.support.v4.j.a {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.ClassLoaderCreator<e>() { // from class: android.support.v7.widget.SearchView.e.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e[] newArray(int i) {
                return new e[i];
            }
        };

        /* renamed from: b  reason: collision with root package name */
        boolean f848b;

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f848b = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // android.support.v4.j.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f848b));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f848b + "}";
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f848b = c();
        return eVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        a(eVar.f848b);
        requestLayout();
    }

    private void setQuery(CharSequence charSequence) {
        this.f836a.setText(charSequence);
        this.f836a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void a(int i2, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    private Intent a(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.J);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.M != null) {
            intent.putExtra("app_data", this.M);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.h.getSearchActivity());
        return intent;
    }

    void i() {
        i.a(this.f836a);
        i.b(this.f836a);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* loaded from: classes.dex */
    private static class f extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f849a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f850b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f851c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f852d;
        private final int e;
        private boolean f;

        public f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f850b = new Rect();
            this.f852d = new Rect();
            this.f851c = new Rect();
            a(rect, rect2);
            this.f849a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f850b.set(rect);
            this.f852d.set(rect);
            this.f852d.inset(-this.e, -this.e);
            this.f851c.set(rect2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            boolean z2 = true;
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.f850b.contains(x, y)) {
                        this.f = true;
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 1:
                case 2:
                    z = this.f;
                    if (z && !this.f852d.contains(x, y)) {
                        z2 = false;
                        break;
                    }
                    break;
                case 3:
                    z = this.f;
                    this.f = false;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                if (z2 && !this.f851c.contains(x, y)) {
                    motionEvent.setLocation(this.f849a.getWidth() / 2, this.f849a.getHeight() / 2);
                } else {
                    motionEvent.setLocation(x - this.f851c.left, y - this.f851c.top);
                }
                return this.f849a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends android.support.v7.widget.f {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f840a;

        /* renamed from: b  reason: collision with root package name */
        private int f841b;

        /* renamed from: c  reason: collision with root package name */
        private SearchView f842c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f843d;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.C0020a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f840a = new Runnable() { // from class: android.support.v7.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public void run() {
                    SearchAutoComplete.this.a();
                }
            };
            this.f841b = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        void setSearchView(SearchView searchView) {
            this.f842c = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f841b = i;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (!z || !this.f842c.hasFocus() || getVisibility() != 0) {
                return;
            }
            this.f843d = true;
            if (!SearchView.a(getContext())) {
                return;
            }
            SearchView.i.a(this, true);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f842c.h();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f841b <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f842c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i >= 600) {
                    return 192;
                }
                if (i >= 640 && i2 >= 480) {
                    return 192;
                }
                return CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
            }
            return 256;
        }

        @Override // android.support.v7.widget.f, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f843d) {
                removeCallbacks(this.f840a);
                post(this.f840a);
            }
            return onCreateInputConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f843d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f843d = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f843d = false;
                removeCallbacks(this.f840a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f843d = false;
                removeCallbacks(this.f840a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f843d = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Method f845a;

        /* renamed from: b  reason: collision with root package name */
        private Method f846b;

        /* renamed from: c  reason: collision with root package name */
        private Method f847c;

        a() {
            try {
                this.f845a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f845a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f846b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f846b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f847c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f847c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f845a != null) {
                try {
                    this.f845a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f846b != null) {
                try {
                    this.f846b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f847c != null) {
                try {
                    this.f847c.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }
}
