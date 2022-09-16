package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tkt  reason: default package */
/* loaded from: classes4.dex */
public final class tkt extends tkj {
    public final Handler a = new Handler(Looper.getMainLooper(), new tks(this));
    public final Set b = new HashSet();
    private final tkd c;
    private boolean d;
    private final tjp e;

    public tkt(tjp tjpVar) {
        this.e = tjpVar;
        this.c = new tkd(tjpVar);
    }

    private final void g() {
        int i = tku.d;
        this.e.a.c.remove(this);
        this.a.removeMessages(0);
    }

    @Override // defpackage.tkj
    public final void a(tky tkyVar, tla tlaVar) {
        View a;
        double min;
        if (this.d || tkyVar == null || (a = tkyVar.a()) == null) {
            return;
        }
        tjz a2 = this.c.a(tkyVar, a);
        AudioManager audioManager = (AudioManager) a.getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0) {
            min = 0.0d;
        } else {
            double streamVolume = audioManager.getStreamVolume(3);
            double d = streamMaxVolume;
            Double.isNaN(streamVolume);
            Double.isNaN(d);
            min = Math.min(streamVolume / d, 1.0d);
        }
        c(tkyVar, new VisibilityChangeEventData(a2, min, tkyVar.b().booleanValue()), tlaVar);
        if (tlaVar != null && tlaVar.r) {
            tkyVar.l();
        }
        tkyVar.m();
        if (tlaVar == null) {
            return;
        }
        if (tlaVar.u) {
            if (!this.b.remove(tkyVar) || !this.b.isEmpty()) {
                return;
            }
            g();
            return;
        }
        boolean isEmpty = this.b.isEmpty();
        this.b.add(tkyVar);
        if (!isEmpty) {
            return;
        }
        f();
    }

    @Override // defpackage.tkj
    public final void b() {
        this.b.clear();
        g();
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(tkc tkcVar) {
        View a;
        if (this.d || tkcVar == null || (a = tkcVar.a()) == null) {
            return;
        }
        tjz a2 = this.c.a(tkcVar, a);
        long currentTimeMillis = System.currentTimeMillis();
        if (tkcVar.c == -1) {
            tkcVar.c = currentTimeMillis;
        }
        long j = tkcVar.b;
        if (j == 0) {
            tkcVar.b = currentTimeMillis;
            j = currentTimeMillis;
        }
        tkcVar.e.b(currentTimeMillis - j, a2.a, a2.b);
        tkcVar.f = a2;
        tkcVar.b = currentTimeMillis;
        if (!tkcVar.g() || tkcVar.m) {
            return;
        }
        tkcVar.h.a(tkcVar.i("lidarim", "v"), tkcVar.a());
        tkcVar.m = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(tkc tkcVar) {
        d(tkcVar);
        if (!this.b.remove(tkcVar) || !this.b.isEmpty()) {
            return;
        }
        g();
    }

    public final void f() {
        int i = tku.d;
        this.e.a.c.add(this);
        this.a.sendEmptyMessageDelayed(0, 200L);
    }
}
