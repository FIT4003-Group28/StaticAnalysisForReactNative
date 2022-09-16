package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;
/* compiled from: PG */
/* renamed from: ciz  reason: default package */
/* loaded from: classes2.dex */
public final class ciz implements cin {
    private final ParcelFileDescriptorRewinder$InternalRewinder a;

    public ciz(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.cin
    public final void b() {
    }

    @Override // defpackage.cin
    /* renamed from: c */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }
}
