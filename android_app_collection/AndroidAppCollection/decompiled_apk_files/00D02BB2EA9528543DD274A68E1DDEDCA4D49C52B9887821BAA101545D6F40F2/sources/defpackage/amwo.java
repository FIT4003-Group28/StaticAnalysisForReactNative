package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Vector;
/* compiled from: PG */
/* renamed from: amwo  reason: default package */
/* loaded from: classes2.dex */
final class amwo extends Handler {
    final /* synthetic */ amwp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amwo(amwp amwpVar, Looper looper) {
        super(looper);
        this.a = amwpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        alyh b;
        int i = message.what;
        long j = 0;
        if (i == 0) {
            amwp amwpVar = this.a;
            amwpVar.f.a();
            long w = amwpVar.c.w(bvjk.gL, 0L);
            if (w < amwpVar.g.b()) {
                j = w;
            }
            amwpVar.d = j;
        } else if (i == 1) {
            amwp amwpVar2 = this.a;
            amwy amwyVar = (amwy) message.obj;
            Vector vector = new Vector();
            vector.addAll(amwpVar2.f.d());
            if (!vector.isEmpty()) {
                amwpVar2.d(12, new amwx(vector, amwpVar2.b.getPrefetcherSettingsParameters().a), amwpVar2.a.c(akry.BASE), amwyVar);
            } else if (amwyVar != null) {
                amwyVar.a(1);
            }
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            amwl amwlVar = (amwl) message.obj;
            int i2 = amwlVar.e;
            Queue<alyh> queue = amwlVar.a;
            amwy amwyVar2 = amwlVar.b;
            akry akryVar = amwlVar.c;
            int i3 = amwlVar.d;
            amwk amwkVar = new amwk(queue);
            amwp amwpVar3 = this.a;
            if (amwpVar3.d(5, amwkVar, amwpVar3.a.c(akryVar), amwyVar2)) {
                return;
            }
            if (i3 <= 0) {
                amwyVar2.a(6);
            } else {
                sendMessageDelayed(obtainMessage(3, new amwl(5, queue, amwyVar2, akryVar, i3 - 1)), 50L);
            }
        } else {
            amwm amwmVar = (amwm) message.obj;
            amwp amwpVar4 = this.a;
            amwf amwfVar = amwmVar.a;
            amco c = amwpVar4.a.c(amwmVar.b.m());
            int i4 = amwmVar.f;
            if (!ambv.n(i4)) {
                while (true) {
                    long B = c.B();
                    if (B <= 0) {
                        break;
                    }
                    try {
                        Thread.sleep(B);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            ArrayList a = dchl.a();
            if (amwmVar.c > 0) {
                while (a.size() < 32 && (b = amwfVar.b()) != null) {
                    if (!c.o(b)) {
                        a.add(b);
                    }
                }
            }
            amwn amwnVar = new amwn(amwpVar4, a.size(), amwmVar);
            int size = a.size();
            for (int i5 = 0; i5 < size; i5++) {
                c.F((alyh) a.get(i5), amwnVar, i4);
            }
            if (a.size() != 0) {
                return;
            }
            amwpVar4.d = amwpVar4.g.b();
            amwpVar4.c.Z(bvjk.gL, amwpVar4.d);
            amwmVar.e.a(1);
        }
    }
}
