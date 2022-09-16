package defpackage;
/* compiled from: PG */
/* renamed from: slu  reason: default package */
/* loaded from: classes4.dex */
public final class slu {
    public final ampq a;
    public final ampq b;
    public final ampq c;
    public final ampq d;
    public final ampq e;
    public final int f;
    public final ampq g;
    public final ampq h;

    public slu() {
    }

    public slu(ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4, ampq ampqVar5, int i, ampq ampqVar6, ampq ampqVar7) {
        this.a = ampqVar;
        this.b = ampqVar2;
        this.c = ampqVar3;
        this.d = ampqVar4;
        this.e = ampqVar5;
        this.f = i;
        this.g = ampqVar6;
        this.h = ampqVar7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slu) {
            slu sluVar = (slu) obj;
            if (this.a.equals(sluVar.a) && this.b.equals(sluVar.b) && this.c.equals(sluVar.c) && this.d.equals(sluVar.d) && this.e.equals(sluVar.e) && this.f == sluVar.f && this.g.equals(sluVar.g) && this.h.equals(sluVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f) * 1000003) ^ 2040732332) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int i = this.f;
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 179 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("StartupConfigs{queryString=");
        sb.append(valueOf);
        sb.append(", proactiveModeEnabled=");
        sb.append(valueOf2);
        sb.append(", suppressTtsForTextQueries=");
        sb.append(valueOf3);
        sb.append(", clientInput=");
        sb.append(valueOf4);
        sb.append(", customizedSource=");
        sb.append(valueOf5);
        sb.append(", inputModality=");
        sb.append(i);
        sb.append(", expandToFullScreen=");
        sb.append(valueOf6);
        sb.append(", micClickedTimeNs=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
