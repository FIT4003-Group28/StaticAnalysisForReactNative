package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ahvp  reason: default package */
/* loaded from: classes.dex */
abstract class ahvp implements yiw {
    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Couldn't retrieve annotation image from [uri=");
        sb.append(valueOf);
        sb.append("]");
        zep.l(sb.toString());
    }
}
