package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: vlz  reason: default package */
/* loaded from: classes7.dex */
public final class vlz {
    private final dcza a;
    private final String b;

    public vlz(dcza dczaVar, String str) {
        this.a = dczaVar;
        this.b = str;
    }

    @dzsi
    public final String a(amvh amvhVar) {
        if (amvhVar == null) {
            return null;
        }
        dczb f = this.a.f();
        f.k(this.b, Charset.defaultCharset());
        if (amvhVar.b == dpjs.ENTITY_TYPE_HOME || amvhVar.b == dpjs.ENTITY_TYPE_WORK) {
            f.h(amvhVar.b.h);
        } else {
            akqi akqiVar = amvhVar.d;
            if (akqiVar == null) {
                return null;
            }
            f.i(akqiVar.b);
            f.i(akqiVar.c);
        }
        return f.p().toString();
    }
}
