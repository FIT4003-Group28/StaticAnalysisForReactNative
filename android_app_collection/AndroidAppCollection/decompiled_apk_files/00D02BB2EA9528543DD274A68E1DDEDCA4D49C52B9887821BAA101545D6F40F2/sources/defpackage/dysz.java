package defpackage;
/* compiled from: PG */
/* renamed from: dysz  reason: default package */
/* loaded from: classes6.dex */
final class dysz {
    final /* synthetic */ dyhc a;
    final /* synthetic */ dytd b;

    public dysz(dytd dytdVar, dyhc dyhcVar) {
        this.b = dytdVar;
        this.a = dyhcVar;
    }

    public final void a(dyfl dyflVar) {
        dyhd dytaVar;
        dytd dytdVar = this.b;
        dyhc dyhcVar = this.a;
        dyfk dyfkVar = dyflVar.a;
        if (dyfkVar == dyfk.SHUTDOWN) {
            return;
        }
        int ordinal = dyfkVar.ordinal();
        if (ordinal == 0) {
            dytaVar = new dyta(dygy.a);
        } else if (ordinal == 1) {
            dytaVar = new dyta(dygy.a(dyhcVar));
        } else if (ordinal == 2) {
            dytaVar = new dyta(dygy.b(dyflVar.b));
        } else if (ordinal == 3) {
            dytaVar = new dytc(dytdVar, dyhcVar);
        } else {
            String valueOf = String.valueOf(dyfkVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("Unsupported state:");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        dytdVar.b.a(dyfkVar, dytaVar);
    }
}
