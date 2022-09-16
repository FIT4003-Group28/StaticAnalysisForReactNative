package defpackage;
/* compiled from: PG */
/* renamed from: aihv  reason: default package */
/* loaded from: classes.dex */
public final class aihv extends aihu {
    private final airz j;

    public aihv(String str, airz airzVar) {
        super("$N", 0, str, 0L);
        this.j = airzVar;
    }

    @Override // defpackage.aihu
    public final int a(long j) {
        ajah ajahVar = this.j.a.a;
        return (int) (ajahVar != null ? ajahVar.n(j) : -1L);
    }

    @Override // defpackage.aihu
    public final int b() {
        ajah ajahVar = this.j.a.a;
        return (int) (ajahVar != null ? ajahVar.n(ajahVar.u().p().h) : -1L);
    }

    @Override // defpackage.aihu
    public final int d() {
        return Integer.MAX_VALUE;
    }
}
