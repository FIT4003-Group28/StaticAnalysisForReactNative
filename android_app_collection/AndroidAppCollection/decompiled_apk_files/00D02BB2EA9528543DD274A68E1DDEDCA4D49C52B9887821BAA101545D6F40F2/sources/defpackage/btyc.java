package defpackage;
/* compiled from: PG */
/* renamed from: btyc  reason: default package */
/* loaded from: classes.dex */
public final class btyc {
    private final duxm a;

    public btyc(duxm duxmVar) {
        this.a = duxmVar;
    }

    public final long a() {
        return this.a.u;
    }

    public final double b(int i) {
        int i2;
        duxm duxmVar = this.a;
        if ((duxmVar.a & 33554432) != 0) {
            duxj duxjVar = duxmVar.t;
            if (duxjVar == null) {
                duxjVar = duxj.j;
            }
            if (i != 0) {
                switch (i) {
                    case 3:
                        i2 = duxjVar.c;
                        break;
                    case 4:
                        i2 = duxjVar.d;
                        break;
                    case 5:
                        i2 = duxjVar.e;
                        break;
                    case 6:
                        i2 = duxjVar.f;
                        break;
                    case 7:
                        i2 = duxjVar.g;
                        break;
                    case 8:
                        i2 = duxjVar.h;
                        break;
                    case 9:
                        i2 = duxjVar.i;
                        break;
                    default:
                        i2 = duxjVar.a;
                        break;
                }
            } else {
                i2 = duxjVar.b;
            }
            double d = i2;
            Double.isNaN(d);
            return d / 100.0d;
        }
        return 1.0d;
    }
}
