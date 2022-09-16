package defpackage;

import android.app.Service;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: crxd  reason: default package */
/* loaded from: classes5.dex */
final class crxd extends crxg {
    private final Service a;
    private final crvv b;
    private final crvc c;
    private final crxk d;
    private final crxb e;
    private final crvt f;

    public crxd(Service service, crvv crvvVar, crvc crvcVar, crxk crxkVar, crxb crxbVar, crvt crvtVar) {
        this.a = service;
        this.b = crvvVar;
        this.c = crvcVar;
        this.d = crxkVar;
        this.e = crxbVar;
        this.f = crvtVar;
    }

    @Override // defpackage.crxg
    public final Service a() {
        return this.a;
    }

    @Override // defpackage.crxg
    public final crvv b() {
        return this.b;
    }

    @Override // defpackage.crxg
    public final crvc c() {
        return this.c;
    }

    @Override // defpackage.crxg
    public final crxk d() {
        return this.d;
    }

    @Override // defpackage.crxg
    public final crxb e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crxg) {
            crxg crxgVar = (crxg) obj;
            if (this.a.equals(crxgVar.a()) && this.b.equals(crxgVar.b()) && this.c.equals(crxgVar.c()) && this.d.equals(crxgVar.d()) && this.e.equals(crxgVar.e()) && this.f.equals(crxgVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crxg
    public final crvt f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length());
        sb.append("MediaTaskBuilder{service=");
        sb.append(valueOf);
        sb.append(", apiaryClient=");
        sb.append(valueOf2);
        sb.append(", authTokenRetriever=");
        sb.append(valueOf3);
        sb.append(", taskContext=");
        sb.append(valueOf4);
        sb.append(", requestInfo=");
        sb.append(valueOf5);
        sb.append(", clearcutReporter=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
