package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
/* compiled from: PG */
/* renamed from: qzr  reason: default package */
/* loaded from: classes4.dex */
public final class qzr implements qzq {
    private final Context a;

    public qzr(Context context) {
        this.a = context;
    }

    @Override // defpackage.qzq
    public final boolean a(File file) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = "com.google.ccc.abuse.droidguard";
        try {
            X509Certificate[][] oF = ne.oF(file.getAbsolutePath());
            Signature[] signatureArr = new Signature[oF.length];
            for (int i = 0; i < oF.length; i++) {
                signatureArr[i] = new Signature(oF[i][0].getEncoded());
            }
            packageInfo.signatures = signatureArr;
            return qsf.b(this.a).e(packageInfo).b;
        } catch (cem e) {
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
