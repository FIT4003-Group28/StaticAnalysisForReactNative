package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
/* compiled from: PG */
/* renamed from: wde  reason: default package */
/* loaded from: classes4.dex */
public final class wde implements wdc {
    private final Context a;
    private final FingerprintManager b;
    private final KeyguardManager c;
    private KeyStore d;
    private KeyGenerator e;
    private boolean f;
    private CancellationSignal g;

    public wde(Context context) {
        this.f = false;
        this.a = context;
        this.c = (KeyguardManager) context.getSystemService("keyguard");
        this.b = (FingerprintManager) context.getSystemService("fingerprint");
        if (h()) {
            try {
                e();
                f();
                this.f = true;
            } catch (wdb e) {
                zep.d("Error initializing YouTubeFingerprintManagerImpl.", e);
                this.f = false;
            }
        }
    }

    private final FingerprintManager.CryptoObject g() {
        Cipher d;
        try {
            try {
                d = d();
            } catch (KeyPermanentlyInvalidatedException unused) {
                this.d.deleteEntry("YouTubeFingerprintKey");
                f();
                d = d();
            }
            return new FingerprintManager.CryptoObject(d);
        } catch (KeyPermanentlyInvalidatedException | KeyStoreException e) {
            throw new wdb("Failed to recreate CryptoObject for fingerprint.", e);
        }
    }

    private final boolean h() {
        if (Build.VERSION.SDK_INT < 23) {
            zep.l("Fingerprint scanner not available on this device.");
            return false;
        } else if (this.a.checkCallingOrSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
            zep.l("Fingerprint permission denied.");
            return false;
        } else if (this.c == null) {
            zep.l("KEYGUARD_SERVICE not available.");
            return false;
        } else {
            FingerprintManager fingerprintManager = this.b;
            if (fingerprintManager != null) {
                try {
                    if (!fingerprintManager.isHardwareDetected()) {
                        zep.l("Fingerprint hardware not detected.");
                        return false;
                    } else if (!this.b.hasEnrolledFingerprints()) {
                        zep.l("Fingerprint hardware not enrolled.");
                        return false;
                    } else if (this.c.isKeyguardSecure()) {
                        return true;
                    } else {
                        zep.l("Fingerprint keyguard not secure.");
                        return false;
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                    zep.l("SecurityException when check fingerprint is available.");
                    return false;
                }
            }
            zep.l("FINGERPRINT_SERVICE not available.");
            return false;
        }
    }

    @Override // defpackage.wcy
    public final boolean a() {
        return h() && this.f;
    }

    @Override // defpackage.wdc
    public final void b(wda wdaVar) {
        if (!a()) {
            ((wbn) wdaVar).f();
            return;
        }
        this.g = new CancellationSignal();
        try {
            this.b.authenticate(g(), this.g, 0, new wdd(wdaVar), null);
        } catch (wdb unused) {
            ((wbn) wdaVar).f();
        }
    }

    @Override // defpackage.wdc
    public final void c() {
        CancellationSignal cancellationSignal = this.g;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.g = null;
        }
    }

    final Cipher d() {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) this.d.getKey("YouTubeFingerprintKey", null));
            return cipher;
        } catch (InvalidKeyException e) {
            if (e instanceof KeyPermanentlyInvalidatedException) {
                throw ((KeyPermanentlyInvalidatedException) e);
            }
            throw new wdb("Failed to generate Cipher for fingerprint.", e);
        } catch (KeyStoreException e2) {
            e = e2;
            throw new wdb("Failed to generate Cipher for fingerprint.", e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new wdb("Failed to generate Cipher for fingerprint.", e);
        } catch (UnrecoverableKeyException e4) {
            e = e4;
            throw new wdb("Failed to generate Cipher for fingerprint.", e);
        } catch (NoSuchPaddingException e5) {
            e = e5;
            throw new wdb("Failed to generate Cipher for fingerprint.", e);
        }
    }

    final void e() {
        try {
            this.d = KeyStore.getInstance("AndroidKeyStore");
            this.e = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        } catch (KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new wdb("Failed to initialize KeyStore and KeyGenerator", e);
        }
    }

    final void f() {
        try {
            this.d.load(null);
            this.e.init(new KeyGenParameterSpec.Builder("YouTubeFingerprintKey", 3).setBlockModes("CBC").setUserAuthenticationRequired(true).setEncryptionPaddings("PKCS7Padding").build());
            this.e.generateKey();
        } catch (IOException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | ProviderException | CertificateException e) {
            throw new wdb("Failed to generate key for fingerprint.", e);
        }
    }
}
