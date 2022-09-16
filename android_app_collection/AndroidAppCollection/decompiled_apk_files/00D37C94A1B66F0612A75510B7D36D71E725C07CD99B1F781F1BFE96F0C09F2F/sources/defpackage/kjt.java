package defpackage;

import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
/* compiled from: PG */
/* renamed from: kjt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kjt implements ayqb {
    private final /* synthetic */ int v;
    public static final /* synthetic */ kjt u = new kjt(20);
    public static final /* synthetic */ kjt t = new kjt(19);
    public static final /* synthetic */ kjt s = new kjt(18);
    public static final /* synthetic */ kjt r = new kjt(17);
    public static final /* synthetic */ kjt q = new kjt(16);
    public static final /* synthetic */ kjt p = new kjt(15);
    public static final /* synthetic */ kjt o = new kjt(14);
    public static final /* synthetic */ kjt n = new kjt(13);
    public static final /* synthetic */ kjt m = new kjt(12);
    public static final /* synthetic */ kjt l = new kjt(11);
    public static final /* synthetic */ kjt k = new kjt(10);
    public static final /* synthetic */ kjt j = new kjt(9);
    public static final /* synthetic */ kjt i = new kjt(8);
    public static final /* synthetic */ kjt h = new kjt(7);
    public static final /* synthetic */ kjt g = new kjt(6);
    public static final /* synthetic */ kjt f = new kjt(5);
    public static final /* synthetic */ kjt e = new kjt(4);
    public static final /* synthetic */ kjt d = new kjt(3);
    public static final /* synthetic */ kjt c = new kjt(2);
    public static final /* synthetic */ kjt b = new kjt(1);
    public static final /* synthetic */ kjt a = new kjt();

    private /* synthetic */ kjt() {
    }

    private /* synthetic */ kjt(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                long j2 = kjv.a;
                zep.d("Error subscribing to video stage", (Throwable) obj);
                return;
            case 1:
                zep.d("Error when subscribing to accessibility state", (Throwable) obj);
                return;
            case 2:
                zna.q((Throwable) obj);
                return;
            case 3:
                zep.d("Error when subscribing to video stage event", (Throwable) obj);
                return;
            case 4:
                zna.q((Throwable) obj);
                return;
            case 5:
                zna.q((Throwable) obj);
                return;
            case 6:
                zna.q((Throwable) obj);
                return;
            case 7:
                zna.q((Throwable) obj);
                return;
            case 8:
                zep.d("SearchHotConfig observer error %s", (Throwable) obj);
                return;
            case 9:
                zna.q((Throwable) obj);
                return;
            case 10:
                zna.q((Throwable) obj);
                return;
            case 11:
                zna.q((Throwable) obj);
                return;
            case 12:
                Drawable drawable = (Drawable) obj;
                if (!(drawable instanceof FrameSequenceDrawable)) {
                    return;
                }
                ((FrameSequenceDrawable) drawable).setLoopBehavior(3);
                return;
            case 13:
                zep.d("Error downloading or decoding asset.", (Throwable) obj);
                return;
            case 14:
                zna.q((Throwable) obj);
                return;
            case 15:
                zna.q((Throwable) obj);
                return;
            case 16:
                zna.q((Throwable) obj);
                return;
            case 17:
                Throwable th = (Throwable) obj;
                throw new IllegalStateException("Unable to update account link state");
            case 18:
                zna.q((Throwable) obj);
                return;
            case 19:
                zna.q((Throwable) obj);
                return;
            default:
                zna.q((Throwable) obj);
                return;
        }
    }
}
