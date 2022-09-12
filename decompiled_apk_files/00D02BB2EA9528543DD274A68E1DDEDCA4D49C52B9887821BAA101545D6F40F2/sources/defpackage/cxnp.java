package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cxnp  reason: default package */
/* loaded from: classes5.dex */
public final class cxnp {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] c;

    static {
        boolean z = false;
        String[] strArr = new String[4];
        strArr[0] = "media";
        String str = "";
        strArr[1] = Build.VERSION.SDK_INT <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : str;
        strArr[2] = Build.VERSION.SDK_INT <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : str;
        if (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) {
            z = true;
        }
        if (true == z) {
            str = "com.google.android.apps.common.testing.services.storage.runfiles";
        }
        strArr[3] = str;
        c = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r0.b == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        if (r0.b != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019c, code lost:
        if (r15.startsWith(r2.getCanonicalPath()) != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0208 A[Catch: IOException -> 0x0242, FileNotFoundException -> 0x0251, TryCatch #3 {FileNotFoundException -> 0x0251, IOException -> 0x0242, blocks: (B:72:0x011a, B:75:0x0158, B:77:0x0164, B:79:0x016e, B:80:0x0171, B:78:0x0169, B:85:0x017a, B:125:0x020e, B:127:0x021a, B:129:0x0224, B:130:0x0227, B:128:0x021f, B:88:0x0184, B:90:0x018c, B:92:0x0194, B:121:0x0204, B:123:0x0208, B:98:0x01af, B:100:0x01b5, B:102:0x01bb, B:105:0x01c6, B:107:0x01d3, B:109:0x01d7, B:112:0x01e2, B:113:0x01e5, B:115:0x01f2, B:117:0x01f6, B:120:0x0201, B:95:0x01a0, B:131:0x0228, B:133:0x0234, B:135:0x023e, B:136:0x0241, B:134:0x0239), top: B:151:0x011a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream a(final android.content.Context r14, android.net.Uri r15) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxnp.a(android.content.Context, android.net.Uri):java.io.InputStream");
    }

    private static File[] b(Callable<File[]> callable) {
        try {
            return callable.call();
        } catch (NullPointerException e) {
            if (Build.VERSION.SDK_INT >= 22) {
                throw e;
            }
            return new File[0];
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            deki.a(fileNotFoundException, e);
        }
    }
}
