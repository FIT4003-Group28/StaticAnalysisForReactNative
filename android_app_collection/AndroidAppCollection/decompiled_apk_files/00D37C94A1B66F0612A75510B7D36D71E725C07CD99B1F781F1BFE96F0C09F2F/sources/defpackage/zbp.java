package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: zbp  reason: default package */
/* loaded from: classes4.dex */
public final class zbp extends zbt {
    public MotionEvent a;
    public zbo b;
    private final Handler f;
    private Runnable g;

    public zbp(ViewConfiguration viewConfiguration) {
        super(viewConfiguration);
        this.f = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.zbt, defpackage.zbr
    public final void c() {
        super.c();
        this.f.removeCallbacks(this.g);
        this.a = null;
    }

    @Override // defpackage.zbt, defpackage.zbr
    public final boolean d(View view, MotionEvent motionEvent) {
        zbo zboVar = this.b;
        if (zboVar == null || !zboVar.nQ(motionEvent, this.e)) {
            return super.d(view, motionEvent);
        }
        if (!e(motionEvent)) {
            return false;
        }
        if (this.g == null) {
            this.g = new zbn(this);
        }
        if (this.a == null) {
            this.a = motionEvent;
            this.f.postDelayed(this.g, ViewConfiguration.getDoubleTapTimeout());
            return true;
        }
        this.b.nM(motionEvent, this.e);
        c();
        return true;
    }
}
