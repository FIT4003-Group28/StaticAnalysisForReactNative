package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jli  reason: default package */
/* loaded from: classes3.dex */
public final class jli extends jkf {
    private final azqb b;
    private final String c;
    private Boolean d;
    private final int e;

    public jli(axxh axxhVar, fcl fclVar, azqb azqbVar, String str, OfflineArrowView offlineArrowView, int i, View.OnClickListener onClickListener) {
        super(axxhVar, fclVar, azqbVar, 1, str, offlineArrowView, onClickListener);
        this.b = azqbVar;
        this.c = str;
        this.e = i;
    }

    @Override // defpackage.jkf, defpackage.jkj
    public final void a() {
        if (!c()) {
            int i = this.e;
            if (i == 3) {
                this.a.a();
                return;
            } else if (i == 2) {
                this.a.e();
                return;
            }
        }
        super.a();
    }

    @Override // defpackage.jkf, defpackage.jkj
    public final void b(jjk jjkVar) {
        if (jjkVar.a || (((agrf) this.b.get()).a().i().a(this.c) <= 0 && !Boolean.FALSE.equals(this.d))) {
            if (jjkVar.a) {
                int i = this.e;
                if (i == 3) {
                    this.a.a();
                    return;
                } else if (i == 2) {
                    this.a.e();
                    return;
                }
            }
            super.b(jjkVar);
            return;
        }
        jkk jkkVar = this.a;
        jkkVar.b();
        jkkVar.a.c(2131231739);
        jkkVar.c(R.string.accessibility_offline_button_sync);
    }

    public final void d(Boolean bool) {
        this.d = bool;
        a();
    }
}
