package defpackage;

import java.util.AbstractMap;
/* renamed from: ahwd  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ahwd implements dbrn {
    static final dbrn a = new ahwd();

    private ahwd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        ahwe ahweVar = (ahwe) obj;
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf(ahweVar.n), ahweVar);
    }
}
