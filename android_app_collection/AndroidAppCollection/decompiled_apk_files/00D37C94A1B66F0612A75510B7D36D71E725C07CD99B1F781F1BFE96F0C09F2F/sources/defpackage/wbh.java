package defpackage;

import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.Map;
/* compiled from: PG */
@Deprecated
/* renamed from: wbh  reason: default package */
/* loaded from: classes4.dex */
public final class wbh implements aafl {
    private final azqb a;

    public wbh(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        wbw wbwVar = (wbw) this.a.get();
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) apzgVar.qm(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
        wbi wbiVar = (wbi) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", wbi.class);
        if (wbiVar != null) {
            wbwVar.a(wbiVar);
        }
        wbwVar.k(inlineAuthCommandOuterClass$InlineAuthCommand);
    }
}
