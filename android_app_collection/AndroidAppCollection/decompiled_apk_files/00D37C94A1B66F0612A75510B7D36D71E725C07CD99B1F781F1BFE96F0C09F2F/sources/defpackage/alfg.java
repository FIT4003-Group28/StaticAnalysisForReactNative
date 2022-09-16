package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alfg  reason: default package */
/* loaded from: classes.dex */
public final class alfg implements algj {
    public final aldn a;
    private final alhc b;
    private final aleu c;
    private final alei d;
    private final alfp e;
    private final alfi f;
    private final alee g;
    private final alhi h;
    private final alfe i;
    private final algg j;
    private final aldz k;
    private final aley l;
    private final algr m;

    public alfg(alhc alhcVar, algr algrVar, aleu aleuVar, alei aleiVar, alfp alfpVar, alfi alfiVar, alee aleeVar, alhi alhiVar, alfe alfeVar, algg alggVar, aldz aldzVar, aley aleyVar, aldn aldnVar) {
        this.b = alhcVar;
        this.m = algrVar;
        this.c = aleuVar;
        this.d = aleiVar;
        this.e = alfpVar;
        this.f = alfiVar;
        this.g = aleeVar;
        this.h = alhiVar;
        this.i = alfeVar;
        this.j = alggVar;
        this.k = aldzVar;
        this.l = aleyVar;
        this.a = aldnVar;
    }

    @Override // defpackage.algj
    public final alhf a(alcw alcwVar) {
        alhf a = this.b.a(Arrays.asList(this.b.c(alcwVar.k, this.m, this.c), this.b.c(alcwVar.k, this.m, this.f).b(this.g)), this.d);
        alhf b = a.b(this.e);
        alhf b2 = this.b.a(Arrays.asList(a.b(this.h).b(this.i), b), this.k).b(this.j).b(this.l);
        b2.c(new Runnable() { // from class: alff
            @Override // java.lang.Runnable
            public final void run() {
                alfg.this.a.c();
            }
        });
        return b2;
    }
}
