package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: anq  reason: default package */
/* loaded from: classes2.dex */
public final class anq {
    private static final ThreadLocal<anq> h = new ThreadLocal<>();
    public final aim<ann, Long> a = new aim<>();
    public final ArrayList<ann> b = new ArrayList<>();
    public final anm c = new anm(this);
    public final Runnable d = new Runnable(this) { // from class: anl
        private final anq a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            anm anmVar = this.a.c;
            anmVar.a.e = SystemClock.uptimeMillis();
            anq anqVar = anmVar.a;
            long j = anqVar.e;
            long uptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < anqVar.b.size(); i++) {
                ann annVar = anqVar.b.get(i);
                if (annVar != null) {
                    Long l = anqVar.a.get(annVar);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            anqVar.a.remove(annVar);
                        }
                    }
                    annVar.a(j);
                }
            }
            if (anqVar.f) {
                int size = anqVar.b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (anqVar.b.get(size) == null) {
                        anqVar.b.remove(size);
                    }
                }
                anqVar.f = false;
            }
            if (anmVar.a.b.size() > 0) {
                anq anqVar2 = anmVar.a;
                anqVar2.g.a(anqVar2.d);
            }
        }
    };
    long e = 0;
    public boolean f = false;
    public final anp g;

    public anq(anp anpVar) {
        this.g = anpVar;
    }

    public static anq a() {
        ThreadLocal<anq> threadLocal = h;
        if (threadLocal.get() == null) {
            threadLocal.set(new anq(new anp()));
        }
        return threadLocal.get();
    }
}
