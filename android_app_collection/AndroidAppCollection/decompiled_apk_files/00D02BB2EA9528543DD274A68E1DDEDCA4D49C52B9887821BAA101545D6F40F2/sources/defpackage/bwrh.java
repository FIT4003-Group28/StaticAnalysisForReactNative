package defpackage;

import android.content.Context;
import defpackage.dssj;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwrh  reason: default package */
/* loaded from: classes.dex */
public final class bwrh<T extends dssj> {
    private final Executor a;
    private final Context b;

    public bwrh(Executor executor, Context context) {
        this.a = executor;
        this.b = context;
    }

    public final bwrg<T> a(dssr<T> dssrVar, bwre bwreVar, String str) {
        return new bwrg<>(dssrVar, this.b, bwreVar, str, this.a);
    }
}
