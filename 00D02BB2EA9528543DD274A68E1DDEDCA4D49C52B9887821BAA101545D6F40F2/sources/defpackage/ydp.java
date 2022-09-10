package defpackage;
/* compiled from: PG */
/* renamed from: ydp  reason: default package */
/* loaded from: classes7.dex */
final class ydp implements acyt {
    final /* synthetic */ zut a;
    final /* synthetic */ ydq b;

    public ydp(ydq ydqVar, zut zutVar) {
        this.b = ydqVar;
        this.a = zutVar;
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        this.b.g.c(this.a);
        final zut zutVar = this.a;
        zutVar.post(new Runnable(this, zutVar) { // from class: ydo
            private final ydp a;
            private final zut b;

            {
                this.a = this;
                this.b = zutVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ydp ydpVar = this.a;
                ydpVar.b.ad.D(aefy.c(this.b).equals(ddmo.FULL_EXPANSION));
            }
        });
    }

    @Override // defpackage.acyt
    public final void b(int i) {
    }
}
