package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gvi  reason: default package */
/* loaded from: classes3.dex */
public final class gvi implements View.OnClickListener {
    public final EditorButtonView a;
    public final ImageView b;
    public boolean c;
    public hhn d;
    private final gyq e;
    private final boolean f;
    private final Drawable g;
    private final Drawable h;
    private final Executor i;
    private final Executor j;

    public gvi(Context context, EditorButtonView editorButtonView, ImageView imageView, Executor executor, Executor executor2, gyq gyqVar, boolean z) {
        this.a = editorButtonView;
        this.e = gyqVar;
        this.b = imageView;
        this.g = po.b(context, R.drawable.ic_camera_align_button_on_v2);
        this.h = po.b(context, R.drawable.ic_camera_align_button_off_v2);
        this.i = executor;
        this.j = executor2;
        this.f = z;
    }

    public final void a(boolean z) {
        if (z) {
            Drawable drawable = this.g;
            if (drawable != null) {
                this.a.b(drawable);
            }
            this.b.setVisibility(0);
            return;
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            this.a.b(drawable2);
        }
        this.b.setVisibility(8);
    }

    public final void b(Throwable th) {
        c(null);
        afus.c(1, 6, "[ShortsCreation][Android]Failed to generate overlay", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Bitmap bitmap) {
        String str;
        hhn hhnVar = this.d;
        if (hhnVar == null) {
            return;
        }
        hhnVar.f = bitmap;
        synchronized (hhnVar.b) {
            if (hhnVar.y() && !hhnVar.d.isEmpty()) {
                File i = hhnVar.i(((axda) arey.s(hhnVar.d)).h);
                try {
                    str = i.getCanonicalPath();
                } catch (IOException e) {
                    e = e;
                    str = null;
                }
                try {
                    hhw.d(hhnVar.f, i, Bitmap.CompressFormat.JPEG);
                    hhnVar.a.remove(str);
                } catch (IOException e2) {
                    e = e2;
                    if (str != null && hhnVar.a.add(str)) {
                        zep.f("ShortsProject", "Error saving align overlay image", e);
                        afus.c(2, 6, "[ShortsCreation][Android][ProjectState]Error saving align overlay image", e);
                    }
                    d(false);
                }
            }
        }
        d(false);
    }

    public final void d(boolean z) {
        ankt u;
        ylr.c();
        hhn hhnVar = this.d;
        if (hhnVar == null) {
            return;
        }
        hhnVar.A(!z);
        Bitmap bitmap = hhnVar.f;
        File h = this.d.h();
        if (bitmap != null) {
            if (this.f && this.a.getVisibility() == 8) {
                gyo a = this.e.a(actj.SHORTS_CREATION_OVERLAY_BUTTON);
                a.h(true);
                a.g();
            }
            this.a.setVisibility(0);
            this.b.setImageBitmap(bitmap);
        } else if (z && h != null) {
            final String absolutePath = h.getAbsolutePath();
            Executor executor = this.i;
            if (Build.VERSION.SDK_INT >= 28) {
                u = anlz.u(new gvj(absolutePath, 1), executor);
            } else {
                u = anlz.u(new gvj(absolutePath), executor);
            }
            ylx.k(u, this.j, new ylv() { // from class: gvg
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    gvi.this.b(th);
                }
            }, new ylw() { // from class: gvh
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    gvi gviVar = gvi.this;
                    String str = absolutePath;
                    ampq ampqVar = (ampq) obj;
                    hhn hhnVar2 = gviVar.d;
                    if (hhnVar2 == null) {
                        return;
                    }
                    File h2 = hhnVar2.h();
                    if (!ampqVar.h()) {
                        gviVar.b(new IOException("bitmap retrieved was null"));
                    } else if (h2 == null || !str.equals(h2.getAbsolutePath())) {
                        zep.g("Align overlay discarded: current video segment has changed.");
                    } else {
                        gviVar.c((Bitmap) ampqVar.c());
                    }
                }
            });
        } else {
            if (this.f && this.a.getVisibility() == 0) {
                gyo a2 = this.e.a(actj.SHORTS_CREATION_OVERLAY_BUTTON);
                a2.h(false);
                a2.g();
            }
            this.a.setVisibility(8);
            this.b.setImageDrawable(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.a) {
            gyq gyqVar = this.e;
            if (gyqVar != null) {
                gyqVar.a(actj.SHORTS_CREATION_OVERLAY_BUTTON).b();
            }
            boolean z = !this.c;
            this.c = z;
            a(z);
        }
    }
}
