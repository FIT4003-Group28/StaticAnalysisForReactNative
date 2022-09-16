package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiux  reason: default package */
/* loaded from: classes.dex */
final class aiux implements afta {
    final /* synthetic */ aopa a;

    public aiux(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.afta
    public final int a() {
        return ((aqlf) this.a.instance).d;
    }

    @Override // defpackage.afta
    public final int b() {
        return ((aqlf) this.a.instance).c;
    }

    @Override // defpackage.afta
    public final int c() {
        return 0;
    }

    @Override // defpackage.afta
    public final int d() {
        return (int) TimeUnit.DAYS.toMinutes(30L);
    }
}
