package c.e.a.b.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.internal.x.a implements com.google.android.gms.common.api.k {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    private final int f4577b;

    /* renamed from: c  reason: collision with root package name */
    private int f4578c;

    /* renamed from: d  reason: collision with root package name */
    private Intent f4579d;

    public c() {
        this(0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i, int i2, Intent intent) {
        this.f4577b = i;
        this.f4578c = i2;
        this.f4579d = intent;
    }

    private c(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final Status n() {
        return this.f4578c == 0 ? Status.f6798f : Status.f6800h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4577b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f4578c);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) this.f4579d, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
