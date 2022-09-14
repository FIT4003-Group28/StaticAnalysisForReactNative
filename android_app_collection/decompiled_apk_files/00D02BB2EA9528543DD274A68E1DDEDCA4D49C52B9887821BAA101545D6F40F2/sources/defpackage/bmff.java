package defpackage;

import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmff  reason: default package */
/* loaded from: classes3.dex */
public final class bmff implements degu<List<String>> {
    final /* synthetic */ bmfg a;

    public bmff(bmfg bmfgVar) {
        this.a = bmfgVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.c = dcdc.f(Locale.getDefault().getLanguage());
        bvoo.h("Unhandled exception retrieving user's ULP", new Object[0]);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<String> list) {
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this.a.c = dcdc.f(Locale.getDefault().getLanguage());
            return;
        }
        this.a.c = dcdc.r(list2);
    }
}
