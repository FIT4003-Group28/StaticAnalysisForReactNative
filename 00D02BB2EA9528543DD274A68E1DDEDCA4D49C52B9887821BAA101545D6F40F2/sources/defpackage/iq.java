package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iq  reason: default package */
/* loaded from: classes6.dex */
public final class iq implements akp {
    final /* synthetic */ is a;
    final /* synthetic */ akq b;
    final /* synthetic */ iu c;

    public iq(iu iuVar, is isVar, akq akqVar) {
        this.c = iuVar;
        this.a = isVar;
        this.b = akqVar;
    }

    @Override // defpackage.akp
    public final void a() {
        synchronized (this.c.a) {
            this.c.a.remove(this.a);
            this.c.b.remove(this.a.a);
            this.b.b();
        }
    }
}
