package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: viq  reason: default package */
/* loaded from: classes7.dex */
public final class viq extends cqiw<zez> {
    public static final cqjb<zey, Integer> a = new vio();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zez zezVar, Context context, cqiv cqivVar) {
        for (zey zeyVar : zezVar.a()) {
            dqvj c = zeyVar.c();
            dqvj dqvjVar = dqvj.DRIVE;
            int ordinal = c.ordinal();
            cqivVar.a(new vip(cjtd.a(ordinal != 1 ? ordinal != 2 ? dtya.eX : dtya.eY : dtya.eW)), zeyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zez> a() {
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.ck(C()));
    }
}
