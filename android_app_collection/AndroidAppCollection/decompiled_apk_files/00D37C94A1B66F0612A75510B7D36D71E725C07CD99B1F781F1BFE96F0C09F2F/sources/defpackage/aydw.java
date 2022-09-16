package defpackage;
/* compiled from: PG */
/* renamed from: aydw  reason: default package */
/* loaded from: classes2.dex */
public final class aydw {
    public final ayab a;
    public ayai b;
    public ayaj c;
    final /* synthetic */ ayeb d;

    public aydw(ayeb ayebVar, ayab ayabVar) {
        this.d = ayebVar;
        this.a = ayabVar;
        ayaj a = ayebVar.a.a(ayebVar.b);
        this.c = a;
        if (a != null) {
            this.b = a.a(ayabVar);
            return;
        }
        String str = ayebVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 182);
        sb.append("Could not find policy '");
        sb.append(str);
        sb.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(sb.toString());
    }
}
