package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjiy  reason: default package */
/* loaded from: classes4.dex */
final class cjiy extends cjjf {
    private final cjjq a;
    private final cjju b;
    private final View c;
    private final Integer d;
    private final cjtd e;
    private final Runnable f;
    private final boolean g;
    private final cjkd h;

    public cjiy(cjjq cjjqVar, cjju cjjuVar, View view, Integer num, cjtd cjtdVar, Runnable runnable, boolean z, cjkd cjkdVar) {
        this.a = cjjqVar;
        this.b = cjjuVar;
        this.c = view;
        this.d = num;
        this.e = cjtdVar;
        this.f = runnable;
        this.g = z;
        this.h = cjkdVar;
    }

    @Override // defpackage.cjjf
    public final cjjq a() {
        return this.a;
    }

    @Override // defpackage.cjjf
    public final cjju b() {
        return this.b;
    }

    @Override // defpackage.cjjf
    public final View c() {
        return this.c;
    }

    @Override // defpackage.cjjf
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.cjjf
    public final cjtd e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        cjtd cjtdVar;
        Runnable runnable;
        cjkd cjkdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjjf) {
            cjjf cjjfVar = (cjjf) obj;
            if (this.a.equals(cjjfVar.a()) && this.b.equals(cjjfVar.b()) && this.c.equals(cjjfVar.c()) && ((num = this.d) != null ? num.equals(cjjfVar.d()) : cjjfVar.d() == null) && ((cjtdVar = this.e) != null ? cjtdVar.equals(cjjfVar.e()) : cjjfVar.e() == null) && ((runnable = this.f) != null ? runnable.equals(cjjfVar.f()) : cjjfVar.f() == null) && this.g == cjjfVar.g() && ((cjkdVar = this.h) != null ? cjkdVar.equals(cjjfVar.h()) : cjjfVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjjf
    public final Runnable f() {
        return this.f;
    }

    @Override // defpackage.cjjf
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.cjjf
    public final cjkd h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        cjtd cjtdVar = this.e;
        int hashCode3 = (hashCode2 ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003;
        Runnable runnable = this.f;
        int hashCode4 = (((hashCode3 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        cjkd cjkdVar = this.h;
        if (cjkdVar != null) {
            i = cjkdVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        boolean z = this.g;
        String valueOf7 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 136 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("Configuration{theme=");
        sb.append(valueOf);
        sb.append(", content=");
        sb.append(valueOf2);
        sb.append(", view=");
        sb.append(valueOf3);
        sb.append(", targetViewId=");
        sb.append(valueOf4);
        sb.append(", loggingParams=");
        sb.append(valueOf5);
        sb.append(", dismissListener=");
        sb.append(valueOf6);
        sb.append(", overlapTarget=");
        sb.append(z);
        sb.append(", verticalPlacementOverride=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
