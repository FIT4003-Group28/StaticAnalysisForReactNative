package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afoo  reason: default package */
/* loaded from: classes.dex */
public final class afoo extends ddl {
    @dfs(a = 13)
    AtomicInteger a;
    @dfs(a = 13)
    AtomicBoolean b;
    @dfs(a = 13)
    AtomicBoolean c;
    @dfs(a = 13)
    AtomicInteger d;
    @dfs(a = 13)
    AtomicInteger e;

    @Override // defpackage.ddl
    public final void a(ddk ddkVar) {
        Object[] objArr = ddkVar.b;
        int i = ddkVar.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            dcz dczVar = new dcz();
            dczVar.a = this.a;
            afpe.e(dczVar);
            this.a = (AtomicInteger) dczVar.a;
            return;
        }
        dcz dczVar2 = new dcz();
        dczVar2.a = this.e;
        dcz dczVar3 = new dcz();
        dczVar3.a = this.d;
        afpe.f(dczVar2, dczVar3, ((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
        this.e = (AtomicInteger) dczVar2.a;
        this.d = (AtomicInteger) dczVar3.a;
    }
}
