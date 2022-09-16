package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: azxq  reason: default package */
/* loaded from: classes2.dex */
public final class azxq {
    public static final azyg a = new azyg("UNDEFINED");
    public static final azyg b = new azyg("REUSABLE_CLAIMED");

    public static final void a(azqy azqyVar, Object obj) {
        if (azqyVar instanceof azxp) {
            azxp azxpVar = (azxp) azqyVar;
            Object i = ayno.i(obj);
            if (azxpVar.a.d(azxpVar.getContext())) {
                azxpVar.c = i;
                azxpVar.f = 1;
                azxpVar.a.st(azxpVar.getContext(), azxpVar);
                return;
            }
            boolean z = azuy.a;
            azvg a2 = azwe.a.a();
            if (a2.h()) {
                azxpVar.c = i;
                azxpVar.f = 1;
                a2.e(azxpVar);
                return;
            }
            a2.f(true);
            try {
                azvo azvoVar = (azvo) azxpVar.getContext().get(azvo.b);
                if (azvoVar != null && !azvoVar.l()) {
                    CancellationException h = azvoVar.h();
                    azxpVar.g(i, h);
                    azxpVar.resumeWith(azqj.p(h));
                } else {
                    azqy azqyVar2 = azxpVar.b;
                    Object obj2 = azxpVar.d;
                    azrd context = azqyVar2.getContext();
                    Object b2 = azyi.b(context, obj2);
                    if (b2 != azyi.a) {
                        azup.c(azqyVar2, context);
                    }
                    azxpVar.b.resumeWith(obj);
                    azyi.c(context, b2);
                }
                do {
                } while (a2.i());
                return;
            } catch (Throwable th) {
                try {
                    azxpVar.q(th, null);
                    return;
                } finally {
                    a2.j();
                }
            }
        }
        azqyVar.resumeWith(obj);
    }
}
