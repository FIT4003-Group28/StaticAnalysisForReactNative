package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: afxh  reason: default package */
/* loaded from: classes.dex */
public class afxh extends afxb {
    private final ContentResolver a;

    public afxh(ContentResolver contentResolver, afyf afyfVar) {
        super(afyfVar);
        this.a = contentResolver;
    }

    private static final void d(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.afxb
    public String b() {
        return "content";
    }

    @Override // defpackage.afxb
    public final void c(Uri uri, yiw yiwVar) {
        InputStream inputStream = null;
        try {
            inputStream = this.a.openInputStream(uri);
            byte[] bArr = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    yiwVar.b(uri, byteArrayOutputStream.toByteArray());
                    return;
                }
            }
        } catch (IOException e) {
            yiwVar.a(uri, e);
        } finally {
            d(inputStream);
        }
    }
}
