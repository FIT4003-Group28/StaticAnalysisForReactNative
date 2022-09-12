package defpackage;

import android.app.Application;
import android.view.View;
/* compiled from: PG */
/* renamed from: acbm  reason: default package */
/* loaded from: classes2.dex */
public class acbm extends acbe implements acbb, apnk {
    public static final cqtd a = cqrt.h(2131232854, irg.O());
    @dzsi
    public apnl b;
    private final Float c;
    private final dwfl d;
    private final apnj e;

    public acbm(dwfl dwflVar, View.OnClickListener onClickListener, Application application, String str, String str2, int i) {
        super(dwflVar, onClickListener, application, str, str2, i);
        Float valueOf;
        dbsk.a(cknv.j(dwflVar));
        dkea dkeaVar = dwflVar.j;
        dkeaVar = dkeaVar == null ? dkea.d : dkeaVar;
        if (dkeaVar.c.size() > 0) {
            valueOf = Float.valueOf(dkeaVar.c.get(0).c / dkeaVar.c.get(0).d);
        } else {
            valueOf = Float.valueOf(1.0f);
        }
        this.c = valueOf;
        this.d = dwflVar;
        this.e = new apnj(this) { // from class: acbl
            private final acbm a;

            {
                this.a = this;
            }

            @Override // defpackage.apnj
            public final void a(boolean z, int i2) {
                apnl apnlVar;
                acbm acbmVar = this.a;
                if (i2 != 4 || (apnlVar = acbmVar.b) == null) {
                    return;
                }
                apnlVar.c(0L);
            }
        };
    }

    @Override // defpackage.acbb
    public apnk a() {
        return this;
    }

    @Override // defpackage.acba
    public Float e() {
        return this.c;
    }

    @Override // defpackage.acbe, defpackage.acba
    @dzsi
    public cqtd j() {
        return a;
    }

    @Override // defpackage.acbb
    public apnj l() {
        return this.e;
    }

    @Override // defpackage.acbb
    public String m() {
        bvrj.UI_THREAD.c();
        dkea dkeaVar = this.d.j;
        if (dkeaVar == null) {
            dkeaVar = dkea.d;
        }
        if (dkeaVar.c.size() == 0) {
            return "";
        }
        dkea dkeaVar2 = this.d.j;
        if (dkeaVar2 == null) {
            dkeaVar2 = dkea.d;
        }
        return dkeaVar2.c.get(0).e;
    }

    @Override // defpackage.acbb
    public String n() {
        bvrj.UI_THREAD.c();
        return this.d.h;
    }

    @Override // defpackage.acbb
    public Boolean o() {
        return true;
    }

    @Override // defpackage.apnk
    public void p(@dzsi apnl apnlVar) {
        this.b = apnlVar;
        if (apnlVar != null) {
            apnlVar.setPlayWhenReady(true);
        }
    }
}
