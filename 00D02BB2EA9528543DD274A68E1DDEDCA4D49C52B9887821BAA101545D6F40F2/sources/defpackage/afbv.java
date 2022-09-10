package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: afbv  reason: default package */
/* loaded from: classes2.dex */
final class afbv implements afby {
    @Override // defpackage.afcf
    public final boolean a(afcj afcjVar) {
        if (afcjVar.f() == 1) {
            afbz afbzVar = afcjVar.b;
            dbsk.s(afbzVar);
            File a = afbzVar.a();
            dbsk.s(a);
            if (a.getName().startsWith("in2-")) {
                afcl.c(afbzVar);
            }
        }
        return true;
    }
}
