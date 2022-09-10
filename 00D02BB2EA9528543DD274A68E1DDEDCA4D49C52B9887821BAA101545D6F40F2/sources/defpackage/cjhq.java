package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjhq  reason: default package */
/* loaded from: classes4.dex */
public final class cjhq extends cjey {
    private final cjtd a;
    private final CharSequence b;
    private final View.OnClickListener c;

    public cjhq(@dzsi cjtd cjtdVar, CharSequence charSequence, View.OnClickListener onClickListener) {
        this.a = cjtdVar;
        this.b = charSequence;
        this.c = onClickListener;
    }

    @Override // defpackage.cjey, defpackage.cjew
    @dzsi
    public cjtd a() {
        return this.a;
    }

    @Override // defpackage.cjey, defpackage.cjew
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.cjey, defpackage.cjew
    public View.OnClickListener c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjey) {
            cjey cjeyVar = (cjey) obj;
            cjtd cjtdVar = this.a;
            if (cjtdVar != null ? cjtdVar.equals(cjeyVar.a()) : cjeyVar.a() == null) {
                if (this.b.equals(cjeyVar.b()) && this.c.equals(cjeyVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        cjtd cjtdVar = this.a;
        return (((((cjtdVar == null ? 0 : cjtdVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 69 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ActionButtonViewModelImpl{ue3LoggingParams=");
        sb.append(valueOf);
        sb.append(", text=");
        sb.append(valueOf2);
        sb.append(", onClickListener=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
