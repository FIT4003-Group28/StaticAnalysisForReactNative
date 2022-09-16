package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amsj  reason: default package */
/* loaded from: classes.dex */
public final class amsj extends amsm {
    final /* synthetic */ amsq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amsj(amsq amsqVar) {
        super(amsqVar);
        this.a = amsqVar;
    }

    @Override // defpackage.amsm
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new amso(this.a, i);
    }
}
