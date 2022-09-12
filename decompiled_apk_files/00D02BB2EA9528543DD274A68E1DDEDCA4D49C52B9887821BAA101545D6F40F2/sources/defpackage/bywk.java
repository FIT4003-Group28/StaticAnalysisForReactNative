package defpackage;

import java.util.AbstractMap;
/* renamed from: bywk  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bywk implements dbrn {
    static final dbrn a = new bywk();

    private bywk() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return ((AbstractMap.SimpleImmutableEntry) obj).getKey();
    }
}
