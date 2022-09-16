package defpackage;

import com.google.protos.youtube.api.innertube.ProfileCardCommandOuterClass$ProfileCardCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eaz  reason: default package */
/* loaded from: classes3.dex */
public final class eaz implements aafl {
    private final ebn a;

    public eaz(ebn ebnVar) {
        this.a = ebnVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand = (ProfileCardCommandOuterClass$ProfileCardCommand) apzgVar.qm(ProfileCardCommandOuterClass$ProfileCardCommand.profileCardCommand);
        this.a.h(profileCardCommandOuterClass$ProfileCardCommand.b, profileCardCommandOuterClass$ProfileCardCommand.c, profileCardCommandOuterClass$ProfileCardCommand.e, profileCardCommandOuterClass$ProfileCardCommand.d, apzgVar);
    }
}
