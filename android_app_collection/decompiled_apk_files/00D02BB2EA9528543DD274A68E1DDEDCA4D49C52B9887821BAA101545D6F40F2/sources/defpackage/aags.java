package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aags  reason: default package */
/* loaded from: classes2.dex */
final class aags implements egd {
    final /* synthetic */ aagx a;

    public aags(aagx aagxVar) {
        this.a = aagxVar;
    }

    @Override // defpackage.egd
    public final int a() {
        View a;
        aagx aagxVar = this.a;
        cqkf<aazo> cqkfVar = aagxVar.ao;
        if (cqkfVar != null) {
            if (!aagxVar.av || (a = cqhu.a(cqkfVar.c(), aawi.a)) == null) {
                View a2 = cqhu.a(this.a.ao.c(), aawi.b);
                if (a2 == null) {
                    return 0;
                }
                return a2.getHeight();
            }
            return a.getHeight();
        }
        return 0;
    }
}
