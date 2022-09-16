package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: pwh  reason: default package */
/* loaded from: classes4.dex */
public final class pwh {
    public final pvq a;
    public final pwa b;
    public final pwf c;
    public final CopyOnWriteArraySet d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private boolean g;

    public pwh(Looper looper, pvq pvqVar, pwf pwfVar) {
        this(new CopyOnWriteArraySet(), looper, pvqVar, pwfVar);
    }

    public final void a(Object obj) {
        if (this.g) {
            return;
        }
        ptx.a(obj);
        this.d.add(new pwg(obj));
    }

    public final void b() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.d()) {
            pwa pwaVar = this.b;
            pwaVar.h(pwaVar.a(0));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.e.isEmpty()) {
            ((Runnable) this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    public final void c(final int i, final pwe pweVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: pwd
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                pwe pweVar2 = pweVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    pwg pwgVar = (pwg) it.next();
                    if (!pwgVar.d) {
                        if (i2 != -1) {
                            pwgVar.b.b(i2);
                        }
                        pwgVar.c = true;
                        pweVar2.a(pwgVar.a);
                    }
                }
            }
        });
    }

    public final void d() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((pwg) it.next()).a(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    public final void e(Object obj) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            pwg pwgVar = (pwg) it.next();
            if (pwgVar.a.equals(obj)) {
                pwgVar.a(this.c);
                this.d.remove(pwgVar);
            }
        }
    }

    public final void f(int i, pwe pweVar) {
        c(i, pweVar);
        b();
    }

    public pwh(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, pvq pvqVar, pwf pwfVar) {
        this.a = pvqVar;
        this.d = copyOnWriteArraySet;
        this.c = pwfVar;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = pvqVar.a(looper, new Handler.Callback() { // from class: pwc
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                pwh pwhVar = pwh.this;
                Iterator it = pwhVar.d.iterator();
                while (it.hasNext()) {
                    pwg pwgVar = (pwg) it.next();
                    pwf pwfVar2 = pwhVar.c;
                    if (!pwgVar.d && pwgVar.c) {
                        pvz a = pwgVar.b.a();
                        pwgVar.b = new pvy();
                        pwgVar.c = false;
                        pwfVar2.a(pwgVar.a, a);
                    }
                    if (pwhVar.b.d()) {
                        return true;
                    }
                }
                return true;
            }
        });
    }
}
