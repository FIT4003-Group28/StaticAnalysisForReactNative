package defpackage;
/* compiled from: PG */
/* renamed from: ajuy  reason: default package */
/* loaded from: classes.dex */
public final class ajuy {
    public final aunm a;
    public final atul b;

    public ajuy(aunm aunmVar) {
        atul atulVar;
        this.a = aunmVar;
        atum atumVar = aunmVar.c;
        if (((atumVar == null ? atum.a : atumVar).b & 1) != 0) {
            atum atumVar2 = aunmVar.c;
            atulVar = (atumVar2 == null ? atum.a : atumVar2).c;
            if (atulVar == null) {
                atulVar = atul.a;
            }
        } else {
            atulVar = null;
        }
        this.b = atulVar;
    }

    public final apnn a() {
        apnm apnmVar = this.a.h;
        if (apnmVar == null) {
            apnmVar = apnm.a;
        }
        if ((apnmVar.b & 2) != 0) {
            apnm apnmVar2 = this.a.h;
            if (apnmVar2 == null) {
                apnmVar2 = apnm.a;
            }
            apnn apnnVar = apnmVar2.c;
            return apnnVar == null ? apnn.a : apnnVar;
        }
        return null;
    }
}
