package defpackage;
/* compiled from: PG */
/* renamed from: koz  reason: default package */
/* loaded from: classes3.dex */
final class koz extends zer {
    final /* synthetic */ agub a;
    final /* synthetic */ aguk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koz(agub agubVar, aguk agukVar) {
        super("offlinePlaybackRequester");
        this.a = agubVar;
        this.b = agukVar;
    }

    @Override // defpackage.zer
    protected final /* bridge */ /* synthetic */ Object a() {
        return new agsk(this.a, this.b);
    }
}
