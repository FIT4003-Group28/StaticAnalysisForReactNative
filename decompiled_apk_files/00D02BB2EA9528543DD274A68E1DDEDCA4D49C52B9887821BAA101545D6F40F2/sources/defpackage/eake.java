package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: eake  reason: default package */
/* loaded from: classes6.dex */
public final class eake implements eakg {
    final /* synthetic */ ParcelFileDescriptor a;

    public eake(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.eakg
    public final FileChannel a() {
        if (this.a.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(this.a).getChannel();
        }
        this.a.close();
        throw new IllegalArgumentException("Not a file: " + this.a);
    }
}
