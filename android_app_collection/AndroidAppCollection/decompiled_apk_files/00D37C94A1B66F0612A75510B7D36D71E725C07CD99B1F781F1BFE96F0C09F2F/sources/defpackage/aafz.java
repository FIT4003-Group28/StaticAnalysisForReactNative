package defpackage;

import com.google.protos.youtube.api.innertube.EntityUpdateCommandOuterClass$EntityUpdateCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aafz  reason: default package */
/* loaded from: classes.dex */
public final class aafz implements aafl {
    private final aajg a;
    private final afvn b;

    public aafz(aajg aajgVar, afvn afvnVar) {
        this.a = aajgVar;
        this.b = afvnVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar.qn(EntityUpdateCommandOuterClass$EntityUpdateCommand.entityUpdateCommand)) {
            aajg aajgVar = this.a;
            afvm c = this.b.c();
            aqvw aqvwVar = ((EntityUpdateCommandOuterClass$EntityUpdateCommand) apzgVar.qm(EntityUpdateCommandOuterClass$EntityUpdateCommand.entityUpdateCommand)).b;
            if (aqvwVar == null) {
                aqvwVar = aqvw.a;
            }
            aajgVar.a(c, aqvwVar);
            return;
        }
        throw new aafy("no entityUpdateCommand");
    }
}
