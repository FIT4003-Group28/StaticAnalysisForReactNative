package defpackage;
/* compiled from: PG */
/* renamed from: ogx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ogx implements aypv {
    public final /* synthetic */ ogy a;
    private final /* synthetic */ int b;

    public /* synthetic */ ogx(ogy ogyVar, int i) {
        this.b = i;
        this.a = ogyVar;
    }

    @Override // defpackage.aypv
    public final void a() {
        if (this.b == 0) {
            this.a.b(auzb.STARTUP_SIGNAL_BROWSE_FEED_LOADED);
        } else {
            this.a.b(auzb.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED);
        }
    }
}
