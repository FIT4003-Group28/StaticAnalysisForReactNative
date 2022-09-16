package defpackage;
/* compiled from: PG */
/* renamed from: dbdu  reason: default package */
/* loaded from: classes5.dex */
public final class dbdu {
    private final dbeb a;
    private final dbeb b;

    public dbdu() {
        this.a = new dbeb();
        this.b = dbeb.n();
    }

    public final dbeb a() {
        return new dbeb(this.a);
    }

    public final dbeb b() {
        return new dbeb(this.b);
    }

    public final dbeb c(float f) {
        return dbeb.g(this.a, this.b.f(f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
        sb.append("[Origin:");
        sb.append(valueOf);
        sb.append(", Direction:");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    public dbdu(dbeb dbebVar, dbeb dbebVar2) {
        dbeb dbebVar3 = new dbeb();
        this.a = dbebVar3;
        dbeb n = dbeb.n();
        this.b = n;
        dbebVar3.a(dbebVar);
        n.a(dbebVar2.e());
    }
}
