package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aorj  reason: default package */
/* loaded from: classes2.dex */
public final class aorj extends cqiw<aork> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aork aorkVar, Context context, cqiv cqivVar) {
        aork aorkVar2 = aorkVar;
        aorf a2 = aorkVar2.a();
        if (a2 == null) {
            cqivVar.a(new aori(), aorkVar2);
        } else {
            cqivVar.a(new aore(), a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aork> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.B(aorh.a), cqgr.ck(C()));
    }
}
