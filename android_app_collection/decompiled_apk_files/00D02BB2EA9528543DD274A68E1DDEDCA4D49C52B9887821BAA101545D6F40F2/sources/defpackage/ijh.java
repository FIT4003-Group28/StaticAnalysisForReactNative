package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ijh  reason: default package */
/* loaded from: classes6.dex */
public final class ijh extends ijt {
    private final cjtd a;
    private final CharSequence b;
    private final CharSequence c;
    private final cjtd d;
    private final cjtd e;
    private final Runnable f;
    private final Runnable g;

    public ijh(@dzsi cjtd cjtdVar, CharSequence charSequence, CharSequence charSequence2, @dzsi cjtd cjtdVar2, @dzsi cjtd cjtdVar3, @dzsi Runnable runnable, @dzsi Runnable runnable2) {
        this.a = cjtdVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = cjtdVar2;
        this.e = cjtdVar3;
        this.f = runnable;
        this.g = runnable2;
    }

    @Override // defpackage.ijt, defpackage.ijr
    @dzsi
    public cjtd a() {
        return this.a;
    }

    @Override // defpackage.ijt, defpackage.ijr
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.ijt, defpackage.ijr
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.ijt, defpackage.ijr
    @dzsi
    public cjtd d() {
        return this.d;
    }

    @Override // defpackage.ijt, defpackage.ijr
    @dzsi
    public cjtd e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        cjtd cjtdVar;
        cjtd cjtdVar2;
        Runnable runnable;
        Runnable runnable2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ijt) {
            ijt ijtVar = (ijt) obj;
            cjtd cjtdVar3 = this.a;
            if (cjtdVar3 != null ? cjtdVar3.equals(ijtVar.a()) : ijtVar.a() == null) {
                if (this.b.equals(ijtVar.b()) && this.c.equals(ijtVar.c()) && ((cjtdVar = this.d) != null ? cjtdVar.equals(ijtVar.d()) : ijtVar.d() == null) && ((cjtdVar2 = this.e) != null ? cjtdVar2.equals(ijtVar.e()) : ijtVar.e() == null) && ((runnable = this.f) != null ? runnable.equals(ijtVar.f()) : ijtVar.f() == null) && ((runnable2 = this.g) != null ? runnable2.equals(ijtVar.g()) : ijtVar.g() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ijt
    @dzsi
    public final Runnable f() {
        return this.f;
    }

    @Override // defpackage.ijt
    @dzsi
    public final Runnable g() {
        return this.g;
    }

    public int hashCode() {
        cjtd cjtdVar = this.a;
        int i = 0;
        int hashCode = ((((((cjtdVar == null ? 0 : cjtdVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        cjtd cjtdVar2 = this.d;
        int hashCode2 = (hashCode ^ (cjtdVar2 == null ? 0 : cjtdVar2.hashCode())) * 1000003;
        cjtd cjtdVar3 = this.e;
        int hashCode3 = (hashCode2 ^ (cjtdVar3 == null ? 0 : cjtdVar3.hashCode())) * 1000003;
        Runnable runnable = this.f;
        int hashCode4 = (hashCode3 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003;
        Runnable runnable2 = this.g;
        if (runnable2 != null) {
            i = runnable2.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("ModPromoBannerViewModelImpl{promoBannerUe3Params=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(valueOf2);
        sb.append(", subtitle=");
        sb.append(valueOf3);
        sb.append(", subtitleButtonUe3Params=");
        sb.append(valueOf4);
        sb.append(", closeButtonUe3Params=");
        sb.append(valueOf5);
        sb.append(", subtitleButtonRunnable=");
        sb.append(valueOf6);
        sb.append(", closeButtonRunnable=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
