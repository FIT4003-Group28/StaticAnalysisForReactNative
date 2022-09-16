package defpackage;

import android.view.View;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: onq  reason: default package */
/* loaded from: classes3.dex */
public final class onq extends onc implements bit {
    onk ae;
    public ony af;

    @Override // defpackage.bjk
    public final void aF(boolean z) {
        onk onkVar = this.ae;
        if (onkVar == null) {
            return;
        }
        int a = onkVar.a();
        int b = this.ae.b();
        this.ae = null;
        if (!z) {
            return;
        }
        if (a == 0) {
            if (b == 0) {
                this.af.d(false);
                return;
            }
            a = 0;
        }
        this.af.d(true);
        this.af.e((a * 60) + b);
    }

    @Override // defpackage.bjk
    protected final View aK() {
        onk onkVar = new onk(rb());
        this.ae = onkVar;
        onkVar.e(onl.a, onl.b);
        int a = this.af.a();
        this.ae.c(a / 60);
        this.ae.d(a % 60);
        return this.ae;
    }

    @Override // defpackage.bit
    public final Preference ov(CharSequence charSequence) {
        return null;
    }
}
