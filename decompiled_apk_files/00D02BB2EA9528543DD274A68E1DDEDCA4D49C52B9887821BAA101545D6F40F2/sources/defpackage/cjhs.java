package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjhs  reason: default package */
/* loaded from: classes4.dex */
final class cjhs extends cjhg {
    private final CharSequence a;
    private final jhp b;
    private final CharSequence c;
    private final Integer d;
    private final View.OnClickListener e;
    private final Boolean f;
    private final cqtv g;
    private final cqtv h;
    private final cjtd i;
    private final Boolean j;

    public cjhs(CharSequence charSequence, @dzsi jhp jhpVar, @dzsi CharSequence charSequence2, Integer num, @dzsi View.OnClickListener onClickListener, Boolean bool, cqtv cqtvVar, cqtv cqtvVar2, @dzsi cjtd cjtdVar, Boolean bool2) {
        this.a = charSequence;
        this.b = jhpVar;
        this.c = charSequence2;
        this.d = num;
        this.e = onClickListener;
        this.f = bool;
        this.g = cqtvVar;
        this.h = cqtvVar2;
        this.i = cjtdVar;
        this.j = bool2;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    @dzsi
    public jhp b() {
        return this.b;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    @dzsi
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    public Integer d() {
        return this.d;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    public cqtv e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        jhp jhpVar;
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        cjtd cjtdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjhg) {
            cjhg cjhgVar = (cjhg) obj;
            if (this.a.equals(cjhgVar.a()) && ((jhpVar = this.b) != null ? jhpVar.equals(cjhgVar.b()) : cjhgVar.b() == null) && ((charSequence = this.c) != null ? charSequence.equals(cjhgVar.c()) : cjhgVar.c() == null) && this.d.equals(cjhgVar.d()) && ((onClickListener = this.e) != null ? onClickListener.equals(cjhgVar.g()) : cjhgVar.g() == null) && this.f.equals(cjhgVar.h()) && this.g.equals(cjhgVar.e()) && this.h.equals(cjhgVar.f()) && ((cjtdVar = this.i) != null ? cjtdVar.equals(cjhgVar.i()) : cjhgVar.i() == null) && this.j.equals(cjhgVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    public cqtv f() {
        return this.h;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    @dzsi
    public View.OnClickListener g() {
        return this.e;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    public Boolean h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        jhp jhpVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (jhpVar == null ? 0 : jhpVar.hashCode())) * 1000003;
        CharSequence charSequence = this.c;
        int hashCode3 = (((hashCode2 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        View.OnClickListener onClickListener = this.e;
        int hashCode4 = (((((((hashCode3 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ ((cqrp) this.g).a) * 1000003) ^ ((cqrp) this.h).a) * 1000003;
        cjtd cjtdVar = this.i;
        if (cjtdVar != null) {
            i = cjtdVar.hashCode();
        }
        return ((hashCode4 ^ i) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    @dzsi
    public cjtd i() {
        return this.i;
    }

    @Override // defpackage.cjhg, defpackage.cjhe
    public Boolean j() {
        return this.j;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 187 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("AlertSubtitleViewModelImpl{text=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append(", iconContentDescription=");
        sb.append(valueOf3);
        sb.append(", maxLineCount=");
        sb.append(valueOf4);
        sb.append(", onClick=");
        sb.append(valueOf5);
        sb.append(", hasMultipleInlineLinks=");
        sb.append(valueOf6);
        sb.append(", paddingTop=");
        sb.append(valueOf7);
        sb.append(", paddingBottom=");
        sb.append(valueOf8);
        sb.append(", ue3LoggingParams=");
        sb.append(valueOf9);
        sb.append(", screenReaderFocusable=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
