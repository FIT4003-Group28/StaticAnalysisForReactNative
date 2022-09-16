package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: amlg  reason: default package */
/* loaded from: classes.dex */
final class amlg extends amkk {
    public static final UUID c = UUID.randomUUID();

    private amlg(amlg amlgVar, String str, amlt amltVar) {
        super(str, amlgVar, amltVar);
    }

    @Override // defpackage.amlv
    public final amlv f(String str, amlt amltVar) {
        return new amlg(this, str, amltVar);
    }

    @Override // defpackage.amlv
    public final void g(boolean z) {
    }

    public amlg(String str, UUID uuid, amlt amltVar) {
        super(str, uuid, amltVar);
    }
}
