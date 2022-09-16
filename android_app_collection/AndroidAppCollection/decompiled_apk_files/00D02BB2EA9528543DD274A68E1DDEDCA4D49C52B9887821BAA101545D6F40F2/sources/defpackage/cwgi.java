package defpackage;
/* compiled from: PG */
/* renamed from: cwgi  reason: default package */
/* loaded from: classes5.dex */
final class cwgi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <AccountT> cvxy<AccountT> a(cvze<AccountT> cvzeVar) {
        cvxz cvxzVar = new cvxz();
        Class<AccountT> i = cvzeVar.i();
        if (i != null) {
            cvxzVar.b = i;
            cwfn o = cvzeVar.o();
            if (o != null) {
                cvxzVar.e = o;
                cvzg<AccountT> a = cvzeVar.a();
                if (a != null) {
                    cvxzVar.f = a;
                    cvxzVar.c = Boolean.valueOf(cvzeVar.f().c());
                    cvuu<AccountT> h = cvzeVar.h();
                    if (h != null) {
                        cvxzVar.a = h;
                        cwjw<AccountT> e = cvzeVar.e();
                        if (e != null) {
                            cvxzVar.d = e;
                            String str = cvxzVar.a == null ? " avatarImageLoader" : "";
                            if (cvxzVar.e == null) {
                                str = str.concat(" accountConverter");
                            }
                            if (cvxzVar.f == null) {
                                str = String.valueOf(str).concat(" accountsModel");
                            }
                            if (cvxzVar.b == null) {
                                str = String.valueOf(str).concat(" accountClass");
                            }
                            if (cvxzVar.c == null) {
                                str = String.valueOf(str).concat(" allowRings");
                            }
                            if (cvxzVar.d == null) {
                                str = String.valueOf(str).concat(" oneGoogleEventLogger");
                            }
                            if (str.isEmpty()) {
                                return new cvya(cvxzVar.a, cvxzVar.e, cvxzVar.f, cvxzVar.b, cvxzVar.c.booleanValue(), cvxzVar.d);
                            }
                            String valueOf = String.valueOf(str);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        }
                        throw new NullPointerException("Null oneGoogleEventLogger");
                    }
                    throw new NullPointerException("Null avatarImageLoader");
                }
                throw new NullPointerException("Null accountsModel");
            }
            throw new NullPointerException("Null accountConverter");
        }
        throw new NullPointerException("Null accountClass");
    }
}
