package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: adkr  reason: default package */
/* loaded from: classes.dex */
public abstract class adkr {
    public static final /* synthetic */ int i = 0;
    protected final azqb a;
    public ahhx b;
    public awel c;
    public final airw e;
    public String g;
    public final adkq h = new adkq(this, 1);
    public final adkq d = new adkq(this);
    public final aypf f = new aypf();

    static {
        zep.a("MDX.CurrentPlaybackMonitor");
    }

    public adkr(azqb azqbVar, airw airwVar) {
        this.a = azqbVar;
        this.e = airwVar;
    }

    protected abstract int a();

    protected abstract adnl b(adnl adnlVar);

    public final adnl c(boolean z) {
        awel awelVar;
        aoob aoobVar;
        airr airrVar = (airr) this.a.get();
        String str = this.g;
        if (str == null) {
            str = airrVar.q();
        }
        ajbf n = airrVar.n();
        String str2 = null;
        PlayerResponseModel c = n == null ? null : n.c();
        boolean z2 = false;
        if (n != null && c != null) {
            atcx atcxVar = c.c().c.s;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            if (atcxVar.b) {
                z2 = true;
            }
        }
        if (!z) {
            return adnl.a;
        }
        if (TextUtils.isEmpty(str) || z2) {
            return b(adnl.a);
        }
        PlaybackStartDescriptor playbackStartDescriptor = airrVar.k().a;
        if (playbackStartDescriptor != null) {
            apzg apzgVar = playbackStartDescriptor.b;
            aoobVar = apzgVar == null ? null : apzgVar.c;
            awelVar = apzgVar == null ? this.c : (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
        } else {
            awelVar = this.c;
            aoobVar = null;
        }
        adnk c2 = adnl.c();
        c2.f(str);
        c2.e(a());
        c2.b(adll.a(c, this.b));
        c2.a = airrVar.m();
        c2.d = aoobVar == null ? null : aoobVar.I();
        c2.c = awelVar == null ? null : awelVar.k;
        if (awelVar != null) {
            str2 = awelVar.f;
        }
        c2.b = str2;
        String d = d();
        if (d != null) {
            c2.d(d);
        }
        return b(c2.a());
    }

    protected abstract String d();
}
