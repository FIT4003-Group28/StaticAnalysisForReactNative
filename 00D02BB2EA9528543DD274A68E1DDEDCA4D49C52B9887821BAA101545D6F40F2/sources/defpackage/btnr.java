package defpackage;

import android.os.CancellationSignal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btnr  reason: default package */
/* loaded from: classes.dex */
public final class btnr extends btoq {
    public final dbsg<String[]> a;
    public final dbsg<String> b;
    public final dbsg<String[]> c;
    public final dbsg<String> d;
    public final dbsg<Integer> e;
    public final dbsg<CancellationSignal> f;

    public btnr(dbsg<String[]> dbsgVar, dbsg<String> dbsgVar2, dbsg<String[]> dbsgVar3, dbsg<String> dbsgVar4, dbsg<Integer> dbsgVar5, dbsg<CancellationSignal> dbsgVar6) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
        this.e = dbsgVar5;
        this.f = dbsgVar6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btoq
    public final dbsg<String[]> a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btoq
    public final dbsg<String> b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btoq
    public final dbsg<String[]> c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btoq
    public final dbsg<String> d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btoq
    public final dbsg<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btoq) {
            btoq btoqVar = (btoq) obj;
            if (this.a.equals(btoqVar.a()) && this.b.equals(btoqVar.b()) && this.c.equals(btoqVar.c()) && this.d.equals(btoqVar.d()) && this.e.equals(btoqVar.e()) && this.f.equals(btoqVar.f())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btoq
    public final dbsg<CancellationSignal> f() {
        return this.f;
    }

    @Override // defpackage.btoq
    public final btop g() {
        return new btnq(this);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332;
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
        StringBuilder sb = new StringBuilder(length + 93 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("QueryParams{projection=");
        sb.append(valueOf);
        sb.append(", selection=");
        sb.append(valueOf2);
        sb.append(", selectionArgs=");
        sb.append(valueOf3);
        sb.append(", sortOrder=");
        sb.append(valueOf4);
        sb.append(", limit=");
        sb.append(valueOf5);
        sb.append(", cancellationSignal=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
