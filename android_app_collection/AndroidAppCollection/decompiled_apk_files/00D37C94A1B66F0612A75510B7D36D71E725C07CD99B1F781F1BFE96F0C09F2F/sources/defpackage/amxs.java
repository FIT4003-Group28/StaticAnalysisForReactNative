package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amxs  reason: default package */
/* loaded from: classes.dex */
public final class amxs extends amxr implements Serializable {
    static final amxr a = new amxs();
    private static final long serialVersionUID = 0;

    private amxs() {
    }

    @Override // defpackage.amxr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        amxt amxtVar = (amxt) obj;
        amxt amxtVar2 = (amxt) obj2;
        return amsu.b.c(amxtVar.b, amxtVar2.b).c(amxtVar.c, amxtVar2.c).a();
    }
}
