package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: asmg  reason: default package */
/* loaded from: classes2.dex */
public final class asmg extends gen {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    public final Runnable b;
    public cqkj c;
    private final astz d = new asmf(this);
    @dzsi
    private asua e;
    @dzsi
    private cqkf<asuw> g;

    public asmg(Runnable runnable) {
        this.b = runnable;
    }

    @Override // defpackage.gen
    protected final boolean aR() {
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        aT();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cqkf<asuw> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.g = null;
        }
        super.am();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        this.e = new asua(Rn(), this.d, a);
        cqkf<asuw> c = this.c.c(new assp(), null);
        this.g = c;
        c.e(this.e);
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.getWindow().requestFeature(1);
        gdfVar.getWindow().addFlags(ImageMetadata.LENS_APERTURE);
        gdfVar.setContentView(this.g.c());
        return gdfVar;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.aE;
    }
}
