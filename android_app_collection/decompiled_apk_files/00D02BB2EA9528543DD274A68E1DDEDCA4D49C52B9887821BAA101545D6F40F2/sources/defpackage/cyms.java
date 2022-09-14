package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_EdgeKeyInfo;
/* renamed from: cyms  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyms implements dbrn {
    static final dbrn a = new cyms();

    private cyms() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cyjs cyjsVar = (cyjs) obj;
        String str = cyjsVar.a;
        int b = cyiu.b(cyjsVar.b);
        if (b == 0) {
            b = 1;
        }
        return new AutoValue_EdgeKeyInfo(str, cyjp.a(b));
    }
}
