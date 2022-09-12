package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvzi  reason: default package */
/* loaded from: classes.dex */
public final class cvzi<T> extends cvyw<T> {
    public final cvyu<T> a;
    public final cvyu<T> b;
    public final cvyu<T> c;

    public cvzi(cvyu<T> cvyuVar, cvyu<T> cvyuVar2, cvyu<T> cvyuVar3) {
        this.a = cvyuVar;
        this.b = cvyuVar2;
        this.c = cvyuVar3;
    }

    @Override // defpackage.cvyw
    public final cvyu<T> a() {
        return this.a;
    }

    @Override // defpackage.cvyw
    public final cvyu<T> b() {
        return this.b;
    }

    @Override // defpackage.cvyw
    public final cvyu<T> c() {
        return this.c;
    }

    @Override // defpackage.cvyw
    public final cvyv<T> d() {
        return new cvzh(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvyw) {
            cvyw cvywVar = (cvyw) obj;
            if (this.a.equals(cvywVar.a()) && this.b.equals(cvywVar.b()) && this.c.equals(cvywVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarStyle + length2 + String.valueOf(valueOf3).length());
        sb.append("AccountMenuClickListeners{myAccountClickListener=");
        sb.append(valueOf);
        sb.append(", useAnotherAccountClickListener=");
        sb.append(valueOf2);
        sb.append(", manageAccountsClickListener=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
