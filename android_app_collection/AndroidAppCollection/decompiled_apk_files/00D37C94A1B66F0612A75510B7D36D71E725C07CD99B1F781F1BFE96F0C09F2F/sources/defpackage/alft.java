package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alft  reason: default package */
/* loaded from: classes.dex */
public final class alft implements algj {
    public final aldn a;
    private final alhc b;
    private final algr c;
    private final alfu d;
    private final aleu e;
    private final alei f;
    private final alhi g;
    private final alec h;
    private final alfp i;
    private final alel j;
    private final algg k;
    private final alfj l;
    private final aldz m;
    private final aley n;
    private final /* synthetic */ int o;

    public alft(alhc alhcVar, algr algrVar, alfu alfuVar, aleu aleuVar, alei aleiVar, alhi alhiVar, alec alecVar, alfp alfpVar, alel alelVar, algg alggVar, alfj alfjVar, aldz aldzVar, aley aleyVar, aldn aldnVar) {
        this.b = alhcVar;
        this.c = algrVar;
        this.d = alfuVar;
        this.e = aleuVar;
        this.f = aleiVar;
        this.g = alhiVar;
        this.h = alecVar;
        this.i = alfpVar;
        this.j = alelVar;
        this.k = alggVar;
        this.l = alfjVar;
        this.m = aldzVar;
        this.n = aleyVar;
        this.a = aldnVar;
    }

    public alft(alhc alhcVar, algr algrVar, alfu alfuVar, aleu aleuVar, alei aleiVar, alhi alhiVar, alec alecVar, alfp alfpVar, alel alelVar, algg alggVar, alfj alfjVar, aldz aldzVar, aley aleyVar, aldn aldnVar, int i) {
        this.o = i;
        this.b = alhcVar;
        this.c = algrVar;
        this.d = alfuVar;
        this.e = aleuVar;
        this.f = aleiVar;
        this.g = alhiVar;
        this.h = alecVar;
        this.i = alfpVar;
        this.j = alelVar;
        this.k = alggVar;
        this.l = alfjVar;
        this.m = aldzVar;
        this.n = aleyVar;
        this.a = aldnVar;
    }

    @Override // defpackage.algj
    public final alhf a(alcw alcwVar) {
        alhf c;
        alhf c2;
        if (this.o != 0) {
            if (alcwVar.s) {
                c2 = this.b.c(alcwVar.k, this.c, this.d).b(this.e);
            } else {
                c2 = this.b.c(alcwVar.k, this.c, this.e);
            }
            if (alcwVar.x) {
                c2 = c2.b(this.h);
            }
            alhf b = c2.b(this.f);
            alhf b2 = this.b.a(Arrays.asList(b.b(this.i).b(this.m), b.b(this.g).b(this.j).b(this.l)), this.k).b(this.n);
            b2.c(new Runnable(null) { // from class: alem
                @Override // java.lang.Runnable
                public final void run() {
                    alft.this.a.c();
                }
            });
            return b2;
        }
        if (alcwVar.s) {
            c = this.b.c(alcwVar.k, this.c, this.d).b(this.e);
        } else {
            c = this.b.c(alcwVar.k, this.c, this.e);
        }
        if (alcwVar.x) {
            c = c.b(this.h);
        }
        alhf b3 = c.b(this.f);
        alhf b4 = this.b.a(Arrays.asList(b3.b(this.i).b(this.m), b3.b(this.g).b(this.j).b(this.l)), this.k).b(this.n);
        b4.c(new Runnable() { // from class: alfq
            @Override // java.lang.Runnable
            public final void run() {
                alft.this.a.c();
            }
        });
        return b4;
    }
}
