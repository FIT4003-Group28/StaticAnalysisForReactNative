package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: cwdw  reason: default package */
/* loaded from: classes5.dex */
public final class cwdw extends cwdz {
    public Integer a;
    public Drawable b;
    public cwdd c;
    private String d;
    private View.OnClickListener e;

    @Override // defpackage.cwdz
    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    @Override // defpackage.cwdz
    public final void c(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.e = onClickListener;
            return;
        }
        throw new NullPointerException("Null onClickListener");
    }

    @Override // defpackage.cwdz
    public final cwea a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" icon");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" label");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" onClickListener");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwdx(this.a.intValue(), this.b, this.d, this.e, this.c);
    }
}
