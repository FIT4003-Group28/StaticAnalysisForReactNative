package defpackage;

import android.content.Context;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btkc  reason: default package */
/* loaded from: classes4.dex */
public final class btkc implements btjs {
    public final btkb a;

    public btkc(Context context, final cklf cklfVar, cjqy cjqyVar, ite iteVar) {
        btkb btkbVar = new btkb(context, cjqyVar, iteVar);
        this.a = btkbVar;
        bvsx bvsxVar = new bvsx(context.getResources());
        bvsu c = bvsxVar.c(R.string.PROFILE_PRIVACY_EXPLANATION_LEARN_MORE);
        c.m(R.color.mod_daynight_blue600);
        bvsu c2 = bvsxVar.c(R.string.PROFILE_PRIVACY_EXPLANATION);
        c2.a(c);
        btkbVar.k(c2.c());
        btkbVar.y(true);
        btkbVar.o = new auc(this, cklfVar) { // from class: btka
            private final btkc a;
            private final cklf b;

            {
                this.a = this;
                this.b = cklfVar;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference) {
                btkc btkcVar = this.a;
                cklf cklfVar2 = this.b;
                btkb btkbVar2 = btkcVar.a;
                View view = btkbVar2.b.get();
                if (view != null) {
                    cjqy cjqyVar2 = btkbVar2.a;
                    cjql e = cjqg.e(view);
                    dbsk.s(e);
                    cjqyVar2.j(e, cjtd.a(dtxy.V));
                }
                cklfVar2.a("maps_profile_about_android");
                return true;
            }
        };
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.a);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.a;
    }

    @Override // defpackage.btjs
    public final void c() {
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
