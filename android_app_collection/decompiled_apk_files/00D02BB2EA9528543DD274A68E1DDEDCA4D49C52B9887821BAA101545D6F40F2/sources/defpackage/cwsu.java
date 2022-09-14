package defpackage;

import android.os.SystemClock;
import dagger.internal.Factory;
import java.util.Random;
/* compiled from: PG */
/* renamed from: cwsu  reason: default package */
/* loaded from: classes5.dex */
public final class cwsu implements Factory<Random> {
    public static Random b() {
        return new Random(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
