package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: akld  reason: default package */
/* loaded from: classes.dex */
public final class akld extends ajwd implements aklk, akoo {
    private final Context a;
    private final ajmy b;
    private final ajsm c;
    private final aafo d;
    private final ajxz e;
    private final SharedPreferences f;
    private final List g;
    private final arag h;

    public akld(avnf avnfVar, Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, SharedPreferences sharedPreferences) {
        this.a = context;
        this.b = ajmyVar;
        this.d = aafoVar;
        this.e = ajxzVar;
        sharedPreferences.getClass();
        this.f = sharedPreferences;
        ajsm ajsmVar = new ajsm();
        this.c = ajsmVar;
        this.g = new ArrayList();
        arag aragVar = null;
        if (System.currentTimeMillis() - sharedPreferences.getLong("share_panel_promo_last_dismissed_millis", 0L) > avnfVar.g) {
            ajsmVar.add(avnfVar);
            this.h = null;
            return;
        }
        if ((avnfVar.b & 8) != 0 && (aragVar = avnfVar.f) == null) {
            aragVar = arag.a;
        }
        this.h = aragVar;
    }

    @Override // defpackage.aklk
    public final void b(List list) {
        for (Object obj : list) {
            if (obj != this && (obj instanceof akoo)) {
                this.g.add((akoo) obj);
            }
        }
        if (this.h != null) {
            for (akoo akooVar : this.g) {
                akooVar.d(this.h);
            }
        }
    }

    @Override // defpackage.aklk
    public final void c(ajsa ajsaVar) {
        ajsaVar.f(avnf.class, new akon(this.a, this.b, this.d, this.e, this));
    }

    @Override // defpackage.akoo
    public final void d(arag aragVar) {
        this.c.clear();
        this.f.edit().putLong("share_panel_promo_last_dismissed_millis", System.currentTimeMillis()).apply();
        for (akoo akooVar : this.g) {
            akooVar.d(aragVar);
        }
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.c;
    }
}
