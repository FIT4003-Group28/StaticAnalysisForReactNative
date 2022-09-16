package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: akkq  reason: default package */
/* loaded from: classes.dex */
public final class akkq extends ajwd implements aklk, akog {
    public final avms a;
    public final akko b;
    private final Context c;
    private final aafo d;
    private final ajsk e;
    private final acti f;
    private final aklw g;
    private final ajsm h;

    public akkq(avms avmsVar, Context context, aafo aafoVar, ajsk ajskVar, acti actiVar, aklw aklwVar, akko akkoVar) {
        avmsVar.getClass();
        this.a = avmsVar;
        this.c = context;
        this.d = aafoVar;
        this.e = ajskVar;
        this.f = actiVar;
        this.g = aklwVar;
        this.b = akkoVar;
        ajsm ajsmVar = new ajsm();
        this.h = ajsmVar;
        ajsmVar.add(avmsVar);
    }

    @Override // defpackage.aklk
    public final void b(List list) {
    }

    @Override // defpackage.aklk
    public final void c(ajsa ajsaVar) {
        Context context = this.c;
        aafo aafoVar = this.d;
        ajsk ajskVar = this.e;
        acti actiVar = this.f;
        final aklw aklwVar = this.g;
        ajsaVar.f(avms.class, new akof(context, aafoVar, ajskVar, actiVar, new Runnable() { // from class: akkn
            @Override // java.lang.Runnable
            public final void run() {
                aklw.this.h();
            }
        }, this));
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.h;
    }
}
