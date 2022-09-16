package defpackage;

import android.os.Build;
import android.widget.Toast;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wdh  reason: default package */
/* loaded from: classes4.dex */
public final class wdh extends adg {
    final /* synthetic */ wdf a;

    public wdh(wdf wdfVar) {
        this.a = wdfVar;
    }

    @Override // defpackage.adg
    public final void b() {
        Toast.makeText(((wcl) this.a).a, "Authentication Failed", 0).show();
    }

    @Override // defpackage.adg
    public final void c(CharSequence charSequence) {
        Toast.makeText(((wcl) this.a).a, charSequence, 0).show();
    }

    @Override // defpackage.adg
    public final void d() {
        wdf wdfVar = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            ((wcl) wdfVar).b.j(1);
            return;
        }
        wcl wclVar = (wcl) wdfVar;
        wclVar.c.postDelayed(new wck(wclVar), 100L);
    }
}
