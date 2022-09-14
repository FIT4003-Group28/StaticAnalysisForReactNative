package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: awpg  reason: default package */
/* loaded from: classes3.dex */
public final class awpg<T> extends btrh<T> {
    private final int d;

    public awpg(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            awpc awpcVar = (awpc) this.a;
            alhw alhwVar = (alhw) obj;
            synchronized (awpcVar.a.b) {
                if (alhwVar.a == alje.FIRST_FINGER_DOWN) {
                    awpcVar.a.g = SystemClock.elapsedRealtime();
                    awpf awpfVar = awpcVar.a;
                    awpfVar.h = 1.0f;
                    awpfVar.c = true;
                } else if (alhwVar.a == alje.LAST_FINGER_UP) {
                    awpcVar.a.g = -1L;
                }
            }
            return;
        }
        awpc awpcVar2 = (awpc) this.a;
        crhp crhpVar = (crhp) obj;
        synchronized (awpcVar2.a.b) {
            if (crhpVar.d() && !crhpVar.e().j) {
                awpcVar2.a.i = crhpVar.e().f().b();
                awpcVar2.a.j = crhpVar.e().h();
            } else {
                awpf awpfVar2 = awpcVar2.a;
                awpfVar2.i = -1;
                awpfVar2.j = null;
            }
        }
    }
}
