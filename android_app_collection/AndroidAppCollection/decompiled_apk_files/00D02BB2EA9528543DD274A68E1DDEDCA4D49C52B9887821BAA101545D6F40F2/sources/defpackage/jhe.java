package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: jhe  reason: default package */
/* loaded from: classes7.dex */
public final class jhe extends jhh {
    private final boolean a;
    private final cqrp b;
    private final cqrp c;
    private final cqrp d;
    private final cqrp e;
    private final cqrp f;
    private final int g;
    private final List<Integer> h;

    public jhe(boolean z, cqrp cqrpVar, cqrp cqrpVar2, cqrp cqrpVar3, cqrp cqrpVar4, cqrp cqrpVar5, int i, List<Integer> list) {
        this.a = z;
        if (cqrpVar != null) {
            this.b = cqrpVar;
            if (cqrpVar2 != null) {
                this.c = cqrpVar2;
                if (cqrpVar3 != null) {
                    this.d = cqrpVar3;
                    if (cqrpVar4 != null) {
                        this.e = cqrpVar4;
                        if (cqrpVar5 != null) {
                            this.f = cqrpVar5;
                            this.g = i;
                            this.h = list;
                            return;
                        }
                        throw new NullPointerException("Null tickMarkTextPaddingBottomTop");
                    }
                    throw new NullPointerException("Null tickMarkTextSize");
                }
                throw new NullPointerException("Null tickMarkWidth");
            }
            throw new NullPointerException("Null barPaddingStartEnd");
        }
        throw new NullPointerException("Null barHeight");
    }

    @Override // defpackage.jhg
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.jhg
    public final cqrp b() {
        return this.b;
    }

    @Override // defpackage.jhg
    public final cqrp c() {
        return this.c;
    }

    @Override // defpackage.jhg
    public final cqrp d() {
        return this.d;
    }

    @Override // defpackage.jhg
    public final cqrp e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhh) {
            jhh jhhVar = (jhh) obj;
            if (this.a == jhhVar.a() && this.b.equals(jhhVar.b()) && this.c.equals(jhhVar.c()) && this.d.equals(jhhVar.d()) && this.e.equals(jhhVar.e()) && this.f.equals(jhhVar.f()) && this.g == jhhVar.g() && this.h.equals(jhhVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jhg
    public final cqrp f() {
        return this.f;
    }

    @Override // defpackage.jhg
    public final int g() {
        return this.g;
    }

    @Override // defpackage.jhg
    public final List<Integer> h() {
        return this.h;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.a) * 1000003) ^ this.c.a) * 1000003) ^ this.d.a) * 1000003) ^ this.e.a) * 1000003) ^ this.f.a) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int i = this.g;
        String valueOf6 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 210 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ProgressBarWithBalloonViewPropertiesImpl{shouldShowBalloon=");
        sb.append(z);
        sb.append(", barHeight=");
        sb.append(valueOf);
        sb.append(", barPaddingStartEnd=");
        sb.append(valueOf2);
        sb.append(", tickMarkWidth=");
        sb.append(valueOf3);
        sb.append(", tickMarkTextSize=");
        sb.append(valueOf4);
        sb.append(", tickMarkTextPaddingBottomTop=");
        sb.append(valueOf5);
        sb.append(", currentProgressValue=");
        sb.append(i);
        sb.append(", tickMarks=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
