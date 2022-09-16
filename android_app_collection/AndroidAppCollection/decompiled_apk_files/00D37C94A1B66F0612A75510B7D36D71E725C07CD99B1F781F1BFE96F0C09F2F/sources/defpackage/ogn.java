package defpackage;
/* compiled from: PG */
/* renamed from: ogn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ogn implements aypv {
    public final /* synthetic */ ogp a;
    private final /* synthetic */ int b;

    public /* synthetic */ ogn(ogp ogpVar, int i) {
        this.b = i;
        this.a = ogpVar;
    }

    @Override // defpackage.aypv
    public final void a() {
        if (this.b == 0) {
            this.a.d.c();
            return;
        }
        ogp ogpVar = this.a;
        ogpVar.b.getLifecycle().c((apx) ogpVar.a.get());
    }
}
