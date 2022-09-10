package defpackage;
/* compiled from: PG */
/* renamed from: byir  reason: default package */
/* loaded from: classes4.dex */
final class byir extends byjc {
    private final Boolean a;
    private final String b;
    private final cqtd c;
    private final CharSequence d;
    private final String e;
    private final CharSequence f;
    private final String g;
    private final cjtd h;
    private final Runnable i;

    public byir(Boolean bool, String str, cqtd cqtdVar, CharSequence charSequence, String str2, CharSequence charSequence2, String str3, @dzsi cjtd cjtdVar, Runnable runnable) {
        this.a = bool;
        if (str != null) {
            this.b = str;
            if (cqtdVar != null) {
                this.c = cqtdVar;
                if (charSequence != null) {
                    this.d = charSequence;
                    if (str2 != null) {
                        this.e = str2;
                        if (charSequence2 != null) {
                            this.f = charSequence2;
                            if (str3 != null) {
                                this.g = str3;
                                this.h = cjtdVar;
                                if (runnable != null) {
                                    this.i = runnable;
                                    return;
                                }
                                throw new NullPointerException("Null getDirectionsClickedRunnable");
                            }
                            throw new NullPointerException("Null getJustificationString");
                        }
                        throw new NullPointerException("Null getDominantNoticeText");
                    }
                    throw new NullPointerException("Null getViaString");
                }
                throw new NullPointerException("Null getTripDurationText");
            }
            throw new NullPointerException("Null getDestinationIcon");
        }
        throw new NullPointerException("Null getDestinationName");
    }

    @Override // defpackage.byjc, defpackage.byie
    public Boolean a() {
        return this.a;
    }

    @Override // defpackage.byjc, defpackage.byie
    public String b() {
        return this.b;
    }

    @Override // defpackage.byjc, defpackage.byie
    public cqtd c() {
        return this.c;
    }

    @Override // defpackage.byjc, defpackage.byie
    public CharSequence d() {
        return this.d;
    }

    @Override // defpackage.byjc, defpackage.byie
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        cjtd cjtdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof byjc) {
            byjc byjcVar = (byjc) obj;
            if (this.a.equals(byjcVar.a()) && this.b.equals(byjcVar.b()) && this.c.equals(byjcVar.c()) && this.d.equals(byjcVar.d()) && this.e.equals(byjcVar.e()) && this.f.equals(byjcVar.f()) && this.g.equals(byjcVar.g()) && ((cjtdVar = this.h) != null ? cjtdVar.equals(byjcVar.i()) : byjcVar.i() == null) && this.i.equals(byjcVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.byjc, defpackage.byie
    public CharSequence f() {
        return this.f;
    }

    @Override // defpackage.byjc, defpackage.byie
    public String g() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        cjtd cjtdVar = this.h;
        return ((hashCode ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.byjc, defpackage.byie
    @dzsi
    public cjtd i() {
        return this.h;
    }

    @Override // defpackage.byjc
    public final Runnable j() {
        return this.i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        String str3 = this.g;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = str2.length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = str3.length();
        StringBuilder sb = new StringBuilder(length + 214 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("DestinationViewModelImpl{isLoading=");
        sb.append(valueOf);
        sb.append(", getDestinationName=");
        sb.append(str);
        sb.append(", getDestinationIcon=");
        sb.append(valueOf2);
        sb.append(", getTripDurationText=");
        sb.append(valueOf3);
        sb.append(", getViaString=");
        sb.append(str2);
        sb.append(", getDominantNoticeText=");
        sb.append(valueOf4);
        sb.append(", getJustificationString=");
        sb.append(str3);
        sb.append(", getLoggingParams=");
        sb.append(valueOf5);
        sb.append(", getDirectionsClickedRunnable=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
