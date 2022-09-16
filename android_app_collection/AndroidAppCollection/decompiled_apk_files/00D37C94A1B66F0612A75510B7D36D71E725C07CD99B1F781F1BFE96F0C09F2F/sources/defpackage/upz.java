package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: upz  reason: default package */
/* loaded from: classes4.dex */
public final class upz implements upx {
    public static final String[] a = {rxj.a("googleone")};
    public final Context b;
    public final ankw c;

    public upz(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = anlz.e(executorService);
    }

    @Override // defpackage.upx
    public final ankt a() {
        return amnt.d(new upy(this, 1), this.c);
    }
}
