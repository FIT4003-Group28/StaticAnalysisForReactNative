package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: xex  reason: default package */
/* loaded from: classes4.dex */
public final class xex implements afxt {
    private final List a;

    public xex(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.afxt
    public final boolean a(aswe asweVar) {
        for (aswf aswfVar : this.a) {
            aswe b = aswe.b(aswfVar.c);
            if (b == null) {
                b = aswe.UNKNOWN;
                continue;
            }
            if (b == asweVar) {
                return true;
            }
        }
        return false;
    }
}
