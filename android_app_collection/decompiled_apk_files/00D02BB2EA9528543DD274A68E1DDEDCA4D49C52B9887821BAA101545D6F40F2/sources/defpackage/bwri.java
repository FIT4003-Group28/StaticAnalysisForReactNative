package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import defpackage.dssj;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwri  reason: default package */
/* loaded from: classes.dex */
public final class bwri<T extends dssj> implements Factory<bwrh<T>> {
    public static <T extends dssj> bwrh<T> b(Executor executor, Context context) {
        return new bwrh<>(executor, context);
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
