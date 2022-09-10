package defpackage;
/* compiled from: PG */
/* renamed from: aafa  reason: default package */
/* loaded from: classes2.dex */
final class aafa extends cqmr<aaff> {
    final /* synthetic */ dmkw a;

    public aafa(dmkw dmkwVar) {
        this.a = dmkwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(aaff aaffVar, boolean z) {
        aaff aaffVar2 = aaffVar;
        this.a.setStartDay(aaffVar2.e());
        this.a.setEndDay(aaffVar2.f());
        this.a.setMinClickableDay(aaffVar2.g());
        this.a.setMaxClickableDay(aaffVar2.h());
        this.a.setMonthTitle(aaffVar2.c());
    }
}
