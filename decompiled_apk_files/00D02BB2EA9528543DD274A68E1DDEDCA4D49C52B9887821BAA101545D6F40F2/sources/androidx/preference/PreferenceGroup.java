package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {
    public final aim<String, Long> a;
    public List<Preference> b;
    public boolean c;
    public int d;
    private final Handler e;
    private int f;
    private boolean g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void al(Preference preference) {
        synchronized (this) {
            super.R();
            if (preference.B == this) {
                preference.N(null);
            }
            if (this.b.remove(preference)) {
                String str = preference.q;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.Ng()));
                    this.e.removeCallbacks(this.h);
                    this.e.post(this.h);
                }
                if (this.g) {
                    preference.P();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void O() {
        super.Q();
        this.g = true;
        int n = n();
        for (int i = 0; i < n; i++) {
            o(i).O();
        }
    }

    @Override // androidx.preference.Preference
    public final void P() {
        R();
        this.g = false;
        int n = n();
        for (int i = 0; i < n; i++) {
            o(i).P();
        }
    }

    @Override // androidx.preference.Preference
    public final void T(boolean z) {
        super.T(z);
        int n = n();
        for (int i = 0; i < n; i++) {
            o(i).ac(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void Z(Bundle bundle) {
        super.Z(bundle);
        int n = n();
        for (int i = 0; i < n; i++) {
            o(i).Z(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void aa(Bundle bundle) {
        super.aa(bundle);
        int n = n();
        for (int i = 0; i < n; i++) {
            o(i).aa(bundle);
        }
    }

    public final void ag() {
        synchronized (this) {
            List<Preference> list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    al(list.get(0));
                }
            }
        }
        L();
    }

    public final <T extends Preference> T ah(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.q, charSequence)) {
            return this;
        }
        int n = n();
        for (int i = 0; i < n; i++) {
            T t2 = (T) o(i);
            if (TextUtils.equals(t2.q, charSequence)) {
                return t2;
            }
            if ((t2 instanceof PreferenceGroup) && (t = (T) ((PreferenceGroup) t2).ah(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    public boolean ai() {
        return true;
    }

    public final void aj(Preference preference) {
        long c;
        if (!this.b.contains(preference)) {
            if (preference.q != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.B;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.q;
                if (preferenceGroup.ah(str) != null) {
                    String str2 = "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.";
                }
            }
            if (preference.p == Integer.MAX_VALUE) {
                if (this.c) {
                    int i = this.f;
                    this.f = i + 1;
                    preference.r(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).c = this.c;
                }
            }
            int binarySearch = Collections.binarySearch(this.b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.ac(h());
            synchronized (this) {
                this.b.add(binarySearch, preference);
            }
            avb avbVar = this.k;
            String str3 = preference.q;
            if (str3 == null || !this.a.containsKey(str3)) {
                c = avbVar.c();
            } else {
                c = this.a.get(str3).longValue();
                this.a.remove(str3);
            }
            preference.l = c;
            preference.m = true;
            try {
                preference.M(avbVar);
                preference.m = false;
                preference.N(this);
                if (this.g) {
                    preference.O();
                }
                L();
            } catch (Throwable th) {
                preference.m = false;
                throw th;
            }
        }
    }

    public final void ak(Preference preference) {
        al(preference);
        L();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable i() {
        return new SavedState(super.i(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void j(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.j(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.d = savedState.a;
        super.j(savedState.getSuperState());
    }

    public final void m(int i) {
        if (i != Integer.MAX_VALUE && !E()) {
            String str = getClass().getSimpleName() + " should have a key defined if it contains an expandable preference";
        }
        this.d = i;
    }

    public final int n() {
        return this.b.size();
    }

    public final Preference o(int i) {
        return this.b.get(i);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new aus();
        int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, 0);
        this.a = new aim<>();
        this.e = new Handler();
        this.c = true;
        this.f = 0;
        this.g = false;
        this.d = Integer.MAX_VALUE;
        this.h = new auq(this);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avf.i, i, 0);
        this.c = kb.f(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            m(kb.l(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }
}
