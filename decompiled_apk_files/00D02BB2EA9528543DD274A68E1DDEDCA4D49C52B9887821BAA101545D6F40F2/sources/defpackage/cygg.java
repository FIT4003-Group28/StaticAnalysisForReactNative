package defpackage;
/* compiled from: PG */
/* renamed from: cygg  reason: default package */
/* loaded from: classes5.dex */
public abstract class cygg implements Comparable<cygg> {
    public static cyge c() {
        return new cydj();
    }

    public abstract String a();

    public abstract cygf b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cygg cyggVar) {
        cygg cyggVar2 = cyggVar;
        if (cyggVar2 == null) {
            return -1;
        }
        int compareTo = b().compareTo(cyggVar2.b());
        return compareTo != 0 ? compareTo : a().compareTo(cyggVar2.a());
    }
}
