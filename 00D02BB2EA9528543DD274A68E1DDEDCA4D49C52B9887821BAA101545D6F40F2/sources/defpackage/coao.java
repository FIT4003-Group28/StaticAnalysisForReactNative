package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
/* compiled from: PG */
/* renamed from: coao  reason: default package */
/* loaded from: classes5.dex */
public final class coao implements coan {
    private final Context a;

    public coao(Context context) {
        this.a = context;
    }

    @Override // defpackage.coan
    public final boolean a(File file) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = "com.google.ccc.abuse.droidguard";
        try {
            X509Certificate[][] a = bqy.a(file.getAbsolutePath());
            Signature[] signatureArr = new Signature[a.length];
            for (int i = 0; i < a.length; i++) {
                signatureArr[i] = new Signature(a[i][0].getEncoded());
            }
            packageInfo.signatures = signatureArr;
            return cnnm.a(this.a).e(packageInfo).b;
        } catch (bqv e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
