package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aahr  reason: default package */
/* loaded from: classes2.dex */
final class aahr implements degu<baad> {
    final /* synthetic */ mw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ aahs d;

    public aahr(aahs aahsVar, mw mwVar, boolean z, String str) {
        this.d = aahsVar;
        this.a = mwVar;
        this.b = z;
        this.c = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        Executor executor = this.d.a;
        final boolean z = this.b;
        final String str = this.c;
        executor.execute(new Runnable(this, z, str) { // from class: aahq
            private final aahr a;
            private final boolean b;
            private final String c;

            {
                this.a = this;
                this.b = z;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aahr aahrVar = this.a;
                aahrVar.d.i(this.b, true, this.c, true);
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi baad baadVar) {
        final baad baadVar2 = baadVar;
        Executor executor = this.d.a;
        final mw mwVar = this.a;
        executor.execute(new Runnable(mwVar, baadVar2) { // from class: aahp
            private final mw a;
            private final baad b;

            {
                this.a = mwVar;
                this.b = baadVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        });
    }
}
