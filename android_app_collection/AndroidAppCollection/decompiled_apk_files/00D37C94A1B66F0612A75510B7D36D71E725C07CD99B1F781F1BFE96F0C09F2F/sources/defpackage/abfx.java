package defpackage;

import com.google.protos.youtube.api.innertube.RegisterTasksCommandOuterClass$RegisterTasksCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abfx  reason: default package */
/* loaded from: classes.dex */
public final class abfx implements aafl {
    private final afvn a;
    private final afvd b;

    public abfx(afvn afvnVar, afvd afvdVar) {
        this.a = afvnVar;
        this.b = afvdVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        RegisterTasksCommandOuterClass$RegisterTasksCommand registerTasksCommandOuterClass$RegisterTasksCommand = (RegisterTasksCommandOuterClass$RegisterTasksCommand) apzgVar.qm(RegisterTasksCommandOuterClass$RegisterTasksCommand.registerTasksCommand);
        ampq a = this.b.a(this.a.c());
        if (!a.h()) {
            return;
        }
        ((abfq) a.c()).b(registerTasksCommandOuterClass$RegisterTasksCommand.b);
    }
}
