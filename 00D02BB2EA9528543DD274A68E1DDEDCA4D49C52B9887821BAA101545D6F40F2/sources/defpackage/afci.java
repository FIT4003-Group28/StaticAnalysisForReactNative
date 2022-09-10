package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: afci  reason: default package */
/* loaded from: classes2.dex */
final class afci implements afby {
    @Override // defpackage.afcf
    public final boolean a(afcj afcjVar) {
        if (afcjVar.f() == 1) {
            afbz afbzVar = afcjVar.b;
            dbsk.s(afbzVar);
            File a = afbzVar.a();
            dbsk.s(a);
            String name = a.getName();
            if (name.startsWith("in1-") || name.startsWith("in2-")) {
                return afcl.c(afbzVar);
            }
        }
        return true;
    }
}
