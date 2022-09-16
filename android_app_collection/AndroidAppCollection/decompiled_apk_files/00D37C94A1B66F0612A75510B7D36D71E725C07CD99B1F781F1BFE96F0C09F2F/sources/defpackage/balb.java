package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: balb  reason: default package */
/* loaded from: classes2.dex */
public final class balb implements Comparable {
    final bahn a;
    final int b;
    final String c;
    final Locale d;

    public balb(bahn bahnVar, int i) {
        this.a = bahnVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }

    public balb(bahn bahnVar, String str, Locale locale) {
        this.a = bahnVar;
        this.b = 0;
        this.c = str;
        this.d = locale;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(balb balbVar) {
        bahn bahnVar = balbVar.a;
        int a = bald.a(this.a.r(), bahnVar.r());
        return a != 0 ? a : bald.a(this.a.p(), bahnVar.p());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b(long j, boolean z) {
        long i;
        String str = this.c;
        if (str == null) {
            i = this.a.h(j, this.b);
        } else {
            i = this.a.i(j, str, this.d);
        }
        return z ? this.a.g(i) : i;
    }
}
