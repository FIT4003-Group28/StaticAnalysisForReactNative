package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* renamed from: cwoo  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwoo implements dbrn {
    static final dbrn a = new cwoo();

    private cwoo() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i = cwoq.b;
        ParcelFileDescriptor c = ((coul) obj).c();
        if (c == null) {
            return null;
        }
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(c);
            Bitmap decodeStream = BitmapFactory.decodeStream(autoCloseInputStream);
            autoCloseInputStream.close();
            return decodeStream;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
