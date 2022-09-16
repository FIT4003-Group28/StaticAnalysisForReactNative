package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gvv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gvv implements View.OnClickListener {
    public final /* synthetic */ gwa a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvv(gwa gwaVar) {
        this.a = gwaVar;
    }

    public /* synthetic */ gvv(gwa gwaVar, int i) {
        this.b = i;
        this.a = gwaVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gvy, hdy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gxs gxsVar;
        zxr zxrVar;
        if (this.b != 0) {
            gwa gwaVar = this.a;
            gwaVar.b(null);
            gyq gyqVar = gwaVar.i;
            if (gyqVar == null) {
                return;
            }
            gyqVar.a(actj.SHORTS_CREATION_GREEN_SCREEN_DESELECT_MEDIA_BUTTON).b();
            return;
        }
        gwa gwaVar2 = this.a;
        ?? r1 = gwaVar2.g;
        if (r1 != 0 && (zxrVar = (gxsVar = (gxs) r1).j) != null) {
            zxrVar.G();
            hdz hdzVar = (hdz) gxsVar.j.y().f("nestedGreenScreenGalleryFragment");
            if (hdzVar == null) {
                hdzVar = hdz.aF(true, R.string.camera_green_screen_label, false, 1, null);
            }
            hdzVar.d = r1;
            ex l = gxsVar.j.y().l();
            l.u(R.id.green_screen_media_picker_view, hdzVar, "nestedGreenScreenGalleryFragment");
            l.a();
        }
        gyq gyqVar2 = gwaVar2.i;
        if (gyqVar2 == null) {
            return;
        }
        gyqVar2.a(actj.SHORTS_CREATION_GREEN_SCREEN_LOAD_MORE_MEDIA_BUTTON).b();
    }
}
