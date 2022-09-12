package defpackage;

import android.content.Context;
import java.io.File;
import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: coav  reason: default package */
/* loaded from: classes5.dex */
public final class coav {
    public static final coap<coau, Class<?>> a = new coap<>();
    public final Context b;
    public final coar c;
    public final coai d;
    private final coan e;

    public coav(Context context, coar coarVar, coan coanVar, coai coaiVar) {
        this.b = context;
        this.c = coarVar;
        this.e = coanVar;
        this.d = coaiVar;
    }

    public final boolean a(File file) {
        try {
            return this.e.a(file);
        } catch (GeneralSecurityException unused) {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 37);
            sb.append("APK at ");
            sb.append(absolutePath);
            sb.append(" failed signature verification");
            sb.toString();
            return false;
        }
    }
}
