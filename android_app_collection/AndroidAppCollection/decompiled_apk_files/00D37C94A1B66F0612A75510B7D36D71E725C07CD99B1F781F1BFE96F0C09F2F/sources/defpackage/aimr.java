package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aimr  reason: default package */
/* loaded from: classes.dex */
public final class aimr {
    public final yni a;
    private final abeb b;
    private final abec c;

    public aimr(yni yniVar, abeb abebVar, abec abecVar) {
        this.a = yniVar;
        this.b = abebVar;
        this.c = abecVar;
    }

    private final ankt d(PlaybackStartDescriptor playbackStartDescriptor, acvg acvgVar, int i) {
        afze d;
        if (i > 0) {
            d = new aikj(i);
        } else {
            d = afze.d();
        }
        String l = playbackStartDescriptor.l();
        if (TextUtils.isEmpty(l)) {
            if (playbackStartDescriptor.a.d.size() > 0) {
                ory oryVar = playbackStartDescriptor.a;
                l = (String) oryVar.d.get(playbackStartDescriptor.b());
            } else {
                l = "";
            }
        }
        c(l, playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.i(), playbackStartDescriptor.y(), d, acvgVar);
        return d;
    }

    public final ankt a(PlaybackStartDescriptor playbackStartDescriptor) {
        return d(playbackStartDescriptor, null, -1);
    }

    public final ankt b(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        return d(playbackStartDescriptor, aijpVar != null ? aijpVar.b : null, aijpVar != null ? aijpVar.e : -1);
    }

    public final void c(String str, String str2, int i, String str3, byte[] bArr, afzf afzfVar, acvg acvgVar) {
        this.a.d(new ahhe());
        if (acvgVar != null) {
            acvgVar.c("wn_s");
        }
        abed a = this.c.a(str, str2, i, str3, bArr, new aimt(this.a, acvgVar));
        abeb abebVar = this.b;
        abebVar.b.k(a, aars.d, new aimq(this, afzfVar, acvgVar), abeb.e(abebVar.a, abebVar.c));
    }
}
