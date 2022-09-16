package defpackage;
/* compiled from: PG */
/* renamed from: kjb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kjb implements ayqb {
    public final /* synthetic */ kjd a;
    private final /* synthetic */ int b;

    public /* synthetic */ kjb(kjd kjdVar) {
        this.a = kjdVar;
    }

    public /* synthetic */ kjb(kjd kjdVar, int i) {
        this.b = i;
        this.a = kjdVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            kjd kjdVar = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            kcb kcbVar = kjdVar.m;
            if (kcbVar == null || kcbVar.e == booleanValue) {
                return;
            }
            kcbVar.e = booleanValue;
            kcbVar.j(false);
            return;
        }
        kjc kjcVar = (kjc) obj;
        kcb kcbVar2 = this.a.m;
        if (kcbVar2 == null) {
            return;
        }
        kcbVar2.e(kjcVar.a, kjcVar.b, kjcVar.c);
    }
}
