package defpackage;

import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import java.util.concurrent.Callable;
/* renamed from: ctub  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctub implements Callable {
    static final Callable a = new ctub();

    private ctub() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        return keyPairGenerator.generateKeyPair();
    }
}
