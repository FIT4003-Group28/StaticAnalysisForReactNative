package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cowe  reason: default package */
/* loaded from: classes5.dex */
public final class cowe extends covv {
    private final cnph<coul> a;

    public cowe(cnph<coul> cnphVar) {
        this.a = cnphVar;
    }

    @Override // defpackage.covv, defpackage.covx
    public final void c(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        int i2;
        Status R = cowh.R(i, bundle);
        int i3 = 0;
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            i3 = bundle2.getInt("width");
            i2 = bundle2.getInt("height");
        } else {
            i2 = 0;
        }
        this.a.c(new cowg(R, parcelFileDescriptor, i3, i2));
    }
}
