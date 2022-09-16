package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
/* compiled from: PG */
/* renamed from: gsl  reason: default package */
/* loaded from: classes3.dex */
final class gsl implements afzf {
    public final azpw a = azpw.Y();
    final /* synthetic */ gsm b;
    private final Uri c;
    private final byte[] d;

    public gsl(gsm gsmVar, Uri uri, byte[] bArr) {
        this.b = gsmVar;
        this.c = uri;
        this.d = bArr;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error loading video", cffVar);
        this.b.d.e(cffVar);
        this.a.sh(gsq.a(1, this.b.d.b(cffVar)));
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arxs arxsVar = (arxs) obj;
        if ((arxsVar.b & 2) != 0) {
            apzg apzgVar = arxsVar.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (this.d != null) {
                aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                aoob x = aoob.x(this.d);
                aopcVar.copyOnWrite();
                apzg apzgVar2 = (apzg) aopcVar.instance;
                apzgVar2.b |= 1;
                apzgVar2.c = x;
                apzgVar = (apzg) aopcVar.mo39build();
            }
            aijl d = PlaybackStartDescriptor.d();
            d.a = apzgVar;
            d.b(false);
            PlaybackStartDescriptor a = d.a();
            if (!akzj.f(a.l(), "") || !akzj.f(a.k(), "") || a.m() != null) {
                azpw azpwVar = this.a;
                gsm gsmVar = this.b;
                if (gsmVar.e() || gsmVar.b.m) {
                    ((aire) gsmVar.c.get()).d(a);
                } else {
                    Context context = gsmVar.a;
                    WatchDescriptor watchDescriptor = new WatchDescriptor(a);
                    watchDescriptor.h();
                    context.startActivity(etk.d(context).putExtra("watch", watchDescriptor).putExtra("playback_start_flag", 3));
                }
                azpwVar.sh(gsq.a);
                return;
            }
            this.a.sh(gsq.a(2, String.format("Unsupported link: %s", this.c)));
        }
    }
}
