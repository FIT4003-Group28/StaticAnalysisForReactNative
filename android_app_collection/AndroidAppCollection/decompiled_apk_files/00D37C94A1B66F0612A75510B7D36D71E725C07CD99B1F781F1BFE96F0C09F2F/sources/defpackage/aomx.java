package defpackage;
/* compiled from: PG */
/* renamed from: aomx  reason: default package */
/* loaded from: classes.dex */
public final class aomx implements Comparable {
    public final aona a;
    public final aomz b;

    public aomx(aona aonaVar, aomz aomzVar) {
        this.a = aonaVar;
        this.b = aomzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aomx a(aona aonaVar, aomz aomzVar) {
        return new aomx(aonaVar, aomzVar);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((aomx) obj).b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
