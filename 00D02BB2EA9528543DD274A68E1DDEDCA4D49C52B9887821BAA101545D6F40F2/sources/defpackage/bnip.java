package defpackage;
/* compiled from: PG */
/* renamed from: bnip  reason: default package */
/* loaded from: classes3.dex */
final class bnip extends bnji {
    private final CharSequence a;
    private final CharSequence b;
    private final dcdc<cqix<?>> c;
    private final cqtd d;
    private final String e;
    private final cqtd f;
    private final cjtd g;
    private final Boolean h;
    private final Integer i;
    private final Integer j;
    private final Runnable k;

    public bnip(@dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, dcdc<cqix<?>> dcdcVar, @dzsi cqtd cqtdVar, @dzsi String str, @dzsi cqtd cqtdVar2, @dzsi cjtd cjtdVar, Boolean bool, Integer num, Integer num2, Runnable runnable) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = dcdcVar;
        this.d = cqtdVar;
        this.e = str;
        this.f = cqtdVar2;
        this.g = cjtdVar;
        this.h = bool;
        this.i = num;
        this.j = num2;
        this.k = runnable;
    }

    @Override // defpackage.bnji, defpackage.jaz
    @dzsi
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.bnji, defpackage.jaz
    @dzsi
    public String b() {
        return this.e;
    }

    @Override // defpackage.bnji, defpackage.jaz
    @dzsi
    public cqtd c() {
        return this.f;
    }

    @Override // defpackage.bnji, defpackage.jaz
    @dzsi
    public CharSequence e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        cqtd cqtdVar;
        String str;
        cqtd cqtdVar2;
        cjtd cjtdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnji) {
            bnji bnjiVar = (bnji) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(bnjiVar.e()) : bnjiVar.e() == null) {
                CharSequence charSequence2 = this.b;
                if (charSequence2 != null ? charSequence2.equals(bnjiVar.f()) : bnjiVar.f() == null) {
                    if (dchl.m(this.c, bnjiVar.g()) && ((cqtdVar = this.d) != null ? cqtdVar.equals(bnjiVar.a()) : bnjiVar.a() == null) && ((str = this.e) != null ? str.equals(bnjiVar.b()) : bnjiVar.b() == null) && ((cqtdVar2 = this.f) != null ? cqtdVar2.equals(bnjiVar.c()) : bnjiVar.c() == null) && ((cjtdVar = this.g) != null ? cjtdVar.equals(bnjiVar.h()) : bnjiVar.h() == null) && this.h.equals(bnjiVar.i()) && this.i.equals(bnjiVar.j()) && this.j.equals(bnjiVar.l()) && this.k.equals(bnjiVar.m())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bnji, defpackage.jaz
    @dzsi
    public CharSequence f() {
        return this.b;
    }

    @Override // defpackage.bnji, defpackage.jaz
    public dcdc<cqix<?>> g() {
        return this.c;
    }

    @Override // defpackage.bnji, defpackage.jaz
    @dzsi
    public cjtd h() {
        return this.g;
    }

    public int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (((hashCode ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        cqtd cqtdVar = this.d;
        int hashCode3 = (hashCode2 ^ (cqtdVar == null ? 0 : cqtdVar.hashCode())) * 1000003;
        String str = this.e;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        cqtd cqtdVar2 = this.f;
        int hashCode5 = (hashCode4 ^ (cqtdVar2 == null ? 0 : cqtdVar2.hashCode())) * 1000003;
        cjtd cjtdVar = this.g;
        if (cjtdVar != null) {
            i = cjtdVar.hashCode();
        }
        return ((((((((hashCode5 ^ i) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.bnji, defpackage.jaz
    public Boolean i() {
        return this.h;
    }

    @Override // defpackage.bnji, defpackage.jaz
    public Integer j() {
        return this.i;
    }

    @Override // defpackage.bnji, defpackage.jaz
    public Integer l() {
        return this.j;
    }

    @Override // defpackage.bnji
    public final Runnable m() {
        return this.k;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String str = this.e;
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        int length9 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 213 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("PlaceAnnotationViewModelImpl{primaryText=");
        sb.append(valueOf);
        sb.append(", secondaryText=");
        sb.append(valueOf2);
        sb.append(", styledPlaceAnnotationLayoutItems=");
        sb.append(valueOf3);
        sb.append(", icon=");
        sb.append(valueOf4);
        sb.append(", webImageUrl=");
        sb.append(str);
        sb.append(", iconBackground=");
        sb.append(valueOf5);
        sb.append(", impressionParams=");
        sb.append(valueOf6);
        sb.append(", visible=");
        sb.append(valueOf7);
        sb.append(", maxLines=");
        sb.append(valueOf8);
        sb.append(", annotationLayoutType=");
        sb.append(valueOf9);
        sb.append(", callbackRunnable=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
