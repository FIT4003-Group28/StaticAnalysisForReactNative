package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.GreenScreenMediaThumbnailContainer;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: gwa  reason: default package */
/* loaded from: classes3.dex */
public final class gwa {
    public final Context a;
    public final HorizontalScrollView b;
    public final ViewGroup c;
    public final int d;
    final HashMap e = new HashMap();
    public DeviceLocalFile f;
    public gvy g;
    public List h;
    public gyq i;
    gvz j;
    public View k;

    public gwa(Context context, HorizontalScrollView horizontalScrollView, ViewGroup viewGroup) {
        this.a = context;
        this.b = horizontalScrollView;
        this.c = viewGroup;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.d = displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final gvz d(View view) {
        return new gvz(view);
    }

    public final View a(int i) {
        LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(i, this.c, false);
        GreenScreenMediaThumbnailContainer greenScreenMediaThumbnailContainer = (GreenScreenMediaThumbnailContainer) inflate.findViewById(R.id.green_screen_media_thumbnail_container);
        greenScreenMediaThumbnailContainer.setOutlineProvider(new gwb(greenScreenMediaThumbnailContainer));
        greenScreenMediaThumbnailContainer.setClipToOutline(true);
        return inflate;
    }

    public final void b(DeviceLocalFile deviceLocalFile) {
        c(deviceLocalFile, true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(DeviceLocalFile deviceLocalFile, boolean z, boolean z2) {
        gvy gvyVar;
        View view;
        DeviceLocalFile deviceLocalFile2 = this.f;
        gvz gvzVar = deviceLocalFile2 == null ? this.j : (gvz) this.e.get(deviceLocalFile2);
        if (gvzVar != null) {
            gvzVar.a();
            gyx gyxVar = gvzVar.c;
            if (gyxVar != null) {
                gyxVar.b();
            }
        }
        if (z2) {
            gvzVar = deviceLocalFile == null ? this.j : (gvz) this.e.get(deviceLocalFile);
            if (gvzVar != null && (view = gvzVar.b) != null) {
                view.setVisibility(0);
            }
        }
        if (true != this.h.contains(deviceLocalFile)) {
            deviceLocalFile = null;
        }
        this.f = deviceLocalFile;
        if (z && (gvyVar = this.g) != null) {
            ((gxs) gvyVar).f(deviceLocalFile, gvzVar, true);
        }
        if (gvzVar != null) {
            View view2 = gvzVar.a;
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new gvx(this, view2));
        }
    }
}
