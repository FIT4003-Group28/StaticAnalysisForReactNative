package defpackage;
/* compiled from: PG */
/* renamed from: aqdl  reason: default package */
/* loaded from: classes2.dex */
final class aqdl extends aqec {
    private final CharSequence a;
    private final CharSequence b;
    private final CharSequence c;
    private final cqtd d;
    private final Runnable e;
    private final cjtd f;
    private final CharSequence g;
    private final Runnable h;
    private final cjtd i;
    private final cjtd j;

    public aqdl(@dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, CharSequence charSequence3, @dzsi cqtd cqtdVar, @dzsi Runnable runnable, @dzsi cjtd cjtdVar, @dzsi CharSequence charSequence4, @dzsi Runnable runnable2, @dzsi cjtd cjtdVar2, @dzsi cjtd cjtdVar3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = cqtdVar;
        this.e = runnable;
        this.f = cjtdVar;
        this.g = charSequence4;
        this.h = runnable2;
        this.i = cjtdVar2;
        this.j = cjtdVar3;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.aqec, defpackage.aqea
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public cqtd d() {
        return this.d;
    }

    @Override // defpackage.aqec
    @dzsi
    public final Runnable e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        cqtd cqtdVar;
        Runnable runnable;
        cjtd cjtdVar;
        CharSequence charSequence;
        Runnable runnable2;
        cjtd cjtdVar2;
        cjtd cjtdVar3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqec) {
            aqec aqecVar = (aqec) obj;
            CharSequence charSequence2 = this.a;
            if (charSequence2 != null ? charSequence2.equals(aqecVar.a()) : aqecVar.a() == null) {
                CharSequence charSequence3 = this.b;
                if (charSequence3 != null ? charSequence3.equals(aqecVar.b()) : aqecVar.b() == null) {
                    if (this.c.equals(aqecVar.c()) && ((cqtdVar = this.d) != null ? cqtdVar.equals(aqecVar.d()) : aqecVar.d() == null) && ((runnable = this.e) != null ? runnable.equals(aqecVar.e()) : aqecVar.e() == null) && ((cjtdVar = this.f) != null ? cjtdVar.equals(aqecVar.f()) : aqecVar.f() == null) && ((charSequence = this.g) != null ? charSequence.equals(aqecVar.g()) : aqecVar.g() == null) && aqecVar.h() == null && ((runnable2 = this.h) != null ? runnable2.equals(aqecVar.i()) : aqecVar.i() == null) && ((cjtdVar2 = this.i) != null ? cjtdVar2.equals(aqecVar.j()) : aqecVar.j() == null) && ((cjtdVar3 = this.j) != null ? cjtdVar3.equals(aqecVar.k()) : aqecVar.k() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public cjtd f() {
        return this.f;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public CharSequence g() {
        return this.g;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public cqtd h() {
        return null;
    }

    public int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (((hashCode ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        cqtd cqtdVar = this.d;
        int hashCode3 = (hashCode2 ^ (cqtdVar == null ? 0 : cqtdVar.hashCode())) * 1000003;
        Runnable runnable = this.e;
        int hashCode4 = (hashCode3 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003;
        cjtd cjtdVar = this.f;
        int hashCode5 = (hashCode4 ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003;
        CharSequence charSequence3 = this.g;
        int hashCode6 = (hashCode5 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * (-721379959);
        Runnable runnable2 = this.h;
        int hashCode7 = (hashCode6 ^ (runnable2 == null ? 0 : runnable2.hashCode())) * 1000003;
        cjtd cjtdVar2 = this.i;
        int hashCode8 = (hashCode7 ^ (cjtdVar2 == null ? 0 : cjtdVar2.hashCode())) * 1000003;
        cjtd cjtdVar3 = this.j;
        if (cjtdVar3 != null) {
            i = cjtdVar3.hashCode();
        }
        return hashCode8 ^ i;
    }

    @Override // defpackage.aqec
    @dzsi
    public final Runnable i() {
        return this.h;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public cjtd j() {
        return this.i;
    }

    @Override // defpackage.aqec, defpackage.aqea
    @dzsi
    public cjtd k() {
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
        int length8 = "null".length();
        int length9 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 258 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("MessagingPromoCardBannerViewModelImpl{title=");
        sb.append(valueOf);
        sb.append(", subtitle=");
        sb.append(valueOf2);
        sb.append(", primaryButtonText=");
        sb.append(valueOf3);
        sb.append(", primaryButtonIcon=");
        sb.append(valueOf4);
        sb.append(", onPrimaryButtonClick=");
        sb.append(valueOf5);
        sb.append(", primaryButtonUe3Params=");
        sb.append(valueOf6);
        sb.append(", secondaryButtonText=");
        sb.append(valueOf7);
        sb.append(", secondaryButtonIcon=");
        sb.append("null");
        sb.append(", onSecondaryButtonClick=");
        sb.append(valueOf8);
        sb.append(", secondaryButtonUe3Params=");
        sb.append(valueOf9);
        sb.append(", bannerUe3Params=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
