package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adkt  reason: default package */
/* loaded from: classes.dex */
public final class adkt extends adlh {
    static {
        zep.a("MDX.player.defaultLocalPlaybackControl");
    }

    public adkt(yni yniVar, airw airwVar, azqb azqbVar, azqb azqbVar2, adoa adoaVar) {
        super(yniVar, (adli) airwVar.A(), azqbVar, azqbVar2, adoaVar);
    }

    private final void g(adnl adnlVar) {
        airr f = f();
        f.getClass();
        aire e = e();
        e.getClass();
        aijl d = PlaybackStartDescriptor.d();
        d.a = (apzg) aikb.m(adnlVar.b, adnlVar.e, adnlVar.f, (float) TimeUnit.MILLISECONDS.toSeconds(adnlVar.c), adnlVar.h, adnlVar.g).mo39build();
        if (adnlVar.b.equals(f.q())) {
            d.i = true;
        }
        PlaybackStartDescriptor a = d.a();
        String.valueOf(String.valueOf(a)).length();
        e.d(a);
    }

    private final boolean h(adnl adnlVar) {
        airr f = f();
        f.getClass();
        return !adnlVar.h(f.p());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void a(adnl adnlVar) {
        if ((!adnlVar.e() && (f() == null || f().p() == null || f().p().isEmpty())) || !h(adnlVar)) {
            f().aa();
        } else {
            g(adnlVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void b() {
        f().D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void c(adnl adnlVar) {
        airr f = f();
        f.getClass();
        if (adnlVar.i(f.q()) && !h(adnlVar)) {
            return;
        }
        g(adnlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void d(aifh aifhVar) {
        SubtitleTrack subtitleTrack;
        airr f = f();
        aire e = e();
        PlaybackStartDescriptor playbackStartDescriptor = null;
        String str = null;
        if (!TextUtils.isEmpty(f.q())) {
            boolean a = adwa.a(f.p());
            PlaybackStartDescriptor playbackStartDescriptor2 = f.k().a;
            String j = playbackStartDescriptor2 != null ? playbackStartDescriptor2.j() : null;
            if (playbackStartDescriptor2 != null) {
                str = playbackStartDescriptor2.i();
            }
            String str2 = str;
            ajbf o = f.o();
            long b = o != null ? o.b() : 0L;
            aijl d = PlaybackStartDescriptor.d();
            d.a = (apzg) aikb.m(f.q(), a ? "" : f.p(), a ? -1 : f.g(), (float) TimeUnit.MILLISECONDS.toSeconds(b), j, str2).mo39build();
            d.b(true);
            playbackStartDescriptor = d.a();
            subtitleTrack = f.m();
        } else {
            subtitleTrack = null;
        }
        f.D();
        if (playbackStartDescriptor != null) {
            String valueOf = String.valueOf(playbackStartDescriptor.l());
            if (valueOf.length() != 0) {
                "Reload video ".concat(valueOf);
            }
            e.d(playbackStartDescriptor);
            if (subtitleTrack == null) {
                return;
            }
            f.I(subtitleTrack, false);
        }
    }
}
