package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gml  reason: default package */
/* loaded from: classes3.dex */
public final class gml implements aafl {
    private final xew a;
    private final wzd b;
    private final aafo c;

    public gml(xfc xfcVar, wzb wzbVar, aafo aafoVar) {
        this.a = xfcVar.b(new gnd(1));
        this.b = wzbVar.a();
        this.c = aafoVar;
    }

    private static Object b(Map map, String str, Object obj) {
        if (map == null || !map.containsKey(str)) {
            return obj;
        }
        try {
            return map.get(str);
        } catch (ClassCastException e) {
            afus.c(2, 1, "FormfillPostSubmitCommand: This should never happen.", e);
            return null;
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        dpp dppVar;
        if (!apzgVar.qn(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint)) {
            return;
        }
        FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint = (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint) apzgVar.qm(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint);
        int e = arey.e(formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.d);
        if (e == 0 || e != 2) {
            ArrayList arrayList = new ArrayList();
            List<dpn> list = (List) b(map, "FORM_RESULTS_ARG", new ArrayList());
            if (list != null) {
                for (dpn dpnVar : list) {
                    String str = dpnVar.e;
                    if (dpnVar.c == 4) {
                        dppVar = (dpp) dpnVar.d;
                    } else {
                        dppVar = dpp.a;
                    }
                    String str2 = dppVar.c;
                    if (!amps.e(str) && !amps.e(str2)) {
                        arrayList.add(amxp.l(str, str2));
                    }
                }
            }
            xew xewVar = this.a;
            apae apaeVar = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b;
            if (apaeVar == null) {
                apaeVar = apae.a;
            }
            xewVar.d(apaeVar, arrayList, false, new afzn[0]);
        } else {
            ArrayList arrayList2 = (ArrayList) b(map, "FORM_RESULTS_ARG", new ArrayList());
            aopa createBuilder = dpo.a.createBuilder();
            String str3 = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.c;
            createBuilder.copyOnWrite();
            dpo dpoVar = (dpo) createBuilder.instance;
            str3.getClass();
            dpoVar.b |= 1;
            dpoVar.c = str3;
            createBuilder.copyOnWrite();
            dpo dpoVar2 = (dpo) createBuilder.instance;
            aopu aopuVar = dpoVar2.d;
            if (!aopuVar.c()) {
                dpoVar2.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) arrayList2, (List) dpoVar2.d);
            byte[] byteArray = ((dpo) createBuilder.mo39build()).toByteArray();
            xew xewVar2 = this.a;
            apae apaeVar2 = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b;
            if (apaeVar2 == null) {
                apaeVar2 = apae.a;
            }
            afzn[] afznVarArr = {this.b};
            Uri j = xfb.j(apaeVar2);
            if (j != null && !Uri.EMPTY.equals(j)) {
                xfb xfbVar = (xfb) xewVar2;
                Uri g = xfbVar.g(j, afznVarArr);
                xfbVar.i(g, apaeVar2, xfbVar.d.d(g, byteArray, xfbVar.a.c()));
            }
        }
        List list2 = (List) b(map, "SUBMIT_COMMANDS_ARG", new ArrayList());
        if (list2 == null) {
            return;
        }
        this.c.d(list2, map);
    }
}
