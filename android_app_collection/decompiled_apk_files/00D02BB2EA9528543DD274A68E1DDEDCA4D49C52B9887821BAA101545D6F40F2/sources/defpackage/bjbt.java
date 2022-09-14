package defpackage;
/* compiled from: PG */
/* renamed from: bjbt  reason: default package */
/* loaded from: classes3.dex */
public final class bjbt extends bjbv {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final gfw e;
    public final dqcj f;
    private final boolean g;

    public bjbt(boolean z, boolean z2, boolean z3, boolean z4, @dzsi String str, @dzsi gfw gfwVar, dqcj dqcjVar) {
        this.a = z;
        this.b = z2;
        this.g = z3;
        this.c = z4;
        this.d = str;
        this.e = gfwVar;
        this.f = dqcjVar;
    }

    @Override // defpackage.bjbv
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.bjbv
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bjbv
    public final boolean c() {
        return this.g;
    }

    @Override // defpackage.bjbv
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.bjbv
    @dzsi
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        gfw gfwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bjbv) {
            bjbv bjbvVar = (bjbv) obj;
            if (this.a == bjbvVar.a() && this.b == bjbvVar.b() && this.g == bjbvVar.c() && this.c == bjbvVar.d() && ((str = this.d) != null ? str.equals(bjbvVar.e()) : bjbvVar.e() == null) && ((gfwVar = this.e) != null ? gfwVar.equals(bjbvVar.f()) : bjbvVar.f() == null) && this.f.equals(bjbvVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bjbv
    @dzsi
    public final gfw f() {
        return this.e;
    }

    @Override // defpackage.bjbv
    public final dqcj g() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        String str = this.d;
        int i4 = 0;
        int hashCode = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        gfw gfwVar = this.e;
        if (gfwVar != null) {
            i4 = gfwVar.hashCode();
        }
        return ((hashCode ^ i4) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.g;
        boolean z4 = this.c;
        String str = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 203 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("SingleQuestionPageOptions{enableAnswerInput=");
        sb.append(z);
        sb.append(", skipPostContributionThanksPage=");
        sb.append(z2);
        sb.append(", showPlaceSnippet=");
        sb.append(z3);
        sb.append(", closeAfterAnsweringQuestion=");
        sb.append(z4);
        sb.append(", currentUserAnswer=");
        sb.append(str);
        sb.append(", answerResultListener=");
        sb.append(valueOf);
        sb.append(", entryPoint=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
