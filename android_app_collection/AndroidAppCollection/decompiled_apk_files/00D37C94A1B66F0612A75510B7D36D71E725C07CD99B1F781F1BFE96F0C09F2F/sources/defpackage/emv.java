package defpackage;
/* compiled from: PG */
/* renamed from: emv  reason: default package */
/* loaded from: classes3.dex */
final class emv implements Comparable {
    public final long a;
    public final apzg b;

    public emv(long j, apzg apzgVar) {
        this.a = j;
        this.b = apzgVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((emv) obj).a));
    }
}
