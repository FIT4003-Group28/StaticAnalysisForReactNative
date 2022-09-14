package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import java.lang.reflect.Array;
/* compiled from: PG */
/* renamed from: cld  reason: default package */
/* loaded from: classes5.dex */
public final class cld<T extends AbstractBundleable> implements Parcelable.Creator<T> {
    private final Class<T> a;

    public cld(Class<T> cls) {
        this.a = cls;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        T t;
        try {
            t = this.a.newInstance();
        } catch (Exception unused) {
            t = null;
        }
        try {
            t.b(parcel.readBundle(this.a.getClassLoader()));
        } catch (Exception unused2) {
            if (String.valueOf(this.a.getSimpleName()).length() == 0) {
                new String("Failed to instantiate ");
            }
            return t;
        }
        return t;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (AbstractBundleable[]) Array.newInstance((Class<?>) this.a, i);
    }
}
