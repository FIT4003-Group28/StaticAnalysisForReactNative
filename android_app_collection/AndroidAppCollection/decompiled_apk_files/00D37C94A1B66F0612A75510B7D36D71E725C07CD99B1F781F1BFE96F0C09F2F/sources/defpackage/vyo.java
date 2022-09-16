package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vyo  reason: default package */
/* loaded from: classes4.dex */
public final class vyo implements ajyi {
    public final Context a;
    private final yzj b;
    private final acti c;
    private final wfe d;
    private final wff e;
    private final wfh f;
    private final wfg g;
    private final ajmy h;
    private ajsa i;
    private final ajxz j;
    private final akbk k;

    public vyo(Context context, yzj yzjVar, acti actiVar, ajmy ajmyVar, wfe wfeVar, wff wffVar, wfh wfhVar, wfg wfgVar, ajxz ajxzVar, akbk akbkVar) {
        this.a = context;
        this.b = yzjVar;
        this.h = ajmyVar;
        this.c = actiVar;
        this.d = wfeVar;
        this.e = wffVar;
        this.f = wfhVar;
        this.g = wfgVar;
        this.j = ajxzVar;
        this.k = akbkVar;
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        aqxo.p(cls == aarz.class);
        ajqw ajqwVar = new ajqw();
        this.i = ajqwVar;
        ajqwVar.f(vyp.class, new wex(this.a, this.f, 1));
        this.i.f(wep.class, new weo(this.a));
        this.i.f(aowz.class, new wem(this.a, R.layout.fusion_account_item_section_header, this.c));
        this.i.f(aarw.class, new vyt(this.a, this.h, this.c, this.d, this.g, this.j, this.k));
        this.i.f(aarx.class, new wee(this.a, this.b, this.e));
        this.i.f(aoxk.class, new weo(this.a, 2, (byte[]) null));
        this.i.f(ajre.class, new ajry() { // from class: vyn
            @Override // defpackage.ajry
            public final ajru b(ViewGroup viewGroup) {
                return new ajrf(vyo.this.a);
            }
        });
        this.i.f(wfi.class, new weo(this.a, 3, (char[]) null));
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.i;
    }
}
