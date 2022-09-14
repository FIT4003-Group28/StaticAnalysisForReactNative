package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avfb  reason: default package */
/* loaded from: classes2.dex */
public final class avfb {
    final /* synthetic */ avfd a;
    private final avzg b;
    private avel c;

    public avfb(avfd avfdVar, avzg avzgVar) {
        this.a = avfdVar;
        this.b = avzgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized avel a() {
        if (this.c == null) {
            this.c = this.a.c.a().d(this.b.b(), this.b.a());
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized avel b() {
        return this.c;
    }
}
