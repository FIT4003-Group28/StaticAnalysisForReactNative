package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.quantum.snackbar.Snackbar;
/* compiled from: PG */
/* renamed from: fvn  reason: default package */
/* loaded from: classes3.dex */
final class fvn implements fuf {
    private final Snackbar a;

    public fvn(Snackbar snackbar) {
        this.a = snackbar;
        snackbar.setOnClickListener(null);
        snackbar.setClickable(false);
        snackbar.setOnTouchListener(new gia(1));
    }

    @Override // defpackage.fuf
    public final /* bridge */ /* synthetic */ View a(fue fueVar, final ftp ftpVar) {
        final fvl fvlVar = (fvl) fueVar;
        CharSequence charSequence = fvlVar.b;
        if (TextUtils.isEmpty(charSequence)) {
            this.a.d(fvlVar.a);
        } else {
            this.a.e(fvlVar.a, charSequence.toString(), new View.OnClickListener() { // from class: fvm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ftp ftpVar2 = ftp.this;
                    fvl fvlVar2 = fvlVar;
                    ftpVar2.a(1);
                    View.OnClickListener onClickListener = fvlVar2.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }
        return this.a;
    }
}
