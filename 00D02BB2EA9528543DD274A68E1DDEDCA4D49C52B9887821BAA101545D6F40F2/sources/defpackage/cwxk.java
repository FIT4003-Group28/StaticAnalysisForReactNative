package defpackage;

import android.os.Build;
import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cwxk  reason: default package */
/* loaded from: classes5.dex */
public final class cwxk implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<dzsj<cwts>>> a;
    private final dzsj<cwxf> b;

    public cwxk(dzsj<dbsg<dzsj<cwts>>> dzsjVar, dzsj<cwxf> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Object B = (((dbsg) ((dxjd) this.a).a).a() && Build.VERSION.SDK_INT >= 23) ? dcep.B(this.b.a()) : dcmr.a;
        dxjg.f(B);
        return B;
    }
}
