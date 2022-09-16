package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: idi  reason: default package */
/* loaded from: classes6.dex */
public final class idi extends idn {
    private final CharSequence a;
    private final CharSequence b;
    private final CharSequence c;
    private final View.OnClickListener d;
    private final cjtd e;

    public idi(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, cjtd cjtdVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = onClickListener;
        this.e = cjtdVar;
    }

    @Override // defpackage.idn, defpackage.idl
    public CharSequence Pb() {
        return this.c;
    }

    @Override // defpackage.idn, defpackage.idl
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.idn, defpackage.idl
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.idn
    public final View.OnClickListener d() {
        return this.d;
    }

    @Override // defpackage.idn, defpackage.idl
    public cjtd e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idn) {
            idn idnVar = (idn) obj;
            if (this.a.equals(idnVar.a()) && this.b.equals(idnVar.b()) && this.c.equals(idnVar.Pb()) && this.d.equals(idnVar.d()) && this.e.equals(idnVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 105 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("FeedbackCardViewModelImpl{title=");
        sb.append(valueOf);
        sb.append(", subtitle=");
        sb.append(valueOf2);
        sb.append(", buttonText=");
        sb.append(valueOf3);
        sb.append(", sendFeedbackClickListener=");
        sb.append(valueOf4);
        sb.append(", cardLoggingParams=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
