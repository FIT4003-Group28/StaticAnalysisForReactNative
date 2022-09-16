package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: vcx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vcx implements anir {
    public final /* synthetic */ vcp a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vbk c;
    private final /* synthetic */ int d;

    public /* synthetic */ vcx(vbk vbkVar, vcp vcpVar, String str, int i) {
        this.d = i;
        this.c = vbkVar;
        this.a = vcpVar;
        this.b = str;
    }

    public /* synthetic */ vcx(vcp vcpVar, String str, vbk vbkVar) {
        this.a = vcpVar;
        this.b = str;
        this.c = vbkVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        String str;
        if (this.d == 0) {
            final vcp vcpVar = this.a;
            String str2 = this.b;
            final vbk vbkVar = this.c;
            List<String> list = (List) obj;
            if (!vcpVar.d) {
                list = amuk.r("");
            }
            amuf f = amuk.f();
            for (final String str3 : list) {
                if (!vdc.c.containsKey(ampr.a(str2, str3)) && vcpVar.e == 7) {
                    if (vcpVar.c) {
                        Context context = vbkVar.g;
                        str = vcv.a(context).getString(vcpVar.a, "");
                    } else {
                        str = str3;
                    }
                    final ankt d = vdq.d(vbkVar, vcpVar.a, str);
                    f.h(anii.i(anii.i(anko.q(d), new vcx(vbkVar, vcpVar, str3, 1), vbkVar.c()), new anir() { // from class: vcw
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            final vbk vbkVar2 = vbk.this;
                            ankt anktVar = d;
                            final vcp vcpVar2 = vcpVar;
                            final String str4 = str3;
                            Void r8 = (Void) obj2;
                            final vdr vdrVar = (vdr) anlz.y(anktVar);
                            if (!vdrVar.c.isEmpty()) {
                                return anii.i(anko.q(anii.h(anko.q(vcr.a(vbkVar2).a()), new fct(vcpVar2.a, 17), vbkVar2.c())), new anir() { // from class: vcy
                                    @Override // defpackage.anir
                                    public final ankt a(Object obj3) {
                                        String str5 = str4;
                                        vcp vcpVar3 = vcpVar2;
                                        vbk vbkVar3 = vbkVar2;
                                        vdr vdrVar2 = vdrVar;
                                        if (!((String) obj3).equals(str5)) {
                                            return ankq.a;
                                        }
                                        if (vdc.c.containsKey(ampr.a(vcpVar3.a, str5))) {
                                            return ankq.a;
                                        }
                                        return vbkVar3.d().a(vdrVar2.c);
                                    }
                                }, vbkVar2.c());
                            }
                            return ankq.a;
                        }
                    }, vbkVar.c()));
                }
            }
            return anlz.j(f.g()).a(gbb.o, vbkVar.c());
        }
        vbk vbkVar2 = this.c;
        vcp vcpVar2 = this.a;
        return vdq.e(vbkVar2, vcpVar2.a, this.b, (vdr) obj, vcpVar2.b);
    }
}
