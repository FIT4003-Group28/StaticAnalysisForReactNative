package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yvk  reason: default package */
/* loaded from: classes4.dex */
public final class yvk implements yve {
    public final SharedPreferences a;
    public final azpb b;
    private final yme c;
    private final Executor d;
    private final ampg e;
    private final yjc f;
    private final aoqu g;

    public yvk(yme ymeVar, Executor executor, SharedPreferences sharedPreferences, ampg ampgVar, yjc yjcVar, aoqu aoquVar) {
        this.c = ymeVar;
        this.d = anlz.g(executor);
        this.a = sharedPreferences;
        this.e = ampgVar;
        this.f = yjcVar;
        this.g = aoquVar;
        azpb ax = azpa.ar().ax();
        this.b = ax;
        ax.c((aoqu) ampgVar.apply(sharedPreferences));
    }

    @Override // defpackage.yve
    public final ankt a() {
        return anlz.q(c());
    }

    @Override // defpackage.yve
    public final ankt b(final ampg ampgVar) {
        aujq aujqVar = this.c.c().g;
        if (aujqVar == null) {
            aujqVar = aujq.a;
        }
        if (aujqVar.e) {
            return anlz.v(new aniq() { // from class: yvj
                @Override // defpackage.aniq
                public final ankt a() {
                    yvk yvkVar = yvk.this;
                    ampg ampgVar2 = ampgVar;
                    SharedPreferences.Editor edit = yvkVar.a.edit();
                    aoqu e = yvkVar.e(edit, ampgVar2);
                    if (edit.commit()) {
                        yvkVar.b.c(e);
                        return anlz.q(null);
                    }
                    return anlz.p(new IllegalStateException("Failed to store data to SharedPreferences"));
                }
            }, this.d);
        }
        try {
            SharedPreferences.Editor edit = this.a.edit();
            aoqu e = e(edit, ampgVar);
            edit.apply();
            this.b.c(e);
            return anlz.q(null);
        } catch (Exception e2) {
            return anlz.p(e2);
        }
    }

    @Override // defpackage.yve
    public final aoqu c() {
        try {
            return (aoqu) this.e.apply(this.a);
        } catch (Exception e) {
            zep.d("Could not write SharedPreferences values to proto schema.", e);
            return this.g;
        }
    }

    @Override // defpackage.yve
    public final aynx d() {
        return this.b.A();
    }

    public final aoqu e(SharedPreferences.Editor editor, ampg ampgVar) {
        aoqu aoquVar = (aoqu) ampgVar.apply((aoqu) this.e.apply(this.a));
        this.f.a(editor, aoquVar);
        return aoquVar;
    }
}
