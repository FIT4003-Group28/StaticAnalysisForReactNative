package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;
/* compiled from: PG */
/* renamed from: buy  reason: default package */
/* loaded from: classes.dex */
public final class buy implements bul<ParcelFileDescriptor> {
    private final ParcelFileDescriptorRewinder$InternalRewinder a;

    public buy(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.bul
    public final void b() {
    }

    @Override // defpackage.bul
    /* renamed from: c */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }
}
