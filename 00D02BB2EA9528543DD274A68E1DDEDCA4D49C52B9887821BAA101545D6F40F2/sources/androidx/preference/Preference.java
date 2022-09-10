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
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class Preference implements Comparable<Preference> {
    public aua A;
    public PreferenceGroup B;
    public aue C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List<Preference> K;
    private boolean L;
    private aud M;
    private final View.OnClickListener N;
    private CharSequence a;
    private CharSequence b;
    private int c;
    private Drawable d;
    private Bundle e;
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;
    public Context j;
    public avb k;
    public long l;
    public boolean m;
    public aub n;
    public auc o;
    public int p;
    public String q;
    public Intent r;
    public String s;
    public boolean t;
    public Object u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new atz();

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

    private final void m(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    return;
                }
                m(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void A(boolean z) {
        if (this.g != z) {
            this.g = z;
            d();
        }
    }

    public final void B(boolean z) {
        if (this.v != z) {
            this.v = z;
            aua auaVar = this.A;
            if (auaVar == null) {
                return;
            }
            ((auw) auaVar).a();
        }
    }

    public final void C(String str) {
        this.q = str;
        if (!this.h || E()) {
            return;
        }
        if (!TextUtils.isEmpty(this.q)) {
            this.h = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    public final String D() {
        return this.q;
    }

    public final boolean E() {
        return !TextUtils.isEmpty(this.q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean F() {
        return this.k != null && this.t && E();
    }

    public final void G(boolean z) {
        if (this.J != z) {
            this.J = z;
            d();
        }
    }

    public final void H(aue aueVar) {
        this.C = aueVar;
        d();
    }

    public boolean I(Object obj) {
        aub aubVar = this.n;
        return aubVar == null || aubVar.a(this, obj);
    }

    public void J(aub aubVar) {
        this.n = aubVar;
    }

    public final void K() {
        Intent intent;
        ava avaVar;
        if (!z() || !this.g) {
            return;
        }
        c();
        auc aucVar = this.o;
        if (aucVar != null && aucVar.a(this)) {
            return;
        }
        avb avbVar = this.k;
        if ((avbVar != null && (avaVar = avbVar.e) != null && avaVar.g(this)) || (intent = this.r) == null) {
            return;
        }
        this.j.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L() {
        aua auaVar = this.A;
        if (auaVar != null) {
            auaVar.a();
        }
    }

    public void M(avb avbVar) {
        this.k = avbVar;
        if (!this.m) {
            this.l = avbVar.c();
        }
        if (p() != null) {
            g(this.u);
            return;
        }
        if (F()) {
            if (((this.k == null || p() != null) ? null : this.k.e()).contains(this.q)) {
                g(null);
                return;
            }
        }
        Object obj = this.u;
        if (obj == null) {
            return;
        }
        g(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.B == null) {
            this.B = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    public long Ng() {
        return this.l;
    }

    public void O() {
        Q();
    }

    public void P() {
        R();
    }

    public final void Q() {
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        Preference S = S(this.i);
        if (S != null) {
            if (S.K == null) {
                S.K = new ArrayList();
            }
            S.K.add(this);
            ab(S.h());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.i + "\" not found for preference \"" + this.q + "\" (title: \"" + ((Object) this.a) + "\"");
    }

    public final void R() {
        Preference S;
        List<Preference> list;
        String str = this.i;
        if (str == null || (S = S(str)) == null || (list = S.K) == null) {
            return;
        }
        list.remove(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Rk(defpackage.ave r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.Rk(ave):void");
    }

    protected final <T extends Preference> T S(String str) {
        avb avbVar = this.k;
        if (avbVar == null) {
            return null;
        }
        return (T) avbVar.f(str);
    }

    public void T(boolean z) {
        List<Preference> list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).ab(z);
        }
    }

    public final void U(SharedPreferences.Editor editor) {
        if (!this.k.c) {
            editor.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String V(String str) {
        if (!F()) {
            return str;
        }
        auf p = p();
        if (p != null) {
            return p.e(this.q, str);
        }
        return this.k.e().getString(this.q, str);
    }

    public final Set<String> W(Set<String> set) {
        if (!F()) {
            return set;
        }
        auf p = p();
        if (p != null) {
            return p.f(this.q, set);
        }
        return this.k.e().getStringSet(this.q, set);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int X(int i) {
        if (!F()) {
            return i;
        }
        auf p = p();
        if (p != null) {
            return p.g(this.q, i);
        }
        return this.k.e().getInt(this.q, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean Y(boolean z) {
        if (!F()) {
            return z;
        }
        auf p = p();
        if (p != null) {
            return p.h(this.q, z);
        }
        return this.k.e().getBoolean(this.q, z);
    }

    public void Z(Bundle bundle) {
        if (E()) {
            this.L = false;
            Parcelable i = i();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (i == null) {
                return;
            }
            bundle.putParcelable(this.q, i);
        }
    }

    public void aa(Bundle bundle) {
        Parcelable parcelable;
        if (!E() || (parcelable = bundle.getParcelable(this.q)) == null) {
            return;
        }
        this.L = false;
        j(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public final void ab(boolean z) {
        if (this.D == z) {
            this.D = !z;
            T(h());
            d();
        }
    }

    public final void ac(boolean z) {
        if (this.E == z) {
            this.E = !z;
            T(h());
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ad(String str) {
        if (F() && !TextUtils.equals(str, V(null))) {
            auf p = p();
            if (p != null) {
                p.a(this.q, str);
                return;
            }
            SharedPreferences.Editor g = this.k.g();
            g.putString(this.q, str);
            U(g);
        }
    }

    public final void ae() {
        this.H = true;
        this.I = false;
    }

    public final void af(int i) {
        if (F() && i != X(i ^ (-1))) {
            auf p = p();
            if (p != null) {
                p.c(this.q, i);
                return;
            }
            SharedPreferences.Editor g = this.k.g();
            g.putInt(this.q, i);
            U(g);
        }
    }

    public void b(View view) {
        K();
    }

    protected void c() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.p;
        int i2 = preference2.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.a;
        CharSequence charSequence2 = preference2.a;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 != null) {
            return charSequence.toString().compareToIgnoreCase(preference2.a.toString());
        }
        return -1;
    }

    public void d() {
        int indexOf;
        aua auaVar = this.A;
        if (auaVar == null || (indexOf = ((auw) auaVar).a.indexOf(this)) == -1) {
            return;
        }
        ((abg) auaVar).b.d(indexOf, 1, this);
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Object obj) {
    }

    public boolean h() {
        return !z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcelable i() {
        this.L = true;
        return BaseSavedState.EMPTY_STATE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(Parcelable parcelable) {
        this.L = true;
        if (parcelable == BaseSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
    }

    public void k(CharSequence charSequence) {
        if (this.C != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.b, charSequence)) {
            return;
        }
        this.b = charSequence;
        d();
    }

    public CharSequence l() {
        aue aueVar = this.C;
        return aueVar != null ? aueVar.a(this) : this.b;
    }

    public final auf p() {
        avb avbVar = this.k;
        if (avbVar != null) {
            return avbVar.b;
        }
        return null;
    }

    public final Bundle q() {
        if (this.e == null) {
            this.e = new Bundle();
        }
        return this.e;
    }

    public final void r(int i) {
        if (i != this.p) {
            this.p = i;
            L();
        }
    }

    public final void s(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.a)) {
            this.a = charSequence;
            d();
        }
    }

    public final void t(int i) {
        s(this.j.getString(i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence u = u();
        if (!TextUtils.isEmpty(u)) {
            sb.append(u);
            sb.append(' ');
        }
        CharSequence l = l();
        if (!TextUtils.isEmpty(l)) {
            sb.append(l);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public CharSequence u() {
        return this.a;
    }

    public final void v(Drawable drawable) {
        if (this.d != drawable) {
            this.d = drawable;
            this.c = 0;
            d();
        }
    }

    public final void w(int i) {
        v(sl.b(this.j, i));
        this.c = i;
    }

    public final void x(int i) {
        k(this.j.getString(i));
    }

    public final void y(boolean z) {
        if (this.f != z) {
            this.f = z;
            T(h());
            d();
        }
    }

    public boolean z() {
        return this.f && this.D && this.E;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kb.k(context, R.attr.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Integer.MAX_VALUE;
        this.f = true;
        this.g = true;
        this.t = true;
        this.D = true;
        this.E = true;
        this.v = true;
        this.F = true;
        this.G = true;
        this.I = true;
        this.x = true;
        this.y = R.layout.preference;
        this.N = new aty(this);
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avf.g, i, i2);
        this.c = kb.g(obtainStyledAttributes, 23, 0, 0);
        this.q = kb.h(obtainStyledAttributes, 26, 6);
        this.a = kb.i(obtainStyledAttributes, 34, 4);
        this.b = kb.i(obtainStyledAttributes, 33, 7);
        this.p = kb.l(obtainStyledAttributes, 28, 8);
        this.s = kb.h(obtainStyledAttributes, 22, 13);
        this.y = kb.g(obtainStyledAttributes, 27, 3, R.layout.preference);
        this.z = kb.g(obtainStyledAttributes, 35, 9, 0);
        this.f = kb.f(obtainStyledAttributes, 21, 2, true);
        this.g = kb.f(obtainStyledAttributes, 30, 5, true);
        this.t = kb.f(obtainStyledAttributes, 29, 1, true);
        this.i = kb.h(obtainStyledAttributes, 19, 10);
        this.F = kb.f(obtainStyledAttributes, 16, 16, this.g);
        this.G = kb.f(obtainStyledAttributes, 17, 17, this.g);
        if (obtainStyledAttributes.hasValue(18)) {
            this.u = f(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.u = f(obtainStyledAttributes, 11);
        }
        this.x = kb.f(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.H = hasValue;
        if (hasValue) {
            this.I = kb.f(obtainStyledAttributes, 32, 14, true);
        }
        this.J = kb.f(obtainStyledAttributes, 24, 15, false);
        this.v = kb.f(obtainStyledAttributes, 25, 25, true);
        this.w = kb.f(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }
}
