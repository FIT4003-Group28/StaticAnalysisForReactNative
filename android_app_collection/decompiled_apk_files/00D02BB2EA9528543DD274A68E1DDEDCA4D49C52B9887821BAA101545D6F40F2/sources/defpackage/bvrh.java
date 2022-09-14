package defpackage;
/* compiled from: PG */
/* renamed from: bvrh  reason: default package */
/* loaded from: classes4.dex */
public final class bvrh implements crzb {
    final /* synthetic */ long a;

    public bvrh(long j) {
        this.a = j;
    }

    @Override // defpackage.crzb
    public final void a() {
        if (c()) {
            return;
        }
        long j = this.a;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(100);
        sb.append("Execution on wrong non-GMM thread, expected tid=");
        sb.append(j);
        sb.append(" actual tid=");
        sb.append(id);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.crzb
    public final void b() {
        if (!c()) {
            return;
        }
        long j = this.a;
        StringBuilder sb = new StringBuilder(79);
        sb.append("Execution on wrong non-GMM thread, expected tid other than ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.crzb
    public final boolean c() {
        return Thread.currentThread().getId() == this.a;
    }
}
