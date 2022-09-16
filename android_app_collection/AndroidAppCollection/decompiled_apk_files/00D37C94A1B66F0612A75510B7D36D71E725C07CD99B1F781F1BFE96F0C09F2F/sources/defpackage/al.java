package defpackage;

import java.security.PrivilegedAction;
/* compiled from: PG */
/* renamed from: al  reason: default package */
/* loaded from: classes.dex */
final class al implements PrivilegedAction {
    final /* synthetic */ String a = "android.icumessageformat.text.MessagePattern.ApostropheMode";

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return System.getProperty(this.a);
    }
}
