package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag(ave aveVar) {
        ah(aveVar.C(16908304));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ah(View view) {
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        int i = 0;
        if (this.a && !TextUtils.isEmpty(this.c)) {
            textView.setText(this.c);
        } else if (this.a || TextUtils.isEmpty(this.d)) {
            CharSequence l = l();
            if (!TextUtils.isEmpty(l)) {
                textView.setText(l);
            } else {
                i = 8;
            }
        } else {
            textView.setText(this.d);
        }
        if (i == textView.getVisibility()) {
            return;
        }
        textView.setVisibility(i);
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        boolean z = !this.a;
        if (I(Boolean.valueOf(z))) {
            m(z);
        }
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected final void g(Object obj) {
        if (obj == null) {
            obj = false;
        }
        m(Y(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean h() {
        if (this.b) {
            if (this.a) {
                return true;
            }
        } else if (!this.a) {
            return true;
        }
        return super.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable i() {
        Parcelable i = super.i();
        if (this.t) {
            return i;
        }
        SavedState savedState = new SavedState(i);
        savedState.a = this.a;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void j(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.j(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.j(savedState.getSuperState());
        m(savedState.a);
    }

    public final void m(boolean z) {
        boolean z2 = this.a;
        if (z2 != z || !this.e) {
            this.a = z;
            this.e = true;
            if (F() && z != Y(!z)) {
                auf p = p();
                if (p != null) {
                    p.d(this.q, z);
                } else {
                    SharedPreferences.Editor g = this.k.g();
                    g.putBoolean(this.q, z);
                    super.U(g);
                }
            }
            if (z2 == z) {
                return;
            }
            T(h());
            d();
        }
    }

    public final void n(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    public final void o(CharSequence charSequence) {
        this.d = charSequence;
        if (!this.a) {
            d();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new avl();
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 1 ? false : true;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
