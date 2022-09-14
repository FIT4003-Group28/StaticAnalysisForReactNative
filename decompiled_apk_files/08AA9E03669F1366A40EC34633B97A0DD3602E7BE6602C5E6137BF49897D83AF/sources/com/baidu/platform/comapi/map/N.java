package com.baidu.platform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.platform.comapi.AssetsLoadUtil;
/* loaded from: classes.dex */
public class N extends LinearLayout implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f2048a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f2049b;

    /* renamed from: c  reason: collision with root package name */
    private Context f2050c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f2051d;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private int l;
    private boolean m;
    private boolean n;

    @Deprecated
    public N(Context context) {
        super(context);
        this.m = false;
        this.n = false;
        this.f2050c = context;
        c();
        if (this.f2051d == null || this.e == null || this.f == null || this.g == null) {
            return;
        }
        this.f2048a = new ImageView(this.f2050c);
        this.f2049b = new ImageView(this.f2050c);
        this.f2048a.setImageBitmap(this.f2051d);
        this.f2049b.setImageBitmap(this.f);
        this.l = a(this.f.getHeight() / 6);
        a(this.f2048a, "main_topbtn_up.9.png");
        a(this.f2049b, "main_bottombtn_up.9.png");
        this.f2048a.setId(0);
        this.f2049b.setId(1);
        this.f2048a.setClickable(true);
        this.f2049b.setClickable(true);
        this.f2048a.setOnTouchListener(this);
        this.f2049b.setOnTouchListener(this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(this.f2048a);
        addView(this.f2049b);
        this.n = true;
    }

    public N(Context context, boolean z) {
        super(context);
        this.m = false;
        this.n = false;
        this.f2050c = context;
        this.m = z;
        this.f2048a = new ImageView(this.f2050c);
        this.f2049b = new ImageView(this.f2050c);
        if (z) {
            d();
            if (this.h == null || this.i == null || this.j == null || this.k == null) {
                return;
            }
            this.f2048a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            this.f2049b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            this.f2048a.setImageBitmap(this.h);
            this.f2049b.setImageBitmap(this.j);
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            setOrientation(0);
        } else {
            c();
            if (this.f2051d == null || this.e == null || this.f == null || this.g == null) {
                return;
            }
            this.f2048a.setImageBitmap(this.f2051d);
            this.f2049b.setImageBitmap(this.f);
            this.l = a(this.f.getHeight() / 6);
            a(this.f2048a, "main_topbtn_up.9.png");
            a(this.f2049b, "main_bottombtn_up.9.png");
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            setOrientation(1);
        }
        this.f2048a.setId(0);
        this.f2049b.setId(1);
        this.f2048a.setClickable(true);
        this.f2049b.setClickable(true);
        this.f2048a.setOnTouchListener(this);
        this.f2049b.setOnTouchListener(this);
        addView(this.f2048a);
        addView(this.f2049b);
        this.n = true;
    }

    private int a(int i) {
        return (int) ((this.f2050c.getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    private Bitmap a(String str) {
        Matrix matrix = new Matrix();
        int densityDpi = SysOSUtil.getDensityDpi();
        float f = densityDpi > 480 ? 1.8f : (densityDpi <= 320 || densityDpi > 480) ? 1.2f : 1.5f;
        matrix.postScale(f, f);
        Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile(str, this.f2050c);
        return Bitmap.createBitmap(loadAssetsFile, 0, 0, loadAssetsFile.getWidth(), loadAssetsFile.getHeight(), matrix, true);
    }

    private void a(View view, String str) {
        Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile(str, this.f2050c);
        byte[] ninePatchChunk = loadAssetsFile.getNinePatchChunk();
        NinePatch.isNinePatchChunk(ninePatchChunk);
        view.setBackgroundDrawable(new NinePatchDrawable(loadAssetsFile, ninePatchChunk, new Rect(), null));
        view.setPadding(this.l, this.l, this.l, this.l);
    }

    private void c() {
        this.f2051d = a("main_icon_zoomin.png");
        this.e = a("main_icon_zoomin_dis.png");
        this.f = a("main_icon_zoomout.png");
        this.g = a("main_icon_zoomout_dis.png");
    }

    private void d() {
        this.h = a("wear_zoom_in.png");
        this.i = a("wear_zoom_in_pressed.png");
        this.j = a("wear_zoon_out.png");
        this.k = a("wear_zoom_out_pressed.png");
    }

    public void a(View.OnClickListener onClickListener) {
        this.f2048a.setOnClickListener(onClickListener);
    }

    public void a(boolean z) {
        ImageView imageView;
        Bitmap bitmap;
        this.f2048a.setEnabled(z);
        if (!z) {
            imageView = this.f2048a;
            bitmap = this.e;
        } else {
            imageView = this.f2048a;
            bitmap = this.f2051d;
        }
        imageView.setImageBitmap(bitmap);
    }

    public boolean a() {
        return this.n;
    }

    public void b() {
        if (this.f2051d != null && !this.f2051d.isRecycled()) {
            this.f2051d.recycle();
            this.f2051d = null;
        }
        if (this.e != null && !this.e.isRecycled()) {
            this.e.recycle();
            this.e = null;
        }
        if (this.f != null && !this.f.isRecycled()) {
            this.f.recycle();
            this.f = null;
        }
        if (this.g != null && !this.g.isRecycled()) {
            this.g.recycle();
            this.g = null;
        }
        if (this.h != null && !this.h.isRecycled()) {
            this.h.recycle();
            this.h = null;
        }
        if (this.i != null && !this.i.isRecycled()) {
            this.i.recycle();
            this.i = null;
        }
        if (this.j != null && !this.j.isRecycled()) {
            this.j.recycle();
            this.j = null;
        }
        if (this.k == null || this.k.isRecycled()) {
            return;
        }
        this.k.recycle();
        this.k = null;
    }

    public void b(View.OnClickListener onClickListener) {
        this.f2049b.setOnClickListener(onClickListener);
    }

    public void b(boolean z) {
        ImageView imageView;
        Bitmap bitmap;
        this.f2049b.setEnabled(z);
        if (!z) {
            imageView = this.f2049b;
            bitmap = this.g;
        } else {
            imageView = this.f2049b;
            bitmap = this.f;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView;
        Bitmap bitmap;
        ImageView imageView2;
        String str;
        if (view instanceof ImageView) {
            switch (((ImageView) view).getId()) {
                case 0:
                    if (motionEvent.getAction() == 0) {
                        if (!this.m) {
                            imageView2 = this.f2048a;
                            str = "main_topbtn_down.9.png";
                            a(imageView2, str);
                            return false;
                        }
                        imageView = this.f2048a;
                        bitmap = this.i;
                        imageView.setImageBitmap(bitmap);
                        return false;
                    } else if (motionEvent.getAction() != 1) {
                        return false;
                    } else {
                        if (!this.m) {
                            imageView2 = this.f2048a;
                            str = "main_topbtn_up.9.png";
                            a(imageView2, str);
                            return false;
                        }
                        imageView = this.f2048a;
                        bitmap = this.h;
                        imageView.setImageBitmap(bitmap);
                        return false;
                    }
                case 1:
                    if (motionEvent.getAction() == 0) {
                        if (!this.m) {
                            imageView2 = this.f2049b;
                            str = "main_bottombtn_down.9.png";
                            a(imageView2, str);
                            return false;
                        }
                        imageView = this.f2049b;
                        bitmap = this.k;
                        imageView.setImageBitmap(bitmap);
                        return false;
                    } else if (motionEvent.getAction() != 1) {
                        return false;
                    } else {
                        if (!this.m) {
                            imageView2 = this.f2049b;
                            str = "main_bottombtn_up.9.png";
                            a(imageView2, str);
                            return false;
                        }
                        imageView = this.f2049b;
                        bitmap = this.j;
                        imageView.setImageBitmap(bitmap);
                        return false;
                    }
                default:
                    return false;
            }
        }
        return false;
    }
}
