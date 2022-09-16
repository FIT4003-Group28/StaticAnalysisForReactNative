package defpackage;
/* compiled from: PG */
/* renamed from: eud  reason: default package */
/* loaded from: classes3.dex */
public final class eud implements acvl {
    private final /* synthetic */ int a;

    public eud() {
    }

    public eud(int i) {
        this.a = i;
    }

    @Override // defpackage.acvl
    public final acvk a(acvp acvpVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new eto(acvpVar.a().a(), acvpVar.e().t());
            }
            if (i == 2) {
                return new exk(acvpVar.a().a(), acvpVar.e().t());
            }
            if (i == 3) {
                return new aczz(acvpVar.a().a(), acvpVar.e().t());
            }
            if (i == 4) {
                return new adad(acvpVar.a().a(), acvpVar.e().t());
            }
            if (i == 5) {
                return new ajpn(acvpVar.a().a(), acvpVar.e().t());
            }
            return new ajpp(acvpVar.a().a(), acvpVar.e().t());
        }
        return new eue(acvpVar.a().a(), acvpVar.e().t());
    }
}
