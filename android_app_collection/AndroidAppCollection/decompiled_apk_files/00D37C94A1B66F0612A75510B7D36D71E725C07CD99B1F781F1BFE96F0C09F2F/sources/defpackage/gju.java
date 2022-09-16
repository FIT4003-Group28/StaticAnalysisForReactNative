package defpackage;

import com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gju  reason: default package */
/* loaded from: classes3.dex */
public final class gju implements aafl {
    private final lwb a;
    private final /* synthetic */ int b;

    public gju(lwb lwbVar) {
        this.a = lwbVar;
    }

    public gju(lwb lwbVar, int i) {
        this.b = i;
        this.a = lwbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.b == 0) {
            if (!apzgVar.qn(asoa.b)) {
                return;
            }
            lwb lwbVar = this.a;
            asoa asoaVar = (asoa) apzgVar.qm(asoa.b);
            if (!lwbVar.a().h()) {
                return;
            }
            ((lwm) lwbVar.a().c()).f(asoaVar);
        } else if (!apzgVar.qn(FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand)) {
        } else {
            lwb lwbVar2 = this.a;
            FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand) apzgVar.qm(FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand);
            if (!lwbVar2.a().h()) {
                return;
            }
            ((lwm) lwbVar2.a().c()).e(filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand);
        }
    }
}
