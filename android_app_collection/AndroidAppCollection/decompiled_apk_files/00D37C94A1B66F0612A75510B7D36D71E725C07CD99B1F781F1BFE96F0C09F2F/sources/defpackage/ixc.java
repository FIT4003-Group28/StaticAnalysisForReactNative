package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ixc  reason: default package */
/* loaded from: classes3.dex */
public final class ixc implements adce {
    public static final String a = zep.a("AutoconnectMealbar");
    public final adgl b;
    public final adgc c;
    public final Context d;
    public final ofu e;
    public final adoa f;
    public final adci g;
    public akff h;
    public final adrq i;
    private final fun j;
    private final Resources k;
    private final acth l;

    public ixc(fun funVar, Context context, adgl adglVar, adgc adgcVar, acth acthVar, adrq adrqVar, ofu ofuVar, adoa adoaVar, adci adciVar) {
        this.j = funVar;
        this.k = context.getResources();
        this.b = adglVar;
        this.c = adgcVar;
        this.d = context;
        this.l = acthVar;
        this.i = adrqVar;
        this.e = ofuVar;
        this.f = adoaVar;
        this.g = adciVar;
    }

    public final acti a() {
        return this.l.oi();
    }

    public final void b(actj actjVar) {
        a().H(3, new acte(actjVar), null);
    }

    @Override // defpackage.adce
    public final void c(final adid adidVar, apzg apzgVar, adct adctVar) {
        ixa ixaVar = new ixa(this, apzgVar);
        fun funVar = this.j;
        akfe d = akff.d();
        d.c = this.k.getString(R.string.autoconnect_title, adidVar.d);
        zhe a2 = zhe.a(R.attr.ytTextPrimary);
        d.k();
        d.g(2131233501);
        d.k = Optional.of(a2);
        d.d = this.k.getString(R.string.autoconnect_details);
        akfe c = d.a(this.k.getString(R.string.autoconnect_action_button), new View.OnClickListener() { // from class: iwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ixc ixcVar = ixc.this;
                adid adidVar2 = adidVar;
                ixcVar.g.b();
                if (adidVar2 == null || adidVar2.n == null) {
                    zep.m(ixc.a, "MDx screen or its route is null.");
                } else {
                    adgl adglVar = ixcVar.b;
                    aopa createBuilder = atcr.a.createBuilder();
                    String str = adidVar2.d;
                    createBuilder.copyOnWrite();
                    atcr atcrVar = (atcr) createBuilder.instance;
                    str.getClass();
                    atcrVar.b |= 1;
                    atcrVar.c = str;
                    String str2 = adidVar2.n.c;
                    createBuilder.copyOnWrite();
                    atcr atcrVar2 = (atcr) createBuilder.instance;
                    atcrVar2.b |= 2;
                    atcrVar2.d = str2;
                    bhc a3 = adglVar.a((atcr) createBuilder.mo39build(), ixcVar.d);
                    if (a3 == null) {
                        zep.m(ixc.a, "Couldn't find the designated route to connect to.");
                    } else {
                        ixcVar.i.a.c(atcw.MDX_SESSION_SOURCE_AUTOCONNECT);
                        ixcVar.c.W(a3);
                        adoa adoaVar = ixcVar.f;
                        adoaVar.g(new ixb(adoaVar, ixcVar.e));
                    }
                }
                ixcVar.b(actj.MDX_AUTOCONNECT_PROMPT_ACTION_BUTTON);
            }
        }).c(this.k.getString(R.string.autoconnect_dismiss_button), new View.OnClickListener() { // from class: iwy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ixc ixcVar = ixc.this;
                ixcVar.g.b();
                ixcVar.b(actj.MDX_AUTOCONNECT_PROMPT_DISMISS_BUTTON);
            }
        });
        c.m = ixaVar;
        c.h(false);
        c.j();
        c.f(!adctVar.e);
        funVar.i(c.e());
    }

    @Override // defpackage.adce
    public final boolean d() {
        return this.h != null;
    }
}
