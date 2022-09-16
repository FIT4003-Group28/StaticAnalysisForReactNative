package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: mbw  reason: default package */
/* loaded from: classes3.dex */
public final class mbw extends fyo {
    public String d;
    private final HashSet e = new HashSet();
    private final fer f;
    private final Handler g;

    public mbw(Handler handler, fer ferVar) {
        this.f = ferVar;
        this.g = handler;
    }

    public final void a(String str) {
        this.e.add(str);
        if (TextUtils.equals(str, this.d)) {
            i();
        }
    }

    public final void b(String str, Bitmap bitmap) {
        c(str, bitmap, ImageView.ScaleType.CENTER_CROP);
    }

    public final void c(String str, Bitmap bitmap, ImageView.ScaleType scaleType) {
        if (this.f.a(str) == null) {
            fep b = this.f.b(str);
            this.f.c(str, b == null ? 0L : b.a, bitmap, scaleType);
        }
        if (TextUtils.equals(str, this.d)) {
            i();
        }
    }

    @Override // defpackage.fyo
    public final boolean j(fyp fypVar, int i) {
        final ggt ggtVar = fypVar.b;
        if (!ggtVar.j()) {
            return true;
        }
        if (i != 1) {
            return i != 2 || this.e.contains(this.d) || this.f.a(this.d) != null || this.f.d;
        }
        String f = ggtVar.f();
        this.d = f;
        this.e.remove(f);
        this.g.postDelayed(new Runnable() { // from class: mbv
            @Override // java.lang.Runnable
            public final void run() {
                mbw mbwVar = mbw.this;
                if (!TextUtils.equals(ggtVar.f(), mbwVar.d) || mbwVar.c == null) {
                    return;
                }
                mbwVar.i();
            }
        }, 5000L);
        return true;
    }
}
