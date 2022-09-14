package defpackage;

import java.security.PrivilegedAction;
/* compiled from: PG */
/* renamed from: cg  reason: default package */
/* loaded from: classes4.dex */
final class cg implements PrivilegedAction<String> {
    final /* synthetic */ String a = "android.icumessageformat.text.MessagePattern.ApostropheMode";

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ String run() {
        return System.getProperty(this.a);
    }
}
