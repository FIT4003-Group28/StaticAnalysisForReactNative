package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jkf  reason: default package */
/* loaded from: classes3.dex */
public class jkf implements jkj {
    public final jkk a;
    private final axxh b;
    private final fcl c;
    private final azqb d;
    private final int e;
    private final String f;

    public jkf(axxh axxhVar, fcl fclVar, azqb azqbVar, int i, String str, OfflineArrowView offlineArrowView, View.OnClickListener onClickListener) {
        this.b = axxhVar;
        this.c = fclVar;
        this.d = azqbVar;
        this.e = i;
        this.f = str;
        this.a = new jkk(offlineArrowView, onClickListener);
    }

    @Override // defpackage.jkj
    public void a() {
        if (!c()) {
            this.a.d();
            return;
        }
        int i = this.e;
        if (i == 0) {
            String str = this.f;
            zgh.m(str);
            b(jjk.b(((agrf) this.d.get()).a().m().e(str)));
        } else if (i == 1) {
            String str2 = this.f;
            zgh.m(str2);
            b(jjk.a(((agrf) this.d.get()).a().i().d(str2)));
        } else if (i == 2) {
            String str3 = this.f;
            zgh.m(str3);
            b(jjk.a(((agrf) this.d.get()).a().k().b(str3)));
        } else if (i != 3) {
            b(jjk.a(((agrf) this.d.get()).a().m().f()));
        } else {
            b(jjk.a(((agrf) this.d.get()).a().m().c()));
        }
    }

    @Override // defpackage.jkj
    public void b(jjk jjkVar) {
        if (!c() || jjkVar.a) {
            this.a.d();
        } else if (jjkVar.b) {
            jkk jkkVar = this.a;
            int i = this.e != 0 ? R.string.accessibility_offline_button_remove_playlist : R.string.accessibility_offline_button_remove_video;
            jkkVar.b();
            jkkVar.a.d();
            jkkVar.a.k();
            jkkVar.c(i);
        } else if (jjkVar.e) {
            jkk jkkVar2 = this.a;
            jkkVar2.b();
            OfflineArrowView offlineArrowView = jkkVar2.a;
            offlineArrowView.b(offlineArrowView.b);
            jkkVar2.a.k();
        } else {
            jkk jkkVar3 = this.a;
            int i2 = jjkVar.f;
            boolean z = jjkVar.c;
            boolean z2 = jjkVar.d;
            jkkVar3.b();
            if (z) {
                if (z2) {
                    jkkVar3.a.g();
                } else {
                    jkkVar3.a.h();
                }
                jkkVar3.a.i(i2);
            } else {
                jkkVar3.a.e();
                jkkVar3.a.k();
            }
            jkkVar3.c(R.string.accessibility_offline_button_cancel);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        Boolean bool;
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return this.c.m();
            }
            if (i == 3) {
                return this.c.k();
            }
            aqxe aqxeVar = this.b.b.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            if (aqxeVar.a(45357487L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45357487L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45357487L);
                bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (bool.booleanValue()) {
                return this.c.h();
            }
            return this.c.h() && !this.c.n();
        }
        return this.c.j();
    }
}
