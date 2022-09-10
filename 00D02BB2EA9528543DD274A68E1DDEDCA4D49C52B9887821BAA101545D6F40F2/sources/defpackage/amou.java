package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amou  reason: default package */
/* loaded from: classes.dex */
public final class amou implements amcm {
    final /* synthetic */ amox a;

    public amou(amox amoxVar) {
        this.a = amoxVar;
    }

    @Override // defpackage.amcm
    public final void a(final alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        boolean z;
        synchronized (this.a.j) {
            amoo amooVar = this.a.i.get(alyhVar);
            if (amooVar == null) {
                return;
            }
            boolean z2 = false;
            boolean z3 = true;
            if (!this.a.j.h(amooVar)) {
                z = false;
            } else {
                if (this.a.j()) {
                    if (i == 0) {
                        throw null;
                    }
                    if (i == 4) {
                        z3 = amooVar.b;
                    } else {
                        if (i != 3 && i != 6) {
                            boolean s = this.a.s(alyhVar, alygVar, alygVar2, new Runnable(this, alyhVar) { // from class: amot
                                private final amou a;
                                private final alyh b;

                                {
                                    this.a = this;
                                    this.b = alyhVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    amou amouVar = this.a;
                                    alyh alyhVar2 = this.b;
                                    synchronized (amouVar.a.j) {
                                        amouVar.a.i.remove(alyhVar2);
                                    }
                                }
                            });
                            z3 = !s;
                            z = s;
                            z2 = true;
                        }
                        this.a.o(alyhVar);
                    }
                }
                z = false;
                z2 = true;
            }
            if (z3) {
                this.a.i.remove(alyhVar);
            }
            if (!z2) {
                return;
            }
            b(amooVar, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r1.s() != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@defpackage.dzsi defpackage.amoo r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amou.b(amoo, boolean):void");
    }
}
