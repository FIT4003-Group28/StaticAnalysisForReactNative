package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: alok  reason: default package */
/* loaded from: classes.dex */
public final class alok {
    private static alok e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new aloi(this));
    public aloj c;
    public aloj d;

    private alok() {
    }

    public static alok a() {
        if (e == null) {
            e = new alok();
        }
        return e;
    }

    public final void b(aloj alojVar) {
        int i = alojVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(alojVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, alojVar), i);
    }

    public final void c() {
        aloj alojVar = this.d;
        if (alojVar != null) {
            this.c = alojVar;
            this.d = null;
            alnw alnwVar = (alnw) alojVar.a.get();
            if (alnwVar != null) {
                aloe.a.sendMessage(aloe.a.obtainMessage(0, alnwVar.a));
            } else {
                this.c = null;
            }
        }
    }

    public final boolean d(aloj alojVar, int i) {
        alnw alnwVar = (alnw) alojVar.a.get();
        if (alnwVar != null) {
            this.b.removeCallbacksAndMessages(alojVar);
            aloe.a.sendMessage(aloe.a.obtainMessage(1, i, 0, alnwVar.a));
            return true;
        }
        return false;
    }

    public final void e(alnw alnwVar) {
        synchronized (this.a) {
            if (g(alnwVar)) {
                aloj alojVar = this.c;
                if (!alojVar.c) {
                    alojVar.c = true;
                    this.b.removeCallbacksAndMessages(alojVar);
                }
            }
        }
    }

    public final void f(alnw alnwVar) {
        synchronized (this.a) {
            if (g(alnwVar)) {
                aloj alojVar = this.c;
                if (alojVar.c) {
                    alojVar.c = false;
                    b(alojVar);
                }
            }
        }
    }

    public final boolean g(alnw alnwVar) {
        aloj alojVar = this.c;
        return alojVar != null && alojVar.a(alnwVar);
    }

    public final boolean h(alnw alnwVar) {
        aloj alojVar = this.d;
        return alojVar != null && alojVar.a(alnwVar);
    }
}
