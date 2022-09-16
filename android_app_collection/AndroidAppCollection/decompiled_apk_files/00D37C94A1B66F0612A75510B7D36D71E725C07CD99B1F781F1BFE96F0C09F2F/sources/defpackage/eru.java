package defpackage;

import com.google.protos.youtube.api.innertube.ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eru  reason: default package */
/* loaded from: classes3.dex */
public final class eru implements aafl {
    private final yzv a;

    public eru(yzv yzvVar) {
        this.a = yzvVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.showNoConnectionBarCommand)) {
            throw new aafy("Expected a ShowNoConnectionBarCommand, but did not find one.");
        }
        this.a.b();
    }
}
