package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cowg  reason: default package */
/* loaded from: classes5.dex */
final class cowg implements coul {
    private final Status a;
    private final ParcelFileDescriptor b;
    private final int c;
    private final int d;

    public cowg(Status status, ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        this.a = status;
        this.b = parcelFileDescriptor;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.cnoj
    public final void b() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.coul
    public final ParcelFileDescriptor c() {
        return this.b;
    }

    @Override // defpackage.coul
    public final int d() {
        return this.c;
    }

    @Override // defpackage.coul
    public final int e() {
        return this.d;
    }
}
