package defpackage;
/* compiled from: PG */
/* renamed from: algf  reason: default package */
/* loaded from: classes.dex */
final class algf extends akzm {
    final /* synthetic */ avvd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public algf(albf albfVar, avvd avvdVar) {
        super(albfVar);
        this.a = avvdVar;
    }

    @Override // defpackage.akzm
    public final void c(aopa aopaVar) {
        alcv a = alcv.a(((alcw) aopaVar.instance).X);
        if (a == null) {
            a = alcv.UNKNOWN;
        }
        if (a != alcv.UNKNOWN) {
            return;
        }
        int ai = awwc.ai(this.a.c);
        if (ai == 0) {
            ai = 1;
        }
        int i = ai - 1;
        if (i == 1) {
            alcv alcvVar = alcv.SUCCESS;
            aopaVar.copyOnWrite();
            alcw alcwVar = (alcw) aopaVar.instance;
            alcwVar.X = alcvVar.g;
            alcwVar.c |= 65536;
        } else if (i == 2) {
            alcv alcvVar2 = alcv.FAILED;
            aopaVar.copyOnWrite();
            alcw alcwVar2 = (alcw) aopaVar.instance;
            alcwVar2.X = alcvVar2.g;
            alcwVar2.c |= 65536;
        } else if (i == 3) {
            alcv alcvVar3 = alcv.REJECTED;
            aopaVar.copyOnWrite();
            alcw alcwVar3 = (alcw) aopaVar.instance;
            alcwVar3.X = alcvVar3.g;
            alcwVar3.c |= 65536;
        } else if (i != 4) {
        } else {
            alcv alcvVar4 = alcv.DELETED;
            aopaVar.copyOnWrite();
            alcw alcwVar4 = (alcw) aopaVar.instance;
            alcwVar4.X = alcvVar4.g;
            alcwVar4.c |= 65536;
        }
    }
}
