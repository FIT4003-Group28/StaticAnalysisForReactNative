package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xxm  reason: default package */
/* loaded from: classes4.dex */
public final class xxm implements View.OnClickListener {
    final /* synthetic */ aqav a;
    final /* synthetic */ apzk b;
    final /* synthetic */ boolean c;
    final /* synthetic */ acti d;
    final /* synthetic */ Map e;
    final /* synthetic */ ImageView f;
    final /* synthetic */ TextView g;
    final /* synthetic */ Map h;
    final /* synthetic */ ImageView i;
    final /* synthetic */ xxp j;
    private final /* synthetic */ int k;

    public xxm(xxp xxpVar, aqav aqavVar, apzk apzkVar, boolean z, acti actiVar, Map map, ImageView imageView, TextView textView, Map map2, ImageView imageView2) {
        this.j = xxpVar;
        this.a = aqavVar;
        this.b = apzkVar;
        this.c = z;
        this.d = actiVar;
        this.e = map;
        this.f = imageView;
        this.g = textView;
        this.h = map2;
        this.i = imageView2;
    }

    public xxm(xxp xxpVar, aqav aqavVar, apzk apzkVar, boolean z, acti actiVar, Map map, ImageView imageView, TextView textView, Map map2, ImageView imageView2, int i) {
        this.k = i;
        this.j = xxpVar;
        this.a = aqavVar;
        this.b = apzkVar;
        this.c = z;
        this.d = actiVar;
        this.e = map;
        this.f = imageView;
        this.g = textView;
        this.h = map2;
        this.i = imageView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        apzg apzgVar2;
        if (this.k == 0) {
            if (!this.j.c.o()) {
                this.j.d.b();
                return;
            }
            aopa mo52toBuilder = this.j.b.b(this.a.i, this.b, this.c).mo52toBuilder();
            aopa mo52toBuilder2 = this.j.b.a(this.a.i, this.b, this.c).mo52toBuilder();
            apos aposVar = (apos) mo52toBuilder2.instance;
            boolean z = aposVar.e;
            if ((z && (aposVar.b & 16384) != 0) || (!z && (aposVar.b & 512) != 0)) {
                if (z) {
                    apzgVar = aposVar.p;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = aposVar.k;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                }
                aopa createBuilder = auqr.a.createBuilder();
                String k = this.d.k();
                createBuilder.copyOnWrite();
                auqr auqrVar = (auqr) createBuilder.instance;
                k.getClass();
                auqrVar.b |= 1;
                auqrVar.c = k;
                aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                aopcVar.e(auqs.b, (auqr) createBuilder.mo39build());
                apzg apzgVar3 = (apzg) aopcVar.mo39build();
                if (z) {
                    mo52toBuilder2.copyOnWrite();
                    apos aposVar2 = (apos) mo52toBuilder2.instance;
                    apzgVar3.getClass();
                    aposVar2.p = apzgVar3;
                    aposVar2.b |= 16384;
                    z = true;
                } else {
                    mo52toBuilder2.copyOnWrite();
                    apos aposVar3 = (apos) mo52toBuilder2.instance;
                    apzgVar3.getClass();
                    aposVar3.k = apzgVar3;
                    aposVar3.b |= 512;
                    z = false;
                }
                this.j.a.c(apzgVar3, this.e);
            }
            mo52toBuilder.copyOnWrite();
            apos aposVar4 = (apos) mo52toBuilder.instance;
            aposVar4.b |= 8;
            aposVar4.e = false;
            mo52toBuilder2.copyOnWrite();
            apos aposVar5 = (apos) mo52toBuilder2.instance;
            aposVar5.b |= 8;
            aposVar5.e = true ^ z;
            apos aposVar6 = (apos) mo52toBuilder.mo39build();
            apos aposVar7 = (apos) mo52toBuilder2.mo39build();
            xxp.c(aposVar6, this.f, this.g, this.h);
            xxp.a(aposVar7, this.i, this.h);
            this.j.b.h(this.a.i, this.b.h, aposVar6, aposVar7);
        } else if (!this.j.c.o()) {
            this.j.d.b();
        } else {
            aopa mo52toBuilder3 = this.j.b.b(this.a.i, this.b, this.c).mo52toBuilder();
            aopa mo52toBuilder4 = this.j.b.a(this.a.i, this.b, this.c).mo52toBuilder();
            apos aposVar8 = (apos) mo52toBuilder3.instance;
            boolean z2 = aposVar8.e;
            if ((z2 && (aposVar8.b & 16384) != 0) || (!z2 && (aposVar8.b & 512) != 0)) {
                if (z2) {
                    apzgVar2 = aposVar8.p;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                } else {
                    apzgVar2 = aposVar8.k;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                }
                aopa createBuilder2 = auqr.a.createBuilder();
                String k2 = this.d.k();
                createBuilder2.copyOnWrite();
                auqr auqrVar2 = (auqr) createBuilder2.instance;
                k2.getClass();
                auqrVar2.b |= 1;
                auqrVar2.c = k2;
                aopc aopcVar2 = (aopc) apzgVar2.mo52toBuilder();
                aopcVar2.e(auqs.b, (auqr) createBuilder2.mo39build());
                apzg apzgVar4 = (apzg) aopcVar2.mo39build();
                if (z2) {
                    mo52toBuilder3.copyOnWrite();
                    apos aposVar9 = (apos) mo52toBuilder3.instance;
                    apzgVar4.getClass();
                    aposVar9.p = apzgVar4;
                    aposVar9.b |= 16384;
                    z2 = true;
                } else {
                    mo52toBuilder3.copyOnWrite();
                    apos aposVar10 = (apos) mo52toBuilder3.instance;
                    apzgVar4.getClass();
                    aposVar10.k = apzgVar4;
                    aposVar10.b |= 512;
                    z2 = false;
                }
                this.j.a.c(apzgVar4, this.e);
            }
            mo52toBuilder3.copyOnWrite();
            apos aposVar11 = (apos) mo52toBuilder3.instance;
            aposVar11.b |= 8;
            aposVar11.e = true ^ z2;
            mo52toBuilder4.copyOnWrite();
            apos aposVar12 = (apos) mo52toBuilder4.instance;
            aposVar12.b |= 8;
            aposVar12.e = false;
            apos aposVar13 = (apos) mo52toBuilder3.mo39build();
            apos aposVar14 = (apos) mo52toBuilder4.mo39build();
            xxp.c(aposVar13, this.f, this.g, this.h);
            xxp.a(aposVar14, this.i, this.h);
            this.j.b.h(this.a.i, this.b.h, aposVar13, aposVar14);
        }
    }
}
