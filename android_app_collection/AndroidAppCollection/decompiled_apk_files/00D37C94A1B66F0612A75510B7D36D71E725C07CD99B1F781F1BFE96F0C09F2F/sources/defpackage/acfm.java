package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfm  reason: default package */
/* loaded from: classes.dex */
public final class acfm implements ajyi {
    final /* synthetic */ acfq a;
    private final ajsa b = new ajqw();

    public acfm(acfq acfqVar) {
        this.a = acfqVar;
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        if (assn.class.isAssignableFrom(cls)) {
            this.b.f(asrf.class, new ajsc(this.a.a));
            this.b.f(asqz.class, new ajsc(this.a.b));
            this.b.f(asrb.class, new acfl(this, 1));
            this.b.f(asrw.class, new acfl(this));
        }
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.b;
    }
}
