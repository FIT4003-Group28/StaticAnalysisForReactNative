package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aanr  reason: default package */
/* loaded from: classes.dex */
public final class aanr {
    public final Uri a;
    public final String b;
    public final Map c;
    public final AtomicReference d;
    public final ampq e;
    public PlayerConfigModel f;
    public String g;
    public VideoStreamingData h;
    public long i;
    public boolean j;
    public final boolean m;
    public String n;
    public String o;
    private atzv q;
    public int p = 1;
    public int k = -1;
    public int l = -1;

    public aanr(String str, long j, Uri uri, atzv atzvVar, boolean z, ampq ampqVar) {
        zgh.m(str);
        this.b = str;
        this.i = Math.max(j, 0L);
        this.a = uri;
        this.q = atzvVar;
        this.m = z;
        this.e = ampqVar;
        this.f = new PlayerConfigModel(atzvVar);
        this.d = new AtomicReference(aouw.ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE);
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put("Content-Type", "application/x-protobuf");
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aanr h(defpackage.aadd r8, defpackage.ampq r9, java.lang.String r10, long r11, defpackage.afmv r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aanr.h(aadd, ampq, java.lang.String, long, afmv, byte[]):aanr");
    }

    public final PlayerConfigModel a(PlayerConfigModel playerConfigModel, yrj yrjVar) {
        Iterable<athb> q;
        if (playerConfigModel == null || yrjVar == null) {
            return this.f;
        }
        long K = playerConfigModel.K();
        List U = playerConfigModel.U();
        if (!U.isEmpty()) {
            long j = Long.MAX_VALUE;
            if (K != Long.MAX_VALUE) {
                Integer valueOf = Integer.valueOf(yrjVar.a());
                if (!U.contains(valueOf)) {
                    return this.f;
                }
                if (this.f.U().contains(valueOf)) {
                    j = this.f.K();
                }
                if (j <= K) {
                    return this.f;
                }
                aopa createBuilder = atzv.a.createBuilder();
                atzv atzvVar = this.q;
                if ((atzvVar.b & 2) != 0) {
                    aqwu aqwuVar = atzvVar.e;
                    if (aqwuVar == null) {
                        aqwuVar = aqwu.b;
                    }
                    createBuilder.copyOnWrite();
                    atzv atzvVar2 = (atzv) createBuilder.instance;
                    aqwuVar.getClass();
                    atzvVar2.e = aqwuVar;
                    atzvVar2.b |= 2;
                }
                atzv atzvVar3 = this.q;
                if ((atzvVar3.c & 256) != 0) {
                    auzl auzlVar = atzvVar3.B;
                    if (auzlVar == null) {
                        auzlVar = auzl.a;
                    }
                    createBuilder.copyOnWrite();
                    atzv atzvVar4 = (atzv) createBuilder.instance;
                    auzlVar.getClass();
                    atzvVar4.B = auzlVar;
                    atzvVar4.c |= 256;
                }
                atzv atzvVar5 = this.q;
                if ((atzvVar5.b & 16384) != 0) {
                    apfz apfzVar = atzvVar5.k;
                    if (apfzVar == null) {
                        apfzVar = apfz.a;
                    }
                    createBuilder.copyOnWrite();
                    atzv atzvVar6 = (atzv) createBuilder.instance;
                    apfzVar.getClass();
                    atzvVar6.k = apfzVar;
                    atzvVar6.b |= 16384;
                }
                atzv atzvVar7 = this.q;
                if ((atzvVar7.b & 32768) != 0) {
                    atnv atnvVar = atzvVar7.l;
                    if (atnvVar == null) {
                        atnvVar = atnv.a;
                    }
                    createBuilder.copyOnWrite();
                    atzv atzvVar8 = (atzv) createBuilder.instance;
                    atnvVar.getClass();
                    atzvVar8.l = atnvVar;
                    atzvVar8.b |= 32768;
                }
                aopa createBuilder2 = aqke.b.createBuilder();
                atzv atzvVar9 = this.q;
                if ((atzvVar9.c & 64) != 0) {
                    aqke aqkeVar = atzvVar9.z;
                    if (aqkeVar == null) {
                        aqkeVar = aqke.b;
                    }
                    boolean z = aqkeVar.f;
                    createBuilder2.copyOnWrite();
                    aqke aqkeVar2 = (aqke) createBuilder2.instance;
                    aqkeVar2.c |= 4;
                    aqkeVar2.f = z;
                }
                createBuilder2.copyOnWrite();
                aqke aqkeVar3 = (aqke) createBuilder2.instance;
                aqkeVar3.c |= 1;
                aqkeVar3.d = K;
                atzv atzvVar10 = playerConfigModel.c;
                if ((atzvVar10.c & 64) == 0) {
                    q = amuk.q();
                } else {
                    aqke aqkeVar4 = atzvVar10.z;
                    if (aqkeVar4 == null) {
                        aqkeVar4 = aqke.b;
                    }
                    q = new aops(aqkeVar4.e, aqke.a);
                }
                createBuilder2.copyOnWrite();
                aqke aqkeVar5 = (aqke) createBuilder2.instance;
                aopq aopqVar = aqkeVar5.e;
                if (!aopqVar.c()) {
                    aqkeVar5.e = aopi.mutableCopy(aopqVar);
                }
                for (athb athbVar : q) {
                    aqkeVar5.e.g(athbVar.n);
                }
                createBuilder.copyOnWrite();
                atzv atzvVar11 = (atzv) createBuilder.instance;
                aqke aqkeVar6 = (aqke) createBuilder2.mo39build();
                aqkeVar6.getClass();
                atzvVar11.z = aqkeVar6;
                atzvVar11.c |= 64;
                return new PlayerConfigModel((atzv) createBuilder.mo39build());
            }
        }
        return this.f;
    }

    public final aouw b() {
        return (aouw) this.d.get();
    }

    public final void c(VideoStreamingData videoStreamingData) {
        this.p = 2;
        this.h = videoStreamingData;
    }

    public final void d(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        this.p = 2;
        this.h = videoStreamingData;
        this.f = playerConfigModel;
        this.q = playerConfigModel.c;
    }

    public final void e(long j) {
        this.i = Math.max(j, 0L);
    }

    public final void f(String str) {
        zgh.m(str);
        this.g = str;
    }

    public final boolean g() {
        return this.p == 2;
    }

    public final void i() {
        this.j = true;
    }
}
