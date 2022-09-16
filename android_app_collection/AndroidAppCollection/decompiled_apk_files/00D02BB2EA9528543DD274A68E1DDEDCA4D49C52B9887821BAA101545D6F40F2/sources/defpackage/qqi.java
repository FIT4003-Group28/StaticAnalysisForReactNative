package defpackage;
/* compiled from: PG */
/* renamed from: qqi  reason: default package */
/* loaded from: classes7.dex */
final class qqi extends qqt {
    public final cqss a;
    public final cqss b;

    public qqi(cqss cqssVar, cqss cqssVar2) {
        this.a = cqssVar;
        this.b = cqssVar2;
    }

    @Override // defpackage.qqt
    public final int a() {
        return 2131232442;
    }

    @Override // defpackage.qqt
    public final int b() {
        return 2131232439;
    }

    @Override // defpackage.qqt
    public final cqss c() {
        return this.a;
    }

    @Override // defpackage.qqt
    public final cqss d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qqt) {
            qqt qqtVar = (qqt) obj;
            if (qqtVar.a() == 2131232442 && qqtVar.b() == 2131232439 && this.a.equals(qqtVar.c()) && this.b.equals(qqtVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 561466324) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 130 + String.valueOf(valueOf2).length());
        sb.append("SurveyConfig{thumbsUpIconResourceId=");
        sb.append(2131232442);
        sb.append(", thumbsDownIconResourceId=");
        sb.append(2131232439);
        sb.append(", surveyBackgroundColor=");
        sb.append(valueOf);
        sb.append(", circleStrokeColor=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
