package defpackage;

import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import com.google.protos.youtube.api.innertube.LoopCommandOuterClass$LoopCommand;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eql  reason: default package */
/* loaded from: classes3.dex */
public final class eql implements aafl {
    private final azqb a;
    private final azqb b;

    public eql(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apzgVar.getClass();
        if (!apzgVar.qn(LoopCommandOuterClass$LoopCommand.loopCommand)) {
            throw new aafy();
        }
        ahvz ahvzVar = (ahvz) this.a.get();
        if (ahvzVar == null) {
            return;
        }
        LoopCommandOuterClass$LoopCommand loopCommandOuterClass$LoopCommand = (LoopCommandOuterClass$LoopCommand) apzgVar.qm(LoopCommandOuterClass$LoopCommand.loopCommand);
        if (loopCommandOuterClass$LoopCommand.c) {
            amuf f = amuk.f();
            if ((loopCommandOuterClass$LoopCommand.b & 2) == 0) {
                f.h("loop_command.start_time_ms is not filled.");
            }
            if ((loopCommandOuterClass$LoopCommand.b & 4) == 0) {
                f.h("loop_command.end_time_ms is not filled.");
            }
            amuk g = f.g();
            if (!g.isEmpty()) {
                amuf f2 = amuk.f();
                if (map == null) {
                    f2.h("args is null.");
                } else {
                    if (map.containsKey("loop_command_resolver_start_time_ms")) {
                        if (!(map.get("loop_command_resolver_start_time_ms") instanceof Long)) {
                            f2.h("Value of loop_command_resolver_start_time_ms is not a Long.");
                        }
                    } else {
                        f2.h("args does not contain key: loop_command_resolver_start_time_ms");
                    }
                    if (map.containsKey("loop_command_resolver_end_time_ms")) {
                        if (!(map.get("loop_command_resolver_end_time_ms") instanceof Long)) {
                            f2.h("Value of loop_command_resolver_end_time_ms is not a Long.");
                        }
                    } else {
                        f2.h("args does not contain key: loop_command_resolver_end_time_ms");
                    }
                }
                amuk g2 = f2.g();
                if (g2.isEmpty()) {
                    ahvzVar.b(((Long) map.get("loop_command_resolver_start_time_ms")).longValue(), ((Long) map.get("loop_command_resolver_end_time_ms")).longValue());
                } else {
                    List[] listArr = {g, g2};
                    StringBuilder sb = new StringBuilder("There were problems with resolving LoopCommand.");
                    for (int i = 0; i < 2; i++) {
                        for (String str : listArr[i]) {
                            sb.append(" ");
                            sb.append(str);
                        }
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                ahvzVar.b(loopCommandOuterClass$LoopCommand.d, loopCommandOuterClass$LoopCommand.e);
            }
            if ((loopCommandOuterClass$LoopCommand.b & 8) == 0) {
                return;
            }
            ClipController clipController = (ClipController) this.b.get();
            String str2 = loopCommandOuterClass$LoopCommand.f;
            if (clipController.u.get() == null) {
                return;
            }
            ((aiuo) clipController.u.get()).b(str2);
            return;
        }
        ahvzVar.a();
    }
}
