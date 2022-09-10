package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: dgwi  reason: default package */
/* loaded from: classes6.dex */
final class dgwi extends dgtl<UUID> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ UUID a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        return UUID.fromString(dgxeVar.h());
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, UUID uuid) {
        UUID uuid2 = uuid;
        dgxgVar.j(uuid2 == null ? null : uuid2.toString());
    }
}
