package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: fjh  reason: default package */
/* loaded from: classes3.dex */
public final class fjh implements tct {
    public final acth a;
    public final Context b;

    public fjh(acth acthVar, Context context) {
        this.a = acthVar;
        this.b = context;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awsn.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        final awsn awsnVar = (awsn) obj;
        return aynr.j(new aynt() { // from class: fjg
            @Override // defpackage.aynt
            public final void a(aysm aysmVar) {
                fjh fjhVar = fjh.this;
                awsn awsnVar2 = awsnVar;
                tcs tcsVar2 = tcsVar;
                asvv b = acun.b(awsnVar2);
                if (b != null && (b.c & 1) != 0 && tcsVar2.a != null) {
                    acti oi = fjhVar.a.oi();
                    acte acteVar = new acte(b.d);
                    View view = tcsVar2.a;
                    int n = zew.n(fjhVar.b.getResources().getDisplayMetrics(), view.getHeight());
                    int n2 = zew.n(fjhVar.b.getResources().getDisplayMetrics(), view.getWidth());
                    aopa createBuilder = asjj.a.createBuilder();
                    aopa createBuilder2 = aqcg.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    aqcg aqcgVar = (aqcg) createBuilder2.instance;
                    aqcgVar.b |= 1;
                    aqcgVar.c = n;
                    createBuilder2.copyOnWrite();
                    aqcg aqcgVar2 = (aqcg) createBuilder2.instance;
                    aqcgVar2.b |= 2;
                    aqcgVar2.d = n2;
                    aqcg aqcgVar3 = (aqcg) createBuilder2.mo39build();
                    createBuilder.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder.instance;
                    aqcgVar3.getClass();
                    asjjVar.D = aqcgVar3;
                    asjjVar.c |= 4194304;
                    oi.w(acteVar, (asjj) createBuilder.mo39build());
                }
                aysmVar.a();
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
