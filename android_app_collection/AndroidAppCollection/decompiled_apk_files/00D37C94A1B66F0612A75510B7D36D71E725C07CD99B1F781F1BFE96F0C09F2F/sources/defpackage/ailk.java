package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ailk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ailk implements aypx {
    public final /* synthetic */ ailu a;
    public final /* synthetic */ aimk b;
    public final /* synthetic */ PlaybackStartDescriptor c;
    private final /* synthetic */ int d;

    public /* synthetic */ ailk(ailu ailuVar, aimk aimkVar, PlaybackStartDescriptor playbackStartDescriptor) {
        this.a = ailuVar;
        this.b = aimkVar;
        this.c = playbackStartDescriptor;
    }

    public /* synthetic */ ailk(ailu ailuVar, aimk aimkVar, PlaybackStartDescriptor playbackStartDescriptor, int i) {
        this.d = i;
        this.a = ailuVar;
        this.b = aimkVar;
        this.c = playbackStartDescriptor;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        if (this.d == 0) {
            ailu ailuVar = this.a;
            final aimk aimkVar = this.b;
            PlaybackStartDescriptor playbackStartDescriptor = this.c;
            final ampq ampqVar = (ampq) obj;
            final ampq ampqVar2 = (ampq) obj2;
            aikk aikkVar = ailuVar.i;
            Executor executor = ailuVar.e;
            final yzj yzjVar = ailuVar.c;
            final String l = playbackStartDescriptor.l();
            ailu.r(aikkVar, executor, new aypx() { // from class: ailm
                @Override // defpackage.aypx
                public final Object a(Object obj3, Object obj4) {
                    ampq ampqVar3 = ampq.this;
                    ampq ampqVar4 = ampqVar2;
                    aimk aimkVar2 = aimkVar;
                    yzj yzjVar2 = yzjVar;
                    String str = l;
                    ampq ampqVar5 = (ampq) obj3;
                    ampq ampqVar6 = (ampq) obj4;
                    boolean z = false;
                    boolean z2 = ampqVar5.h() || ampqVar6.h();
                    boolean z3 = ampqVar3.h() || ampqVar4.h();
                    if (z2 && z3) {
                        z = true;
                    }
                    aqxo.y(z);
                    if (ampqVar6.h()) {
                        Exception exc = (Exception) ampqVar6.c();
                        aimkVar2.b(new aikd(4, true, 1, yzjVar2.b(exc), exc, str));
                    } else if (ampqVar4.h()) {
                        Exception exc2 = (Exception) ampqVar4.c();
                        aimkVar2.b(new aikd(4, true, 1, yzjVar2.b(exc2), exc2, str));
                    } else if (ampqVar5.h() && ampqVar3.h()) {
                        aimkVar2.g((WatchNextResponseModel) ampqVar3.c());
                        aimkVar2.d((PlayerResponseModel) ampqVar5.c());
                    }
                    ailu.p(aimkVar2, 2, ampqVar5, ampqVar3);
                    return amon.a;
                }
            });
            return amon.a;
        }
        return ailu.b((ampq) obj, (ampq) obj2, this.b, this.c.l(), this.a.c);
    }
}
