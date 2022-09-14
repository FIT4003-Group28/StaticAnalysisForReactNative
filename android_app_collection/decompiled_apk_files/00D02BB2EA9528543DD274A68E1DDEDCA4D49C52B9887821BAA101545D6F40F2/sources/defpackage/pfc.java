package defpackage;
/* compiled from: PG */
/* renamed from: pfc  reason: default package */
/* loaded from: classes7.dex */
public final class pfc {
    public final btvo a;

    public pfc(btvo btvoVar) {
        this.a = btvoVar;
    }

    public final boolean a() {
        return b() || c();
    }

    public final boolean b() {
        return this.a.getGellerParameters().a || this.a.getGellerParameters().b || this.a.getGellerParameters().c;
    }

    public final boolean c() {
        int a;
        int a2 = dkjx.a(this.a.getExploreMapParametersWithoutLogging().o);
        return ((a2 != 0 && a2 == 3) || ((a = dkjx.a(this.a.getExploreMapParametersWithoutLogging().o)) != 0 && a == 4)) && this.a.getExploreMapParametersWithoutLogging().q > 0;
    }
}
