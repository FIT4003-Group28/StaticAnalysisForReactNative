package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
/* compiled from: PG */
/* renamed from: iqy  reason: default package */
/* loaded from: classes3.dex */
public final class iqy implements iqx {
    private final axwq a;

    static {
        zep.a("MDX.RemoteWatchPromptHelper");
    }

    public iqy(axwq axwqVar) {
        this.a = axwqVar;
    }

    @Override // defpackage.iqx
    public final void a(WatchDescriptor watchDescriptor, eo eoVar) {
        String.format("isPromptBottomSheet=%b", this.a.b());
        if (this.a.b().booleanValue()) {
            iqr iqrVar = new iqr();
            Bundle bundle = new Bundle();
            bundle.putParcelable("watch", watchDescriptor);
            iqrVar.ae(bundle);
            iqrVar.qv(eoVar, null);
            return;
        }
        iqw iqwVar = new iqw();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("watch", watchDescriptor);
        iqwVar.ae(bundle2);
        iqwVar.qv(eoVar, null);
    }
}
