package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: afck  reason: default package */
/* loaded from: classes2.dex */
final class afck implements afby {
    @Override // defpackage.afcf
    public final boolean a(afcj afcjVar) {
        afbz afbzVar = afcjVar.b;
        dbsk.s(afbzVar);
        File a = afbzVar.a();
        dbsk.s(a);
        String name = a.getName();
        if (afcjVar.f() == 1) {
            if (name.startsWith("in1-")) {
                return afcl.e(afbzVar, "in1-");
            }
        } else if (afcjVar.f() == 2 && !name.startsWith("in2-")) {
            return afcl.d(afbzVar, "in1-");
        }
        return true;
    }
}
