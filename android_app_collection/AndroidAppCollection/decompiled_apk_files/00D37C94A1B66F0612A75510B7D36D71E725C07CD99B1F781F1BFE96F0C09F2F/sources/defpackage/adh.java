package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adh  reason: default package */
/* loaded from: classes.dex */
final class adh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.Builder a(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt b(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
