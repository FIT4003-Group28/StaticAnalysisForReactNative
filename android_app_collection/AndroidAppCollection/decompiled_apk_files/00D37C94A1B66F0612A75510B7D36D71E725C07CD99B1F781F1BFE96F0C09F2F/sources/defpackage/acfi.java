package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.OrientationEventListener;
/* compiled from: PG */
/* renamed from: acfi  reason: default package */
/* loaded from: classes.dex */
public final class acfi extends OrientationEventListener implements Handler.Callback {
    public int a;
    private final Handler b;
    private int c;
    private final acel d;

    public acfi(Context context, acel acelVar) {
        super(context, 3);
        this.a = -1;
        this.d = acelVar;
        Looper myLooper = Looper.myLooper();
        this.b = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, this);
    }

    private final void a() {
        this.b.removeCallbacksAndMessages(null);
        this.a = -1;
        this.c = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void disable() {
        a();
        super.disable();
    }

    @Override // android.view.OrientationEventListener
    public final void enable() {
        a();
        super.enable();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.c == -1) {
            acel acelVar = this.d;
            int i = message.what;
            aces acesVar = acelVar.a;
            acesVar.d(acesVar.b.getWidth(), acelVar.a.b.getHeight());
        } else {
            acel acelVar2 = this.d;
            int i2 = message.what;
            aces acesVar2 = acelVar2.a;
            acesVar2.d(acesVar2.b.getWidth(), acelVar2.a.b.getHeight());
        }
        this.c = message.what;
        return true;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2 = 0;
        if ((i < 0 || i > 30) && (i < 330 || i >= 360)) {
            i2 = (i < 60 || i > 120) ? (i < 150 || i > 210) ? (i < 240 || i > 300) ? -1 : 270 : 180 : 90;
        }
        if (i2 != this.a) {
            this.a = i2;
            this.b.removeCallbacksAndMessages(null);
            if (i2 == -1) {
                return;
            }
            int i3 = this.c;
            if (i3 == -1) {
                this.b.sendEmptyMessage(i2);
            } else if (i3 == i2) {
            } else {
                this.b.sendEmptyMessageDelayed(i2, 200L);
            }
        }
    }
}
