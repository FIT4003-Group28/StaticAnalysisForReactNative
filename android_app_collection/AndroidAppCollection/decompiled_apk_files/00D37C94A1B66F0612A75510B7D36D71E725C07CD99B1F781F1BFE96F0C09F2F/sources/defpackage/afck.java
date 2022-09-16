package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: afck  reason: default package */
/* loaded from: classes.dex */
public final class afck {
    public final avg a;
    public final FormatStreamModel b;
    public final avb c;
    public final long d;
    final prt e;

    public afck(long j, avg avgVar, FormatStreamModel formatStreamModel, prt prtVar, avb avbVar) {
        this.d = j;
        this.a = avgVar;
        this.b = formatStreamModel;
        this.e = prtVar;
        this.c = avbVar;
    }

    public final long a() {
        return this.c.e();
    }

    public final long b(long j) {
        return d(j) + this.c.a(j, this.d);
    }

    public final long c(long j) {
        return this.c.f(j);
    }

    public final long d(long j) {
        return this.c.b(j);
    }

    public final avf e(long j) {
        return this.c.c(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f() {
        long a = a();
        h();
        return a - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        a();
        h();
    }

    public final void h() {
        this.c.d();
    }
}
