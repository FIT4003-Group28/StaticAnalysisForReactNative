package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abxq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abxq {
    public final /* synthetic */ abyk a;
    public final /* synthetic */ abyh b;

    public /* synthetic */ abxq(abyk abykVar, abyh abyhVar) {
        this.a = abykVar;
        this.b = abyhVar;
    }

    public final void a(int i, boolean z) {
        abyk abykVar = this.a;
        abyh abyhVar = this.b;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Error updating mic for live capture: status=");
            sb.append(i);
            sb.append(", isMicEnabled=");
            sb.append(z);
            zep.b(sb.toString());
            if (abykVar.U) {
                abykVar.g.d(2, abykVar.P, abykVar.u.getString(R.string.lc_error_mute_failed), false);
            }
        }
        abyhVar.a(z);
        abykVar.A = z;
    }
}
