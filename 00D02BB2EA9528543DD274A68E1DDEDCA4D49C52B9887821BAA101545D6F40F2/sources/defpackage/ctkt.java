package defpackage;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctkt  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctkt implements dbrn {
    static final dbrn a = new ctkt();

    private ctkt() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            final cuhy f = cuhz.f();
            f.c(((Integer) hashMap.get("ID")).intValue());
            f.f((String) hashMap.get("TEXT"));
            f.e((String) hashMap.get("SECONDARY_TEXT"));
            if (hashMap.containsKey("LIGHTER_ICON")) {
                cstn.a(ctkb.b((HashMap) hashMap.get("LIGHTER_ICON")), new mw(f) { // from class: ctkv
                    private final cuhy a;

                    {
                        this.a = f;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        this.a.d((cugd) obj2);
                    }
                });
            }
            return cstn.b(csto.h(hashMap.get("ACTION")), ctkw.a).h(new dbrn(f) { // from class: ctkx
                private final cuhy a;

                {
                    this.a = f;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    cuhy cuhyVar = this.a;
                    cuhyVar.b((ctzl) obj2);
                    return cuhyVar.a();
                }
            });
        } catch (IllegalStateException | NullPointerException unused) {
            cstl.a("ChipsListConverters");
            return dbpy.a;
        }
    }
}
