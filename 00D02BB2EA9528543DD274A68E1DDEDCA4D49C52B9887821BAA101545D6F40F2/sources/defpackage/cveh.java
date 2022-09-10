package defpackage;
/* compiled from: PG */
/* renamed from: cveh  reason: default package */
/* loaded from: classes5.dex */
public final class cveh extends tt<cved> {
    private static final String a = "cveh";

    @Override // defpackage.tt
    public final /* bridge */ /* synthetic */ boolean a(cved cvedVar, cved cvedVar2) {
        cvcy a2;
        cvcy a3;
        String str;
        String str2;
        cved cvedVar3 = cvedVar;
        cved cvedVar4 = cvedVar2;
        if (cvedVar3.b() != cvedVar4.b()) {
            return false;
        }
        cvec cvecVar = cvec.MESSAGE_BUBBLE;
        int ordinal = cvedVar3.b().ordinal();
        if (ordinal == 0) {
            a2 = cvedVar3.a();
            a3 = cvedVar4.a();
        } else if (ordinal == 1) {
            cuib d = cvedVar3.d();
            cuib d2 = cvedVar4.d();
            str2 = d.a();
            str = d2.a();
            return str2.equals(str);
        } else if (ordinal == 2) {
            a2 = cvedVar3.c();
            a3 = cvedVar4.c();
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                return false;
            }
            cstl.a(a);
            return true;
        } else {
            a2 = cvedVar3.e();
            a3 = cvedVar4.e();
        }
        str2 = a2.a().b().a();
        str = a3.a().b().a();
        return str2.equals(str);
    }

    @Override // defpackage.tt
    public final /* bridge */ /* synthetic */ boolean b(cved cvedVar, cved cvedVar2) {
        return cvedVar.equals(cvedVar2);
    }
}
