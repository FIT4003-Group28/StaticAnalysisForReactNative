package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: flv  reason: default package */
/* loaded from: classes3.dex */
final class flv implements AdapterView.OnItemSelectedListener {
    public int a = -1;
    final /* synthetic */ flx b;
    private Map c;

    public flv(flx flxVar) {
        this.b = flxVar;
    }

    private final auxq a(int i) {
        return (auxq) this.b.b.getItem(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        auxs auxsVar;
        auxs auxsVar2;
        if (i == this.a) {
            return;
        }
        auxq a = a(i);
        ajrs ajrsVar = this.b.e;
        if (ajrsVar != null) {
            nni.w(ajrsVar, a);
        }
        if (a.c == 3) {
            auxsVar = (auxs) a.d;
        } else {
            auxsVar = auxs.a;
        }
        if ((auxsVar.b & 1) != 0) {
            ajwq b = akal.b(this.b.e);
            if (b != null) {
                if (a.c == 3) {
                    auxsVar2 = (auxs) a.d;
                } else {
                    auxsVar2 = auxs.a;
                }
                aumx aumxVar = auxsVar2.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                b.lx(aumxVar, null);
            }
        } else if (a.c == 5) {
            aafo aafoVar = this.b.a;
            apzg apzgVar = (apzg) a.d;
            if (this.c == null) {
                this.c = new HashMap(1);
            }
            this.c.put("sectionListController", this.b.e.c("sectionListController"));
            aafoVar.c(apzgVar, this.c);
        }
        int i2 = 0;
        while (i2 < this.b.b.getCount()) {
            aopa mo52toBuilder = a(i2).mo52toBuilder();
            boolean z = i2 == i;
            mo52toBuilder.copyOnWrite();
            auxq auxqVar = (auxq) mo52toBuilder.instance;
            auxqVar.b |= 4;
            auxqVar.g = z;
            this.b.b.b(i2, (auxq) mo52toBuilder.mo39build());
            i2++;
        }
        this.a = i;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
