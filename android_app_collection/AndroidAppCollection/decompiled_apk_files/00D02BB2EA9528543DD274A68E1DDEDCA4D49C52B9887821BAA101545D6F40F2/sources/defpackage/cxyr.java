package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cxyr  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cxyr implements dbrn {
    static final dbrn a = new cxyr();

    private cxyr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cyft cyftVar = (cyft) obj;
        int i = 0;
        if (cyftVar.b() != null) {
            dcdc<MatchInfo> dcdcVar = cyftVar.b().n;
            int size = dcdcVar.size();
            int i2 = 0;
            while (i < size) {
                i2 += dcdcVar.get(i).b();
                i++;
            }
            i = i2;
        }
        return Integer.valueOf(i);
    }
}
