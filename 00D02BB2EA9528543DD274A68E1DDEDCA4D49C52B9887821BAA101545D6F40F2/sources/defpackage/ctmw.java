package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctmw  reason: default package */
/* loaded from: classes5.dex */
public final class ctmw extends ctof {
    public final dspd a;
    public final int b;
    public final dbsg<Integer> c;
    public final dbsg<int[]> d;
    public final dbsg<String> e;
    public final dbsg<String> f;

    public ctmw(dspd dspdVar, int i, dbsg<Integer> dbsgVar, dbsg<int[]> dbsgVar2, dbsg<String> dbsgVar3, dbsg<String> dbsgVar4) {
        this.a = dspdVar;
        this.b = i;
        this.c = dbsgVar;
        this.d = dbsgVar2;
        this.e = dbsgVar3;
        this.f = dbsgVar4;
    }

    @Override // defpackage.ctof
    public final dspd a() {
        return this.a;
    }

    @Override // defpackage.ctof
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ctof
    public final dbsg<Integer> c() {
        return this.c;
    }

    @Override // defpackage.ctof
    public final dbsg<int[]> d() {
        return this.d;
    }

    @Override // defpackage.ctof
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctof) {
            ctof ctofVar = (ctof) obj;
            if (this.a.equals(ctofVar.a()) && this.b == ctofVar.b() && this.c.equals(ctofVar.c()) && this.d.equals(ctofVar.d()) && this.e.equals(ctofVar.e()) && this.f.equals(ctofVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctof
    public final dbsg<String> f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textColorAlertDialogListItem + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("ClearcutEvent{event=");
        sb.append(valueOf);
        sb.append(", eventCode=");
        sb.append(i);
        sb.append(", eventFlowId=");
        sb.append(valueOf2);
        sb.append(", experimentIds=");
        sb.append(valueOf3);
        sb.append(", logSourceName=");
        sb.append(valueOf4);
        sb.append(", uploadAccountName=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
