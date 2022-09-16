package defpackage;

import android.media.MediaDrm;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: oxe  reason: default package */
/* loaded from: classes4.dex */
public final class oxe {
    public final MediaDrm a;

    public oxe(UUID uuid) {
        pce.a(uuid);
        this.a = new MediaDrm(uuid);
    }

    public final void a(owz owzVar) {
        this.a.setOnEventListener(owzVar == null ? null : new oxb(owzVar));
    }

    public final void b(String str, String str2) {
        this.a.setPropertyString(str, str2);
    }
}
