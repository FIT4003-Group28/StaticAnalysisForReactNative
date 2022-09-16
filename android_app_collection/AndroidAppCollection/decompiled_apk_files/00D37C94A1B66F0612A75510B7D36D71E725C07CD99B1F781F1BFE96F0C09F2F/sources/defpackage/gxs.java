package defpackage;

import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.GreenScreenMediaPickerView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gxs  reason: default package */
/* loaded from: classes3.dex */
public final class gxs implements View.OnClickListener, gvy, hdh, hdy {
    public static final amuk a = amuk.o(new ArrayList(Arrays.asList(actj.SHORTS_CREATION_GREEN_SCREEN_REQUEST_PERMISSIONS_BUTTON)));
    public static final amuk b = amuk.o(new ArrayList(Arrays.asList(actj.SHORTS_CREATION_GREEN_SCREEN_SELECT_MEDIA_BUTTON, actj.SHORTS_CREATION_GREEN_SCREEN_LOAD_MORE_MEDIA_BUTTON, actj.SHORTS_CREATION_GREEN_SCREEN_DESELECT_MEDIA_BUTTON)));
    private final Executor A;
    private final Executor B;
    private int C;
    private final zne D;
    public final List c;
    public final EditorButtonView d;
    public final gyq e;
    public final boolean f;
    public final Context g;
    public final dt h;
    final zxr i;
    final zxr j;
    final View k;
    final View l;
    final View m;
    final GreenScreenMediaPickerView n;
    public final View o;
    public final gwa p;
    public hhn q;
    public List r;
    public final HashMap s = new HashMap();
    public gwt t;
    private final View u;
    private final hdi v;
    private final Drawable w;
    private final Drawable x;
    private final int y;
    private final int z;

