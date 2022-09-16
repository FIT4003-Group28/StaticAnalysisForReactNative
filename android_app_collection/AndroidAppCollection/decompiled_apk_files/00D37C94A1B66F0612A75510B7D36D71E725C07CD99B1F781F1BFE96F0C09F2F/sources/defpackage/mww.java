package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mww  reason: default package */
/* loaded from: classes3.dex */
public class mww {
    protected final enm a;
    public Object b;
    public String c;
    private final aafo d;
    private final tjv e;
    private final View f;
    private String g;

    public mww(aafo aafoVar, tjv tjvVar, enm enmVar, View view) {
        aafoVar.getClass();
        this.d = aafoVar;
        tjvVar.getClass();
        this.e = tjvVar;
        enmVar.getClass();
        this.a = enmVar;
        view.getClass();
        this.f = view;
    }

    public static amuk a(List list) {
        List q;
        if (list.size() > 0) {
            q = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                aopa createBuilder = aswg.a.createBuilder();
                createBuilder.copyOnWrite();
                aswg aswgVar = (aswg) createBuilder.instance;
                str.getClass();
                aswgVar.b |= 1;
                aswgVar.c = str;
                q.add((aswg) createBuilder.mo39build());
            }
        } else {
            q = amuk.q();
        }
        aopa createBuilder2 = PingingEndpointOuterClass$PingingEndpoint.a.createBuilder();
        createBuilder2.copyOnWrite();
        PingingEndpointOuterClass$PingingEndpoint pingingEndpointOuterClass$PingingEndpoint = (PingingEndpointOuterClass$PingingEndpoint) createBuilder2.instance;
        pingingEndpointOuterClass$PingingEndpoint.b |= 1;
        pingingEndpointOuterClass$PingingEndpoint.c = true;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint, (PingingEndpointOuterClass$PingingEndpoint) createBuilder2.mo39build());
        aopcVar.copyOnWrite();
        apzg apzgVar = (apzg) aopcVar.instance;
        aopu aopuVar = apzgVar.d;
        if (!aopuVar.c()) {
            apzgVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) q, (List) apzgVar.d);
        return amuk.r((apzg) aopcVar.mo39build());
    }

    protected final Map b(boolean z) {
        Map h = actk.h(this.b, z);
        h.put("MacrosConverters.CustomConvertersKey", f());
        return h;
    }

    public final void c() {
        String str = this.g;
        if (str != null) {
            this.e.d(str);
        }
    }

    public final void d(acti actiVar, Object obj, String str, List list, aozy aozyVar, byte[] bArr) {
        obj.getClass();
        this.b = obj;
        this.c = str;
        if (bArr != null && bArr.length > 0) {
            actiVar.u(new acte(bArr), null);
        }
        if (list != null) {
            mwx mwxVar = (mwx) this.a.c(this.c, mwx.class, "PPState", mwv.a, this.b);
            if (!mwxVar.a) {
                mwxVar.a = true;
                e(list, false);
            }
        }
        if (aozyVar == null || aozyVar.b.size() <= 0 || amps.e(aozyVar.e)) {
            this.g = null;
            return;
        }
        this.e.b(aozyVar.e, this.f, new xjf(obj, aozyVar, this.d));
        this.g = aozyVar.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(List list, boolean z) {
        if (list != null) {
            Map b = b(z);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                apzg apzgVar = (apzg) it.next();
                if (apzgVar != null) {
                    this.d.c(apzgVar, b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public afzn[] f() {
        return new afzn[0];
    }

    public final void g(apzg apzgVar) {
        if (apzgVar != null) {
            this.d.c(apzgVar, b(true));
        }
    }
}
