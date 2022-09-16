package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aei  reason: default package */
/* loaded from: classes.dex */
public final class aei extends dh {
    final Handler ae = new Handler(Looper.getMainLooper());
    final Runnable af = new aee(this);
    ady ag;
    public int ah;
    public int ai;
    public ImageView aj;
    TextView ak;

    private final int aE(int i) {
        Context rb = rb();
        Context a = adv.a(this);
        if (rb == null || a == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        rb.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = a.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.ae.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        ady adyVar = this.ag;
        adyVar.u = 0;
        adyVar.p(1);
        this.ag.o(N(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Context a = adv.a(this);
        if (a != null) {
            ady b = adv.b(a);
            this.ag = b;
            if (b.v == null) {
                b.v = new t();
            }
            b.v.e(this, new aeg(this, 1));
            ady adyVar = this.ag;
            if (adyVar.w == null) {
                adyVar.w = new t();
            }
            adyVar.w.e(this, new aeg(this));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.ah = aE(R.attr.colorError);
        } else {
            Context rb = rb();
            this.ah = rb != null ? ake.d(rb, R.color.biometric_error_color) : 0;
        }
        this.ai = aE(16842808);
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ag.n(true);
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        CharSequence g;
        nw nwVar = new nw(rg());
        nwVar.o(this.ag.i());
        View inflate = LayoutInflater.from(nwVar.a()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence h = this.ag.h();
            if (TextUtils.isEmpty(h)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(h);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.ag.s();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.aj = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.ak = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (acy.c(this.ag.d())) {
            g = N(R.string.confirm_device_credential_password);
        } else {
            g = this.ag.g();
        }
        nwVar.i(g, new aef(this));
        nwVar.p(inflate);
        nx b = nwVar.b();
        b.setCanceledOnTouchOutside(false);
        return b;
    }
}
