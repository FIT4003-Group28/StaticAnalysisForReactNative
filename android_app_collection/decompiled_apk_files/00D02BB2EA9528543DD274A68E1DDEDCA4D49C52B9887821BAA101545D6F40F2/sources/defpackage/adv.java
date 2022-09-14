package defpackage;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.SearchView$SavedState;
import android.support.v7.widget.SearchView$SearchAutoComplete;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: adv  reason: default package */
/* loaded from: classes2.dex */
public final class adv extends aab implements ue {
    public static final adr v;
    private Rect A;
    private Rect B;
    private int[] C;
    private int[] D;
    private final ImageView E;
    private final Drawable F;
    private final Intent G;
    private final Intent H;
    private final CharSequence I;
    private ado J;
    private View.OnClickListener K;
    private boolean L;
    private CharSequence M;
    private boolean N;
    private boolean O;
    private int P;
    private boolean Q;
    private boolean R;
    private int S;
    private Bundle T;
    private final Runnable U;
    private Runnable V;
    private final WeakHashMap<String, Drawable.ConstantState> W;
    public final SearchView$SearchAutoComplete a;
    private final View.OnClickListener aa;
    private final TextView.OnEditorActionListener ab;
    private final AdapterView.OnItemClickListener ac;
    private final AdapterView.OnItemSelectedListener ad;
    private TextWatcher ae;
    public final View b;
    final ImageView c;
    final ImageView d;
    final ImageView e;
    final ImageView i;
    public final View j;
    public final int k;
    public final int l;
    public adp m;
    View.OnFocusChangeListener n;
    public adq o;
    public boolean p;
    public boolean q;
    amk r;
    public CharSequence s;
    public CharSequence t;
    SearchableInfo u;
    View.OnKeyListener w;
    private final View x;
    private final View y;
    private adu z;

    static {
        v = Build.VERSION.SDK_INT < 29 ? new adr() : null;
    }

    public adv(Context context) {
        this(context, null);
    }

    private final boolean A() {
        return (this.L || this.Q) && !this.q;
    }

    private final void C() {
        this.a.dismissDropDown();
    }

