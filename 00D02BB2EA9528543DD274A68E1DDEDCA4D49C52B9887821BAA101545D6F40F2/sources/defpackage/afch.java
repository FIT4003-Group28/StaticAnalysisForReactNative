package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: afch  reason: default package */
/* loaded from: classes2.dex */
final class afch implements afby {
    @Override // defpackage.afcf
    public final boolean a(afcj afcjVar) {
        afbz afbzVar = afcjVar.b;
        dbsk.s(afbzVar);
        File a = afbzVar.a();
        dbsk.s(a);
        if (afcjVar.f() == 1) {
            return afcl.d(afbzVar, "in1-");
        }
        return !a.getName().startsWith("in1-") || afcl.e(afbzVar, "in1-");
    }
}
