package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aenv  reason: default package */
/* loaded from: classes.dex */
public final class aenv {
    public aeub a;
    private final String d;
    private final afje e;
    private final afgz f;
    public final Object b = new Object();
    public final List c = new ArrayList();
    private final List g = new ArrayList();

    public aenv(afje afjeVar, String str, afgz afgzVar) {
        this.e = afjeVar;
        this.d = str;
        this.f = afgzVar;
        this.a = d(afjeVar, str);
    }

    private static aeub d(afje afjeVar, String str) {
        afiz c = afjeVar.c(str);
        if (c == null) {
            return null;
        }
        return aetz.b(new Handler(Looper.getMainLooper()), c, aetv.c);
    }

    public final void a() {
        synchronized (this.b) {
            if (this.a != null) {
                return;
            }
            aeub d = d(this.e, this.d);
            this.a = d;
            if (d == null) {
                aeny.g("OnesieQoeReporter: No Qoe Client.");
                return;
            }
            for (afkn afknVar : this.g) {
                this.a.d(afknVar);
            }
            for (aenu aenuVar : this.c) {
                this.a.i(aenuVar.a, aenuVar.b);
            }
        }
    }

    public final void b(IOException iOException) {
        synchronized (this.b) {
            afkn c = this.f.c(afkl.ONESIE, iOException, null, null, null, 0L, false, false);
            c.g();
            aeub aeubVar = this.a;
            if (aeubVar != null) {
                aeubVar.d(c);
            } else {
                this.g.add(c);
            }
        }
    }

    public final void c(String str, Exception exc) {
        synchronized (this.b) {
            afkn afknVar = new afkn(afkl.ONESIE, str, 0L, exc);
            afknVar.g();
            aeub aeubVar = this.a;
            if (aeubVar != null) {
                aeubVar.d(afknVar);
            } else {
                this.g.add(afknVar);
            }
        }
    }
}
