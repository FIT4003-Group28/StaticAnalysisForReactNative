package defpackage;
/* compiled from: PG */
/* renamed from: dykv  reason: default package */
/* loaded from: classes6.dex */
public final class dykv {
    public final dygx a;
    public dyhe b;
    public dyhf c;
    final /* synthetic */ dyla d;

    public dykv(dyla dylaVar, dygx dygxVar) {
        this.d = dylaVar;
        this.a = dygxVar;
        dyhf b = dylaVar.a.b(dylaVar.b);
        this.c = b;
        if (b != null) {
            this.b = b.a(dygxVar);
            return;
        }
        String str = dylaVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 182);
        sb.append("Could not find policy '");
        sb.append(str);
        sb.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(sb.toString());
    }
}
