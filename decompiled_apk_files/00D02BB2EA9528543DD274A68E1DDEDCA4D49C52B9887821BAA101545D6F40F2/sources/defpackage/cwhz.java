package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwhz  reason: default package */
/* loaded from: classes5.dex */
public final class cwhz extends cwic {
    public final int a;
    public final Drawable b;
    public final String c;
    public final int d;
    public final View.OnClickListener e;

    public cwhz(int i, Drawable drawable, String str, int i2, View.OnClickListener onClickListener) {
        this.a = i;
        this.b = drawable;
        this.c = str;
        this.d = i2;
        this.e = onClickListener;
    }

    @Override // defpackage.cwic
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cwic
    public final Drawable b() {
        return this.b;
    }

    @Override // defpackage.cwic
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cwic
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cwic
    public final View.OnClickListener e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwic) {
            cwic cwicVar = (cwic) obj;
            if (this.a == cwicVar.a() && this.b.equals(cwicVar.b()) && this.c.equals(cwicVar.c()) && this.d == cwicVar.d() && this.e.equals(cwicVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cwic
    public final cwib f() {
        return new cwhy(this);
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        int i2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("SimpleActionSpec{id=");
        sb.append(i);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", label=");
        sb.append(str);
        sb.append(", veId=");
        sb.append(i2);
        sb.append(", onClickListener=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
