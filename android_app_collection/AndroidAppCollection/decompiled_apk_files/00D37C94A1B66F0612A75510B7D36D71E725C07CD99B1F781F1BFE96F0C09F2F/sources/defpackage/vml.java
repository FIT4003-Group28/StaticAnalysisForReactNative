package defpackage;

import android.net.Uri;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: vml  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vml implements anir {
    public final /* synthetic */ vmq a;
    private final /* synthetic */ int b;

    public /* synthetic */ vml(vmq vmqVar, int i) {
        this.b = i;
        this.a = vmqVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        ankt anktVar;
        int i = this.b;
        if (i == 0) {
            vmq vmqVar = this.a;
            vmqVar.c((Uri) anlz.y(vmqVar.a), obj);
            return ankq.a;
        } else if (i == 1) {
            vmq vmqVar2 = this.a;
            synchronized (vmqVar2.e) {
                anktVar = vmqVar2.f;
            }
            return anktVar;
        } else if (i == 2) {
            vmq vmqVar3 = this.a;
            Uri uri = (Uri) obj;
            Uri a = uyr.a(uri, ".bak");
            try {
                if (vmqVar3.c.h(a)) {
                    vmqVar3.c.g(a, uri);
                }
                return ankq.a;
            } catch (IOException e) {
                return anlz.p(e);
            }
        } else {
            vmq vmqVar4 = this.a;
            Void r4 = (Void) obj;
            return anlz.q(vmqVar4.b((Uri) anlz.y(vmqVar4.a)));
        }
    }
}
