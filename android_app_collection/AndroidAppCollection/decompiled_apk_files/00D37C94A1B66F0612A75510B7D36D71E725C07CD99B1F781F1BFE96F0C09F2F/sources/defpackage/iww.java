package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iww  reason: default package */
/* loaded from: classes3.dex */
public abstract class iww implements aafl {
    public final yzj a;
    protected final Context b;
    public final aios c;
    public iwv d;
    private final adoa e;
    private final ailf f;
    private final iwu g = new iwu(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public iww(adoa adoaVar, ailf ailfVar, yzj yzjVar, Context context, aios aiosVar) {
        adoaVar.getClass();
        this.e = adoaVar;
        this.f = ailfVar;
        yzjVar.getClass();
        this.a = yzjVar;
        this.b = context;
        this.c = aiosVar;
    }

    protected abstract String b(apzg apzgVar);

    protected abstract String c(apzg apzgVar);

    protected abstract void d(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final adnt f() {
        return this.e.e();
    }

    public final void g(String str) {
        this.f.h(str, ailf.a, "", 0, this.g);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String b = b(apzgVar);
        if (!TextUtils.isEmpty(b)) {
            d(b);
        } else {
            g(c(apzgVar));
        }
    }
}
