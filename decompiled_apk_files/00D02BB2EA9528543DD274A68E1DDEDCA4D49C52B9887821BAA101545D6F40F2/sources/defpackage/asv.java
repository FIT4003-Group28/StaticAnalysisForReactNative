package defpackage;

import android.content.pm.ResolveInfo;
import java.util.function.Function;
/* renamed from: asv  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asv implements Function {
    static final Function a = new asv();

    private asv() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((ResolveInfo) obj).serviceInfo;
    }
}
