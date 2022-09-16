package defpackage;
/* compiled from: PG */
/* renamed from: bfbh  reason: default package */
/* loaded from: classes3.dex */
final class bfbh implements bexy {
    final /* synthetic */ bfbj a;

    public bfbh(bfbj bfbjVar) {
        this.a = bfbjVar;
    }

    @Override // defpackage.bexy
    public final void a(final bexz bexzVar, boolean z) {
        bfbj bfbjVar = this.a;
        if (bfbjVar.d != null) {
            bfbjVar.c.b(new Runnable(this, bexzVar) { // from class: bfbg
                private final bfbh a;
                private final bexz b;

                {
                    this.a = this;
                    this.b = bexzVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bfbh bfbhVar = this.a;
                    bexz bexzVar2 = this.b;
                    bfbj bfbjVar2 = bfbhVar.a;
                    ilo iloVar = bfbjVar2.d;
                    dbsk.s(iloVar);
                    bfbjVar2.m(bexzVar2.d(iloVar));
                }
            }, bvrj.UI_THREAD);
        }
    }
}
