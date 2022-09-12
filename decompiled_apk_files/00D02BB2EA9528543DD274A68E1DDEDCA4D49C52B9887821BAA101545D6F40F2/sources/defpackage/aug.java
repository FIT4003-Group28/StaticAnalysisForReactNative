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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;
/* compiled from: PG */
/* renamed from: aug  reason: default package */
/* loaded from: classes2.dex */
public abstract class aug extends ex implements DialogInterface.OnClickListener {
    private DialogPreference ad;
    private CharSequence ae;
    private CharSequence af;
    private CharSequence ag;
    public int ah;
    private CharSequence ai;
    private int aj;
    private BitmapDrawable ak;

    /* JADX INFO: Access modifiers changed from: protected */
    public void aJ(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.ai;
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

    protected boolean aK() {
        return false;
    }

    public abstract void aL(boolean z);

    protected void aM(qx qxVar) {
    }

    public final DialogPreference aN() {
        if (this.ad == null) {
            this.ad = (DialogPreference) ((atl) G()).Ri(this.o.getString("key"));
        }
        return this.ad;
    }

    @Override // defpackage.ex, defpackage.fd
    public void l(Bundle bundle) {
        super.l(bundle);
        fd G = G();
        if (!(G instanceof atl)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        atl atlVar = (atl) G;
        String string = this.o.getString("key");
        if (bundle == null) {
            DialogPreference dialogPreference = (DialogPreference) atlVar.Ri(string);
            this.ad = dialogPreference;
            this.ae = dialogPreference.a;
            this.af = dialogPreference.d;
            this.ag = dialogPreference.e;
            this.ai = dialogPreference.b;
            this.aj = dialogPreference.f;
            Drawable drawable = dialogPreference.c;
            if (drawable == null || (drawable instanceof BitmapDrawable)) {
                this.ak = (BitmapDrawable) drawable;
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            this.ak = new BitmapDrawable(Rn(), createBitmap);
            return;
        }
        this.ae = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.af = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.ag = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.ai = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.aj = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap == null) {
            return;
        }
        this.ak = new BitmapDrawable(Rn(), bitmap);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ah = i;
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aL(this.ah == -1);
    }

    @Override // defpackage.ex
    public Dialog q(Bundle bundle) {
        this.ah = -2;
        qx qxVar = new qx(H());
        qxVar.j(this.ae);
        qxVar.e(this.ak);
        qxVar.h(this.af, this);
        qxVar.g(this.ag, this);
        int i = this.aj;
        View view = null;
        if (i != 0) {
            LayoutInflater layoutInflater = this.W;
            if (layoutInflater == null) {
                layoutInflater = ad(null);
            }
            view = layoutInflater.inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            aJ(view);
            qxVar.k(view);
        } else {
            qxVar.f(this.ai);
        }
        aM(qxVar);
        qy b = qxVar.b();
        if (aK()) {
            Window window = b.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
            } else {
                window.setSoftInputMode(5);
            }
        }
        return b;
    }

    @Override // defpackage.ex, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ae);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.af);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.ag);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.ai);
        bundle.putInt("PreferenceDialogFragment.layout", this.aj);
        BitmapDrawable bitmapDrawable = this.ak;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
