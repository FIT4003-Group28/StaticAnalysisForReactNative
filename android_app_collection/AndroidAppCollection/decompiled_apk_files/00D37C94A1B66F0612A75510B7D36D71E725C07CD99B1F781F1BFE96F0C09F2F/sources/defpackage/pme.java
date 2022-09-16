package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pme  reason: default package */
/* loaded from: classes4.dex */
public final class pme {
    public final Handler a = new Handler();
    public final AudioTrack.StreamEventCallback b = new pmd(this);
    final /* synthetic */ pmf c;

    public pme(pmf pmfVar) {
        this.c = pmfVar;
    }
}
