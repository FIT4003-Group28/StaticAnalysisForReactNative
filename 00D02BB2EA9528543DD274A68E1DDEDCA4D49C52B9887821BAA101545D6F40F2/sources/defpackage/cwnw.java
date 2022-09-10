package defpackage;

import android.accounts.Account;
import android.graphics.Bitmap;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cwnw  reason: default package */
/* loaded from: classes5.dex */
final class cwnw {
    public static final /* synthetic */ int a = 0;
    private final csqo b;

    static {
        cwjy.a();
    }

    public cwnw(csqo csqoVar) {
        dbsk.s(csqoVar);
        this.b = csqoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<Bitmap> a(cwnv cwnvVar, String str, int i) {
        dbac f = dbac.b(cwnvVar.a(this.b.a(new Account(str, "com.google")), new csqi(), cwlk.a(i))).c(csqp.class, cwnq.a, dege.a).d(cnob.class, cwnr.a, dege.a).d(IOException.class, cwns.a, dege.a).f(cwnt.a, dege.a);
        dbae.c(f, new cwnu(), dege.a);
        return f;
    }
}
