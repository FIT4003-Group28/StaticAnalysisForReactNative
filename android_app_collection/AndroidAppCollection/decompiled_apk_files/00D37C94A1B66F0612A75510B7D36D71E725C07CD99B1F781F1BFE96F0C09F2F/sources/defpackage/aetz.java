package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: aetz  reason: default package */
/* loaded from: classes.dex */
public final class aetz implements aeub {
    private final afiz b;
    private final aetv c;
    private final Handler d;

    private aetz(Handler handler, afiz afizVar, aetv aetvVar) {
        this.d = handler;
        this.b = afizVar;
        this.c = aetvVar;
    }

    public static aeub b(Handler handler, afiz afizVar, aetv aetvVar) {
        if (afizVar == null) {
            afkk afkkVar = new afkk("invalid.parameter", 0L);
            afkkVar.b = "c.QoeLogger";
            afkkVar.c = new Throwable();
            aetvVar.g(afkkVar.a());
            return a;
        }
        return new aetz(handler, afizVar, aetvVar);
    }

    @Override // defpackage.aeub
    public final aeub a(aetv aetvVar) {
        return b(this.d, this.b, aetvVar);
    }

    @Override // defpackage.aeub
    public final void c(int i, boolean z) {
        afiz afizVar = this.b;
        if (z) {
            afizVar.k = i;
        } else {
            afizVar.l(afizVar.e(), i);
        }
    }

    @Override // defpackage.aeub
    public final void d(final afkn afknVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.post(new Runnable() { // from class: aetx
                @Override // java.lang.Runnable
                public final void run() {
                    aetz.this.d(afknVar);
                }
            });
        } else if (afknVar.n() || afkn.p(afknVar.i())) {
            this.c.g(afknVar);
        } else {
            this.b.v(afknVar);
        }
    }

    @Override // defpackage.aeub
    public final void e(final String str, final String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.post(new Runnable() { // from class: aety
                @Override // java.lang.Runnable
                public final void run() {
                    aetz.this.e(str, str2);
                }
            });
            return;
        }
        this.b.C(str, agpr.n(str2));
    }

    @Override // defpackage.aeub
    public final void f(boolean z, boolean z2) {
        afiz afizVar = this.b;
        String e = afizVar.e();
        afiw afiwVar = afizVar.e;
        String str = true != z ? "0" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + str.length());
        sb.append(e);
        sb.append(":");
        sb.append(str);
        afiwVar.a("is_offline", sb.toString());
        if (z2) {
            afizVar.e.a("cat", "partial_playback");
        }
    }

    @Override // defpackage.aeub
    public final void g(auqn auqnVar) {
        afiz afizVar = this.b;
        if (auqnVar == auqn.SEEK_SOURCE_UNKNOWN) {
            return;
        }
        String e = afizVar.e();
        afiw afiwVar = afizVar.e;
        int i = auqnVar.n;
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
        sb.append(e);
        sb.append(":");
        sb.append(i);
        afiwVar.a("ss", sb.toString());
    }

    @Override // defpackage.aeub
    public final void h(int i) {
        this.b.D(i);
    }

    @Override // defpackage.aeub
    public final void i(String str, String str2) {
        String e = this.b.e();
        String d = amps.d(str2);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 4 + d.length());
        sb.append("rt.");
        sb.append(e);
        sb.append(";");
        sb.append(d);
        e(str, sb.toString());
    }
}
