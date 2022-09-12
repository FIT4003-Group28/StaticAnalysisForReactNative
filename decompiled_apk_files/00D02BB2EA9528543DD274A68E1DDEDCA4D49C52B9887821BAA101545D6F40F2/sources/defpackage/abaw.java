package defpackage;
/* compiled from: PG */
/* renamed from: abaw  reason: default package */
/* loaded from: classes2.dex */
final class abaw extends abbe {
    public final String a;
    public final String b;
    public final dmni c;
    public final dmxh d;
    public final dpum e;
    public final akqs f;

    public abaw(String str, String str2, @dzsi dmni dmniVar, @dzsi dmxh dmxhVar, @dzsi dpum dpumVar, @dzsi akqs akqsVar) {
        this.a = str;
        this.b = str2;
        this.c = dmniVar;
        this.d = dmxhVar;
        this.e = dpumVar;
        this.f = akqsVar;
    }

    @Override // defpackage.abbe
    public final String a() {
        return this.a;
    }

    @Override // defpackage.abbe
    public final String b() {
        return this.b;
    }

    @Override // defpackage.abbe
    @dzsi
    public final dmni c() {
        return this.c;
    }

    @Override // defpackage.abbe
    @dzsi
    public final dmxh d() {
        return this.d;
    }

    @Override // defpackage.abbe
    @dzsi
    public final dpum e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dmni dmniVar;
        dmxh dmxhVar;
        dpum dpumVar;
        akqs akqsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof abbe) {
            abbe abbeVar = (abbe) obj;
            if (this.a.equals(abbeVar.a()) && this.b.equals(abbeVar.b()) && ((dmniVar = this.c) != null ? dmniVar.equals(abbeVar.c()) : abbeVar.c() == null) && ((dmxhVar = this.d) != null ? dmxhVar.equals(abbeVar.d()) : abbeVar.d() == null) && ((dpumVar = this.e) != null ? dpumVar.equals(abbeVar.e()) : abbeVar.e() == null) && ((akqsVar = this.f) != null ? akqsVar.equals(abbeVar.f()) : abbeVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abbe
    @dzsi
    public final akqs f() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 91 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Contents{mid=");
        sb.append(str);
        sb.append(", ved=");
        sb.append(str2);
        sb.append(", vectorOps=");
        sb.append(valueOf);
        sb.append(", tiledEventMapTemplate=");
        sb.append(valueOf2);
        sb.append(", pinMarkerPosition=");
        sb.append(valueOf3);
        sb.append(", latlngBounds=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        dmni dmniVar = this.c;
        int i4 = 0;
        if (dmniVar == null) {
            i = 0;
        } else {
            i = dmniVar.bC;
            if (i == 0) {
                i = dsst.a.b(dmniVar).c(dmniVar);
                dmniVar.bC = i;
            }
        }
        int i5 = (hashCode ^ i) * 1000003;
        dmxh dmxhVar = this.d;
        if (dmxhVar == null) {
            i2 = 0;
        } else {
            i2 = dmxhVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dmxhVar).c(dmxhVar);
                dmxhVar.bC = i2;
            }
        }
        int i6 = (i5 ^ i2) * 1000003;
        dpum dpumVar = this.e;
        if (dpumVar == null) {
            i3 = 0;
        } else {
            i3 = dpumVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(dpumVar).c(dpumVar);
                dpumVar.bC = i3;
            }
        }
        int i7 = (i6 ^ i3) * 1000003;
        akqs akqsVar = this.f;
        if (akqsVar != null) {
            i4 = akqsVar.hashCode();
        }
        return i7 ^ i4;
    }
}
