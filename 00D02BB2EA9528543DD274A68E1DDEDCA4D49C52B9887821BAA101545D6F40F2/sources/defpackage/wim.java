package defpackage;
/* compiled from: PG */
/* renamed from: wim  reason: default package */
/* loaded from: classes7.dex */
final class wim implements acyt {
    final /* synthetic */ zut a;
    final /* synthetic */ wio b;

    public wim(wio wioVar, zut zutVar) {
        this.b = wioVar;
        this.a = zutVar;
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        this.b.ad.c(this.a);
        final zut zutVar = this.a;
        zutVar.post(new Runnable(this, zutVar) { // from class: wil
            private final wim a;
            private final zut b;

            {
                this.a = this;
                this.b = zutVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wim wimVar = this.a;
                zut zutVar2 = this.b;
                if (wimVar.b.ai != null) {
                    wimVar.b.ai.M(aefy.c(zutVar2).equals(ddmo.FULL_EXPANSION));
                }
            }
        });
    }

    @Override // defpackage.acyt
    public final void b(int i) {
    }
}
