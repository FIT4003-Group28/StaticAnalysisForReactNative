package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: jcn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jcn implements jbg {
    public final /* synthetic */ aajs a;
    public final /* synthetic */ agqh b;
    private final /* synthetic */ int c;

    public /* synthetic */ jcn(aajs aajsVar, agqh agqhVar) {
        this.a = aajsVar;
        this.b = agqhVar;
    }

    public /* synthetic */ jcn(aajs aajsVar, agqh agqhVar, int i) {
        this.c = i;
        this.a = aajsVar;
        this.b = agqhVar;
    }

    @Override // defpackage.jbg
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            aajs aajsVar = this.a;
            agqh agqhVar = this.b;
            amvn amvnVar = jcq.a;
            ((jcu) obj).k(aajsVar, agqhVar);
        } else if (i != 1) {
            if (i == 2) {
                jdg.l(this.a, this.b, (Set) obj);
            } else {
                jdg.l(this.a, this.b, (Set) obj);
            }
        } else {
            aajs aajsVar2 = this.a;
            agqh agqhVar2 = this.b;
            amvn amvnVar2 = jcq.a;
            ((jcu) obj).h(aajsVar2, agqhVar2);
        }
    }
}
