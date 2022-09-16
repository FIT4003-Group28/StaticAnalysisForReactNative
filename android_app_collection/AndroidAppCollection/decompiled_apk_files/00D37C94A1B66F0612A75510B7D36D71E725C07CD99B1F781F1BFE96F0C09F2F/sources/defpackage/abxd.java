package defpackage;
/* compiled from: PG */
/* renamed from: abxd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abxd {
    public final /* synthetic */ abyk a;
    public final /* synthetic */ int b;
    public final /* synthetic */ abto c;

    public /* synthetic */ abxd(abyk abykVar, int i, abto abtoVar) {
        this.a = abykVar;
        this.b = i;
        this.c = abtoVar;
    }

    public final void a() {
        final abyk abykVar = this.a;
        final int i = this.b;
        final abto abtoVar = this.c;
        if (!abykVar.d.d()) {
            return;
        }
        abykVar.k.i(new abxp(abykVar), new abtv() { // from class: abxg
            @Override // defpackage.abtv
            public final void a(int i2) {
                abyk abykVar2 = abyk.this;
                abto abtoVar2 = abtoVar;
                int i3 = i;
                if (!abykVar2.d.d()) {
                    return;
                }
                if (i2 == 0) {
                    abykVar2.V = abykVar2.i.d();
                    abykVar2.W = abtoVar2.a();
                    abykVar2.t.postDelayed(abykVar2.w, 3000L);
                } else if (i2 == 2 || i2 == 7 || i2 == 8) {
                    StringBuilder sb = new StringBuilder(68);
                    sb.append("Capture pipeline not configured properly for SpeedTest - ");
                    sb.append(i2);
                    zep.b(sb.toString());
                    abykVar2.l(i3);
                } else {
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Error starting SpeedTest: ");
                    sb2.append(i2);
                    zep.b(sb2.toString());
                    abykVar2.a();
                }
            }
        });
    }
}
