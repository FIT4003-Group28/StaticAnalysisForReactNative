package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
/* compiled from: PG */
/* renamed from: bjk  reason: default package */
/* loaded from: classes2.dex */
public abstract class bjk extends dh implements DialogInterface.OnClickListener {
    private DialogPreference ae;
    private CharSequence af;
    private CharSequence ag;
    private CharSequence ah;
    public int ai;
    private CharSequence aj;
    private int ak;
    private BitmapDrawable al;

    /* JADX INFO: Access modifiers changed from: protected */
    public void aE(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.aj;
            int i = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            if (findViewById.getVisibility() == i) {
                return;
            }
            findViewById.setVisibility(i);
        }
    }

    public abstract void aF(boolean z);

    protected void aG() {
    }

    protected boolean aI() {
        return false;
    }

    public final DialogPreference aJ() {
        if (this.ae == null) {
            this.ae = (DialogPreference) ((bit) mI()).ov(this.m.getString("key"));
        }
        return this.ae;
    }

    protected View aK() {
        int i = this.ak;
        if (i == 0) {
            return null;
        }
        return mM().inflate(i, (ViewGroup) null);
    }

    protected void jR(nw nwVar) {
    }

    @Override // defpackage.dh, defpackage.dp
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        dp mI = mI();
        if (!(mI instanceof bit)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        bit bitVar = (bit) mI;
        String string = this.m.getString("key");
        if (bundle == null) {
            DialogPreference dialogPreference = (DialogPreference) bitVar.ov(string);
            this.ae = dialogPreference;
            this.af = dialogPreference.a;
            this.ag = dialogPreference.d;
            this.ah = dialogPreference.e;
            this.aj = dialogPreference.b;
            this.ak = dialogPreference.f;
            Drawable drawable = dialogPreference.c;
            if (drawable == null || (drawable instanceof BitmapDrawable)) {
                this.al = (BitmapDrawable) drawable;
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            this.al = new BitmapDrawable(rh(), createBitmap);
            return;
        }
        this.af = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.ag = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.ah = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.aj = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.ak = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap == null) {
            return;
        }
        this.al = new BitmapDrawable(rh(), bitmap);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ai = i;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aF(this.ai == -1);
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        this.ai = -2;
        nw nwVar = new nw(rb());
        nwVar.o(this.af);
        nwVar.e(this.al);
        nwVar.l(this.ag, this);
        nwVar.i(this.ah, this);
        rb();
        View aK = aK();
        if (aK != null) {
            aE(aK);
            nwVar.p(aK);
        } else {
            nwVar.g(this.aj);
        }
        jR(nwVar);
        nx b = nwVar.b();
        if (aI()) {
            Window window = b.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                bjj.a(window);
            } else {
                aG();
            }
        }
        return b;
    }

    @Override // defpackage.dh, defpackage.dp
    public void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.af);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ag);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.ah);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.aj);
        bundle.putInt("PreferenceDialogFragment.layout", this.ak);
        BitmapDrawable bitmapDrawable = this.al;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
