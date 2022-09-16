package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gxb  reason: default package */
/* loaded from: classes3.dex */
public final class gxb implements zlz {
    final /* synthetic */ gxk a;

    public gxb(gxk gxkVar) {
        this.a = gxkVar;
    }

    @Override // defpackage.zlz
    public final void a() {
    }

    @Override // defpackage.zlz
    public final void b() {
        zma i;
        if (this.a.aA.i() != null) {
            float f = i.b / i.a;
            gxk gxkVar = this.a;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            gxkVar.mJ().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            float f2 = i2;
            float f3 = i3;
            if (f >= f2 / f3) {
                i2 = (int) (f3 * f);
            } else {
                i3 = (int) (f2 / f);
            }
            gxkVar.aA.u(i2, i3);
            zgd.t(gxkVar.aR, zgd.s(i2, i3), ViewGroup.LayoutParams.class);
            zgd.t(gxkVar.aT, zgd.s(i2, i3), ViewGroup.LayoutParams.class);
        }
    }

    @Override // defpackage.zlz
    public final void d() {
    }

    @Override // defpackage.zlz
    public final void mi() {
        this.a.aH();
        gxk gxkVar = this.a;
        int i = gxkVar.aV;
        if (i != -1) {
            gxkVar.aA.B(i);
            this.a.aV = -1;
        }
    }

    @Override // defpackage.zlz
    public final void mm() {
        dt mJ = this.a.mJ();
        if (mJ == null) {
            return;
        }
        WindowManager.LayoutParams attributes = mJ.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        mJ.getWindow().setAttributes(attributes);
    }

    @Override // defpackage.zlz
    public final void mn() {
        dt mJ = this.a.mJ();
        if (mJ == null) {
            return;
        }
        WindowManager.LayoutParams attributes = mJ.getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        mJ.getWindow().setAttributes(attributes);
    }
}
