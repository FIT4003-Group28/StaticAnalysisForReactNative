package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: aajm  reason: default package */
/* loaded from: classes2.dex */
public final class aajm extends aajq {
    private final String a;
    private final dpuk b;
    private final boolean c;
    private final bvqg<dbsg<diwb>> d;
    private final bvrj e;

    public aajm(String str, dpuk dpukVar, boolean z, bvqg<dbsg<diwb>> bvqgVar, bvrj bvrjVar) {
        this.a = str;
        this.b = dpukVar;
        this.c = z;
        this.d = bvqgVar;
        this.e = bvrjVar;
    }

    @Override // defpackage.aajq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aajq
    public final dpuk b() {
        return this.b;
    }

    @Override // defpackage.aajq
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.aajq
    public final bvqg<dbsg<diwb>> d() {
        return this.d;
    }

    @Override // defpackage.aajq
    public final bvrj e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aajq) {
            aajq aajqVar = (aajq) obj;
            if (this.a.equals(aajqVar.a()) && this.b.equals(aajqVar.b()) && this.c == aajqVar.c() && this.d.equals(aajqVar.d()) && this.e.equals(aajqVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle + length2 + length3 + String.valueOf(valueOf3).length());
        sb.append("NetworkControllerOption{mid=");
        sb.append(str);
        sb.append(", knowledgeEntityType=");
        sb.append(valueOf);
        sb.append(", includeSimilarExperiences=");
        sb.append(z);
        sb.append(", callback=");
        sb.append(valueOf2);
        sb.append(", callbackThread=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
