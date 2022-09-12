package defpackage;
/* compiled from: PG */
/* renamed from: ahqe  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahqe {
    public final long a;

    public ahqe(long j) {
        this.a = j;
    }

    public boolean a() {
        return false;
    }

    public akra b() {
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("getPositionMean() is not supported by ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }

    public abstract void c(ahqb ahqbVar);

    public abstract void d(ddrh ddrhVar);

    public String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(40);
        sb.append("Observation{timeMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
