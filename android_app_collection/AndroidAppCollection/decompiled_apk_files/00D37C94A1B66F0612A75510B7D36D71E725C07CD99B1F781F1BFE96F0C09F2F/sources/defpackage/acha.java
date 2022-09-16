package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acha  reason: default package */
/* loaded from: classes.dex */
public final class acha implements ynl {
    final /* synthetic */ LiveCreationActivity a;

    public acha(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                wgg wggVar = wgg.STARTED;
                int ordinal = ((wgh) obj).a().ordinal();
                if (ordinal != 1 && ordinal != 2) {
                    return null;
                }
                if (this.a.k.t()) {
                    this.a.w();
                    return null;
                }
                zag.q(this.a, R.string.lc_not_signed_in, 0);
                this.a.finish();
                return null;
            } else if (i == 1) {
                ampq f = ((aabj) obj).f();
                if (!((Boolean) f.b(aapz.n).e(false)).booleanValue()) {
                    return null;
                }
                LiveCreationActivity liveCreationActivity = this.a;
                arag aragVar = ((atpl) f.c()).c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                zag.r(liveCreationActivity, ajgl.b(aragVar), 0);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{wgh.class, aabj.class};
    }
}
