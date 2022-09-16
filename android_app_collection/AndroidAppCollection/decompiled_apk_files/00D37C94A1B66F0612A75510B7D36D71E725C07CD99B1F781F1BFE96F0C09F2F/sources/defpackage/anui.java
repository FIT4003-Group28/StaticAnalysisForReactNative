package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
/* compiled from: PG */
/* renamed from: anui  reason: default package */
/* loaded from: classes.dex */
final class anui extends ThreadLocal {
    final /* synthetic */ anuj a;

    public anui(anuj anujVar) {
        this.a = anujVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) anub.b.a(this.a.a);
            mac.init(this.a.b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
