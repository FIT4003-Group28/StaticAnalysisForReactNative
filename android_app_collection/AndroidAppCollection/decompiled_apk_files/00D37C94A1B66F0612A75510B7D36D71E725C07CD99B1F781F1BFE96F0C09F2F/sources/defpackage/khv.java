package defpackage;

import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: khv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class khv implements Consumer {
    private final /* synthetic */ int o;
    public static final /* synthetic */ khv n = new khv(16);
    public static final /* synthetic */ khv m = new khv(15);
    public static final /* synthetic */ khv l = new khv(13);
    public static final /* synthetic */ khv k = new khv(11);
    public static final /* synthetic */ khv j = new khv(10);
    public static final /* synthetic */ khv i = new khv(9);
    public static final /* synthetic */ khv h = new khv(8);
    public static final /* synthetic */ khv g = new khv(7);
    public static final /* synthetic */ khv f = new khv(6);
    public static final /* synthetic */ khv e = new khv(5);
    public static final /* synthetic */ khv d = new khv(4);
    public static final /* synthetic */ khv c = new khv(3);
    public static final /* synthetic */ khv b = new khv(2);
    public static final /* synthetic */ khv a = new khv(1);

    public /* synthetic */ khv() {
    }

    public /* synthetic */ khv(int i2) {
        this.o = i2;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.o) {
            case 0:
                return consumer.getClass();
            case 1:
                return consumer.getClass();
            case 2:
                return consumer.getClass();
            case 3:
                return consumer.getClass();
            case 4:
                return consumer.getClass();
            case 5:
                return consumer.getClass();
            case 6:
                return consumer.getClass();
            case 7:
                return consumer.getClass();
            case 8:
                return consumer.getClass();
            case 9:
                return consumer.getClass();
            case 10:
                return consumer.getClass();
            case 11:
                return consumer.getClass();
            case 12:
                return consumer.getClass();
            case 13:
                return consumer.getClass();
            case 14:
                return consumer.getClass();
            case 15:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.o) {
            case 0:
                ((ffo) obj).sendAccessibilityEvent(4);
                return;
            case 1:
                ((ffo) obj).l();
                return;
            case 2:
                ((nj) obj).j(true);
                return;
            case 3:
                ((EdgeEffect) obj).finish();
                return;
            case 4:
                ((EdgeEffect) obj).onRelease();
                return;
            case 5:
                ((ngz) obj).bd();
                return;
            case 6:
                ((nhb) obj).be();
                return;
            case 7:
                ((nhb) obj).be();
                return;
            case 8:
                ((nhb) obj).be();
                return;
            case 9:
                ((nhb) obj).be();
                return;
            case 10:
                ((View) obj).clearAnimation();
                return;
            case 11:
                ((c) obj).a();
                return;
            case 12:
                ssz sszVar = (ssz) obj;
                int i2 = yxz.f;
                return;
            case 13:
                ((adbb) obj).b();
                return;
            case 14:
                afus.c(2, 27, "Error found with DfeStackSampler Polling", (Throwable) obj);
                return;
            case 15:
                afus.c(2, 27, "Error found with AppProfiler", (Throwable) obj);
                return;
            default:
                Throwable th = (Throwable) obj;
                return;
        }
    }
}
