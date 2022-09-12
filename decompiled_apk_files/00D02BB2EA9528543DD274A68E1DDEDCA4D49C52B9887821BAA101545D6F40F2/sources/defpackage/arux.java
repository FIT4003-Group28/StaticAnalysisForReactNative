package defpackage;

import android.content.pm.ResolveInfo;
/* compiled from: PG */
/* renamed from: arux  reason: default package */
/* loaded from: classes2.dex */
public final class arux extends aruy<arxx> {
    private final arxy b;
    private final aryb c;
    private final cqkn<aryj> d;

    public arux(aruq aruqVar, arxy arxyVar, aryb arybVar, cqkn<aryj> cqknVar, ResolveInfo resolveInfo) {
        super(aruqVar, resolveInfo);
        this.b = arxyVar;
        this.c = arybVar;
        this.d = cqknVar;
    }

    @Override // defpackage.arxl
    public final /* bridge */ /* synthetic */ cqkp b() {
        return this.b.a(this.d, this.a.serviceInfo.packageName, null, true, this.c);
    }
}
