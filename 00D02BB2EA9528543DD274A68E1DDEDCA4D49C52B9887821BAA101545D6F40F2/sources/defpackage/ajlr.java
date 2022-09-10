package defpackage;

import java.util.List;
/* renamed from: ajlr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajlr implements dbrn {
    static final dbrn a = new ajlr();

    private ajlr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i = ajlu.i;
        for (Boolean bool : (List) obj) {
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
