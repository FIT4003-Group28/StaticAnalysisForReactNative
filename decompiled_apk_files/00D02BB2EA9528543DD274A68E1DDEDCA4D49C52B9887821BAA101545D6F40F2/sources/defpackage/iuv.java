package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: iuv  reason: default package */
/* loaded from: classes.dex */
public final class iuv extends cqss implements iuz<cqss> {
    public final cqss a;
    public final cqss b;
    @dzsi
    private final aufe c;

    public iuv(@dzsi aufe aufeVar, cqss cqssVar, cqss cqssVar2) {
        super(new Object[]{aufeVar, cqssVar, cqssVar2});
        this.c = aufeVar;
        dbsk.s(cqssVar);
        this.a = cqssVar;
        dbsk.s(cqssVar2);
        this.b = cqssVar2;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return true;
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ cqss NS() {
        return this.b;
    }

    @Override // defpackage.cqss, defpackage.cqtd
    public final Drawable a(Context context) {
        return ((cqss) iva.j(this, this.c)).a(context);
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return ((cqss) iva.j(this, this.c)).b(context);
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        return ((cqss) iva.j(this, this.c)).c(context);
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ cqss d() {
        return this.a;
    }
}
