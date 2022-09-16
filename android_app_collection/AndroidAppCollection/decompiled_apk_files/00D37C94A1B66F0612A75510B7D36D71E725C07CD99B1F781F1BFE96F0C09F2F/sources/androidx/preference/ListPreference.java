package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String G;
    private boolean H;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context) {
        this(context, null);
    }

    public void e(CharSequence[] charSequenceArr) {
        this.g = charSequenceArr;
    }

    public void f(int i) {
        CharSequence[] charSequenceArr = this.h;
        if (charSequenceArr != null) {
            o(charSequenceArr[i].toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.g(savedState.getSuperState());
        o(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        o(s((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable jO() {
        Parcelable jO = super.jO();
        if (this.w) {
            return jO;
        }
        SavedState savedState = new SavedState(jO);
        savedState.a = this.i;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected Object jP(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int k = k(this.i);
        if (k < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[k];
    }

    @Override // androidx.preference.Preference
    public CharSequence m() {
        bji bjiVar = this.F;
        if (bjiVar != null) {
            return bjiVar.a(this);
        }
        CharSequence l = l();
        CharSequence m = super.m();
        String str = this.G;
        if (str == null) {
            return m;
        }
        Object[] objArr = new Object[1];
        if (l == null) {
            l = "";
        }
        objArr[0] = l;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, m)) {
            return m;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.G = null;
        } else {
            this.G = charSequence.toString();
        }
    }

    public void o(String str) {
        boolean z = !TextUtils.equals(this.i, str);
        if (z || !this.H) {
            this.i = str;
            this.H = true;
            Y(str);
            if (!z) {
                return;
            }
            d();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asq(3);
        String a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ft.d(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkf.e, i, i2);
        this.g = ft.m(obtainStyledAttributes, 2, 0);
        this.h = ft.m(obtainStyledAttributes, 3, 1);
        if (ft.k(obtainStyledAttributes, 4, 4, false)) {
            if (biy.a == null) {
                biy.a = new biy();
            }
            K(biy.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bkf.g, i, i2);
        this.G = ft.j(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
