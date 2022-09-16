package defpackage;

import java.security.SecureRandom;
/* compiled from: PG */
/* renamed from: anul  reason: default package */
/* loaded from: classes.dex */
final class anul extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
