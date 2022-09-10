package defpackage;

import java.net.InetAddress;
/* compiled from: PG */
/* renamed from: dgwh  reason: default package */
/* loaded from: classes6.dex */
final class dgwh extends dgtl<InetAddress> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ InetAddress a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        return InetAddress.getByName(dgxeVar.h());
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, InetAddress inetAddress) {
        InetAddress inetAddress2 = inetAddress;
        dgxgVar.j(inetAddress2 == null ? null : inetAddress2.getHostAddress());
    }
}
