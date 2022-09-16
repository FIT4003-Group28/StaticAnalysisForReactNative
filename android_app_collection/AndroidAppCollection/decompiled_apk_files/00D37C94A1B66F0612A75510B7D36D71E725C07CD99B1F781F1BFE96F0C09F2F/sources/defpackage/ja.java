package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ja  reason: default package */
/* loaded from: classes3.dex */
public final class ja {
    public static void A(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof kf) {
            ((kf) viewParent).c(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static void B(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof kf) {
            ((kf) viewParent).d(view, i);
        } else if (i != 0) {
        } else {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static boolean C(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean D(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static boolean E(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof kf) {
            return ((kf) viewParent).e(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static int F(byte[] bArr) {
        bca G = G(bArr);
        if (G == null) {
            return -1;
        }
        return G.b;
    }

    public static bca G(byte[] bArr) {
        pwu pwuVar = new pwu(bArr);
        if (pwuVar.c < 32) {
            return null;
        }
        pwuVar.G(0);
        if (pwuVar.d() != pwuVar.a() + 4 || pwuVar.d() != 1886614376) {
            return null;
        }
        int f = bbl.f(pwuVar.d());
        if (f > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(f);
            Log.w("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(pwuVar.o(), pwuVar.o());
        if (f == 1) {
            pwuVar.H(pwuVar.l() * 16);
        }
        int l = pwuVar.l();
        if (l != pwuVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[l];
        pwuVar.B(bArr2, 0, l);
        return new bca(uuid, f, bArr2);
    }

    public static byte[] H(byte[] bArr, UUID uuid) {
        bca G = G(bArr);
        if (G == null) {
            return null;
        }
        if (uuid.equals(G.a)) {
            return G.c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(G.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
        sb.append("UUID mismatch. Expected: ");
        sb.append(valueOf);
        sb.append(", got: ");
        sb.append(valueOf2);
        sb.append(".");
        Log.w("PsshAtomUtil", sb.toString());
        return null;
    }

    public static int I(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static bad J(pwu pwuVar, boolean z, boolean z2) {
        if (z) {
            K(3, pwuVar, false);
        }
        pwuVar.v((int) pwuVar.n()).length();
        long n = pwuVar.n();
        String[] strArr = new String[(int) n];
        for (int i = 0; i < n; i++) {
            String v = pwuVar.v((int) pwuVar.n());
            strArr[i] = v;
            v.length();
        }
        if (!z2 || (pwuVar.i() & 1) != 0) {
            return new bad(strArr);
        }
        throw pjq.a("framing bit expected to be set", null);
    }

    public static float a(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    public static int b(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    public static int c(PlaybackState playbackState) {
        return playbackState.getState();
    }

    public static long d(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    public static long e(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    public static long f(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    public static long g(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    public static long h(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState.Builder i() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState.CustomAction.Builder j(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState.CustomAction k(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState l(PlaybackState.Builder builder) {
        return builder.build();
    }

    public static Bundle m(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    public static CharSequence n(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    public static CharSequence o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    public static String p(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    public static List q(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }

    public static void y(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof kf) {
            ((kf) viewParent).ko(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void z(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof kg) {
            ((kg) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof kf) {
            ((kf) viewParent).kp(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static boolean K(int i, pwu pwuVar, boolean z) {
        if (pwuVar.a() < 7) {
            if (z) {
                return false;
            }
            int a = pwuVar.a();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(a);
            throw pjq.a(sb.toString(), null);
        } else if (pwuVar.i() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw pjq.a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), null);
        } else if (pwuVar.i() == 118 && pwuVar.i() == 111 && pwuVar.i() == 114 && pwuVar.i() == 98 && pwuVar.i() == 105 && pwuVar.i() == 115) {
            return true;
        } else {
            if (!z) {
                throw pjq.a("expected characters 'vorbis'", null);
            }
            return false;
        }
    }
}
