package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: dafn  reason: default package */
/* loaded from: classes5.dex */
public final class dafn {
    private static dafn e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new dafl(this));
    public dafm c;
    public dafm d;

    private dafn() {
    }

    public static dafn a() {
        if (e == null) {
            e = new dafn();
        }
        return e;
    }

    public final void b() {
        dafm dafmVar = this.d;
        if (dafmVar != null) {
            this.c = dafmVar;
            this.d = null;
            daew daewVar = dafmVar.a.get();
            if (daewVar != null) {
                daff.b.sendMessage(daff.b.obtainMessage(0, daewVar.a));
            } else {
                this.c = null;
            }
        }
    }

    public final boolean c(dafm dafmVar, int i) {
        daew daewVar = dafmVar.a.get();
        if (daewVar != null) {
            this.b.removeCallbacksAndMessages(dafmVar);
            daff.b.sendMessage(daff.b.obtainMessage(1, i, 0, daewVar.a));
            return true;
        }
        return false;
    }

    public final void d(dafm dafmVar) {
        int i = dafmVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(dafmVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, dafmVar), i);
    }

    public final void e(daew daewVar) {
        synchronized (this.a) {
            if (g(daewVar)) {
                dafm dafmVar = this.c;
                if (!dafmVar.c) {
                    dafmVar.c = true;
                    this.b.removeCallbacksAndMessages(dafmVar);
                }
            }
        }
    }

    public final void f(daew daewVar) {
        synchronized (this.a) {
            if (g(daewVar)) {
                dafm dafmVar = this.c;
                if (dafmVar.c) {
                    dafmVar.c = false;
                    d(dafmVar);
                }
            }
        }
    }

    public final boolean g(daew daewVar) {
        dafm dafmVar = this.c;
        return dafmVar != null && dafmVar.a(daewVar);
    }

    public final boolean h(daew daewVar) {
        dafm dafmVar = this.d;
        return dafmVar != null && dafmVar.a(daewVar);
    }
}
