package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ybx  reason: default package */
/* loaded from: classes4.dex */
public final class ybx implements aafl {
    public final Activity a;
    public final ajxz b;
    public final acti c;
    public final yzj d;
    public final aafo e;
    public final ydq f;
    public final yat g = new yat();
    public final ycs h;
    public final acrr i;
    private final abff j;

    public ybx(Activity activity, abff abffVar, ajxz ajxzVar, acti actiVar, yzj yzjVar, aafo aafoVar, ycs ycsVar, ydq ydqVar, acrr acrrVar) {
        this.a = activity;
        this.j = abffVar;
        this.b = ajxzVar;
        this.c = actiVar;
        this.d = yzjVar;
        this.e = aafoVar;
        this.f = ydqVar;
        this.h = ycsVar;
        this.i = acrrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arrh arrhVar;
        arrh arrhVar2;
        abff abffVar = this.j;
        abey abeyVar = new abey(abffVar.e, abffVar.c.c());
        abeyVar.j(apzgVar.c);
        YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint = (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint) apzgVar.qm(YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.ypcCancelRecurrenceEndpoint);
        aoob aoobVar = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.e;
        List list = null;
        if (!aoobVar.H()) {
            ycp ycpVar = new ycp();
            ycpVar.a = aoobVar;
            arrf a = arrh.a();
            awhg a2 = ycpVar.a();
            a.copyOnWrite();
            ((arrh) a.instance).em(a2);
            arrhVar = (arrh) a.mo39build();
        } else {
            arrhVar = null;
        }
        if (!aoobVar.H()) {
            ycp ycpVar2 = new ycp();
            ycpVar2.a = aoobVar;
            ycpVar2.b = 4;
            arrf a3 = arrh.a();
            awhg a4 = ycpVar2.a();
            a3.copyOnWrite();
            ((arrh) a3.instance).ek(a4);
            arrhVar2 = (arrh) a3.mo39build();
        } else {
            arrhVar2 = null;
        }
        ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.getClass();
        abeyVar.a = abey.g(ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.b);
        abeyVar.b = abey.g(ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.c);
        awir awirVar = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
        if (awirVar == null) {
            awirVar = awir.a;
        }
        if (awirVar.b.isEmpty()) {
            try {
                list = (List) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", List.class);
            } catch (ClassCastException unused) {
            }
            abeyVar.t(list);
        } else {
            awir awirVar2 = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
            if (awirVar2 == null) {
                awirVar2 = awir.a;
            }
            abeyVar.t(awirVar2.b);
        }
        awir awirVar3 = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
        if (awirVar3 == null) {
            awirVar3 = awir.a;
        }
        if (!awirVar3.c.isEmpty()) {
            awir awirVar4 = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
            if (awirVar4 == null) {
                awirVar4 = awir.a;
            }
            aopu aopuVar = awirVar4.c;
            if (aopuVar != null && !aopuVar.isEmpty()) {
                abeyVar.c = aopuVar;
            }
        }
        if (apzgVar.qn(auqs.b)) {
            auqr auqrVar = (auqr) apzgVar.qm(auqs.b);
            if (!auqrVar.c.isEmpty()) {
                abeyVar.l(auqrVar.c);
            }
        }
        this.g.show(this.a.getFragmentManager(), yat.a);
        this.j.i.e(abeyVar, new ybw(this, arrhVar, arrhVar2));
    }
}
