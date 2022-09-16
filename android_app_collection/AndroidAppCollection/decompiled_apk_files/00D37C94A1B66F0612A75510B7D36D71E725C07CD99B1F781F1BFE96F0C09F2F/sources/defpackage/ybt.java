package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ybt  reason: default package */
/* loaded from: classes4.dex */
final class ybt implements wbi, ydp {
    final aafo a;
    final apzg b;
    private final ybm c;

    public ybt(aafo aafoVar, apzg apzgVar, ybm ybmVar) {
        this.a = aafoVar;
        this.b = apzgVar;
        this.c = ybmVar;
    }

    @Override // defpackage.wbi
    public final void a() {
        ybm ybmVar = this.c;
        if (ybmVar != null) {
            ybmVar.b();
        }
    }

    @Override // defpackage.wbi
    public final void b() {
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("PostTransactionCallback", this);
            this.a.c(this.b, hashMap);
        }
    }

    @Override // defpackage.ydp
    public final void h() {
    }

    @Override // defpackage.ydp
    public final void mE() {
        ybm ybmVar = this.c;
        if (ybmVar != null) {
            ybmVar.c(null);
        }
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        ybm ybmVar = this.c;
        if (ybmVar != null) {
            ybmVar.e(ashnVar);
        }
    }
}
