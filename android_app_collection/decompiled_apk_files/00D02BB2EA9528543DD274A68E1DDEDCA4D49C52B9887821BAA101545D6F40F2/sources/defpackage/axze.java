package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axze  reason: default package */
/* loaded from: classes3.dex */
public final class axze {
    public static final dpov b = dpov.f;
    public final axyz a;
    public dpov c = b;
    public Runnable d = axza.a;

    public axze(axyz axyzVar) {
        this.a = axyzVar;
    }

    public final void a(final dpov dpovVar, dbsz<List<dpre>> dbszVar, dbty<Boolean> dbtyVar) {
        if (this.c.equals(dpovVar)) {
            return;
        }
        this.d.run();
        final axzd axzdVar = new axzd(this, dbszVar, dbtyVar);
        this.d = new Runnable(this, axzdVar, dpovVar) { // from class: axzb
            private final axze a;
            private final axyy b;
            private final dpov c;

            {
                this.a = this;
                this.b = axzdVar;
                this.c = dpovVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axze axzeVar = this.a;
                axzeVar.a.b(this.b, this.c);
                axzeVar.c = axze.b;
                axzeVar.d = axzc.a;
            }
        };
        this.c = dpovVar;
        this.a.a(axzdVar, dpovVar);
        this.a.c(dpovVar);
    }
}
