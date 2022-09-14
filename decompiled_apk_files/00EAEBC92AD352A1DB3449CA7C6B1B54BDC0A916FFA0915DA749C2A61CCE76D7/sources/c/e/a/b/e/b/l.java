package c.e.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
/* loaded from: classes.dex */
public final class l extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: b  reason: collision with root package name */
    private final int f4582b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.common.b f4583c;

    /* renamed from: d  reason: collision with root package name */
    private final u f4584d;

    public l(int i) {
        this(new com.google.android.gms.common.b(8, null), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i, com.google.android.gms.common.b bVar, u uVar) {
        this.f4582b = i;
        this.f4583c = bVar;
        this.f4584d = uVar;
    }

    private l(com.google.android.gms.common.b bVar, u uVar) {
        this(1, bVar, null);
    }

    public final com.google.android.gms.common.b q() {
        return this.f4583c;
    }

    public final u r() {
        return this.f4584d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4582b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f4583c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) this.f4584d, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
