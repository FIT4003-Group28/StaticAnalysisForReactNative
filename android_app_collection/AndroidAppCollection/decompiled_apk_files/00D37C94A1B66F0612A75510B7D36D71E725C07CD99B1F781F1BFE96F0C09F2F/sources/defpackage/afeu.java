package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
/* compiled from: PG */
/* renamed from: afeu  reason: default package */
/* loaded from: classes.dex */
public final class afeu {
    public static int a(List list, long j, long j2, ampt amptVar) {
        afes afesVar;
        int size = list.size();
        for (int i = 1; i < size; i++) {
            afet afetVar = (afet) list.get(i);
            if (afetVar.b - j >= j2 && (afesVar = afetVar.a) != null && amptVar.a(afesVar)) {
                return i;
            }
        }
        return size;
    }

    public static boolean b(adzz adzzVar, afes afesVar, String str, PlayerConfigModel playerConfigModel, boolean z, long j) {
        return adzzVar != null && !TextUtils.isEmpty(str) && !playerConfigModel.Z() && z && adzzVar.e(str, afesVar.d(), j, 0, 0, 0);
    }

    public static boolean c(adzz adzzVar, String str, PlayerConfigModel playerConfigModel, afes afesVar) {
        return adzzVar == null || TextUtils.isEmpty(str) || ovm.a(afesVar.d()) == -1 || playerConfigModel.Z() || adzzVar.e(str, afesVar.d(), 0L, 1, 3, 3);
    }

    public static boolean d(VideoStreamingData videoStreamingData, boolean z) {
        if (videoStreamingData != null) {
            return (videoStreamingData.equals(VideoStreamingData.a) || (!videoStreamingData.p.isEmpty() && !videoStreamingData.v)) && !z;
        }
        return false;
    }

    public static final long f(String str, int i) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final aenb g(aenc aencVar) {
        return new aemx(aencVar);
    }

    private static boolean h(afjz afjzVar, PlayerConfigModel playerConfigModel, boolean z) {
        aanu aanuVar = aanu.DEFAULT;
        int ordinal = afjzVar.ar().ordinal();
        return ordinal != 0 ? ordinal == 5 : z && playerConfigModel.aG();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.afnk e(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r1, defpackage.afnh r2, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r3, defpackage.afjz r4, int r5, boolean r6, boolean r7, boolean r8) {
        /*
            if (r3 == 0) goto La0
            if (r1 != 0) goto L6
            goto La0
        L6:
            if (r2 == 0) goto L20
            if (r8 == 0) goto L20
            afnk r8 = r2.C()
            afnk r0 = defpackage.afnk.GL_GVR
            if (r8 == r0) goto L1a
            afnk r8 = r2.C()
            afnk r0 = defpackage.afnk.YUV_SURFACE
            if (r8 != r0) goto L20
        L1a:
            afnk r1 = r2.C()
            goto La9
        L20:
            r2 = 0
            r8 = 1
            if (r7 != 0) goto L4b
            aanv r7 = r1.i()
            aanv r0 = defpackage.aanv.RECTANGULAR_2D
            if (r7 != r0) goto L4b
            aanv r7 = r1.i()
            boolean r7 = r3.ar(r7)
            if (r7 != 0) goto L4b
            atzv r7 = r3.c
            aqwu r7 = r7.e
            if (r7 != 0) goto L3e
            aqwu r7 = defpackage.aqwu.b
        L3e:
            int r7 = r7.aA
            int r7 = defpackage.awwc.bu(r7)
            if (r7 != 0) goto L48
        L46:
            r7 = 0
            goto L4c
        L48:
            r0 = 2
            if (r7 != r0) goto L46
        L4b:
            r7 = 1
        L4c:
            r0 = 4
            if (r5 != r0) goto L50
            r2 = 1
        L50:
            if (r2 == 0) goto L61
            boolean r8 = r3.aG()
            if (r8 != 0) goto L61
            if (r7 != 0) goto L61
            boolean r8 = r1.v
            if (r8 != 0) goto L61
            afnk r1 = defpackage.afnk.YUV_SURFACE
            goto La9
        L61:
            atzv r8 = r3.c
            aqwu r8 = r8.e
            if (r8 != 0) goto L69
            aqwu r8 = defpackage.aqwu.b
        L69:
            boolean r8 = r8.Q
            if (r8 == 0) goto L7e
            if (r7 != 0) goto L7e
            boolean r8 = h(r4, r3, r2)
            if (r8 == 0) goto L7e
            boolean r8 = d(r1, r6)
            if (r8 == 0) goto L7e
            afnk r1 = defpackage.afnk.GL_VPX
            goto La9
        L7e:
            boolean r2 = h(r4, r3, r2)
            if (r2 != 0) goto L86
            if (r7 == 0) goto L8f
        L86:
            boolean r2 = d(r1, r6)
            if (r2 == 0) goto L8f
            afnk r1 = defpackage.afnk.GL_GVR
            goto La9
        L8f:
            r2 = 8
            if (r5 != r2) goto L96
            afnk r1 = defpackage.afnk.GL_VPX
            goto La9
        L96:
            boolean r1 = r1.v
            if (r1 == 0) goto L9d
            afnk r1 = defpackage.afnk.SECURE_SURFACE
            goto La9
        L9d:
            afnk r1 = defpackage.afnk.SURFACE
            goto La9
        La0:
            if (r2 == 0) goto La7
            afnk r1 = r2.C()
            goto La9
        La7:
            afnk r1 = defpackage.afmy.a
        La9:
            afnk r2 = defpackage.afnk.SURFACE
            if (r1 != r2) goto Lc3
            boolean r2 = r4.al()
            if (r2 != 0) goto Lc1
            if (r3 == 0) goto Lc3
            atzv r2 = r3.c
            aqwu r2 = r2.e
            if (r2 != 0) goto Lbd
            aqwu r2 = defpackage.aqwu.b
        Lbd:
            boolean r2 = r2.bn
            if (r2 == 0) goto Lc3
        Lc1:
            afnk r1 = defpackage.afnk.SECURE_SURFACE
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afeu.e(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, afnh, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjz, int, boolean, boolean, boolean):afnk");
    }
}
