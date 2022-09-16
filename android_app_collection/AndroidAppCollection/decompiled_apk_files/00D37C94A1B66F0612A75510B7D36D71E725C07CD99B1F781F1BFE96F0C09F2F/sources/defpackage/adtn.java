package defpackage;
/* compiled from: PG */
/* renamed from: adtn  reason: default package */
/* loaded from: classes.dex */
final class adtn implements adts {
    final /* synthetic */ adto a;

    public adtn(adto adtoVar) {
        this.a = adtoVar;
    }

    @Override // defpackage.adts
    public final void a() {
        String str = adto.a;
        synchronized (this.a.d) {
            this.a.c = 2;
        }
    }

    @Override // defpackage.adts
    public final void b() {
        String str = adto.a;
        synchronized (this.a.d) {
            this.a.c = 0;
        }
    }
}
