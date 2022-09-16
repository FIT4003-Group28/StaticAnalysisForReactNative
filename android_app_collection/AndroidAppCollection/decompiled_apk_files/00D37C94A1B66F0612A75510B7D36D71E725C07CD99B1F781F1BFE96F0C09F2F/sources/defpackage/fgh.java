package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: fgh  reason: default package */
/* loaded from: classes3.dex */
public final class fgh {
    private final Object a;
    private apzg b;
    private PlaybackStartDescriptor c;

    public fgh(UUID uuid, PlaybackStartDescriptor playbackStartDescriptor) {
        this(uuid, etk.g(playbackStartDescriptor));
        this.c = playbackStartDescriptor;
    }

    public final synchronized PlaybackStartDescriptor a() {
        if (this.c == null) {
            apzg apzgVar = this.b;
            aijl d = PlaybackStartDescriptor.d();
            d.a = apzgVar;
            this.c = d.a();
        }
        return this.c;
    }

    public final synchronized apzg b() {
        return this.b;
    }

    public final String c() {
        return a().l();
    }

    public final synchronized void d(apzg apzgVar) {
        if (akzj.f(this.b, apzgVar)) {
            return;
        }
        this.b = apzgVar;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgh)) {
            return false;
        }
        return this.a.equals(((fgh) fgh.class.cast(obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public fgh(UUID uuid, apzg apzgVar) {
        this.a = uuid;
        apzgVar.getClass();
        d(apzgVar);
    }
}
