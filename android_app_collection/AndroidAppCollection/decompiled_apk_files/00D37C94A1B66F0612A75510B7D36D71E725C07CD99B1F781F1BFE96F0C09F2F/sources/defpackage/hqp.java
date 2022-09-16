package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelPlayerOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: hqp  reason: default package */
/* loaded from: classes3.dex */
public final class hqp {
    public static final Bitmap A(long j, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return mediaMetadataRetriever.getFrameAtTime(j);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final void B(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            mediaMetadataRetriever.release();
        } catch (RuntimeException unused) {
        }
    }

    public static final void C(int i, String str) {
        afus.c(i, 24, str, new Exception());
    }

    public static apjf a(aulr aulrVar) {
        if ((aulrVar.b & 1024) != 0) {
            aunb aunbVar = aulrVar.m;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(AutoplayRendererOuterClass.autoplayEndpointRenderer)) {
                return null;
            }
            aunb aunbVar2 = aulrVar.m;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (apjf) aunbVar2.qm(AutoplayRendererOuterClass.autoplayEndpointRenderer);
        }
        return null;
    }

    public static apoj b(boolean z, aunb aunbVar) {
        if (!z || aunbVar == null || !aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            return null;
        }
        return (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
    }

    public static asov c(boolean z, asow asowVar) {
        if (!z || asowVar == null || (asowVar.b & 1) == 0) {
            return null;
        }
        asov asovVar = asowVar.c;
        return asovVar == null ? asov.a : asovVar;
    }

    public static aulr d(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
            aunb aunbVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.j;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ReelPlayerOverlayRendererOuterClass.reelPlayerOverlayRenderer)) {
                return null;
            }
            aunb aunbVar2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.j;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (aulr) aunbVar2.qm(ReelPlayerOverlayRendererOuterClass.reelPlayerOverlayRenderer);
        }
        return null;
    }

    public static aulv e(aulr aulrVar) {
        if (aulrVar != null && (aulrVar.b & 2097152) != 0) {
            aunb aunbVar = aulrVar.w;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ReelPlayerOverlayRendererOuterClass.reelPlayerPersistentEducationRenderer)) {
                aunb aunbVar2 = aulrVar.w;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                return (aulv) aunbVar2.qm(ReelPlayerOverlayRendererOuterClass.reelPlayerPersistentEducationRenderer);
            }
        }
        return null;
    }

    public static ReelWatchEndpointOuterClass$ReelWatchEndpoint f(PlaybackStartDescriptor playbackStartDescriptor) {
        apzg apzgVar;
        if (playbackStartDescriptor == null || (apzgVar = playbackStartDescriptor.b) == null || !apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return null;
        }
        return (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
    }

    public static boolean g(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null || (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 65536) == 0) {
            return false;
        }
        auku aukuVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.q;
        if (aukuVar == null) {
            aukuVar = auku.a;
        }
        return aukuVar.b;
    }

    public static boolean h(artv artvVar) {
        aulr aulrVar = null;
        if (artvVar != null) {
            auls aulsVar = artvVar.d;
            if (aulsVar == null) {
                aulsVar = auls.a;
            }
            if ((aulsVar.b & 1) != 0) {
                auls aulsVar2 = artvVar.d;
                if (aulsVar2 == null) {
                    aulsVar2 = auls.a;
                }
                aulrVar = aulsVar2.c;
                if (aulrVar == null) {
                    aulrVar = aulr.a;
                }
            }
        }
        if (aulrVar == null || (artvVar.b & 4) == 0) {
            return false;
        }
        asaj asajVar = artvVar.e;
        if (asajVar == null) {
            asajVar = asaj.a;
        }
        if ((asajVar.b & 4) == 0) {
            return false;
        }
        asaj asajVar2 = artvVar.e;
        if (asajVar2 == null) {
            asajVar2 = asaj.a;
        }
        asaa asaaVar = asajVar2.f;
        if (asaaVar == null) {
            asaaVar = asaa.a;
        }
        int cj = awwc.cj(asaaVar.c);
        return (cj == 0 || cj != 6 || (aulrVar.b & 134217728) == 0) ? false : true;
    }

    public static boolean i(aulv aulvVar) {
        int bB;
        return (aulvVar == null || (aulvVar.b & 8) == 0 || (bB = awwc.bB(aulvVar.f)) == 0 || bB != 3) ? false : true;
    }

    public static boolean j(aulr aulrVar) {
        if (aulrVar == null || (aulrVar.b & 4096) == 0) {
            return false;
        }
        int bC = awwc.bC(aulrVar.o);
        if (bC == 0) {
            bC = 1;
        }
        return r(bC);
    }

    public static boolean k(PlaybackStartDescriptor playbackStartDescriptor) {
        int bH;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint f = f(playbackStartDescriptor);
        return (f == null || (bH = awwc.bH(f.c)) == 0 || bH != 3) ? false : true;
    }

    public static boolean l(apzg apzgVar) {
        return n((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
    }

    public static boolean m(aulr aulrVar) {
        int i = 0;
        if (aulrVar != null && (aulrVar.b & 4096) != 0 && (i = awwc.bC(aulrVar.o)) == 0) {
            i = 1;
        }
        return s(i);
    }

    public static boolean n(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return m(d(reelWatchEndpointOuterClass$ReelWatchEndpoint));
    }

    public static boolean o(aulr aulrVar) {
        if (aulrVar == null) {
            return false;
        }
        int bC = awwc.bC(aulrVar.o);
        if (bC == 0) {
            bC = 1;
        }
        return bC == 2 || bC == 3 || bC == 4 || bC == 6 || bC == 8 || bC == 10 || bC == 11 || bC == 1;
    }

    public static boolean p(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        aulr d = d(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        int i = 1;
        if (d != null) {
            int i2 = d.b;
            if ((1048576 & i2) != 0) {
                int bD = awwc.bD(d.v);
                return bD != 0 && bD == 3;
            } else if ((i2 & 4096) != 0) {
                int bC = awwc.bC(d.o);
                if (bC != 0) {
                    i = bC;
                }
                return t(i);
            }
        }
        return true;
    }

    public static int q(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        aulr d = d(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (d == null || (d.b & 4096) == 0) {
            return 0;
        }
        int bC = awwc.bC(d.o);
        if (bC != 0) {
            return bC;
        }
        return 1;
    }

    public static boolean r(int i) {
        return i == 12;
    }

    public static boolean s(int i) {
        return i == 5 || i == 7 || i == 9 || i == 12;
    }

    public static boolean t(int i) {
        return i == 6 || i == 8 || i == 10 || i == 11 || i == 7 || i == 9 || i == 12;
    }

    public static PlaybackStartDescriptor u(PlaybackStartDescriptor playbackStartDescriptor, int i) {
        apzg apzgVar = playbackStartDescriptor.b;
        if (apzgVar == null) {
            return playbackStartDescriptor;
        }
        aopa y = y(apzgVar);
        y.copyOnWrite();
        atnp atnpVar = (atnp) y.instance;
        atnp atnpVar2 = atnp.a;
        atnpVar.b |= 2;
        atnpVar.d = i;
        aijl e = playbackStartDescriptor.e();
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopcVar.e(atno.b, (atnp) y.mo39build());
        e.a = (apzg) aopcVar.mo39build();
        e.f = playbackStartDescriptor.s();
        e.e = playbackStartDescriptor.r();
        PlaybackStartDescriptor a = e.a();
        a.o(playbackStartDescriptor);
        return a;
    }

    public static aoob v(aunb aunbVar) {
        apoj apojVar = (aunbVar == null || !aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) ? null : (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        if (apojVar == null || (apojVar.b & 1048576) == 0) {
            return null;
        }
        return apojVar.t;
    }

    public static atnp w(apzg apzgVar) {
        if (apzgVar != null && apzgVar.qn(atno.b)) {
            return (atnp) apzgVar.qm(atno.b);
        }
        return null;
    }

    public static aulr x(artv artvVar) {
        if ((artvVar.b & 2) != 0) {
            auls aulsVar = artvVar.d;
            if (aulsVar == null) {
                aulsVar = auls.a;
            }
            if ((aulsVar.b & 1) == 0) {
                return null;
            }
            auls aulsVar2 = artvVar.d;
            if (aulsVar2 == null) {
                aulsVar2 = auls.a;
            }
            aulr aulrVar = aulsVar2.c;
            return aulrVar == null ? aulr.a : aulrVar;
        }
        return null;
    }

    public static aopa y(apzg apzgVar) {
        if (!apzgVar.qn(atno.b)) {
            return atnp.a.createBuilder();
        }
        return ((atnp) apzgVar.qm(atno.b)).mo52toBuilder();
    }

    public static final void z(Uri uri, MediaMetadataRetriever mediaMetadataRetriever, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                    try {
                        openAssetFileDescriptor.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (RuntimeException e) {
                    B(mediaMetadataRetriever);
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                try {
                    openAssetFileDescriptor.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("openAssetFileDescriptor returned null for ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }
}
