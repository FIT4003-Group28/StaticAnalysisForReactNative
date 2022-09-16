package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: gyh  reason: default package */
/* loaded from: classes3.dex */
public final class gyh extends zxr implements hdy {
    public gws a;
    private final Context b;
    private final gyq c;
    private final View d;

    public gyh(Context context, eo eoVar, gyq gyqVar) {
        super(context, eoVar, gyqVar.a, Optional.empty(), true, true, true);
        this.b = context;
        this.c = gyqVar;
        this.d = LayoutInflater.from(context).inflate(R.layout.shorts_segment_import_layout, (ViewGroup) null);
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.d;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return this.b.getString(R.string.shorts_segment_import_bottom_sheet_title);
    }

    @Override // defpackage.hdy
    public final void e() {
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void g() {
        super.g();
        hdz hdzVar = (hdz) y().f("nestedGalleryFragment");
        if (hdzVar == null) {
            hdzVar = hdz.aG(true, null);
        }
        hdzVar.d = this;
        ex l = y().l();
        l.u(R.id.nested_gallery_fragment, hdzVar, "nestedGalleryFragment");
        l.a();
        this.c.c(acuo.a(121258)).b();
        gyo a = this.c.a(actj.SHORTS_CREATION_GALLERY_CELL);
        a.h(true);
        a.a();
    }

    @Override // defpackage.hdy
    public final void lP() {
        gxh gxhVar;
        gws gwsVar = this.a;
        if (gwsVar == null || (gxhVar = gwsVar.a.e) == null) {
            return;
        }
        gxhVar.lP();
    }

    @Override // defpackage.hdy
    public final void lQ(DeviceLocalFile deviceLocalFile) {
        gxh gxhVar;
        z();
        gws gwsVar = this.a;
        if (gwsVar == null || (gxhVar = gwsVar.a.e) == null) {
            return;
        }
        ((hes) gxhVar).aI(deviceLocalFile, 5);
    }
}
