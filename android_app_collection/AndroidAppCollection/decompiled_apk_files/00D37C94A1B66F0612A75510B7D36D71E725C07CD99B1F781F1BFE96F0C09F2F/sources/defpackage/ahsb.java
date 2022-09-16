package defpackage;

import com.google.protos.youtube.api.innertube.EnterVrModeCommandOuterClass$EnterVrModeCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahsb  reason: default package */
/* loaded from: classes.dex */
public final class ahsb implements aafl {
    private final ahso a;

    public ahsb(ahso ahsoVar) {
        ahsoVar.getClass();
        this.a = ahsoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(EnterVrModeCommandOuterClass$EnterVrModeCommand.enterVrModeCommand)) {
            throw new aafy("Expected a EnterVrModeCommand, but did not find one.");
        }
        this.a.e();
    }
}
