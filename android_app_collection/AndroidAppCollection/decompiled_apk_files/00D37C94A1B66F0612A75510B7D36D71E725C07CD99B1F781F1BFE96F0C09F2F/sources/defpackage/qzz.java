package defpackage;

import android.util.Log;
import java.io.File;
import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: qzz  reason: default package */
/* loaded from: classes4.dex */
public final class qzz {
    public static final qzs a = new qzs();

    public static final boolean a(File file, qzq qzqVar) {
        try {
            return qzqVar.a(file);
        } catch (GeneralSecurityException e) {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 37);
            sb.append("APK at ");
            sb.append(absolutePath);
            sb.append(" failed signature verification");
            Log.e("DG", sb.toString(), e);
            return false;
        }
    }
}
