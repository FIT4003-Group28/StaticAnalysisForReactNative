package defpackage;

import java.io.InputStream;
import java.security.PrivilegedAction;
/* compiled from: PG */
/* renamed from: ci  reason: default package */
/* loaded from: classes4.dex */
final class ci implements PrivilegedAction<InputStream> {
    final /* synthetic */ Class a;
    final /* synthetic */ String b = "/android/icumessageformat/ICUConfig.properties";

    public ci(Class cls) {
        this.a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ InputStream run() {
        return this.a.getResourceAsStream(this.b);
    }
}
