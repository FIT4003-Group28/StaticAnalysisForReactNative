package defpackage;

import android.accounts.Account;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ure  reason: default package */
/* loaded from: classes4.dex */
final class ure {
    private final uac a;

    public ure(uac uacVar) {
        this.a = uacVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt a(urd urdVar, String str, int i) {
        amne h = amne.f(urdVar.a(this.a.a(new Account(str, "com.google")), new uaa(), uqb.b(i))).b(uad.class, uag.j, anjk.a).c(qsp.class, urc.b, anjk.a).c(IOException.class, urc.a, anjk.a).h(uag.k, anjk.a);
        amnt.g(h, new sle(4), anjk.a);
        return h;
    }
}
