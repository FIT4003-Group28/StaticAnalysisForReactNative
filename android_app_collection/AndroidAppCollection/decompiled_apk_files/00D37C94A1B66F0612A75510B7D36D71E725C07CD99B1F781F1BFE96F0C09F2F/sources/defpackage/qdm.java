package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qdm  reason: default package */
/* loaded from: classes4.dex */
public final class qdm extends dvd implements qdn {
    private final Drawable a;
    private final Uri b;
    private final double c;
    private final int d;
    private final int e;

    public qdm(Drawable drawable, Uri uri, double d, int i, int i2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.a = drawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.qdn
    public final double a() {
        return this.c;
    }

    @Override // defpackage.qdn
    public final int f() {
        return this.e;
    }

    @Override // defpackage.qdn
    public final int g() {
        return this.d;
    }

    @Override // defpackage.qdn
    public final Uri h() {
        return this.b;
    }

    @Override // defpackage.qdn
    public final rad i() {
        return rac.a(this.a);
    }

    public qdm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            rad i3 = i();
            parcel2.writeNoException();
            dve.i(parcel2, i3);
        } else if (i == 2) {
            Uri uri = this.b;
            parcel2.writeNoException();
            dve.h(parcel2, uri);
        } else if (i == 3) {
            double d = this.c;
            parcel2.writeNoException();
            parcel2.writeDouble(d);
        } else if (i == 4) {
            int i4 = this.d;
            parcel2.writeNoException();
            parcel2.writeInt(i4);
        } else if (i != 5) {
            return false;
        } else {
            int i5 = this.e;
            parcel2.writeNoException();
            parcel2.writeInt(i5);
        }
        return true;
    }
}
