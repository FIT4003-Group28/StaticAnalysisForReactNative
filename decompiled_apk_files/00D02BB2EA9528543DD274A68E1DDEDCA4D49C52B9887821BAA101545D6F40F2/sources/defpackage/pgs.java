package defpackage;

import java.util.List;
/* renamed from: pgs  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class pgs implements dbrn {
    static final dbrn a = new pgs();

    private pgs() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        List list = (List) obj;
        return (list == null || !list.contains(true)) ? bbx.c() : bbx.a();
    }
}
