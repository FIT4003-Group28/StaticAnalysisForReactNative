package defpackage;
/* compiled from: PG */
/* renamed from: bhat  reason: default package */
/* loaded from: classes3.dex */
public class bhat {
    public final btvo a;

    public bhat(btvo btvoVar) {
        this.a = btvoVar;
    }

    public static final boolean f(ilo iloVar) {
        return (iloVar == null || iloVar.bf() == null || !iloVar.bf().r) ? false : true;
    }

    public final boolean a() {
        return this.a.getMerchantExperienceParameters().c;
    }

    public final boolean b() {
        return a() && this.a.getMerchantExperienceParameters().d;
    }

    public final boolean c(btpf btpfVar, ilo iloVar) {
        return b() && f(iloVar) && !btpfVar.f;
    }

    public final boolean d() {
        return this.a.getMerchantExperienceParameters().b;
    }

    public final boolean e() {
        return this.a.getBusinessCallsParameters().b;
    }
}
