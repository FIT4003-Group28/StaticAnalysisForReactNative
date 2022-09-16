package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: fgj  reason: default package */
/* loaded from: classes3.dex */
public final class fgj {
    public final ymx a;
    private final Random b = new Random();
    private final List c;

    public fgj() {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = new ymx();
        arrayList.add(new fgi(this));
    }

    private final UUID d() {
        return new UUID(this.b.nextLong(), this.b.nextLong());
    }

    private final synchronized UUID e(apzg apzgVar) {
        Iterator it = this.c.iterator();
        UUID uuid = null;
        while (it.hasNext() && (uuid = (UUID) ((fgi) it.next()).a.a.get(apzgVar)) == null) {
        }
        if (uuid == null) {
            UUID d = d();
            a(apzgVar, d);
            return d;
        }
        return uuid;
    }

    public final synchronized void a(apzg apzgVar, UUID uuid) {
        for (fgi fgiVar : this.c) {
            fgiVar.a.a.put(apzgVar, uuid);
        }
    }

    public final synchronized fgh b(PlaybackStartDescriptor playbackStartDescriptor) {
        apzg apzgVar = playbackStartDescriptor.b;
        if (apzgVar == null) {
            return new fgh(d(), playbackStartDescriptor);
        }
        return new fgh(e(apzgVar), playbackStartDescriptor);
    }

    public final fgh c(apzg apzgVar) {
        apzgVar.getClass();
        return new fgh(e(apzgVar), apzgVar);
    }
}
