package defpackage;
/* compiled from: PG */
/* renamed from: amwn  reason: default package */
/* loaded from: classes2.dex */
final class amwn implements amcm {
    final /* synthetic */ amwp a;
    private final amwy b;
    private int c;
    private boolean d;
    private final amwm e;

    public amwn(amwp amwpVar, int i, amwm amwmVar) {
        this.a = amwpVar;
        this.c = i;
        this.e = amwmVar;
        this.b = amwmVar.e;
    }

    @Override // defpackage.amcm
    public final synchronized void a(alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        if (i != 0) {
            int i2 = 4;
            if (i != 4 && !this.d) {
                this.c--;
                amwm amwmVar = this.e;
                amwmVar.c--;
                if (i == 2) {
                    i2 = 3;
                } else if (i != 5) {
                    i2 = i == 6 ? 5 : 0;
                }
                if (i2 != 0) {
                    this.d = true;
                    this.b.a(i2);
                    return;
                }
                amwy amwyVar = this.b;
                int i3 = amwmVar.d;
                amwmVar.a.a();
                amwyVar.b();
                if (this.c != 0) {
                    return;
                }
                if (this.e.a.a() == 0) {
                    this.b.a(1);
                    return;
                }
                long j = true != ambv.n(this.e.f) ? 1000L : 50L;
                amwp amwpVar = this.a;
                amwpVar.e.sendMessageDelayed(amwpVar.e.obtainMessage(2, this.e), j);
                return;
            }
            return;
        }
        throw null;
    }
}
