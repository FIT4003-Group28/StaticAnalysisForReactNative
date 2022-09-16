package defpackage;
/* compiled from: PG */
/* renamed from: jyd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jyd implements zdt {
    public final /* synthetic */ jyf a;
    private final /* synthetic */ int b;

    public /* synthetic */ jyd(jyf jyfVar, int i) {
        this.b = i;
        this.a = jyfVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            jyf jyfVar = this.a;
            zep.d("Error getting player feature settings.", (Throwable) obj);
            jyfVar.b.g(false);
            return;
        }
        this.a.b.g(((awvc) obj).d);
    }
}
