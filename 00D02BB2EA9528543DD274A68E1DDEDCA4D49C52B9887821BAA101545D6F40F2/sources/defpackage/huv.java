package defpackage;

import android.app.Activity;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: huv  reason: default package */
/* loaded from: classes.dex */
public final class huv {
    public final Activity a;
    public final cqat b;
    public final btrm c;
    public final ckcw d;
    public final Map<ckjf, Long> e = new EnumMap(ckjf.class);
    public int f;
    public boolean g;
    public long h;
    private final cjyh i;

    public huv(Activity activity, cqat cqatVar, btrm btrmVar, ckcw ckcwVar, cjyh cjyhVar) {
        this.a = activity;
        this.b = cqatVar;
        this.c = btrmVar;
        this.d = ckcwVar;
        this.i = cjyhVar;
    }

    private final void b(ckjf ckjfVar, long j) {
        Long l = this.e.get(ckjfVar);
        if (l == null) {
            l = 0L;
        }
        this.e.put(ckjfVar, Long.valueOf(l.longValue() + j));
    }

    public final synchronized void a() {
        ckjf ckjfVar;
        int i = this.f;
        if (this.g) {
            if (i == 2) {
                ckjfVar = ckjf.LANDSCAPE_WITH_NAV;
            } else {
                ckjfVar = ckjf.PORTRAIT_WITH_NAV;
            }
        } else if (i == 2) {
            ckjfVar = ckjf.LANDSCAPE_NO_NAV;
        } else {
            ckjfVar = ckjf.PORTRAIT_NO_NAV;
        }
        long e = this.b.e();
        long j = e - this.h;
        b(ckjfVar, j);
        ckjf ckjfVar2 = null;
        if (this.i.b()) {
            if (ckjfVar == ckjf.LANDSCAPE_WITH_NAV) {
                ckjfVar2 = ckjf.LANDSCAPE_WITH_NAV_ASSISTANT_DRIVING_ELIGIBLE;
            } else if (ckjfVar == ckjf.PORTRAIT_WITH_NAV) {
                ckjfVar2 = ckjf.PORTRAIT_WITH_NAV_ASSISTANT_DRIVING_ELIGIBLE;
            }
        }
        if (ckjfVar2 != null) {
            b(ckjfVar2, j);
        }
        this.h = e;
    }
}
