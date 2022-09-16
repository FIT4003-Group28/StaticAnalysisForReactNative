package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: cxoq  reason: default package */
/* loaded from: classes5.dex */
public final class cxoq {
    public static String a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return b(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    public static String b(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }
}
