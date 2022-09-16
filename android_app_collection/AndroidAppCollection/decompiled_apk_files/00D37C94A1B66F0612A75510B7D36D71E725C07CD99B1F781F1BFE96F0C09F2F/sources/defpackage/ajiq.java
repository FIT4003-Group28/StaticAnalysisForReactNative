package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ajiq  reason: default package */
/* loaded from: classes.dex */
public final class ajiq implements aapu, ajij {
    public static final aoos a;
    public static final int b;
    public final axnm c;
    public final teb d;
    public final aadd e;
    public final Set f = Collections.synchronizedSet(new HashSet());
    public final AtomicReference g = new AtomicReference();
    final AtomicBoolean h = new AtomicBoolean(false);
    private final axnm i;

    static {
        aoos c = aoos.c();
        c.e(aqtl.b);
        c.e(avga.b);
        c.e(asly.b);
        c.e(auns.b);
        a = c;
        b = (aqtl.b.a() << 3) | 2;
    }

    public ajiq(axnm axnmVar, aadd aaddVar, teb tebVar, ajik ajikVar, axnm axnmVar2) {
        this.c = axnmVar;
        this.e = aaddVar;
        this.d = tebVar;
        synchronized (ajikVar.a) {
            ajikVar.a.add(this);
        }
        this.i = axnmVar2;
    }

    @Override // defpackage.ajij
    public final void a() {
        this.g.set(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = (defpackage.aqtl) r0.y(defpackage.aqtl.a.getParserForType(), defpackage.ajiq.a);
     */
    @Override // defpackage.aapu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void b(defpackage.afvm r17, defpackage.arbf r18, defpackage.arpa r19) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajiq.b(afvm, arbf, arpa):void");
    }

    public final ResourceLoader c() {
        return ((teo) this.i.get()).a();
    }

    public final boolean d() {
        return ((teo) this.i.get()).b();
    }

    public final boolean e() {
        return ((teo) this.i.get()).c();
    }
}
