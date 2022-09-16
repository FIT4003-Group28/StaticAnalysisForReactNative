package defpackage;
/* compiled from: PG */
/* renamed from: swj  reason: default package */
/* loaded from: classes4.dex */
final class swj extends ddl {
    @dfs(a = 13)
    Boolean a;

    @Override // defpackage.ddl
    public final void a(ddk ddkVar) {
        Object[] objArr = ddkVar.b;
        if (ddkVar.a != 0) {
            return;
        }
        dcz dczVar = new dcz();
        dczVar.a = this.a;
        Boolean bool = (Boolean) dczVar.a;
        boolean z = false;
        if (bool != null && !bool.booleanValue()) {
            z = true;
        }
        dczVar.a = Boolean.valueOf(z);
        this.a = (Boolean) dczVar.a;
    }
}
