package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: fid  reason: default package */
/* loaded from: classes3.dex */
final class fid extends ddl {
    @dfs(a = 13)
    fio a;
    @dfs(a = 13)
    AtomicBoolean b;
    @dfs(a = 13)
    fij c;

    @Override // defpackage.ddl
    public final void a(ddk ddkVar) {
        Object[] objArr = ddkVar.b;
        if (ddkVar.a != 0) {
            return;
        }
        dcz dczVar = new dcz();
        dczVar.a = this.b;
        dczVar.a = (AtomicBoolean) objArr[0];
        this.b = (AtomicBoolean) dczVar.a;
    }
}
