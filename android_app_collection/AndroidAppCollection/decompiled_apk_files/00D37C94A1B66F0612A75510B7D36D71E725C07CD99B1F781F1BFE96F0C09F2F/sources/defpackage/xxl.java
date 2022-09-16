package defpackage;

import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xxl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xxl implements View.OnClickListener {
    public final /* synthetic */ xxp a;
    public final /* synthetic */ aqav b;
    public final /* synthetic */ apzk c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ acti e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ View g;
    public final /* synthetic */ View h;
    private final /* synthetic */ int i;

    public /* synthetic */ xxl(xxp xxpVar, aqav aqavVar, apzk apzkVar, boolean z, acti actiVar, Map map, View view, View view2) {
        this.a = xxpVar;
        this.b = aqavVar;
        this.c = apzkVar;
        this.d = z;
        this.e = actiVar;
        this.f = map;
        this.g = view;
        this.h = view2;
    }

    public /* synthetic */ xxl(xxp xxpVar, aqav aqavVar, apzk apzkVar, boolean z, acti actiVar, Map map, View view, View view2, int i) {
        this.i = i;
        this.a = xxpVar;
        this.b = aqavVar;
        this.c = apzkVar;
        this.d = z;
        this.e = actiVar;
        this.f = map;
        this.g = view;
        this.h = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.i == 0) {
            xxp xxpVar = this.a;
            aqav aqavVar = this.b;
            apzk apzkVar = this.c;
            boolean z = this.d;
            acti actiVar = this.e;
            Map map = this.f;
            View view2 = this.g;
            View view3 = this.h;
            if (!xxpVar.c.o()) {
                xxpVar.d.b();
                return;
            }
            aopa mo52toBuilder = xxpVar.b.a(aqavVar.i, apzkVar, z).mo52toBuilder();
            aopa mo52toBuilder2 = xxpVar.b.b(aqavVar.i, apzkVar, z).mo52toBuilder();
            apzg e = xxp.e(mo52toBuilder, actiVar);
            xxp.f(mo52toBuilder, mo52toBuilder2);
            if (e != null) {
                xxpVar.a.c(e, map);
            }
            apos aposVar = (apos) mo52toBuilder2.mo39build();
            apos aposVar2 = (apos) mo52toBuilder.mo39build();
            xxp.d(aposVar, view2, xxpVar.g);
            xxp.b(aposVar2, view3, xxpVar.g);
            xxpVar.b.h(aqavVar.i, apzkVar.h, aposVar, aposVar2);
            return;
        }
        xxp xxpVar2 = this.a;
        aqav aqavVar2 = this.b;
        apzk apzkVar2 = this.c;
        boolean z2 = this.d;
        acti actiVar2 = this.e;
        Map map2 = this.f;
        View view4 = this.g;
        View view5 = this.h;
        if (!xxpVar2.c.o()) {
            xxpVar2.d.b();
            return;
        }
        aopa mo52toBuilder3 = xxpVar2.b.b(aqavVar2.i, apzkVar2, z2).mo52toBuilder();
        aopa mo52toBuilder4 = xxpVar2.b.a(aqavVar2.i, apzkVar2, z2).mo52toBuilder();
        apzg e2 = xxp.e(mo52toBuilder3, actiVar2);
        xxp.f(mo52toBuilder3, mo52toBuilder4);
        if (e2 != null) {
            xxpVar2.a.c(e2, map2);
        }
        apos aposVar3 = (apos) mo52toBuilder3.mo39build();
        apos aposVar4 = (apos) mo52toBuilder4.mo39build();
        xxp.d(aposVar3, view4, xxpVar2.g);
        xxp.b(aposVar4, view5, xxpVar2.g);
        xxpVar2.b.h(aqavVar2.i, apzkVar2.h, aposVar3, aposVar4);
    }
}
