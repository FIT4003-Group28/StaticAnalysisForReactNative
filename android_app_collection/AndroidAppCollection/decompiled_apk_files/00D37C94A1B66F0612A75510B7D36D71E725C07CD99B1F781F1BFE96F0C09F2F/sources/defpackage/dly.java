package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dly  reason: default package */
/* loaded from: classes3.dex */
public final class dly extends ddl {
    @dfs(a = 3)
    int a;
    @dfs(a = 13)
    AtomicReference b;
    @dfs(a = 13)
    AtomicReference c;

    @Override // defpackage.ddl
    public final void a(ddk ddkVar) {
        Object[] objArr = ddkVar.b;
        if (ddkVar.a != 0) {
            return;
        }
        dcz dczVar = new dcz();
        dczVar.a = Integer.valueOf(this.a);
        dmd.c(dczVar);
        this.a = ((Integer) dczVar.a).intValue();
    }
}
