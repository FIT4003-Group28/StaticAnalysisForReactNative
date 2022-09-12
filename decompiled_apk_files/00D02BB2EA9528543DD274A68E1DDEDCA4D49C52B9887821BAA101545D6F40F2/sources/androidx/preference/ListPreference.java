package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ListPreference extends DialogPreference {
    private String D;
    private boolean E;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context) {
        this(context, null);
    }

    public final void Rj(String str) {
        boolean z = !TextUtils.equals(this.i, str);
        if (z || !this.E) {
            this.i = str;
            this.E = true;
            ad(str);
            if (!z) {
                return;
            }
            d();
        }
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Object obj) {
        Rj(V((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable i() {
        Parcelable i = super.i();
        if (this.t) {
            return i;
        }
        SavedState savedState = new SavedState(i);
        savedState.a = this.i;
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
        Rj(savedState.a);
    }

    @Override // androidx.preference.Preference
    public final void k(CharSequence charSequence) {
        super.k(charSequence);
        if (charSequence == null) {
            this.D = null;
        } else {
            this.D = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence l() {
        aue aueVar = this.C;
        if (aueVar != null) {
            return aueVar.a(this);
        }
        CharSequence n = n();
        CharSequence l = super.l();
        String str = this.D;
        if (str == null) {
            return l;
        }
        Object[] objArr = new Object[1];
        if (n == null) {
            n = "";
        }
        objArr[0] = n;
        String format = String.format(str, objArr);
        return TextUtils.equals(format, l) ? l : format;
    }

    public final CharSequence n() {
        CharSequence[] charSequenceArr;
        int o = o(this.i);
        if (o < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[o];
    }

    public final int o(String str) {
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

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new atr();
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
        this(context, attributeSet, kb.k(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avf.e, i, i2);
        this.g = kb.j(obtainStyledAttributes, 2, 0);
        this.h = kb.j(obtainStyledAttributes, 3, 1);
        if (kb.f(obtainStyledAttributes, 4, 4, false)) {
            if (ats.a == null) {
                ats.a = new ats();
            }
            H(ats.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, avf.g, i, i2);
        this.D = kb.h(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
