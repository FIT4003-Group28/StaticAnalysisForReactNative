package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* compiled from: PG */
/* renamed from: anta  reason: default package */
/* loaded from: classes.dex */
final class anta extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) anub.a.a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
