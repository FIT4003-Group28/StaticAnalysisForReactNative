package defpackage;

import android.util.LruCache;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: igh  reason: default package */
/* loaded from: classes3.dex */
public final class igh implements ifl {
    public final ifn a;
    final LruCache b;
    private final ihp c;
    private final amqo d;
    private final aanz e;
    private final Executor f;
    private final ayor g;
    private final snc h;

    public igh(ihp ihpVar, ifn ifnVar, ifm ifmVar, amqo amqoVar, aanz aanzVar, Executor executor, ayor ayorVar, snc sncVar) {
        this.c = ihpVar;
        this.a = ifnVar;
        this.d = amqoVar;
        this.e = aanzVar;
        this.f = executor;
        this.g = ayorVar;
        this.h = sncVar;
        ifmVar.getClass();
        ifmVar.a(this);
        this.b = new LruCache(64);
    }

    public static final ihn a(apzg apzgVar, ihp ihpVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        aopa createBuilder = asag.a.createBuilder();
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 32) != 0) {
            String str = reelWatchEndpointOuterClass$ReelWatchEndpoint.g;
            createBuilder.copyOnWrite();
            asag asagVar = (asag) createBuilder.instance;
            str.getClass();
            asagVar.b |= 2048;
            asagVar.k = str;
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 2) != 0) {
            String str2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.d;
            createBuilder.copyOnWrite();
            asag asagVar2 = (asag) createBuilder.instance;
            str2.getClass();
            asagVar2.b |= 2;
            asagVar2.d = str2;
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0) {
            String str3 = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
            createBuilder.copyOnWrite();
            asag asagVar3 = (asag) createBuilder.instance;
            str3.getClass();
            asagVar3.b |= 256;
            asagVar3.i = str3;
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 16) != 0) {
            int i = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
            createBuilder.copyOnWrite();
            asag asagVar4 = (asag) createBuilder.instance;
            asagVar4.b |= 512;
            asagVar4.j = i;
        }
        ihn ihnVar = new ihn(ihpVar.e, ihpVar.a.c());
        int i2 = 1;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 1) != 0) {
            int bH = awwc.bH(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
            if (bH != 0) {
                i2 = bH;
            }
            ihnVar.c = i2;
        }
        ihnVar.d = createBuilder;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 16384) != 0) {
            ihnVar.a = reelWatchEndpointOuterClass$ReelWatchEndpoint.o;
        }
        ihnVar.j(apzgVar.c);
        return ihnVar;
    }

    public static void c(LruCache lruCache) {
        synchronized (lruCache) {
            for (igg iggVar : lruCache.snapshot().values()) {
                ige igeVar = iggVar.a;
                if (igeVar != null) {
                    igeVar.i = true;
                }
            }
            lruCache.evictAll();
        }
    }

    @Override // defpackage.ifl
    public final void aS(arqn arqnVar, arqo arqoVar) {
        b();
    }

    public final void b() {
        c(this.b);
    }

    public final void d(apzg apzgVar, String str, boolean z, boolean z2, afzf afzfVar) {
        e(apzgVar, str, z, z2, afzfVar, afzj.a);
    }

    public final void e(apzg apzgVar, String str, boolean z, boolean z2, afzf afzfVar, afzf afzfVar2) {
        f(apzgVar, str, z, z2, false, afzfVar, afzfVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Type inference failed for: r1v5, types: [afzf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(final defpackage.apzg r28, final java.lang.String r29, boolean r30, boolean r31, boolean r32, defpackage.afzf r33, defpackage.afzf r34) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igh.f(apzg, java.lang.String, boolean, boolean, boolean, afzf, afzf):void");
    }
}
