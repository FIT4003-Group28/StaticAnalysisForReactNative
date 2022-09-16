package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: kej  reason: default package */
/* loaded from: classes3.dex */
public final class kej implements ffu {
    public boolean a;
    final yye b;
    private boolean c;
    private boolean d;
    private CharSequence e;
    private boolean f;

    public kej(yye yyeVar) {
        this.b = yyeVar;
        a(false);
        e(null, null, null);
    }

    private final void j(boolean z) {
        this.b.a(this.c, z);
    }

    @Override // defpackage.ffu
    public final void a(boolean z) {
        this.c = false;
        j(z);
    }

    @Override // defpackage.ffu
    public final void b(boolean z) {
    }

    @Override // defpackage.ffu
    public final void d(boolean z) {
        if (!this.a) {
            this.d = z;
        }
    }

    @Override // defpackage.ffu
    public final void e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (this.d) {
            i(charSequence);
        }
    }

    @Override // defpackage.ffu
    public final void f(boolean z) {
        if (this.c) {
            return;
        }
        this.c = true;
        j(z);
    }

    @Override // defpackage.ffu
    public final void g(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(CharSequence charSequence) {
        this.a = false;
        d(false);
        this.a = true;
        i(charSequence);
    }

    final void i(CharSequence charSequence) {
        boolean z = !this.d;
        if (!TextUtils.equals(this.e, charSequence) || this.f != z) {
            this.f = z;
            this.e = charSequence;
            ((TextView) this.b.b).setText(this.e);
        }
    }

    @Override // defpackage.ffu
    public final void nE(boolean z) {
        if (!this.a) {
            this.d = !z;
        }
    }
}
