package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
/* compiled from: PG */
/* renamed from: sjm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class sjm implements slc {
    public final /* synthetic */ sju a;
    private final /* synthetic */ int b;

    public /* synthetic */ sjm(sju sjuVar) {
        this.a = sjuVar;
    }

    public /* synthetic */ sjm(sju sjuVar, int i) {
        this.b = i;
        this.a = sjuVar;
    }

    @Override // defpackage.slc
    public final ankt a() {
        if (this.b == 0) {
            sju sjuVar = this.a;
            return anii.i(sjuVar.c, g.e, sjuVar.i);
        }
        sju sjuVar2 = this.a;
        return anii.h(sjuVar2.c, ryj.j, sjuVar2.i);
    }
}
