package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rmb  reason: default package */
/* loaded from: classes4.dex */
final class rmb implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ rki d;
    private final /* synthetic */ int e;

    public rmb(rki rkiVar, String str, String str2, String str3) {
        this.d = rkiVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public rmb(rki rkiVar, String str, String str2, String str3, int i) {
        this.e = i;
        this.d = rkiVar;
        this.b = str;
        this.a = str2;
        this.c = str3;
    }

    public rmb(rki rkiVar, String str, String str2, String str3, int i, byte[] bArr) {
        this.e = i;
        this.d = rkiVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i = this.e;
        if (i == 0) {
            this.d.a.w();
            return this.d.a.j().r(this.a, this.b, this.c);
        } else if (i == 1) {
            this.d.a.w();
            return this.d.a.j().r(this.b, this.a, this.c);
        } else if (i == 2) {
            this.d.a.w();
            return this.d.a.j().o(this.b, this.a, this.c);
        } else {
            this.d.a.w();
            return this.d.a.j().o(this.a, this.b, this.c);
        }
    }
}
