package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable {
    public boolean A;
    public int B;
    public int C;
    public bje D;
    public PreferenceGroup E;
    public bji F;
    private boolean G;
    private boolean H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f71J;
    private List K;
    private boolean L;
    private bjh M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Drawable b;
    private Bundle c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    public Context j;
    public bkb k;
    public long l;
    public boolean m;
    public bjf n;
    public bjg o;
    public int p;
    public CharSequence q;
    public int r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public String x;
    public Object y;
    public boolean z;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new asq(5);

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context) {
        this(context, null);
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    return;
                }
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void A(bkb bkbVar) {
        this.k = bkbVar;
        if (!this.m) {
            this.l = bkbVar.a();
        }
        if (U()) {
            bkb bkbVar2 = this.k;
            if ((bkbVar2 != null ? bkbVar2.c() : null).contains(this.s)) {
                h(null);
                return;
            }
        }
        Object obj = this.y;
        if (obj != null) {
            h(obj);
        }
    }

    public void B() {
        P();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C() {
        P();
    }

    public final void D() {
        Intent intent;
        bka bkaVar;
        if (!T() || !this.v) {
            return;
        }
        c();
        bjg bjgVar = this.o;
        if (bjgVar != null && bjgVar.b(this)) {
            return;
        }
        bkb bkbVar = this.k;
        if ((bkbVar != null && (bkaVar = bkbVar.c) != null && bkaVar.aF(this)) || (intent = this.t) == null) {
            return;
        }
        this.j.startActivity(intent);
    }

    public final void E() {
        if (TextUtils.isEmpty(this.x)) {
            return;
        }
        Preference r = r(this.x);
        if (r != null) {
            if (r.K == null) {
                r.K = new ArrayList();
            }
            r.K.add(this);
            V(r.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.x + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public void F(Object obj) {
        this.y = obj;
    }

    public final void G(boolean z) {
        if (this.d != z) {
            this.d = z;
            x(j());
            d();
        }
    }

    public final void H(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            this.r = 0;
            d();
        }
    }

    public final void I(String str) {
        this.s = str;
        if (!this.e || S()) {
            return;
        }
        if (!TextUtils.isEmpty(this.s)) {
            this.e = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    public final void J(int i) {
        if (i != this.p) {
            this.p = i;
            y();
        }
    }

    public final void K(bji bjiVar) {
        this.F = bjiVar;
        d();
    }

    public final void L(int i) {
        M(this.j.getString(i));
    }

    public final void M(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.q)) {
            this.q = charSequence;
            d();
        }
    }

    public final void N(boolean z) {
        if (this.z != z) {
            this.z = z;
            bje bjeVar = this.D;
            if (bjeVar == null) {
                return;
            }
            ((bjw) bjeVar).a();
        }
    }

    public final void O(SharedPreferences.Editor editor) {
        if (!this.k.a) {
            editor.apply();
        }
    }

    public final void P() {
        Preference r;
        List list;
        String str = this.x;
        if (str == null || (r = r(str)) == null || (list = r.K) == null) {
            return;
        }
        list.remove(this);
    }

    public boolean Q(Object obj) {
        bjf bjfVar = this.n;
        return bjfVar == null || bjfVar.a(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean R(boolean z) {
        return !U() ? z : this.k.c().getBoolean(this.s, z);
    }

    public final boolean S() {
        return !TextUtils.isEmpty(this.s);
    }

    public boolean T() {
        return this.d && this.f && this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean U() {
        return this.k != null && this.w && S();
    }

    public final void V(boolean z) {
        if (this.f == z) {
            this.f = !z;
            x(j());
            d();
        }
    }

    public final void W(boolean z) {
        if (this.g == z) {
            this.g = !z;
            x(j());
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X(boolean z) {
        if (U() && z != R(!z)) {
            SharedPreferences.Editor b = this.k.b();
            b.putBoolean(this.s, z);
            O(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Y(String str) {
        if (U() && !TextUtils.equals(str, s(null))) {
            SharedPreferences.Editor b = this.k.b();
            b.putString(this.s, str);
            O(b);
        }
    }

    public final void Z() {
        if (this.I) {
            this.I = false;
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aa(int i) {
        if (U() && i != p(i ^ (-1))) {
            SharedPreferences.Editor b = this.k.b();
            b.putInt(this.s, i);
            O(b);
        }
    }

    protected void c() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.p;
        int i2 = preference.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 != null) {
            return charSequence.toString().compareToIgnoreCase(preference.q.toString());
        }
        return -1;
    }

    public void d() {
        int indexOf;
        bje bjeVar = this.D;
        if (bjeVar == null || (indexOf = ((bjw) bjeVar).d.indexOf(this)) == -1) {
            return;
        }
        ((xo) bjeVar).a.d(indexOf, 1, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable == BaseSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
    }

    protected void h(Object obj) {
    }

    public boolean j() {
        return !T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcelable jO() {
        this.L = true;
        return BaseSavedState.EMPTY_STATE;
    }

    protected Object jP(TypedArray typedArray, int i) {
        return null;
    }

    public long jQ() {
        return this.l;
    }

    public CharSequence m() {
        bji bjiVar = this.F;
        return bjiVar != null ? bjiVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.F != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int p(int i) {
        return !U() ? i : this.k.c().getInt(this.s, i);
    }

    public final Bundle q() {
        if (this.c == null) {
            this.c = new Bundle();
        }
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qB(defpackage.bke r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.qB(bke):void");
    }

    public void qC(View view) {
        D();
    }

    protected final Preference r(String str) {
        bkb bkbVar = this.k;
        if (bkbVar == null) {
            return null;
        }
        return bkbVar.d(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String s(String str) {
        return !U() ? str : this.k.c().getString(this.s, str);
    }

    public final Set t(Set set) {
        return !U() ? set : this.k.c().getStringSet(this.s, set);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence m = m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.E == null) {
            this.E = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    public void v(Bundle bundle) {
        Parcelable parcelable;
        if (!S() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void w(Bundle bundle) {
        if (S()) {
            this.L = false;
            Parcelable jO = jO();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (jO == null) {
                return;
            }
            bundle.putParcelable(this.s, jO);
        }
    }

    public void x(boolean z) {
        List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).V(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y() {
        bje bjeVar = this.D;
        if (bjeVar != null) {
            bjeVar.a();
        }
    }

    public void z() {
        E();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ft.d(context, R.attr.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Integer.MAX_VALUE;
        this.d = true;
        this.v = true;
        this.w = true;
        this.f = true;
        this.g = true;
        this.z = true;
        this.h = true;
        this.i = true;
        this.H = true;
        this.f71J = true;
        this.B = R.layout.preference;
        this.N = new bjd(this);
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkf.g, i, i2);
        this.r = ft.f(obtainStyledAttributes, 23, 0, 0);
        this.s = ft.j(obtainStyledAttributes, 26, 6);
        this.q = ft.h(obtainStyledAttributes, 34, 4);
        this.a = ft.h(obtainStyledAttributes, 33, 7);
        this.p = ft.n(obtainStyledAttributes, 28, 8);
        this.u = ft.j(obtainStyledAttributes, 22, 13);
        this.B = ft.f(obtainStyledAttributes, 27, 3, R.layout.preference);
        this.C = ft.f(obtainStyledAttributes, 35, 9, 0);
        this.d = ft.k(obtainStyledAttributes, 21, 2, true);
        this.v = ft.k(obtainStyledAttributes, 30, 5, true);
        this.w = ft.k(obtainStyledAttributes, 29, 1, true);
        this.x = ft.j(obtainStyledAttributes, 19, 10);
        this.h = ft.k(obtainStyledAttributes, 16, 16, this.v);
        this.i = ft.k(obtainStyledAttributes, 17, 17, this.v);
        if (obtainStyledAttributes.hasValue(18)) {
            this.y = jP(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.y = jP(obtainStyledAttributes, 11);
        }
        this.f71J = ft.k(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.G = hasValue;
        if (hasValue) {
            this.H = ft.k(obtainStyledAttributes, 32, 14, true);
        }
        this.I = ft.k(obtainStyledAttributes, 24, 15, false);
        this.z = ft.k(obtainStyledAttributes, 25, 25, true);
        this.A = ft.k(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }
}
