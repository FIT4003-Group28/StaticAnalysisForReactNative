package defpackage;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider;
/* compiled from: PG */
/* renamed from: ajiv  reason: default package */
/* loaded from: classes.dex */
final class ajiv extends PublicKeyVerifierProvider {
    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider
    public final PublicKeyVerifier createVerifier() {
        return new ajiu();
    }
}
