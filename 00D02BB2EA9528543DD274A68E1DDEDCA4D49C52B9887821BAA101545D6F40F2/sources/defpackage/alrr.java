package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alrr  reason: default package */
/* loaded from: classes.dex */
public final class alrr extends alrk {
    public alrr(alrv alrvVar, boolean z) {
        super(alrvVar, "GMM-Legend", 0, z);
    }

    @Override // defpackage.alrk, defpackage.akvx
    public final akuh a(long j) {
        synchronized (this.a) {
            Map<Long, alow> map = this.a;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                alow alowVar = this.a.get(valueOf);
                if (alowVar != null) {
                    return alowVar;
                }
                return alrv.c;
            } else if (this.e == null) {
                return alrv.c;
            } else {
                alow alowVar2 = new alow(this, j);
                this.a.put(valueOf, alowVar2);
                return alowVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alrk
    public final alxp i(long j) {
        alrv alrvVar = this.e;
        if (alrvVar != null) {
            return alrvVar.p(j);
        }
        return alxp.e;
    }
}
