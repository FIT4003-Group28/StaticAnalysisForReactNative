package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: cwnt  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwnt implements dbrn {
    static final dbrn a = new cwnt();

    private cwnt() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        InputStream inputStream = (InputStream) obj;
        int i = cwnw.a;
        if (inputStream == null) {
            return null;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
        return decodeStream;
    }
}
