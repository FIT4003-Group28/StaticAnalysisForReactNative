package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: emb  reason: default package */
/* loaded from: classes3.dex */
final class emb extends fjt {
    final /* synthetic */ emd a;
    private final fny f;
    private final fmg g;
    private final ajrp h;
    private final View i;
    private boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emb(emd emdVar) {
        super(emdVar.a, emdVar.b, R.layout.grid_channel_item);
        this.a = emdVar;
        this.h = emdVar.d.a(emdVar.c);
        this.i = this.b.findViewById(R.id.channel_subscribe_button_container);
        fny a = emdVar.g.a(this.b.findViewById(R.id.subscription_notification_view));
        this.f = a;
        this.g = emdVar.f.a((TextView) this.b.findViewById(R.id.subscribe_button), a);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        avaq avaqVar;
        View a;
        arej arejVar = (arej) obj;
        apzg apzgVar = null;
        if ((arejVar.b & 4) != 0) {
            aragVar = arejVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        f(ajgl.b(aragVar));
        if ((arejVar.b & 8) != 0) {
            aragVar2 = arejVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(this.d, ajgl.b(aragVar2));
        if ((arejVar.b & 16) != 0) {
            aragVar3 = arejVar.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        e(ajgl.b(aragVar3));
        avhn avhnVar = arejVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        d(avhnVar);
        arek arekVar = arejVar.j;
        if (arekVar == null) {
            arekVar = arek.a;
        }
        if (arekVar.b == 55419609) {
            arek arekVar2 = arejVar.j;
            if (arekVar2 == null) {
                arekVar2 = arek.a;
            }
            if (arekVar2.b == 55419609) {
                avaqVar = (avaq) arekVar2.c;
            } else {
                avaqVar = avaq.a;
            }
        } else {
            avaqVar = null;
        }
        acti actiVar = ajrsVar.a;
        if (avaqVar != null) {
            avaqVar = (avaq) fyv.c(this.a.a, avaqVar.mo52toBuilder(), this.c.getText()).mo39build();
        }
        this.g.i(avaqVar, actiVar);
        if (!this.j && (a = this.f.a()) != null) {
            int dimensionPixelOffset = this.a.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_vertical_padding);
            int dimensionPixelOffset2 = this.a.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_horizontal_padding);
            a.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            this.j = true;
        }
        zag.o(this.i, true);
        ajrp ajrpVar = this.h;
        acti actiVar2 = ajrsVar.a;
        if ((arejVar.b & 128) != 0 && (apzgVar = arejVar.i) == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.a(actiVar2, apzgVar, ajrsVar.e());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h.c();
        this.g.d();
    }
}
