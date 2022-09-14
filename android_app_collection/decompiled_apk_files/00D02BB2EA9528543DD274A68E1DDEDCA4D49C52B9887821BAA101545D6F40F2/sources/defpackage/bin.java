package defpackage;
/* compiled from: PG */
/* renamed from: bin  reason: default package */
/* loaded from: classes3.dex */
public final class bin implements bjt<Throwable> {
    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void a(Throwable th) {
        Throwable th2 = th;
        if (bps.j(th2)) {
            bpo.b("Unable to load composition.");
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }
}
