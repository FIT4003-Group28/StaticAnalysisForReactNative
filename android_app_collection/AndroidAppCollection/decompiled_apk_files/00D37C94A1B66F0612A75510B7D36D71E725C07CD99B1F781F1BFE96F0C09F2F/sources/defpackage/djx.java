package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: djx  reason: default package */
/* loaded from: classes3.dex */
public final class djx extends ddl {
    @dfs(a = 3)
    int a;

    @Override // defpackage.ddl
    public final void a(ddk ddkVar) {
        Object[] objArr = ddkVar.b;
        if (ddkVar.a != 0) {
            return;
        }
        dcz dczVar = new dcz();
        dczVar.a = Integer.valueOf(this.a);
        dli.d(((Integer) objArr[0]).intValue(), dczVar);
        this.a = ((Integer) dczVar.a).intValue();
    }
}
