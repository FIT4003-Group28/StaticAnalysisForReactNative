package defpackage;
/* compiled from: PG */
/* renamed from: apyv  reason: default package */
/* loaded from: classes2.dex */
public class apyv {
    private final apzy a;
    private final bvjj b;
    private final akfa c;
    private final apyx d;

    public apyv(apzy apzyVar, bvjj bvjjVar, akfa akfaVar, apyx apyxVar) {
        this.a = apzyVar;
        this.b = bvjjVar;
        this.c = akfaVar;
        this.d = apyxVar;
    }

    public final boolean a() {
        btlu j = this.c.j();
        return j != null && b(j);
    }

    public final boolean b(btlu btluVar) {
        if (btluVar.l() && this.d.c(btluVar)) {
            apyx apyxVar = this.d;
            if (((apyxVar.c(btluVar) && apyxVar.a.a().b(btluVar).getBusinessMessagingParameters().L) || this.a.i(btluVar) || this.b.o(bvjk.ju, btluVar, false)) && d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        apyx apyxVar = this.d;
        return (apyxVar.a() && apyxVar.b.a().getBusinessMessagingParameters().J) || a();
    }

    public final boolean d() {
        apzy apzyVar = this.a;
        return !apzyVar.a() || !apzyVar.b.b() || !apzyVar.a.a().getBusinessMessagingParameters().K || this.b.m(bvjk.jv, false);
    }
}
