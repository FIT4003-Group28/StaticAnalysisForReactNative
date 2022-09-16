package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agsu  reason: default package */
/* loaded from: classes.dex */
final class agsu implements asv {
    private final amqo a;

    public agsu(final aghe agheVar, final afjl afjlVar, final afkf afkfVar, final asv asvVar) {
        this.a = aqxo.i(new amqo() { // from class: agst
            @Override // defpackage.amqo
            public final Object get() {
                asv asvVar2 = asv.this;
                aghe agheVar2 = agheVar;
                afjl afjlVar2 = afjlVar;
                afkf afkfVar2 = afkfVar;
                asv agswVar = new agsw(asvVar2);
                asv asvVar3 = agswVar;
                for (agpz agpzVar : agheVar2.g()) {
                    asvVar3 = new pdh(agpzVar, asvVar3, afjlVar2.a(agpzVar.n()), null, 4, afkfVar2);
                }
                return asvVar3;
            }
        });
    }

    @Override // defpackage.asv
    public final Map a() {
        return ((asv) this.a.get()).a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ((asv) this.a.get()).b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        return ((asv) this.a.get()).g(bArr, i, i2);
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        return ((asv) this.a.get()).h(asyVar);
    }

    @Override // defpackage.asv
    public final Uri i() {
        return ((asv) this.a.get()).i();
    }

    @Override // defpackage.asv
    public final void j() {
        ((asv) this.a.get()).j();
    }
}
