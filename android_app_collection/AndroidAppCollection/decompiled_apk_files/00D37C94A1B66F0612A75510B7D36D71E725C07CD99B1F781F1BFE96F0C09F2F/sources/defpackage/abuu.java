package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abuu  reason: default package */
/* loaded from: classes.dex */
final class abuu implements Runnable {
    final /* synthetic */ abux a;
    private final /* synthetic */ int b;

    public abuu(abux abuxVar) {
        this.a = abuxVar;
    }

    public abuu(abux abuxVar, int i) {
        this.b = i;
        this.a = abuxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            abux abuxVar = this.a;
            abxx abxxVar = abuxVar.o;
            if (abxxVar == null || !abuxVar.d) {
                return;
            }
            abyk abykVar = abxxVar.a;
            if (!abykVar.U) {
                return;
            }
            String string = abykVar.u.getString(R.string.lc_error_battery_low);
            abyk abykVar2 = abxxVar.a;
            abykVar2.g.d(1, abykVar2.O, string, false);
        } else if (i == 1) {
            abux abuxVar2 = this.a;
            if (abuxVar2.o == null || !abuxVar2.d) {
                return;
            }
            abuxVar2.c.postDelayed(abuxVar2.i, 70000L);
        } else {
            abux abuxVar3 = this.a;
            abxx abxxVar2 = abuxVar3.o;
            if (abxxVar2 == null || !abuxVar3.d) {
                return;
            }
            abyk abykVar3 = abxxVar2.a;
            if (!abykVar3.U || !abykVar3.v()) {
                return;
            }
            abyk abykVar4 = abxxVar2.a;
            abykVar4.g.b(abykVar4.O);
        }
    }
}
