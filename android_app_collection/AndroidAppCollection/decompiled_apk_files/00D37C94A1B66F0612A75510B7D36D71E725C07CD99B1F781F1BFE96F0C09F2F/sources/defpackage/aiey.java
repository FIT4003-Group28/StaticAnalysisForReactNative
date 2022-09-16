package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: aiey  reason: default package */
/* loaded from: classes.dex */
public final class aiey {
    private final aifg a;
    private final SparseArray e;
    private final aifa f;
    private final fgj i;
    private final Set b = new CopyOnWriteArraySet();
    private final Set c = new CopyOnWriteArraySet();
    private final Set d = new CopyOnWriteArraySet();
    private final aiex g = new aiex();
    private volatile aiev h = new aieo();

    static {
        zep.a("PlaybackQueueManager");
    }

    public aiey(aifg aifgVar, fgj fgjVar) {
        this.i = fgjVar;
        this.a = aifgVar;
        aifa aifaVar = new aifa();
        this.f = aifaVar;
        aifaVar.c(this.h);
        this.e = new SparseArray(2);
        int[] iArr = aiev.d;
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            aife aifeVar = new aife(i2);
            aifeVar.b(this.h);
            this.e.put(i2, aifeVar);
        }
        c(aifgVar);
        c(this.g);
        aiex aiexVar = this.g;
        this.c.add(aiexVar);
        this.h.g(aiexVar);
    }

    public final int a() {
        return this.h.c();
    }

    public final synchronized aiql b(PlaybackStartDescriptor playbackStartDescriptor) {
        aiep aiemVar;
        aifc aifcVar;
        if (this.h instanceof aiep) {
            aiemVar = (aiep) this.h;
        } else {
            aiemVar = new aiem(this.h, this.i);
        }
        aifcVar = new aifc(aiemVar, this.a);
        aiqk aiqkVar = null;
        if (!this.h.m(playbackStartDescriptor)) {
            aiqkVar = aifcVar.c(playbackStartDescriptor, null);
        }
        if (aiqkVar != null) {
            aifcVar.f(aiqkVar, aifcVar.a(aiqkVar));
        }
        return aifcVar;
    }

    public final void c(aiet aietVar) {
        this.d.add(aietVar);
        this.h.f(aietVar);
    }

    public final fgh d() {
        aiev aievVar = this.h;
        int c = aievVar.c();
        if (c != -1) {
            return aievVar.r(0, c);
        }
        return null;
    }

    public final synchronized void e(aiev aievVar) {
        if (this.h == aievVar) {
            return;
        }
        Object b = this.a.b();
        aiev aievVar2 = this.h;
        int a = a();
        fgh d = d();
        this.h = aievVar;
        this.f.c(this.h);
        int[] iArr = aiev.d;
        for (int i = 0; i < 2; i++) {
            ((aife) this.e.get(iArr[i])).b(this.h);
        }
        int a2 = a();
        fgh d2 = d();
        for (aieu aieuVar : this.c) {
            aievVar2.l(aieuVar);
            aievVar.g(aieuVar);
            if (a != a2) {
                aieuVar.d();
            }
        }
        boolean z = !akzj.f(d, d2);
        for (aiet aietVar : this.d) {
            aievVar2.k(aietVar);
            aievVar.f(aietVar);
            if (z) {
                aietVar.a(d2);
            }
        }
        this.a.d(d(), null, true);
        this.a.c(b);
        for (aiew aiewVar : this.b) {
            aiewVar.a();
        }
    }
}
