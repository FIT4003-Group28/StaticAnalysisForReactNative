package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import org.chromium.net.NetError;
/* compiled from: PG */
/* renamed from: yzf  reason: default package */
/* loaded from: classes4.dex */
public final class yzf extends OrientationEventListener {
    public static final /* synthetic */ int b = 0;
    public boolean a;
    private final yzd c;
    private int d;

    public yzf(Context context, WindowManager windowManager) {
        super(context, 3);
        this.d = -1;
        this.c = new yzd(context, windowManager);
    }

    public final void a(yze yzeVar) {
        yzd yzdVar = this.c;
        yzeVar.getClass();
        yzdVar.b.add(yzeVar);
    }

    @Override // android.view.OrientationEventListener
    public final void disable() {
        super.disable();
        this.a = false;
        this.d = -1;
        yzd yzdVar = this.c;
        yzdVar.a.removeCallbacks(yzdVar);
        yzdVar.c = true;
        yzdVar.d = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void enable() {
        this.a = true;
        super.enable();
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2 = 0;
        if (!zgd.P(i + NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY, -20, 0) && !zgd.Q(i, 0)) {
            i2 = zgd.Q(i + (-90), -20) ? 1 : zgd.Q(i + NetError.ERR_TLS13_DOWNGRADE_DETECTED, -20) ? 2 : zgd.Q(i + (-270), -20) ? 3 : -1;
        }
        if (this.d == i2) {
            return;
        }
        this.d = i2;
        yzd yzdVar = this.c;
        if (i2 == -1) {
            return;
        }
        yzdVar.a.removeCallbacks(yzdVar);
        yzdVar.d = i2;
        yzdVar.a.postDelayed(yzdVar, true != yzdVar.c ? 200L : 0L);
    }

    @Deprecated
    public yzf(Context context, WindowManager windowManager, yze yzeVar) {
        this(context, windowManager);
        a(yzeVar);
    }
}
