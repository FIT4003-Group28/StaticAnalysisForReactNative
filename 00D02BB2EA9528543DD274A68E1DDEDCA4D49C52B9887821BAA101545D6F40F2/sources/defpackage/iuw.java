package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: iuw  reason: default package */
/* loaded from: classes6.dex */
public final class iuw extends cqtd implements iuz<cqtd> {
    public final cqtd a;
    public final cqtd b;
    @dzsi
    private final aufe c;

    public iuw(cqtd cqtdVar, cqtd cqtdVar2, @dzsi aufe aufeVar) {
        super(new Object[]{cqtdVar, cqtdVar2, aufeVar});
        dbsk.s(cqtdVar);
        this.a = cqtdVar;
        dbsk.s(cqtdVar2);
        this.b = cqtdVar2;
        this.c = aufeVar;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return true;
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ cqtd NS() {
        return this.b;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return ((cqtd) iva.j(this, this.c)).a(context);
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ cqtd d() {
        return this.a;
    }
}
