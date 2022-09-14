package c.e.a.a.i.w.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final long f3770a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.m f3771b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.h f3772c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j, c.e.a.a.i.m mVar, c.e.a.a.i.h hVar) {
        this.f3770a = j;
        if (mVar != null) {
            this.f3771b = mVar;
            if (hVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f3772c = hVar;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // c.e.a.a.i.w.j.i
    public c.e.a.a.i.h a() {
        return this.f3772c;
    }

    @Override // c.e.a.a.i.w.j.i
    public long b() {
        return this.f3770a;
    }

    @Override // c.e.a.a.i.w.j.i
    public c.e.a.a.i.m c() {
        return this.f3771b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3770a == iVar.b() && this.f3771b.equals(iVar.c()) && this.f3772c.equals(iVar.a());
    }

    public int hashCode() {
        long j = this.f3770a;
        return this.f3772c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3771b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f3770a + ", transportContext=" + this.f3771b + ", event=" + this.f3772c + "}";
    }
}
