package defpackage;

import com.google.protos.youtube.api.innertube.RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iso  reason: default package */
/* loaded from: classes3.dex */
public final class iso implements aafl {
    private final isr a;

    public iso(isr isrVar) {
        this.a = isrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.a.a(((RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction) apzgVar.qm(RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.recordUserEventTokenAction)).b);
    }
}
