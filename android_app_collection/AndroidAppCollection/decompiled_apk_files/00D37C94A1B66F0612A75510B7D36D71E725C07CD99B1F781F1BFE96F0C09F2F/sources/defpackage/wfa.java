package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wfa  reason: default package */
/* loaded from: classes4.dex */
public final class wfa implements ajyi {
    public ajsa a;
    private final Context b;
    private final yzj c;
    private final acti d;
    private final wfe e;
    private final wff f;
    private final wfh g;
    private final ajmr h;

    public wfa(Context context, yzj yzjVar, acti actiVar, ajmr ajmrVar, wfe wfeVar, wff wffVar, wfh wfhVar) {
        this.b = context;
        this.c = yzjVar;
        this.h = ajmrVar;
        this.d = actiVar;
        this.e = wfeVar;
        this.f = wffVar;
        this.g = wfhVar;
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        this.a = new ajqw();
        aqxo.p(cls == aarz.class);
        this.a.f(wep.class, new weo(this.b));
        this.a.f(aowz.class, new wem(this.b, R.layout.account_item_section_header, this.d));
        this.a.f(aarw.class, new wej(this.b, this.h, this.d, this.e));
        this.a.f(aarx.class, new wee(this.b, this.c, this.f));
        this.a.f(wey.class, new wex(this.b, this.g));
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
