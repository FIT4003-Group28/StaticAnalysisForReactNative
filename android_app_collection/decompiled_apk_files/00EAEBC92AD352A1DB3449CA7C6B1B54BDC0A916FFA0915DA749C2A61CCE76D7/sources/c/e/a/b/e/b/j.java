package c.e.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
/* loaded from: classes.dex */
public final class j extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: b  reason: collision with root package name */
    private final int f4580b;

    /* renamed from: c  reason: collision with root package name */
    private final t f4581c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i, t tVar) {
        this.f4580b = i;
        this.f4581c = tVar;
    }

    public j(t tVar) {
        this(1, tVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4580b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f4581c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
