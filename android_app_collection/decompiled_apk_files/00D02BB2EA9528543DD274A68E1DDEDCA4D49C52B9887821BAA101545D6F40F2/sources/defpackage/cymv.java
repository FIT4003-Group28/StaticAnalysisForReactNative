package defpackage;

import com.google.android.libraries.social.populous.core.SourceIdentity;
/* renamed from: cymv  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cymv implements dbrn {
    static final dbrn a = new cymv();

    private cymv() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cylz cylzVar = (cylz) obj;
        cygv d = SourceIdentity.d();
        ((cycf) d).a = cylzVar.a;
        int b = cyiu.b(cylzVar.b);
        if (b == 0) {
            b = 1;
        }
        d.b(cyjp.a(b));
        return d.a();
    }
}
