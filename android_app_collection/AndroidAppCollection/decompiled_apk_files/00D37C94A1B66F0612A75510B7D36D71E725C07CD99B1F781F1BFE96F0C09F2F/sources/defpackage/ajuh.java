package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajuh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajuh implements View.OnClickListener {
    public final /* synthetic */ ajul a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajuh(ajul ajulVar) {
        this.a = ajulVar;
    }

    public /* synthetic */ ajuh(ajul ajulVar, int i) {
        this.b = i;
        this.a = ajulVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            ajul ajulVar = this.a;
            zag.i(ajulVar.getCurrentFocus());
            ajum ajumVar = ajulVar.h;
            String obj = ajulVar.d.getText().toString();
            aqrc aqrcVar = (aqrc) ajulVar.e.getSelectedItem();
            aqrc aqrcVar2 = (aqrc) ajulVar.f.getSelectedItem();
            String obj2 = ajulVar.g.getText().toString();
            ajun ajunVar = ajumVar.d;
            asof asofVar = ajumVar.a;
            ampq ampqVar = ajumVar.b;
            Object obj3 = ajumVar.c;
            ajunVar.b = true;
            if (!ajunVar.b(asofVar, ajulVar, obj, aqrcVar, aqrcVar2, true)) {
                return;
            }
            amum h = amup.h();
            h.f("com.google.android.libraries.youtube.innertube.services.flags.user_comments", obj);
            if (obj3 != null) {
                h.f("com.google.android.libraries.youtube.innertube.endpoint.tag", obj3);
            }
            if (aqrcVar != null && aqrcVar2 != null) {
                aopa createBuilder = arsa.a.createBuilder();
                int i = 0;
                int intValue = aqrcVar.c == 6 ? ((Integer) aqrcVar.d).intValue() : 0;
                createBuilder.copyOnWrite();
                arsa arsaVar = (arsa) createBuilder.instance;
                arsaVar.b |= 1;
                arsaVar.c = intValue;
                if (aqrcVar2.c == 6) {
                    i = ((Integer) aqrcVar2.d).intValue();
                }
                createBuilder.copyOnWrite();
                arsa arsaVar2 = (arsa) createBuilder.instance;
                arsaVar2.b |= 2;
                arsaVar2.d = i;
                createBuilder.copyOnWrite();
                arsa arsaVar3 = (arsa) createBuilder.instance;
                obj2.getClass();
                arsaVar3.b |= 4;
                arsaVar3.e = obj2;
                h.f("com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", (arsa) createBuilder.mo39build());
            }
            if (ampqVar.h()) {
                aopa createBuilder2 = arse.a.createBuilder();
                int i2 = ((ajuo) ampqVar.c()).a;
                createBuilder2.copyOnWrite();
                arse arseVar = (arse) createBuilder2.instance;
                arseVar.b |= 1;
                arseVar.c = i2;
                int i3 = ((ajuo) ampqVar.c()).b;
                createBuilder2.copyOnWrite();
                arse arseVar2 = (arse) createBuilder2.instance;
                arseVar2.b |= 2;
                arseVar2.d = i3;
                h.f("com.google.android.libraries.youtube.innertube.services.flags.video_report_details", (arse) createBuilder2.mo39build());
            }
            aafo aafoVar = ajunVar.a;
            apok apokVar = asofVar.n;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            apzg apzgVar = apojVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, h.b());
            ajulVar.dismiss();
            return;
        }
        this.a.dismiss();
    }
}
