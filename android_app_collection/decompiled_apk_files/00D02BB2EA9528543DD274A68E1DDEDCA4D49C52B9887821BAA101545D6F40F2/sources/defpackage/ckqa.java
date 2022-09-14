package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.StringWriter;
/* compiled from: PG */
/* renamed from: ckqa  reason: default package */
/* loaded from: classes4.dex */
public final class ckqa {
    public static String a(Bitmap bitmap) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("data:image/png;base64,");
        ddac ddacVar = new ddac((ddad) ddae.d, stringWriter);
        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, ddacVar)) {
            try {
                ddacVar.close();
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
        return "";
    }
}