    public gxs(List list, EditorButtonView editorButtonView, int i, int i2, gyq gyqVar, boolean z, Context context, dt dtVar, hdi hdiVar, Executor executor, Executor executor2) {
        this.c = list;
        this.d = editorButtonView;
        this.y = i;
        this.z = i2;
        this.e = gyqVar;
        this.f = z;
        this.g = context;
        this.h = dtVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.green_screen_allow_access, (ViewGroup) null);
        this.k = inflate;
        View findViewById = inflate.findViewById(R.id.green_screen_allow_access_button);
        this.u = findViewById;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.green_screen_media_picker_bottom_sheet_layout, (ViewGroup) null);
        this.l = inflate2;
        this.m = inflate2.findViewById(R.id.green_screen_no_media_view);
        GreenScreenMediaPickerView greenScreenMediaPickerView = (GreenScreenMediaPickerView) inflate2.findViewById(R.id.green_screen_media_picker_view);
        this.n = greenScreenMediaPickerView;
        this.o = LayoutInflater.from(context).inflate(R.layout.green_screen_gallery_picker_bottom_sheet_layout, (ViewGroup) null);
        gwa gwaVar = new gwa(context, greenScreenMediaPickerView.a, greenScreenMediaPickerView.b);
        this.p = gwaVar;
        this.w = po.b(context, R.drawable.ic_green_screen_on);
        this.x = po.b(context, R.drawable.ic_green_screen_off);
        this.v = hdiVar;
        gxr gxrVar = new gxr(this, context, dtVar.getSupportFragmentManager(), gyqVar.a);
        gxrVar.F(context.getString(R.string.camera_green_screen_done));
        this.i = gxrVar;
        this.j = new gxq(this, context, dtVar.getSupportFragmentManager(), gyqVar.a, Optional.empty());
        this.A = executor;
        this.B = executor2;
        this.D = new zne(context);
        h(false, false);
        editorButtonView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        gwaVar.g = this;
        gwaVar.i = gyqVar;
        hdiVar.g = this;
        hdiVar.e();
    }

    private final void k(boolean z) {
        Drawable drawable;
        hdi hdiVar = this.v;
        hdiVar.a = z;
        if (!z) {
            hdiVar.d = "";
            hdiVar.f();
        }
        hdiVar.d();
        Drawable drawable2 = this.w;
        if (drawable2 == null || (drawable = this.x) == null) {
            return;
        }
        EditorButtonView editorButtonView = this.d;
        if (true != z) {
            drawable2 = drawable;
        }
        editorButtonView.b(drawable2);
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.a((actj) it.next()).a();
        }
        this.r = list;
    }

    public final void c(boolean z) {
        List<actj> list = this.r;
        if (list == null) {
            return;
        }
        for (actj actjVar : list) {
            gyo a2 = this.e.a(actjVar);
            a2.h(z);
            a2.g();
        }
    }

    public final void d(Throwable th, gvz gvzVar) {
        if (gvzVar != null) {
            gvzVar.b();
        }
        this.p.b(null);
        hqs.j(this.g, R.string.shorts_camera_green_screen_failed_loading);
        afus.c(1, 6, "[ShortsCreation][Android][Camera]Failed to save green screen media", th);
    }

    @Override // defpackage.hdy
    public final void e() {
        this.j.z();
    }

    public final void f(final DeviceLocalFile deviceLocalFile, final gvz gvzVar, boolean z) {
        gyx gyxVar;
        if (this.q == null) {
            return;
        }
        boolean z2 = false;
        if (deviceLocalFile == null) {
            k(false);
            return;
        }
        File file = (File) this.s.get(deviceLocalFile);
        String str = null;
        if ((file != null && file.exists()) || this.q == null) {
            if (gvzVar != null) {
                gvzVar.b();
            }
            hdi hdiVar = this.v;
            if (file != null && file.exists()) {
                str = file.getPath();
            }
            hdiVar.b(str);
            if (file != null && file.exists()) {
                z2 = true;
            }
            k(z2);
        } else if (z) {
            if (gvzVar != null && (gyxVar = gvzVar.c) != null) {
                gyxVar.c();
            }
            int i = this.C;
            this.C = i + 1;
            final String valueOf = String.valueOf(i);
            final hhn hhnVar = this.q;
            final ContentResolver contentResolver = this.g.getContentResolver();
            Executor executor = this.A;
            final int i2 = this.z;
            final int i3 = this.y;
            ylx.k(anlz.u(new Callable() { // from class: gwc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bitmap bitmap;
                    hhn hhnVar2 = hhn.this;
                    DeviceLocalFile deviceLocalFile2 = deviceLocalFile;
                    ContentResolver contentResolver2 = contentResolver;
                    int i4 = i2;
                    int i5 = i3;
                    String str2 = valueOf;
                    File file2 = null;
                    if (hhnVar2 != null) {
                        try {
                            if (Build.VERSION.SDK_INT >= 29) {
                                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver2, deviceLocalFile2.f()));
                            } else {
                                bitmap = MediaStore.Images.Media.getBitmap(contentResolver2, deviceLocalFile2.f());
                            }
                        } catch (IOException e) {
                            afus.c(1, 6, "[ShortsCreation][Android][Camera]Failed loading image", e);
                            bitmap = null;
                        }
                        double d = i4;
                        double d2 = i5;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        Bitmap f = gyy.f(bitmap, d / d2);
                        Bitmap createScaledBitmap = f == null ? null : Bitmap.createScaledBitmap(f, i5, i4, true);
                        String valueOf2 = String.valueOf(str2);
                        File i6 = hhnVar2.i(valueOf2.length() != 0 ? "green_screen_image".concat(valueOf2) : new String("green_screen_image"));
                        try {
                            hhw.d(createScaledBitmap, i6, Bitmap.CompressFormat.PNG);
                            file2 = i6;
                        } catch (IOException e2) {
                            zep.f("ShortsProject", "Error saving green screen background image", e2);
                            afus.c(2, 6, "[ShortsCreation][Android][ProjectState]Error saving green screen background image", e2);
                        }
                    }
                    return ampq.i(file2);
                }
            }, executor), this.B, new ylv() { // from class: gxm
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    gxs.this.d(th, gvzVar);
                }
            }, new ylw() { // from class: gxn
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    gxs gxsVar = gxs.this;
                    DeviceLocalFile deviceLocalFile2 = deviceLocalFile;
                    gvz gvzVar2 = gvzVar;
                    ampq ampqVar = (ampq) obj;
                    if (!ampqVar.h()) {
                        gxsVar.d(new IOException("Null file returned from save"), gvzVar2);
                        return;
                    }
                    gxsVar.s.put(deviceLocalFile2, (File) ampqVar.c());
                    if (deviceLocalFile2.equals(gxsVar.p.f)) {
                        gxsVar.f(deviceLocalFile2, gvzVar2, false);
                        return;
                    }
                    if (gvzVar2 != null) {
                        gvzVar2.b();
                    }
                    zep.g("Selected green screen media has changed.");
                }
            });
        } else {
            f(null, gvzVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(final boolean z, final boolean z2) {
        if (!j()) {
            return;
        }
        final zne zneVar = this.D;
        ylx.k(anlz.u(new Callable() { // from class: gwd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zne.this.c(1);
            }
        }, this.A), this.B, new ylv() { // from class: gxl
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                gxs.this.i(null, false, false);
                afus.c(1, 6, "[ShortsCreation][Android][Camera]Failed to load green screen media list", th);
            }
        }, new ylw() { // from class: gxo
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                gxs.this.i((List) obj, z, z2);
            }
        });
    }

    public final void i(List list, boolean z, boolean z2) {
        ViewGroup viewGroup;
        Bitmap bitmap;
        if (list == null || list.isEmpty()) {
            this.m.setVisibility(0);
            this.n.setVisibility(4);
            k(false);
            return;
        }
        this.m.setVisibility(4);
        this.n.setVisibility(0);
        k(z);
        final gwa gwaVar = this.p;
        gwaVar.h = list;
        gwaVar.c.removeAllViews();
        gwaVar.e.clear();
        if (gwaVar.j == null) {
            View a2 = gwaVar.a(R.layout.green_screen_deselect_list_item);
            if (a2 != null) {
                a2.setOnClickListener(new gvv(gwaVar, 1));
            }
            if (a2 != null) {
                gwaVar.j = gwa.d(a2);
            }
        }
        gvz gvzVar = gwaVar.j;
        if (gvzVar != null) {
            gwaVar.c.addView(gvzVar.a);
        }
        for (final DeviceLocalFile deviceLocalFile : (List) Collection.EL.stream(gwaVar.h).limit(30L).collect(Collectors.toList())) {
            View a3 = gwaVar.a(R.layout.green_screen_media_picker_list_item);
            View view = null;
            if (a3 == null) {
                a3 = null;
            } else {
                int dimensionPixelSize = gwaVar.a.getResources().getDimensionPixelSize(R.dimen.green_screen_media_item_thumbnail_view_size);
                ContentResolver contentResolver = gwaVar.a.getContentResolver();
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        bitmap = contentResolver.loadThumbnail(deviceLocalFile.f(), new Size(dimensionPixelSize, dimensionPixelSize), null);
                    } catch (Exception e) {
                        if (!(e instanceof OperationCanceledException)) {
                            afus.c(1, 6, "[ShortsCreation][Android][Camera]Failed loading thumbnail", e);
                        }
                        bitmap = null;
                    }
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.outHeight = dimensionPixelSize;
                    options.outWidth = dimensionPixelSize;
                    bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, deviceLocalFile.c(), 1, options);
                }
                ((ImageView) a3.findViewById(R.id.green_screen_media_item_thumbnail)).setImageBitmap(gyy.f(bitmap, 1.0d));
            }
            if (a3 != null) {
                gwaVar.e.put(deviceLocalFile, gwa.d(a3));
                a3.setContentDescription(deviceLocalFile.h());
                a3.setOnClickListener(new View.OnClickListener() { // from class: gvw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        gwa gwaVar2 = gwa.this;
                        DeviceLocalFile deviceLocalFile2 = deviceLocalFile;
                        if (true == deviceLocalFile2.equals(gwaVar2.f)) {
                            deviceLocalFile2 = null;
                        }
                        gwaVar2.b(deviceLocalFile2);
                        gyq gyqVar = gwaVar2.i;
                        if (gyqVar != null) {
                            gyqVar.a(actj.SHORTS_CREATION_GREEN_SCREEN_SELECT_MEDIA_BUTTON).b();
                        }
                    }
                });
                view = a3;
            }
            if (view != null) {
                gwaVar.c.addView(view);
            }
        }
        if (gwaVar.h.size() > 30) {
            if (gwaVar.k == null) {
                View a4 = gwaVar.a(R.layout.green_screen_more_media_list_item);
                if (a4 != null) {
                    a4.setOnClickListener(new gvv(gwaVar));
                }
                gwaVar.k = a4;
            }
            View view2 = gwaVar.k;
            if (view2 != null) {
                gwaVar.c.addView(view2);
            }
        }
        if (gwaVar.c.getChildCount() > 0) {
            int dimensionPixelSize2 = gwaVar.a.getResources().getDimensionPixelSize(R.dimen.green_screen_media_item_first_last_item_margin);
            View childAt = gwaVar.c.getChildAt(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.setMarginStart(dimensionPixelSize2);
            childAt.setLayoutParams(layoutParams);
            View childAt2 = gwaVar.c.getChildAt(viewGroup.getChildCount() - 1);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            layoutParams2.setMarginEnd(dimensionPixelSize2);
            childAt2.setLayoutParams(layoutParams2);
        }
        DeviceLocalFile deviceLocalFile2 = gwaVar.f;
        gwaVar.c(deviceLocalFile2, false, deviceLocalFile2 != null);
        if (!z2) {
            return;
        }
        this.e.c(acuo.a(127083)).b();
        b(b);
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return zwn.e(this.h, 0);
    }

    @Override // defpackage.hdy
    public final void lP() {
        gwt gwtVar = this.t;
        if (gwtVar != null) {
            gwtVar.a();
        }
    }

    @Override // defpackage.hdy
    public final void lQ(DeviceLocalFile deviceLocalFile) {
        this.j.z();
        this.p.b(deviceLocalFile);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.d) {
            this.e.a(actj.SHORTS_CREATION_GREEN_SCREEN_BUTTON).b();
            zxr zxrVar = this.i;
            if (zxrVar == null) {
                return;
            }
            zxrVar.G();
        } else if (view != this.u) {
        } else {
            zxr zxrVar2 = this.i;
            if (zxrVar2 != null) {
                zxrVar2.z();
            }
            gwt gwtVar = this.t;
            if (gwtVar != null) {
                gwtVar.a();
            }
            this.e.a(actj.SHORTS_CREATION_GREEN_SCREEN_REQUEST_PERMISSIONS_BUTTON).b();
        }
    }
}
