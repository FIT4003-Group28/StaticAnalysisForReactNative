package defpackage;
/* compiled from: PG */
/* renamed from: bxqc  reason: default package */
/* loaded from: classes4.dex */
final class bxqc implements dbty<Boolean> {
    final /* synthetic */ bxqh a;

    public bxqc(bxqh bxqhVar) {
        this.a = bxqhVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Boolean a() {
        return Boolean.valueOf(!this.a.l().booleanValue());
    }
}
