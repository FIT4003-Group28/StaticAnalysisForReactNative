package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clsm  reason: default package */
/* loaded from: classes5.dex */
public final class clsm {
    public final Handler a = new Handler();
    public final AudioTrack.StreamEventCallback b = new clsl(this);
    final /* synthetic */ clsn c;

    public clsm(clsn clsnVar) {
        this.c = clsnVar;
    }
}