    private final Intent D(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.t);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.T;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.u.getSearchActivity());
        return intent;
    }

    public static boolean v(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private final int y() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private final int z() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    @Override // defpackage.ue
    public final void a() {
        if (this.R) {
            return;
        }
        this.R = true;
        int imeOptions = this.a.getImeOptions();
        this.S = imeOptions;
        this.a.setImeOptions(imeOptions | 33554432);
        this.a.setText("");
        setIconified(false);
    }

    @Override // defpackage.ue
    public final void b() {
        setQuery("", false);
        clearFocus();
        c(true);
        this.a.setImeOptions(this.S);
        this.R = false;
    }

    public final void c(boolean z) {
        this.q = z;
        int i = 0;
        int i2 = true != z ? 8 : 0;
        boolean isEmpty = TextUtils.isEmpty(this.a.getText());
        this.c.setVisibility(i2);
        d(!isEmpty);
        this.x.setVisibility(true != z ? 0 : 8);
        if (this.E.getDrawable() == null || this.p) {
            i = 8;
        }
        this.E.setVisibility(i);
        f();
        o(isEmpty);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.O = true;
        super.clearFocus();
        this.a.clearFocus();
        this.a.a(false);
        this.O = false;
    }

    public final void d(boolean z) {
        int i = 0;
        if (!this.L || !A() || !hasFocus() || (!z && this.Q)) {
            i = 8;
        }
        this.d.setVisibility(i);
    }

    public final void e() {
        int i = 0;
        if (!A() || (this.d.getVisibility() != 0 && this.i.getVisibility() != 0)) {
            i = 8;
        }
        this.y.setVisibility(i);
    }

    public final void f() {
        boolean z = !TextUtils.isEmpty(this.a.getText());
        int i = 0;
        boolean z2 = z || (this.p && !this.R);
        ImageView imageView = this.e;
        if (true != z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(z ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    public final void j() {
        post(this.U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        int[] iArr = this.a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void o(boolean z) {
        int i = 8;
        if (this.Q && !this.q && z) {
            this.d.setVisibility(8);
            i = 0;
        }
        this.i.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.U);
        post(this.V);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.aab, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
            Rect rect = this.A;
            searchView$SearchAutoComplete.getLocationInWindow(this.C);
            getLocationInWindow(this.D);
            int[] iArr = this.C;
            int i5 = iArr[1];
            int[] iArr2 = this.D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchView$SearchAutoComplete.getWidth() + i7, searchView$SearchAutoComplete.getHeight() + i6);
            this.B.set(this.A.left, 0, this.A.right, i4 - i2);
            adu aduVar = this.z;
            if (aduVar == null) {
                adu aduVar2 = new adu(this.B, this.A, this.a);
                this.z = aduVar2;
                setTouchDelegate(aduVar2);
                return;
            }
            aduVar.a(this.B, this.A);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    @Override // defpackage.aab, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.q
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L29
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L3a
        L1b:
            int r0 = r3.P
            if (r0 <= 0) goto L3a
            goto L36
        L20:
            int r4 = r3.P
            if (r4 > 0) goto L3a
            int r4 = r3.y()
            goto L3a
        L29:
            int r0 = r3.P
            if (r0 <= 0) goto L32
            int r4 = java.lang.Math.min(r0, r4)
            goto L3a
        L32:
            int r0 = r3.y()
        L36:
            int r4 = java.lang.Math.min(r0, r4)
        L3a:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4c
            if (r0 == 0) goto L47
            goto L54
        L47:
            int r5 = r3.z()
            goto L54
        L4c:
            int r0 = r3.z()
            int r5 = java.lang.Math.min(r0, r5)
        L54:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adv.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SearchView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SearchView$SavedState searchView$SavedState = (SearchView$SavedState) parcelable;
        super.onRestoreInstanceState(searchView$SavedState.d);
        c(searchView$SavedState.a);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(super.onSaveInstanceState());
        searchView$SavedState.a = this.q;
        return searchView$SavedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        Editable text = this.a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        adp adpVar = this.m;
        if (adpVar != null) {
            text.toString();
            if (adpVar.b()) {
                return;
            }
        }
        if (this.u != null) {
            w(text.toString());
        }
        this.a.a(false);
        C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        if (!TextUtils.isEmpty(this.a.getText())) {
            this.a.setText("");
            this.a.requestFocus();
            this.a.a(true);
        } else if (!this.p) {
        } else {
            ado adoVar = this.J;
            if (adoVar != null && adoVar.a()) {
                return;
            }
            clearFocus();
            c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        c(false);
        this.a.requestFocus();
        this.a.a(true);
        View.OnClickListener onClickListener = this.K;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!this.O && isFocusable()) {
            if (!this.q) {
                boolean requestFocus = this.a.requestFocus(i, rect);
                if (requestFocus) {
                    c(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        SearchableInfo searchableInfo = this.u;
        if (searchableInfo != null) {
            try {
                String str = null;
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = new Intent(this.G);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    if (searchActivity != null) {
                        str = searchActivity.flattenToShortString();
                    }
                    intent.putExtra("calling_package", str);
                    getContext().startActivity(intent);
                } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                } else {
                    Intent intent2 = this.H;
                    ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                    Intent intent3 = new Intent("android.intent.action.SEARCH");
                    intent3.setComponent(searchActivity2);
                    PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent3, 1073741824);
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = this.T;
                    if (bundle2 != null) {
                        bundle.putParcelable("app_data", bundle2);
                    }
                    Intent intent4 = new Intent(intent2);
                    String str2 = "free_form";
                    Resources resources = getResources();
                    if (searchableInfo.getVoiceLanguageModeId() != 0) {
                        str2 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                    }
                    String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                    String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                    int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
                    intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str2);
                    intent4.putExtra("android.speech.extra.PROMPT", string);
                    intent4.putExtra("android.speech.extra.LANGUAGE", string2);
                    intent4.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                    if (searchActivity2 != null) {
                        str = searchActivity2.flattenToShortString();
                    }
                    intent4.putExtra("calling_package", str);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                    getContext().startActivity(intent4);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.T = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            q();
        } else {
            r();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        c(z);
        B();
    }

    public void setImeOptions(int i) {
        this.a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.P = i;
        requestLayout();
    }

    public void setOnCloseListener(ado adoVar) {
        this.J = adoVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.n = onFocusChangeListener;
    }

    public void setOnQueryTextListener(adp adpVar) {
        this.m = adpVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.K = onClickListener;
    }

    public void setOnSuggestionListener(adq adqVar) {
        this.o = adqVar;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.a.setText(charSequence);
        if (charSequence != null) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
            searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
            this.t = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        p();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.M = charSequence;
        B();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.N = z;
        amk amkVar = this.r;
        if (amkVar instanceof aej) {
            aej aejVar = (aej) amkVar;
            int i = 1;
            if (true == z) {
                i = 2;
            }
            aejVar.a = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (getContext().getPackageManager().resolveActivity(r0, com.google.ar.core.ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r6) {
        /*
            r5 = this;
            r5.u = r6
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L6b
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r5.a
            int r6 = r6.getSuggestThreshold()
            r2.setThreshold(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r6 = r5.a
            android.app.SearchableInfo r2 = r5.u
            int r2 = r2.getImeOptions()
            r6.setImeOptions(r2)
            android.app.SearchableInfo r6 = r5.u
            int r6 = r6.getInputType()
            r2 = r6 & 15
            if (r2 != r1) goto L33
            r2 = -65537(0xfffffffffffeffff, float:NaN)
            r6 = r6 & r2
            android.app.SearchableInfo r2 = r5.u
            java.lang.String r2 = r2.getSuggestAuthority()
            if (r2 == 0) goto L33
            r2 = 589824(0x90000, float:8.2652E-40)
            r6 = r6 | r2
        L33:
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r5.a
            r2.setInputType(r6)
            amk r6 = r5.r
            if (r6 == 0) goto L3f
            r6.b(r0)
        L3f:
            android.app.SearchableInfo r6 = r5.u
            java.lang.String r6 = r6.getSuggestAuthority()
            if (r6 == 0) goto L68
            aej r6 = new aej
            android.content.Context r2 = r5.getContext()
            android.app.SearchableInfo r3 = r5.u
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r5.W
            r6.<init>(r2, r5, r3, r4)
            r5.r = r6
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r5.a
            r2.setAdapter(r6)
            amk r6 = r5.r
            aej r6 = (defpackage.aej) r6
            boolean r2 = r5.N
            if (r1 == r2) goto L65
            r2 = 1
            goto L66
        L65:
            r2 = 2
        L66:
            r6.a = r2
        L68:
            r5.B()
        L6b:
            android.app.SearchableInfo r6 = r5.u
            r2 = 0
            if (r6 == 0) goto L9e
            boolean r6 = r6.getVoiceSearchEnabled()
            if (r6 == 0) goto L9e
            android.app.SearchableInfo r6 = r5.u
            boolean r6 = r6.getVoiceSearchLaunchWebSearch()
            if (r6 == 0) goto L81
            android.content.Intent r0 = r5.G
            goto L8b
        L81:
            android.app.SearchableInfo r6 = r5.u
            boolean r6 = r6.getVoiceSearchLaunchRecognizer()
            if (r6 == 0) goto L8b
            android.content.Intent r0 = r5.H
        L8b:
            if (r0 == 0) goto L9e
            android.content.Context r6 = r5.getContext()
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r3 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r0, r3)
            if (r6 == 0) goto L9e
            goto L9f
        L9e:
            r1 = 0
        L9f:
            r5.Q = r1
            if (r1 == 0) goto Laa
            android.support.v7.widget.SearchView$SearchAutoComplete r6 = r5.a
            java.lang.String r0 = "nm"
            r6.setPrivateImeOptions(r0)
        Laa:
            boolean r6 = r5.q
            r5.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adv.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.L = z;
        c(this.q);
    }

    public void setSuggestionsAdapter(amk amkVar) {
        this.r = amkVar;
        this.a.setAdapter(amkVar);
    }

    public final void t(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void u() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.refreshAutoCompleteResults();
            return;
        }
        adr adrVar = v;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        adr.a();
        Method method = adrVar.a;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        adr adrVar2 = v;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete2 = this.a;
        adr.a();
        Method method2 = adrVar2.b;
        if (method2 == null) {
            return;
        }
        try {
            method2.invoke(searchView$SearchAutoComplete2, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(String str) {
        getContext().startActivity(D("android.intent.action.SEARCH", null, null, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(int r7) {
        /*
            r6 = this;
            adq r0 = r6.o
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.a()
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            return r1
        Ld:
            amk r0 = r6.r
            android.database.Cursor r0 = r0.d
            if (r0 == 0) goto Laa
            boolean r7 = r0.moveToPosition(r7)
            if (r7 == 0) goto Laa
            r7 = 0
            java.lang.String r2 = "suggest_intent_action"
            java.lang.String r2 = defpackage.aej.d(r0, r2)     // Catch: java.lang.RuntimeException -> L75
            if (r2 != 0) goto L28
            android.app.SearchableInfo r2 = r6.u     // Catch: java.lang.RuntimeException -> L75
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L75
        L28:
            if (r2 != 0) goto L2c
            java.lang.String r2 = "android.intent.action.SEARCH"
        L2c:
            java.lang.String r3 = "suggest_intent_data"
            java.lang.String r3 = defpackage.aej.d(r0, r3)     // Catch: java.lang.RuntimeException -> L75
            if (r3 != 0) goto L3a
            android.app.SearchableInfo r3 = r6.u     // Catch: java.lang.RuntimeException -> L75
            java.lang.String r3 = r3.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L75
        L3a:
            if (r3 == 0) goto L5c
            java.lang.String r4 = "suggest_intent_data_id"
            java.lang.String r4 = defpackage.aej.d(r0, r4)     // Catch: java.lang.RuntimeException -> L75
            if (r4 == 0) goto L5c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L75
            r5.<init>()     // Catch: java.lang.RuntimeException -> L75
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L75
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L75
            java.lang.String r3 = android.net.Uri.encode(r4)     // Catch: java.lang.RuntimeException -> L75
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L75
            java.lang.String r3 = r5.toString()     // Catch: java.lang.RuntimeException -> L75
        L5c:
            if (r3 != 0) goto L60
            r3 = r7
            goto L64
        L60:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.RuntimeException -> L75
        L64:
            java.lang.String r4 = "suggest_intent_query"
            java.lang.String r4 = defpackage.aej.d(r0, r4)     // Catch: java.lang.RuntimeException -> L75
            java.lang.String r5 = "suggest_intent_extra_data"
            java.lang.String r5 = defpackage.aej.d(r0, r5)     // Catch: java.lang.RuntimeException -> L75
            android.content.Intent r7 = r6.D(r2, r3, r5, r4)     // Catch: java.lang.RuntimeException -> L75
            goto L90
        L75:
            int r0 = r0.getPosition()     // Catch: java.lang.RuntimeException -> L7a
            goto L7b
        L7a:
            r0 = -1
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Search suggestions cursor at row "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " returned exception."
            r2.append(r0)
            r2.toString()
        L90:
            if (r7 == 0) goto Laa
            android.content.Context r0 = r6.getContext()     // Catch: java.lang.RuntimeException -> L9a
            r0.startActivity(r7)     // Catch: java.lang.RuntimeException -> L9a
            goto Laa
        L9a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed launch activity: "
            r0.append(r2)
            r0.append(r7)
            r0.toString()
        Laa:
            android.support.v7.widget.SearchView$SearchAutoComplete r7 = r6.a
            r7.a(r1)
            r6.C()
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adv.x(int):boolean");
    }

    public adv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public adv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.U = new adf(this);
        this.V = new adg(this);
        this.W = new WeakHashMap<>();
        adj adjVar = new adj(this);
        this.aa = adjVar;
        this.w = new adk(this);
        adl adlVar = new adl(this);
        this.ab = adlVar;
        adm admVar = new adm(this);
        this.ac = admVar;
        adn adnVar = new adn(this);
        this.ad = adnVar;
        this.ae = new ade(this);
        aeq b = aeq.b(context, attributeSet, sj.t, i, 0);
        LayoutInflater.from(context).inflate(b.o(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(R.id.search_src_text);
        this.a = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.a = this;
        this.x = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.b = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.y = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.c = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.d = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.e = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.i = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        od.U(findViewById, b.d(10));
        od.U(findViewById2, b.d(14));
        imageView.setImageDrawable(b.d(13));
        imageView2.setImageDrawable(b.d(7));
        imageView3.setImageDrawable(b.d(4));
        imageView4.setImageDrawable(b.d(16));
        imageView5.setImageDrawable(b.d(13));
        this.F = b.d(12);
        afb.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.k = b.o(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.l = b.o(5, 0);
        imageView.setOnClickListener(adjVar);
        imageView3.setOnClickListener(adjVar);
        imageView2.setOnClickListener(adjVar);
        imageView4.setOnClickListener(adjVar);
        searchView$SearchAutoComplete.setOnClickListener(adjVar);
        searchView$SearchAutoComplete.addTextChangedListener(this.ae);
        searchView$SearchAutoComplete.setOnEditorActionListener(adlVar);
        searchView$SearchAutoComplete.setOnItemClickListener(admVar);
        searchView$SearchAutoComplete.setOnItemSelectedListener(adnVar);
        searchView$SearchAutoComplete.setOnKeyListener(this.w);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new adh(this));
        setIconifiedByDefault(b.h(8, true));
        int m = b.m(1, -1);
        if (m != -1) {
            setMaxWidth(m);
        }
        this.I = b.f(6);
        this.M = b.f(11);
        int i2 = b.i(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = b.i(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(b.h(0, true));
        b.q();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.G = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.H = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.j = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new adi(this));
        }
        c(this.p);
        B();
    }

    private final void B() {
        SpannableStringBuilder spannableStringBuilder = this.M;
        if (spannableStringBuilder == null) {
            SearchableInfo searchableInfo = this.u;
            spannableStringBuilder = (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.I : getContext().getText(this.u.getHintId());
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        if (this.p && this.F != null) {
            double textSize = searchView$SearchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.F.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("   ");
            spannableStringBuilder2.setSpan(new ImageSpan(this.F), 1, 2, 33);
            spannableStringBuilder2.append(spannableStringBuilder);
            spannableStringBuilder = spannableStringBuilder2;
        }
        searchView$SearchAutoComplete.setHint(spannableStringBuilder);
    }
}
