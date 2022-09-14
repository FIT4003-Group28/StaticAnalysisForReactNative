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
public class EditTextPreference extends DialogPreference {
    public String g;

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kb.k(context, R.attr.editTextPreferenceStyle, 16842898));
    }

    public final void e(String str) {
        boolean h = h();
        this.g = str;
        ad(str);
        boolean h2 = h();
        if (h2 != h) {
            T(h2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Object obj) {
        e(V((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean h() {
        return TextUtils.isEmpty(this.g) || super.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable i() {
        Parcelable i = super.i();
        if (this.t) {
            return i;
        }
        SavedState savedState = new SavedState(i);
        savedState.a = this.g;
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
        e(savedState.a);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new atn();
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

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avf.d, i, 0);
        if (kb.f(obtainStyledAttributes, 0, 0, false)) {
            if (ato.a == null) {
                ato.a = new ato();
            }
            H(ato.a);
        }
        obtainStyledAttributes.recycle();
    }
}
