package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tvs  reason: default package */
/* loaded from: classes4.dex */
public final class tvs {
    public static volatile boolean a = false;
    public final Context b;
    public final tyk c;
    public final tuk d;
    public final tul e;
    public final twv f;
    public final twy g;
    public final tsy h;
    public final trv i;
    public final tyz j;
    public final tyo k;
    public final tys l;
    public final ampq m;
    public final Executor n;
    public final ampq o;
    public final tqe p;

    public tvs(Context context, tyk tykVar, twv twvVar, twy twyVar, tuk tukVar, tul tulVar, tsy tsyVar, trv trvVar, tyz tyzVar, tyo tyoVar, tys tysVar, ampq ampqVar, Executor executor, ampq ampqVar2, tqe tqeVar) {
        this.b = context;
        this.c = tykVar;
        this.f = twvVar;
        this.g = twyVar;
        this.d = tukVar;
        this.e = tulVar;
        this.h = tsyVar;
        this.i = trvVar;
        this.j = tyzVar;
        this.k = tyoVar;
        this.l = tysVar;
        this.m = ampqVar;
        this.n = executor;
        this.o = ampqVar2;
        this.p = tqeVar;
    }

    public final ankt a() {
        return amnt.f(this.f.a(), new tvj(this, 4), this.n);
    }

    public final ankt b(final boolean z) {
        int i = typ.a;
        return anii.i(c(), new anir() { // from class: tvq
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tvs tvsVar = tvs.this;
                boolean z2 = z;
                Void r4 = (Void) obj;
                tvsVar.p.v();
                tvsVar.c.g(1031);
                tuk tukVar = tvsVar.d;
                return anii.i(tukVar.d.d(), new tue(tukVar, z2), tukVar.h);
            }
        }, this.n);
    }

    public final ankt c() {
        if (a) {
            return anlz.q(null);
        }
        final SharedPreferences b = uaw.b(this.b, "gms_icing_mdd_manager_metadata", this.m);
        return amne.f(anlz.q(null)).i(new anir() { // from class: tvk
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tvs tvsVar = tvs.this;
                SharedPreferences sharedPreferences = b;
                if (!sharedPreferences.getBoolean("mdd_migrated_to_offroad", false)) {
                    int i = typ.a;
                    return amnt.e(tvsVar.a(), new tvh(sharedPreferences), tvsVar.n);
                }
                return anlz.q(null);
            }
        }, this.n).i(new tvj(this, 10), this.n).i(new tvj(this, 6), this.n).i(new tvj(this, 7), this.n).h(tvv.b, this.n);
    }
}
