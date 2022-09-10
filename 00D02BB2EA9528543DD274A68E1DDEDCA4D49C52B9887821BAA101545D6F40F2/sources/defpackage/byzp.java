package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: byzp  reason: default package */
/* loaded from: classes4.dex */
final class byzp extends byzy {
    private final CharSequence a;
    private final vyk b;
    private final vyk c;
    private final dbty<Drawable> d;
    private final int e;
    private final byzg f;
    private final dgsn g;
    private final dbty<Intent> h;
    private final dbty<Intent> i;
    private final dbty<Intent> j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final int o;
    private final int p;
    private final int q;

    public byzp(CharSequence charSequence, vyk vykVar, vyk vykVar2, dbty<Drawable> dbtyVar, int i, byzg byzgVar, dgsn dgsnVar, dbty<Intent> dbtyVar2, @dzsi dbty<Intent> dbtyVar3, @dzsi dbty<Intent> dbtyVar4, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4) {
        if (charSequence != null) {
            this.a = charSequence;
            this.b = vykVar;
            this.c = vykVar2;
            if (dbtyVar != null) {
                this.d = dbtyVar;
                this.e = i;
                if (byzgVar != null) {
                    this.f = byzgVar;
                    if (dgsnVar != null) {
                        this.g = dgsnVar;
                        if (dbtyVar2 != null) {
                            this.h = dbtyVar2;
                            this.i = dbtyVar3;
                            this.j = dbtyVar4;
                            this.k = z;
                            this.l = z2;
                            this.m = z3;
                            this.n = z4;
                            this.o = i2;
                            this.p = i3;
                            if (i4 != 0) {
                                this.q = i4;
                                return;
                            }
                            throw new NullPointerException("Null sharingStatus");
                        }
                        throw new NullPointerException("Null contentIntent");
                    }
                    throw new NullPointerException("Null vehicleType");
                }
                throw new NullPointerException("Null guidanceType");
            }
            throw new NullPointerException("Null icon");
        }
        throw new NullPointerException("Null header");
    }

    @Override // defpackage.byzy
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.byzy
    public final vyk b() {
        return this.b;
    }

    @Override // defpackage.byzy
    public final vyk c() {
        return this.c;
    }

    @Override // defpackage.byzy
    public final dbty<Drawable> d() {
        return this.d;
    }

    @Override // defpackage.byzy
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dbty<Intent> dbtyVar;
        dbty<Intent> dbtyVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof byzy) {
            byzy byzyVar = (byzy) obj;
            if (this.a.equals(byzyVar.a()) && this.b.equals(byzyVar.b()) && this.c.equals(byzyVar.c()) && this.d.equals(byzyVar.d()) && this.e == byzyVar.e() && this.f.equals(byzyVar.f()) && this.g.equals(byzyVar.g()) && this.h.equals(byzyVar.h()) && ((dbtyVar = this.i) != null ? dbtyVar.equals(byzyVar.i()) : byzyVar.i() == null) && ((dbtyVar2 = this.j) != null ? dbtyVar2.equals(byzyVar.j()) : byzyVar.j() == null) && this.k == byzyVar.k() && this.l == byzyVar.l() && this.m == byzyVar.m() && this.n == byzyVar.n() && this.o == byzyVar.o() && this.p == byzyVar.p() && this.q == byzyVar.q()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.byzy
    public final byzg f() {
        return this.f;
    }

    @Override // defpackage.byzy
    public final dgsn g() {
        return this.g;
    }

    @Override // defpackage.byzy
    public final dbty<Intent> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        dbty<Intent> dbtyVar = this.i;
        int i = 0;
        int hashCode2 = (hashCode ^ (dbtyVar == null ? 0 : dbtyVar.hashCode())) * 1000003;
        dbty<Intent> dbtyVar2 = this.j;
        if (dbtyVar2 != null) {
            i = dbtyVar2.hashCode();
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        int i3 = 1237;
        int i4 = (((((i2 ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003;
        if (true == this.n) {
            i3 = 1231;
        }
        return ((((((i4 ^ i3) * 1000003) ^ this.o) * 1000003) ^ this.p) * 1000003) ^ this.q;
    }

    @Override // defpackage.byzy
    @dzsi
    public final dbty<Intent> i() {
        return this.i;
    }

    @Override // defpackage.byzy
    @dzsi
    public final dbty<Intent> j() {
        return this.j;
    }

    @Override // defpackage.byzy
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.byzy
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.byzy
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.byzy
    public final boolean n() {
        return this.n;
    }

    @Override // defpackage.byzy
    public final int o() {
        return this.o;
    }

    @Override // defpackage.byzy
    public final int p() {
        return this.p;
    }

    @Override // defpackage.byzy
    public final int q() {
        return this.q;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int i = this.e;
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.m;
        boolean z4 = this.n;
        int i2 = this.o;
        int i3 = this.p;
        String a = bzdi.a(this.q);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 291 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf9).length() + a.length());
        sb.append("GuidanceContent{header=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(valueOf2);
        sb.append(", description=");
        sb.append(valueOf3);
        sb.append(", icon=");
        sb.append(valueOf4);
        sb.append(", smallIconId=");
        sb.append(i);
        sb.append(", guidanceType=");
        sb.append(valueOf5);
        sb.append(", vehicleType=");
        sb.append(valueOf6);
        sb.append(", contentIntent=");
        sb.append(valueOf7);
        sb.append(", nextStageIntent=");
        sb.append(valueOf8);
        sb.append(", previousStageIntent=");
        sb.append(valueOf9);
        sb.append(", shouldAlert=");
        sb.append(z);
        sb.append(", active=");
        sb.append(z2);
        sb.append(", stoppable=");
        sb.append(z3);
        sb.append(", noGps=");
        sb.append(z4);
        sb.append(", stageNumber=");
        sb.append(i2);
        sb.append(", stageCount=");
        sb.append(i3);
        sb.append(", sharingStatus=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
