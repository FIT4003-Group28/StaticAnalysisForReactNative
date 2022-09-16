package defpackage;
/* compiled from: PG */
/* renamed from: bws  reason: default package */
/* loaded from: classes2.dex */
public final class bws implements bxp {
    @Override // defpackage.bxp
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        if (cdh.l(th)) {
            cda.b("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
