package defpackage;

import android.net.Uri;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: vmj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vmj implements aniq {
    public final /* synthetic */ vmq a;
    private final /* synthetic */ int b;

    public /* synthetic */ vmj(vmq vmqVar) {
        this.a = vmqVar;
    }

    public /* synthetic */ vmj(vmq vmqVar, int i) {
        this.b = i;
        this.a = vmqVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        if (this.b != 0) {
            vmq vmqVar = this.a;
            return anlz.r(anii.i(vmqVar.a, ammo.c(new vml(vmqVar, 2)), vmqVar.b));
        }
        vmq vmqVar2 = this.a;
        try {
            return anlz.q(vmqVar2.b((Uri) anlz.y(vmqVar2.a)));
        } catch (IOException e) {
            vmp vmpVar = new vmp(vmqVar2);
            if ((e instanceof vjn) || (e.getCause() instanceof vjn)) {
                return anlz.p(e);
            }
            return anii.i(vmqVar2.d.a(e, vmpVar), ammo.c(new vml(vmqVar2, 3)), vmqVar2.b);
        }
    }
}
