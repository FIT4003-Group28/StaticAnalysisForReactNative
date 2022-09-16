package defpackage;

import android.accounts.AccountManager;
/* compiled from: PG */
/* renamed from: use  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class use implements Runnable {
    public final /* synthetic */ usf a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ use(usf usfVar, String str) {
        this.a = usfVar;
        this.b = str;
    }

    public /* synthetic */ use(usf usfVar, String str, int i) {
        this.c = i;
        this.a = usfVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            usf usfVar = this.a;
            usfVar.b.a.c.loadUrl(this.b);
            return;
        }
        usf usfVar2 = this.a;
        AccountManager.get(usfVar2.a).invalidateAuthToken("com.google", this.b);
    }
}
