package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wbg  reason: default package */
/* loaded from: classes4.dex */
public final class wbg {
    public final wac a;
    private final wea b;
    private final Executor c;

    public wbg(wea weaVar, wac wacVar, Executor executor) {
        this.b = weaVar;
        this.a = wacVar;
        this.c = executor;
    }

    public final ankt a(int i) {
        if (i - 1 != 1) {
            return null;
        }
        return anii.h(this.b.d(), new ampg() { // from class: wbf
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return (AccountIdentity) wbg.this.a.d((String) obj);
            }
        }, this.c);
    }
}
