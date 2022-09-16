package defpackage;
/* compiled from: PG */
/* renamed from: juv  reason: default package */
/* loaded from: classes3.dex */
public final class juv extends jur implements Comparable {
    private final long b;

    public juv(aoqu aoquVar, long j) {
        super(aoquVar);
        this.b = j;
    }

    public final Long a() {
        return Long.valueOf(this.b);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return -a().compareTo(((juv) obj).a());
    }
}
