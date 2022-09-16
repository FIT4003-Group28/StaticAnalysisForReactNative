package defpackage;
/* compiled from: PG */
/* renamed from: jno  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jno implements ayqb {
    public final /* synthetic */ jnp a;
    private final /* synthetic */ int b;

    public /* synthetic */ jno(jnp jnpVar, int i) {
        this.b = i;
        this.a = jnpVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            jnp jnpVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                jnpVar.a.d(jnp.d(2));
                return;
            } else {
                jnpVar.a.d(jnp.d(3));
                return;
            }
        }
        jnp jnpVar2 = this.a;
        Boolean bool = (Boolean) obj;
        jnpVar2.c();
        jnpVar2.b.g(jnpVar2);
    }
}
