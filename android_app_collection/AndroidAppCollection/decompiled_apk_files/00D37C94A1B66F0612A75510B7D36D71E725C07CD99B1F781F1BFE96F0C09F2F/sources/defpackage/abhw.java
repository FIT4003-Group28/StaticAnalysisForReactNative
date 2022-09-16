package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abhw  reason: default package */
/* loaded from: classes.dex */
public final class abhw implements abrg {
    public final Handler a;
    public final ajsm b = new ajsm();
    final Map c = new HashMap();
    public final abhv d = new abhv(this);
    public final abka e;

    public abhw(Handler handler, abka abkaVar) {
        this.a = handler;
        this.e = abkaVar;
    }

    private final void f() {
        for (abhu abhuVar : this.c.values()) {
            this.a.removeCallbacks(abhuVar);
        }
        this.c.clear();
        this.b.clear();
    }

    public final void a(String str, Object obj, long j) {
        ylr.c();
        if (this.c.containsKey(str)) {
            return;
        }
        abhu abhuVar = new abhu(this, str, obj, j, System.currentTimeMillis());
        this.c.put(str, abhuVar);
        this.b.add(0, obj);
        this.a.postDelayed(abhuVar, j);
    }

    @Override // defpackage.abrg
    public final void mU() {
        ylr.c();
        for (abhu abhuVar : this.c.values()) {
            this.a.removeCallbacks(abhuVar);
        }
    }

    @Override // defpackage.abrg
    public final void mV() {
        ylr.c();
        for (abhu abhuVar : this.c.values()) {
            long currentTimeMillis = (abhuVar.c + abhuVar.b) - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                this.a.post(abhuVar);
            } else {
                this.a.postDelayed(abhuVar, currentTimeMillis);
            }
        }
    }

    @Override // defpackage.abrg
    public final void mW() {
        ylr.c();
        f();
    }

    @Override // defpackage.abrg
    public final void mX() {
        ylr.c();
        f();
    }
}
