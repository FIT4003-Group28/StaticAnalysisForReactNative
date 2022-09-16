package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: rss  reason: default package */
/* loaded from: classes4.dex */
final class rss implements rsc {
    private final Status a;
    private final ParcelFileDescriptor b;

    public rss(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.qtb
    public final void b() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.rsc
    public final ParcelFileDescriptor c() {
        return this.b;
    }
}
