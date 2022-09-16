package defpackage;

import java.security.PrivilegedAction;
/* compiled from: PG */
/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
final class an implements PrivilegedAction {
    final /* synthetic */ Class a;
    final /* synthetic */ String b = "/android/icumessageformat/ICUConfig.properties";

    public an(Class cls) {
        this.a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return this.a.getResourceAsStream(this.b);
    }
}
