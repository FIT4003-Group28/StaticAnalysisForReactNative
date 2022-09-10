package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: hur  reason: default package */
/* loaded from: classes.dex */
public final class hur implements ckcx {
    final /* synthetic */ Map.Entry a;

    public hur(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        hus husVar = hus.PORTRAIT_NO_NAV;
        int i = ((hus) this.a.getKey()).f;
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar = (ddyq) ddyfVar.b;
        int i2 = i - 1;
        ddyq ddyqVar2 = ddyq.K;
        if (i != 0) {
            ddyqVar.i = i2;
            ddyqVar.a |= 2048;
            boolean z = ((hus) this.a.getKey()).e;
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar3 = (ddyq) ddyfVar.b;
            ddyqVar3.a |= 4096;
            ddyqVar3.j = z;
            return;
        }
        throw null;
    }
}
