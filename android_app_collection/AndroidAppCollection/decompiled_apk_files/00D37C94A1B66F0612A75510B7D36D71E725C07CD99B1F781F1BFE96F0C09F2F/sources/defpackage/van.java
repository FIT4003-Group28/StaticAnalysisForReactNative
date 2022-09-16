package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: van  reason: default package */
/* loaded from: classes4.dex */
public final class van implements var {
    public final Application a;
    public final Set b;
    private final Set c;

    public van(Context context, Set set, Set set2) {
        this.a = (Application) context;
        this.c = set;
        this.b = set2;
    }

    @Override // defpackage.var
    public final void a(final baax baaxVar) {
        baak baakVar = baaxVar.h;
        if (baakVar == null) {
            baakVar = baak.a;
        }
        if ((baakVar.b & 1) == 0 || this.c.isEmpty() || this.b.isEmpty()) {
            return;
        }
        amuf f = amuk.f();
        amzs it = ((amyg) this.c).iterator();
        while (it.hasNext()) {
            f.h(((vap) it.next()).a());
        }
        anlz.z(anii.h(anlz.w(f.g()), new ampg() { // from class: vam
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                van vanVar = van.this;
                baax baaxVar2 = baaxVar;
                aopc aopcVar = (aopc) vao.a.createBuilder();
                for (vao vaoVar : (List) obj) {
                    if (vaoVar != null) {
                        aopcVar.mergeFrom((aopi) vaoVar);
                    }
                }
                aopcVar.copyOnWrite();
                vao vaoVar2 = (vao) aopcVar.instance;
                baaxVar2.getClass();
                vaoVar2.c = baaxVar2;
                vaoVar2.b |= 1;
                amyg amygVar = (amyg) vanVar.b;
                String[] strArr = new String[amygVar.e];
                amzs it2 = amygVar.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    strArr[i] = ((vaq) it2.next()).getClass().getName();
                    i++;
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(vanVar.a.getApplicationContext(), LifeboatReceiver.class));
                intent.setPackage(vanVar.a.getApplicationContext().getPackageName());
                intent.putExtra("Transmitters", strArr);
                intent.putExtra("MetricSnapshot", ((vao) aopcVar.mo39build()).toByteArray());
                vanVar.a.sendBroadcast(intent);
                return null;
            }
        }, anjk.a));
    }
}
