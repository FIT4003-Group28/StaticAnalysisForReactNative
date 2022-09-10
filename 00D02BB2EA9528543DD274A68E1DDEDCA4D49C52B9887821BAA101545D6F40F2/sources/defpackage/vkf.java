package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vkf  reason: default package */
/* loaded from: classes7.dex */
public final class vkf extends cqiw<zdf> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zdf zdfVar, Context context, cqiv cqivVar) {
        zdf zdfVar2 = zdfVar;
        zdg a = zdfVar2.a();
        zdg b = zdfVar2.b();
        if (a.c().booleanValue() && b != null && b.d().booleanValue()) {
            cqivVar.a(new vgq(), a);
            cqivVar.a(new uoe(), zdfVar2.c());
            cqivVar.a(new uzv(), b);
        } else if (!a.c().booleanValue() || b == null || b.d().booleanValue()) {
            cqivVar.a(new uzv(), a);
            cqivVar.a(new vke(), zdfVar2);
        } else {
            cqivVar.a(new vgq(), a);
            cqivVar.a(new uoe(), zdfVar2.c());
            cqivVar.a(new vkd(), b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zdf> a() {
        return cqgr.gp(cqgr.ck(C()));
    }
}
