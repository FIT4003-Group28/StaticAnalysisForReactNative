package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cgxe  reason: default package */
/* loaded from: classes4.dex */
public class cgxe implements cgve {
    private final List<cgvd> a;

    public cgxe(Activity activity, cgsk cgskVar, dnmc dnmcVar) {
        bydk bydkVar = new bydk(activity);
        dgsl dgslVar = dnmcVar.a;
        LinkedHashMap<String, List<String>> c = bydkVar.c(dgslVar == null ? dgsl.b : dgslVar, TimeZone.getTimeZone(cgskVar.c().ad));
        this.a = new ArrayList();
        for (Map.Entry<String, List<String>> entry : c.entrySet()) {
            this.a.add(new cgxd(entry.getKey(), dbrz.e("\n").g(entry.getValue())));
        }
    }

    @Override // defpackage.cgvb
    public void a(cqiv cqivVar) {
        cqivVar.a(new cggd(), this);
    }

    @Override // defpackage.cgve
    public List<cgvd> b() {
        return this.a;
    }
}
