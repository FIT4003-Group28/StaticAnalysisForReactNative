package defpackage;
/* compiled from: PG */
/* renamed from: krx  reason: default package */
/* loaded from: classes3.dex */
final class krx extends krz {
    final String a;
    final String b;

    public krx(ksc kscVar, String str, String str2, afzf afzfVar) {
        super(kscVar, null, aoob.b, afzfVar);
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.krz
    public final void a(abbb abbbVar) {
        abbbVar.u(this.a, this.b);
    }

    @Override // defpackage.krz
    public final boolean b(krz krzVar) {
        if (!(krzVar instanceof krx)) {
            return false;
        }
        return ((krx) krzVar).a.equals(this.a);
    }

    @Override // defpackage.krz
    public final boolean c() {
        return true;
    }
}
