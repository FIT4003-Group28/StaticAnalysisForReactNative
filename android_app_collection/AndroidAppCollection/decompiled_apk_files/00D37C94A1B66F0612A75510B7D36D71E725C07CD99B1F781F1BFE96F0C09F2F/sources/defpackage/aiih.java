package defpackage;

import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import java.util.Observable;
import java.util.Observer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiih  reason: default package */
/* loaded from: classes.dex */
public final class aiih implements Observer {
    final /* synthetic */ awgw a;
    final /* synthetic */ aiii b;

    public aiih(aiii aiiiVar, awgw awgwVar) {
        this.b = aiiiVar;
        this.a = awgwVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        this.b.d.deleteObserver(this);
        awgw awgwVar = this.a;
        if ((awgwVar.b & 65536) != 0) {
            apzg apzgVar = awgwVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
                apzg apzgVar2 = this.a.p;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                this.b.e.b(((CommandExecutorCommandOuterClass$CommandExecutorCommand) apzgVar2.qm(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b);
            }
        }
        this.b.f();
        this.b.a();
        this.b.b(awgu.YOU_THERE_EVENT_TYPE_LACT_RESET, this.a);
    }
}
