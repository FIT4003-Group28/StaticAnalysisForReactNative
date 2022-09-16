package defpackage;
/* compiled from: PG */
/* renamed from: avcq  reason: default package */
/* loaded from: classes2.dex */
final class avcq implements dbty<awcd> {
    final /* synthetic */ avcr a;

    public avcq(avcr avcrVar) {
        this.a = avcrVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ awcd a() {
        awce awceVar;
        synchronized (this.a) {
            avcr avcrVar = this.a;
            awceVar = avcrVar.d;
            if (awceVar == null) {
                avcrVar.i();
                avcrVar.d = avcrVar.b.a().c(avcrVar.e.b(), avcrVar.e.a());
                awceVar = avcrVar.d;
            }
        }
        return awceVar;
    }
}
