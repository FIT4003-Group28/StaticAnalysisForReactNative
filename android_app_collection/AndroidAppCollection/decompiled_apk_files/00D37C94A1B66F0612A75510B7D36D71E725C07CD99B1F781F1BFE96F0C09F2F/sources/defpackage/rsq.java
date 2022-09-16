package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: rsq  reason: default package */
/* loaded from: classes4.dex */
public final class rsq extends rsl {
    private final qtu a;

    public rsq(qtu qtuVar) {
        this.a = qtuVar;
    }

    @Override // defpackage.rsl
    public final void b(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status n = rst.n(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.d(new rss(n, parcelFileDescriptor));
    }
}
