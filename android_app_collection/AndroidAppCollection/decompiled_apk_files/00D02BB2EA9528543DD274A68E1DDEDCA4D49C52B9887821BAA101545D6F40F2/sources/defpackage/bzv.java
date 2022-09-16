package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
/* compiled from: PG */
/* renamed from: bzv  reason: default package */
/* loaded from: classes.dex */
final class bzv implements bzy<ParcelFileDescriptor> {
    @Override // defpackage.bzy
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.bzy
    public final /* bridge */ /* synthetic */ void b(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // defpackage.bzy
    public final /* bridge */ /* synthetic */ ParcelFileDescriptor c(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
