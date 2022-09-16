package com.google.android.apps.youtube.app.mdx.watch;

import android.app.Activity;
import android.content.SharedPreferences;
import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxLivestreamMealbarController implements f {
    public final Activity a;
    public final akfd b;
    public final adoa c;
    public final eo d;
    public final SharedPreferences e;
    public final atcj f;
    public final bgo g;
    public final adhf h;
    public final snc i;
    public final afvn j;
    public final adgl k;
    public final acth l;
    public final ezh m;
    private final airw n;
    private final aypf o = new aypf();
    private final iyf p = new iyf(this);

    public MdxLivestreamMealbarController(Activity activity, akfd akfdVar, adoa adoaVar, eo eoVar, SharedPreferences sharedPreferences, airw airwVar, bgo bgoVar, adhf adhfVar, azqb azqbVar, snc sncVar, afvn afvnVar, adgl adglVar, acth acthVar, ezh ezhVar) {
        this.a = activity;
        this.b = akfdVar;
        this.c = adoaVar;
        this.d = eoVar;
        this.e = sharedPreferences;
        this.n = airwVar;
        this.g = bgoVar;
        this.h = adhfVar;
        atcj atcjVar = ((aacz) azqbVar.get()).b().n;
        this.f = atcjVar == null ? atcj.a : atcjVar;
        this.i = sncVar;
        this.j = afvnVar;
        this.k = adglVar;
        this.l = acthVar;
        this.m = ezhVar;
        Optional.empty();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.o.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        atcj atcjVar = this.f;
        int i = atcjVar.b;
        if ((1048576 & i) == 0 || !atcjVar.f || (2097152 & i) == 0) {
            return;
        }
        this.o.g(this.p.g(this.n));
    }
}
