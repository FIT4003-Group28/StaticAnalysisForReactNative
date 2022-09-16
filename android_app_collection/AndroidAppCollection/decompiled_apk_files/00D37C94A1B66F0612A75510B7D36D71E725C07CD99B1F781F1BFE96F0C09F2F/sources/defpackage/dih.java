package defpackage;
/* compiled from: PG */
/* renamed from: dih  reason: default package */
/* loaded from: classes3.dex */
final class dih extends ddl {
    @dfs(a = 13)
    dit a;
    @dfs(a = 3)
    boolean b;
    @dfs(a = 13)
    dik c;
    @dfs(a = 13)
    dhv d;
    @dfs(a = 13)
    djo e;
    @dfs(a = 13)
    dle f;
    @dfs(a = 13)
    xz g;
    @dfs(a = 13)
    dgz h;

    @Override // defpackage.ddl
    public final void a(ddk ddkVar) {
        Object[] objArr = ddkVar.b;
        int i = ddkVar.a;
        if (i == Integer.MIN_VALUE) {
            this.b = ((Boolean) objArr[0]).booleanValue();
        } else if (i != 0) {
        } else {
            dcz dczVar = new dcz();
            dczVar.a = this.c;
            dim.a(dczVar, (dik) objArr[0]);
            this.c = (dik) dczVar.a;
        }
    }
}
