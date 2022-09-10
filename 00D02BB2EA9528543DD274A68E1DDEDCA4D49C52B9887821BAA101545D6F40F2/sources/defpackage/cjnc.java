package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjnc  reason: default package */
/* loaded from: classes4.dex */
final class cjnc extends cjne {
    private final String a;
    private final Integer b;
    private final cjtd c;
    private final View d;
    private final Runnable e;
    private final boolean f;
    private final cjkd g;

    public cjnc(String str, Integer num, cjtd cjtdVar, View view, Runnable runnable, boolean z, cjkd cjkdVar) {
        this.a = str;
        this.b = num;
        this.c = cjtdVar;
        this.d = view;
        this.e = runnable;
        this.f = z;
        this.g = cjkdVar;
    }

    @Override // defpackage.cjne
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cjne
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cjne
    public final cjtd c() {
        return this.c;
    }

    @Override // defpackage.cjne
    public final View d() {
        return this.d;
    }

    @Override // defpackage.cjne
    public final Integer e() {
        return null;
    }

    public final boolean equals(Object obj) {
        Runnable runnable;
        cjkd cjkdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjne) {
            cjne cjneVar = (cjne) obj;
            String str = this.a;
            if (str != null ? str.equals(cjneVar.a()) : cjneVar.a() == null) {
                Integer num = this.b;
                if (num != null ? num.equals(cjneVar.b()) : cjneVar.b() == null) {
                    cjtd cjtdVar = this.c;
                    if (cjtdVar != null ? cjtdVar.equals(cjneVar.c()) : cjneVar.c() == null) {
                        if (this.d.equals(cjneVar.d()) && cjneVar.e() == null && ((runnable = this.e) != null ? runnable.equals(cjneVar.f()) : cjneVar.f() == null) && this.f == cjneVar.g() && ((cjkdVar = this.g) != null ? cjkdVar.equals(cjneVar.h()) : cjneVar.h() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cjne
    public final Runnable f() {
        return this.e;
    }

    @Override // defpackage.cjne
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.cjne
    public final cjkd h() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        cjtd cjtdVar = this.c;
        int hashCode3 = (((hashCode2 ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003) ^ this.d.hashCode()) * (-721379959);
        Runnable runnable = this.e;
        int hashCode4 = (((hashCode3 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        cjkd cjkdVar = this.g;
        if (cjkdVar != null) {
            i = cjkdVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        boolean z = this.f;
        String valueOf5 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = "null".length();
        StringBuilder sb = new StringBuilder(length + 134 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Configuration{text=");
        sb.append(str);
        sb.append(", textId=");
        sb.append(valueOf);
        sb.append(", loggingParams=");
        sb.append(valueOf2);
        sb.append(", view=");
        sb.append(valueOf3);
        sb.append(", targetViewId=");
        sb.append("null");
        sb.append(", dismissListener=");
        sb.append(valueOf4);
        sb.append(", overlapTarget=");
        sb.append(z);
        sb.append(", verticalPlacementOverride=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
