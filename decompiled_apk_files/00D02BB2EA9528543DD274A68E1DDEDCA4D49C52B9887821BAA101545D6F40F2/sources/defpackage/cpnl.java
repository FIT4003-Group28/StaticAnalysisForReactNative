package defpackage;

import android.content.Context;
import android.widget.RadioGroup;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cpnl  reason: default package */
/* loaded from: classes5.dex */
final class cpnl extends cpnv {
    private final Context b;
    private final String c;
    private final cpnm d;
    private final TextView e;
    private final RadioGroup f;
    private final dhab g;
    private final String h;
    private final dcdc<cpnn> i;

    public cpnl(Context context, String str, cpnm cpnmVar, TextView textView, RadioGroup radioGroup, dhab dhabVar, String str2, dcdc<cpnn> dcdcVar) {
        this.b = context;
        this.c = str;
        this.d = cpnmVar;
        this.e = textView;
        this.f = radioGroup;
        this.g = dhabVar;
        this.h = str2;
        this.i = dcdcVar;
    }

    @Override // defpackage.cpnv
    public final Context a() {
        return this.b;
    }

    @Override // defpackage.cpnv
    public final String b() {
        return this.c;
    }

    @Override // defpackage.cpnv
    public final cpnm c() {
        return this.d;
    }

    @Override // defpackage.cpnv
    public final TextView d() {
        return this.e;
    }

    @Override // defpackage.cpnv
    public final RadioGroup e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        dhab dhabVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpnv) {
            cpnv cpnvVar = (cpnv) obj;
            if (this.b.equals(cpnvVar.a()) && this.c.equals(cpnvVar.b()) && this.d.equals(cpnvVar.c()) && this.e.equals(cpnvVar.d()) && this.f.equals(cpnvVar.e()) && ((dhabVar = this.g) != null ? dhabVar.equals(cpnvVar.f()) : cpnvVar.f() == null) && this.h.equals(cpnvVar.g()) && dchl.m(this.i, cpnvVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cpnv
    public final dhab f() {
        return this.g;
    }

    @Override // defpackage.cpnv
    public final String g() {
        return this.h;
    }

    @Override // defpackage.cpnv
    public final dcdc<cpnn> h() {
        return this.i;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        dhab dhabVar = this.g;
        if (dhabVar == null) {
            i = 0;
        } else {
            int i2 = dhabVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dhabVar).c(dhabVar);
                dhabVar.bC = i2;
            }
            i = i2;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String str2 = this.h;
        String valueOf6 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 156 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str2).length() + String.valueOf(valueOf6).length());
        sb.append("FeedbackTask{context=");
        sb.append(valueOf);
        sb.append(", feedbackLoopId=");
        sb.append(str);
        sb.append(", feedbackController=");
        sb.append(valueOf2);
        sb.append(", feedbackMessage=");
        sb.append(valueOf3);
        sb.append(", feedbackSuggestions=");
        sb.append(valueOf4);
        sb.append(", addressLocation=");
        sb.append(valueOf5);
        sb.append(", addressLanguage=");
        sb.append(str2);
        sb.append(", feedbackListeners=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
