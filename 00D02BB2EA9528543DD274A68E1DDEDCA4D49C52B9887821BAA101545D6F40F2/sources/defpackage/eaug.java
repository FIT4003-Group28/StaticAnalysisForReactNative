package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaug  reason: default package */
/* loaded from: classes6.dex */
public final class eaug implements Comparable<eaug> {
    final eaon a;
    final int b;
    final String c;
    final Locale d;

    public eaug(eaon eaonVar, int i) {
        this.a = eaonVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }

    public eaug(eaon eaonVar, String str, Locale locale) {
        this.a = eaonVar;
        this.b = 0;
        this.c = str;
        this.d = locale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j, boolean z) {
        long r;
        String str = this.c;
        if (str == null) {
            r = this.a.p(j, this.b);
        } else {
            r = this.a.r(j, str, this.d);
        }
        return z ? this.a.F(r) : r;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(eaug eaugVar) {
        eaon eaonVar = eaugVar.a;
        int f = eaui.f(this.a.t(), eaonVar.t());
        return f != 0 ? f : eaui.f(this.a.s(), eaonVar.s());
    }
}
