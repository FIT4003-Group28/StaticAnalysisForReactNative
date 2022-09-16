package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: adgg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adgg implements Callable {
    public final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public /* synthetic */ adgg(List list) {
        this.a = list;
    }

    public /* synthetic */ adgg(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                tlf tlfVar = null;
                for (ankt anktVar : this.a) {
                    tlf tlfVar2 = (tlf) anlz.y(anktVar);
                    if (tlfVar2 != null) {
                        aqxo.z(tlfVar == null, "More than one auth provider provided result.");
                        tlfVar = tlfVar2;
                    }
                }
                if (tlfVar == null) {
                    throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
                }
                return tlfVar;
            }
            List<ankt> list = this.a;
            amuf f = amuk.f();
            for (ankt anktVar2 : list) {
                f.j((Iterable) anlz.y(anktVar2));
            }
            return f.g();
        }
        return (Map) Collection.EL.stream(this.a).map(omr.u).filter(lws.t).collect(Collectors.toMap(adgi.b, adgi.a));
    }
}
