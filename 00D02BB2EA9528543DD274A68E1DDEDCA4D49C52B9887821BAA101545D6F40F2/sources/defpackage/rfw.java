package defpackage;

import java.util.List;
/* renamed from: rfw  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class rfw implements dbrn {
    public static final dbrn a = new rfw();

    private rfw() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        List<rhy> c = ((rhj) obj).c();
        return c.isEmpty() ? dbpy.a : c.get(0).b(2).a.h(rhm.a);
    }
}
