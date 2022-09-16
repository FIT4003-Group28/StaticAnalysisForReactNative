package defpackage;
/* compiled from: PG */
/* renamed from: akrl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akrl implements sgp {
    public final /* synthetic */ awsf a;
    private final /* synthetic */ int b;

    public /* synthetic */ akrl(awsf awsfVar) {
        this.a = awsfVar;
    }

    public /* synthetic */ akrl(awsf awsfVar, int i) {
        this.b = i;
        this.a = awsfVar;
    }

    @Override // defpackage.sgp
    public final Object a(Object obj, int i, sgt sgtVar) {
        awry awryVar;
        awry awryVar2;
        if (this.b != 0) {
            awsf awsfVar = this.a;
            sgw sgwVar = (sgw) obj;
            if (awsfVar.b == 2) {
                awryVar2 = (awry) awsfVar.c;
            } else {
                awryVar2 = awry.a;
            }
            return (String) awryVar2.b.get(i);
        }
        awsf awsfVar2 = this.a;
        sgw sgwVar2 = (sgw) obj;
        if (awsfVar2.d == 4) {
            awryVar = (awry) awsfVar2.e;
        } else {
            awryVar = awry.a;
        }
        return (String) awryVar.b.get(i);
    }
}
