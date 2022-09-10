package defpackage;
/* compiled from: PG */
/* renamed from: bgds  reason: default package */
/* loaded from: classes3.dex */
final class bgds {
    final /* synthetic */ bgdt a;
    private final begq b;

    public bgds(bgdt bgdtVar, begq begqVar) {
        this.a = bgdtVar;
        this.b = begqVar;
    }

    public final void a(@dzsi dwcy dwcyVar, @dzsi bttq bttqVar) {
        synchronized (this.a) {
            bgdt bgdtVar = this.a;
            if (bgdtVar.a == null) {
                return;
            }
            bgdtVar.a = null;
            if (bttqVar != null || dwcyVar == null) {
                this.b.b();
            } else {
                this.b.a(dwcyVar);
            }
        }
    }
}
