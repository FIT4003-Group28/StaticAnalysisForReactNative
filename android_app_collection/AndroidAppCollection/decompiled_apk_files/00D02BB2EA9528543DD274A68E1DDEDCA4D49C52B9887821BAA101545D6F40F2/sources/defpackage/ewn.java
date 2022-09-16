package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ewn  reason: default package */
/* loaded from: classes6.dex */
public final class ewn<T> implements dzsj<T> {
    final /* synthetic */ ewo a;
    private final int b;

    public ewn(ewo ewoVar, int i) {
        this.a = ewoVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            ewo ewoVar = this.a;
            return (T) bayw.b(ewoVar.a.ad(), ewoVar.a.eW.u(), ewoVar.a.eW.er(), ewoVar.a.eW.n(), ewoVar.a.eW.hj(), ewoVar.a.eW.oL(), ewoVar.a.eW.bu(), ewoVar.a.J(), ewoVar.a.eW.kf(), ewoVar.b(), ewoVar.a.eW.oN(), dxjh.c(ewoVar.a.eW.oP()), dxjh.c(ewoVar.a.eW.oP()));
        } else if (i == 1) {
            return (T) baua.b(this.a.a.fc());
        } else {
            if (i != 2) {
                ewo ewoVar2 = this.a;
                return (T) new bazx(ewoVar2.a.ad(), ewoVar2.a.eW.u(), ewoVar2.a.eW.er(), ewoVar2.a.eW.hj(), ewoVar2.a.eW.kf(), ewoVar2.a.eW.R(), ewoVar2.b());
            }
            ewo ewoVar3 = this.a;
            return (T) bayz.b(ewoVar3.a.ad(), ewoVar3.a.eW.er(), ewoVar3.a.eW.n(), ewoVar3.a.eW.hj(), ewoVar3.a.J(), ewoVar3.a.A(), ewoVar3.a.eW.k(), ewoVar3.a.un(), ewoVar3.b(), ewoVar3.a.eW.oN(), dxjh.c(ewoVar3.a.eW.oP()), dxjh.c(ewoVar3.a.eW.oP()));
        }
    }
}
