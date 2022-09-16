package defpackage;
/* compiled from: PG */
/* renamed from: amet  reason: default package */
/* loaded from: classes.dex */
public final class amet implements aniq {
    final /* synthetic */ aniq a;
    final /* synthetic */ ankt b;

    public amet(aniq aniqVar, ankt anktVar) {
        this.a = aniqVar;
        this.b = anktVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        return this.a.a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(", input=[");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
