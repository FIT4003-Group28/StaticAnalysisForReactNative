package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: akll  reason: default package */
/* loaded from: classes.dex */
public final class akll extends ajwd implements aklk {
    public final aafo a;
    public final avni b;
    public final ajsm c;
    private final Context d;

    public akll(avni avniVar, Context context, aafo aafoVar) {
        this.d = context;
        this.a = aafoVar;
        this.b = avniVar;
        ajsm ajsmVar = new ajsm();
        this.c = ajsmVar;
        ajsmVar.add(avniVar);
    }

    @Override // defpackage.aklk
    public final void b(List list) {
    }

    @Override // defpackage.aklk
    public final void c(ajsa ajsaVar) {
        ajsaVar.f(avni.class, new akos(this.d, this));
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.c;
    }
}
