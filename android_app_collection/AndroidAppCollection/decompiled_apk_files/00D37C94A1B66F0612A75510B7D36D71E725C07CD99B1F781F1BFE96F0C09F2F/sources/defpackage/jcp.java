package defpackage;
/* compiled from: PG */
/* renamed from: jcp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jcp implements jbg {
    public final /* synthetic */ aajs a;
    public final /* synthetic */ agqv b;
    private final /* synthetic */ int c;

    public /* synthetic */ jcp(aajs aajsVar, agqv agqvVar) {
        this.a = aajsVar;
        this.b = agqvVar;
    }

    public /* synthetic */ jcp(aajs aajsVar, agqv agqvVar, int i) {
        this.c = i;
        this.a = aajsVar;
        this.b = agqvVar;
    }

    @Override // defpackage.jbg
    public final void a(Object obj) {
        if (this.c == 0) {
            aajs aajsVar = this.a;
            agqv agqvVar = this.b;
            amvn amvnVar = jcq.a;
            ((jcw) obj).p(aajsVar, agqvVar);
            return;
        }
        aajs aajsVar2 = this.a;
        agqv agqvVar2 = this.b;
        amvn amvnVar2 = jcq.a;
        ((jcw) obj).o(aajsVar2, agqvVar2);
    }
}
