package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lri  reason: default package */
/* loaded from: classes3.dex */
public final class lri implements alax {
    final /* synthetic */ lrj a;

    public lri(lrj lrjVar) {
        this.a = lrjVar;
    }

    @Override // defpackage.alax
    public final void a(final String str, final String str2, final augw augwVar) {
        this.a.b.execute(new Runnable() { // from class: lre
            @Override // java.lang.Runnable
            public final void run() {
                lri lriVar = lri.this;
                String str3 = str;
                String str4 = str2;
                augw augwVar2 = augwVar;
                ggp b = lriVar.a.b(str3, str4);
                if (b != null) {
                    b.n = augwVar2.b;
                    arag aragVar = augwVar2.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    b.o = ajgl.b(aragVar);
                    arag aragVar2 = augwVar2.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    b.p = ajgl.b(aragVar2);
                    lriVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alax
    public final void b(final String str, final String str2, final avhj avhjVar) {
        this.a.b.execute(new Runnable() { // from class: lrf
            @Override // java.lang.Runnable
            public final void run() {
                lri lriVar = lri.this;
                String str3 = str;
                String str4 = str2;
                avhj avhjVar2 = avhjVar;
                ggp b = lriVar.a.b(str3, str4);
                if (b != null) {
                    avhn avhnVar = avhjVar2.b;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                    b.e = avhnVar;
                    lriVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alax
    public final void c(final String str, final String str2, final avtl avtlVar) {
        this.a.b.execute(new Runnable() { // from class: lrg
            @Override // java.lang.Runnable
            public final void run() {
                apzg apzgVar;
                lri lriVar = lri.this;
                String str3 = str;
                String str4 = str2;
                avtl avtlVar2 = avtlVar;
                ggp b = lriVar.a.b(str3, str4);
                if (b != null) {
                    if ((avtlVar2.b & 2) != 0) {
                        apzgVar = avtlVar2.d;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = null;
                    }
                    b.t = apzgVar;
                    if ((avtlVar2.b & 1) != 0) {
                        ates atesVar = avtlVar2.c;
                        if (atesVar == null) {
                            atesVar = ates.a;
                        }
                        if ((atesVar.b & 1) != 0) {
                            ates atesVar2 = avtlVar2.c;
                            if (atesVar2 == null) {
                                atesVar2 = ates.a;
                            }
                            atep atepVar = atesVar2.c;
                            if (atepVar == null) {
                                atepVar = atep.a;
                            }
                            b.d = atepVar;
                        }
                    } else {
                        b.d = null;
                    }
                    lriVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alax
    public final void d(final String str, final String str2, final avvd avvdVar) {
        this.a.b.execute(new Runnable() { // from class: lrh
            @Override // java.lang.Runnable
            public final void run() {
                lri lriVar = lri.this;
                String str3 = str;
                String str4 = str2;
                avvd avvdVar2 = avvdVar;
                ggp b = lriVar.a.b(str3, str4);
                if (b != null) {
                    b.d(avvdVar2);
                    lriVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alax
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.alax
    public final /* synthetic */ void f(String str, Exception exc) {
    }

    @Override // defpackage.alax
    public final /* synthetic */ void g() {
    }
}
