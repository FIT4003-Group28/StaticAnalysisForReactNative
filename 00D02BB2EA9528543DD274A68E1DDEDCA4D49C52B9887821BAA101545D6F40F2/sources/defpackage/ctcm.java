package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcm  reason: default package */
/* loaded from: classes5.dex */
public final class ctcm implements cswc<Long> {
    final /* synthetic */ ctct a;

    public ctcm(ctct ctctVar) {
        this.a = ctctVar;
    }

    @Override // defpackage.cswc
    public final /* bridge */ /* synthetic */ void a(Long l) {
        ctct ctctVar = this.a;
        ctctVar.o.postDelayed(ctctVar.w, l.longValue());
    }
}
