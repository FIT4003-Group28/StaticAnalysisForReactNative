package defpackage;
/* compiled from: PG */
/* renamed from: akqw  reason: default package */
/* loaded from: classes.dex */
final class akqw extends agc {
    final /* synthetic */ akqy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akqw(akqy akqyVar) {
        super(50);
        this.a = akqyVar;
    }

    @Override // defpackage.agc
    protected final /* bridge */ /* synthetic */ void h(Object obj, Object obj2) {
        akqx akqxVar = (akqx) obj2;
        this.a.e.addAndGet(-((akqx) obj).c);
    }
}
