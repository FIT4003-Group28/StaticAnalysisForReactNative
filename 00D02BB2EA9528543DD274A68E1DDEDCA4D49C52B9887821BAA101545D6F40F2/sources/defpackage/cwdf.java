package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwdf  reason: default package */
/* loaded from: classes.dex */
public final class cwdf extends cwdc {
    public final int a;
    public final Drawable b;
    public final String c;
    public final int d;
    public final View.OnClickListener e;
    public final cwdd f;
    public final cwdm g;
    public final boolean h;
    public final cwda i;

    public cwdf(int i, Drawable drawable, String str, int i2, View.OnClickListener onClickListener, cwdd cwddVar, cwdm cwdmVar, boolean z, cwda cwdaVar) {
        this.a = i;
        this.b = drawable;
        this.c = str;
        this.d = i2;
        this.e = onClickListener;
        this.f = cwddVar;
        this.g = cwdmVar;
        this.h = z;
        this.i = cwdaVar;
    }

    @Override // defpackage.cwdc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cwdc
    public final Drawable b() {
        return this.b;
    }

    @Override // defpackage.cwdc
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cwdc
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cwdc
    public final View.OnClickListener e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cwdd cwddVar;
        cwdm cwdmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwdc) {
            cwdc cwdcVar = (cwdc) obj;
            if (this.a == cwdcVar.a() && this.b.equals(cwdcVar.b()) && this.c.equals(cwdcVar.c()) && this.d == cwdcVar.d() && this.e.equals(cwdcVar.e()) && ((cwddVar = this.f) != null ? cwddVar.equals(cwdcVar.f()) : cwdcVar.f() == null) && ((cwdmVar = this.g) != null ? cwdmVar.equals(cwdcVar.g()) : cwdcVar.g() == null) && cwdcVar.h() == null && this.h == cwdcVar.i() && this.i.equals(cwdcVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cwdc
    public final cwdd f() {
        return this.f;
    }

    @Override // defpackage.cwdc
    public final cwdm g() {
        return this.g;
    }

    @Override // defpackage.cwdc
    public final cwdp h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        cwdd cwddVar = this.f;
        int i = 0;
        int hashCode2 = (hashCode ^ (cwddVar == null ? 0 : cwddVar.hashCode())) * 1000003;
        cwdm cwdmVar = this.g;
        if (cwdmVar != null) {
            i = cwdmVar.hashCode();
        }
        return ((((hashCode2 ^ i) * (-721379959)) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.cwdc
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.cwdc
    public final cwda j() {
        return this.i;
    }

    @Override // defpackage.cwdc
    public final cwdb k() {
        return new cwde(this);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        int i2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        boolean z = this.h;
        String valueOf5 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 179 + length2 + length3 + length4 + length5 + "null".length() + String.valueOf(valueOf5).length());
        sb.append("ActionSpec{id=");
        sb.append(i);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", label=");
        sb.append(str);
        sb.append(", veId=");
        sb.append(i2);
        sb.append(", onClickListener=");
        sb.append(valueOf2);
        sb.append(", visibilityHandler=");
        sb.append(valueOf3);
        sb.append(", countDecoration=");
        sb.append(valueOf4);
        sb.append(", highlightTextRetriever=");
        sb.append("null");
        sb.append(", visibleOnIncognito=");
        sb.append(z);
        sb.append(", actionType=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
