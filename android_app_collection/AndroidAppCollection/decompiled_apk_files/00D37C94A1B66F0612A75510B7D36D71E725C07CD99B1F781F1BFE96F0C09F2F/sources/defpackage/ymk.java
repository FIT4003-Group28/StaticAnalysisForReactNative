package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: ymk  reason: default package */
/* loaded from: classes4.dex */
public class ymk extends ymv {
    private amuk a;

    public ymk(Context context, String str, List list) {
        this(context, str, list, 0);
    }

    @Override // defpackage.ymv
    protected final ymu a(int i) {
        return (ymu) this.a.get(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymk(Context context, String str, List list, int i) {
        super(context, str, list.size());
        context.getClass();
        list.getClass();
        this.a = amuk.o(list);
        if (i > 0) {
            yvv.d(this, i);
        }
    }
}
