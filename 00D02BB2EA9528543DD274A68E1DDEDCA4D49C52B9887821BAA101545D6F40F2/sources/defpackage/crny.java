package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: crny  reason: default package */
/* loaded from: classes5.dex */
final class crny {
    final int a;
    final List<Integer> b;
    final String c;
    @dzsi
    final String d;
    private final ddws e;

    public crny(int i, ddws ddwsVar, List<Integer> list, String str, @dzsi String str2) {
        this.a = i;
        this.e = ddwsVar;
        this.b = list;
        this.c = str;
        this.d = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        ddws ddwsVar = this.e;
        if (ddwsVar.c) {
            ddwsVar.bF();
            ddwsVar.c = false;
        }
        ddww ddwwVar = (ddww) ddwsVar.b;
        ddww ddwwVar2 = ddww.U;
        ddwwVar.a |= 8388608;
        ddwwVar.z = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(boolean z) {
        ddws ddwsVar = this.e;
        if (ddwsVar.c) {
            ddwsVar.bF();
            ddwsVar.c = false;
        }
        ddww ddwwVar = (ddww) ddwsVar.b;
        ddww ddwwVar2 = ddww.U;
        ddwwVar.a |= 16777216;
        ddwwVar.A = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(boolean z) {
        ddws ddwsVar = this.e;
        if (ddwsVar.c) {
            ddwsVar.bF();
            ddwsVar.c = false;
        }
        ddww ddwwVar = (ddww) ddwsVar.b;
        ddww ddwwVar2 = ddww.U;
        ddwwVar.a |= 33554432;
        ddwwVar.B = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(boolean z) {
        ddws ddwsVar = this.e;
        if (ddwsVar.c) {
            ddwsVar.bF();
            ddwsVar.c = false;
        }
        ddww ddwwVar = (ddww) ddwsVar.b;
        ddww ddwwVar2 = ddww.U;
        ddwwVar.a |= 67108864;
        ddwwVar.C = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(boolean z) {
        ddws ddwsVar = this.e;
        if (ddwsVar.c) {
            ddwsVar.bF();
            ddwsVar.c = false;
        }
        ddww ddwwVar = (ddww) ddwsVar.b;
        ddww ddwwVar2 = ddww.U;
        ddwwVar.a |= 134217728;
        ddwwVar.D = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean f() {
        return ((ddww) this.e.b).d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g() {
        return ((ddww) this.e.b).c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean h() {
        return ((ddww) this.e.b).w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ddww i() {
        return this.e.bK();
    }
}
