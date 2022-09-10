package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: cwdx  reason: default package */
/* loaded from: classes5.dex */
final class cwdx extends cwea {
    private final int a;
    private final Drawable b;
    private final String c;
    private final View.OnClickListener d;
    private final cwdd e;

    public cwdx(int i, Drawable drawable, String str, View.OnClickListener onClickListener, cwdd cwddVar) {
        this.a = i;
        this.b = drawable;
        this.c = str;
        this.d = onClickListener;
        this.e = cwddVar;
    }

    @Override // defpackage.cwea
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cwea
    public final Drawable b() {
        return this.b;
    }

    @Override // defpackage.cwea
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cwea
    public final View.OnClickListener d() {
        return this.d;
    }

    @Override // defpackage.cwea
    public final cwdd e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cwdd cwddVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwea) {
            cwea cweaVar = (cwea) obj;
            if (this.a == cweaVar.a() && this.b.equals(cweaVar.b()) && this.c.equals(cweaVar.c()) && this.d.equals(cweaVar.d()) && ((cwddVar = this.e) != null ? cwddVar.equals(cweaVar.e()) : cweaVar.e() == null) && cweaVar.f() == null && cweaVar.g() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cwea
    public final cwdm f() {
        return null;
    }

    @Override // defpackage.cwea
    public final cwdp g() {
        return null;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        cwdd cwddVar = this.e;
        return (hashCode ^ (cwddVar == null ? 0 : cwddVar.hashCode())) * (-721379959);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + length3 + length4 + "null".length() + "null".length());
        sb.append("CustomActionSpec{id=");
        sb.append(i);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", label=");
        sb.append(str);
        sb.append(", onClickListener=");
        sb.append(valueOf2);
        sb.append(", visibilityHandler=");
        sb.append(valueOf3);
        sb.append(", countDecoration=");
        sb.append("null");
        sb.append(", highlightTextRetriever=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
