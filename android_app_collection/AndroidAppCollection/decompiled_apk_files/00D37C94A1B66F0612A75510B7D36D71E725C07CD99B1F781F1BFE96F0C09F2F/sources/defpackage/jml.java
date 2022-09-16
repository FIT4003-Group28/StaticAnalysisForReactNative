package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: jml  reason: default package */
/* loaded from: classes3.dex */
public final class jml {
    private final jmm a;

    public jml(jmm jmmVar) {
        this.a = jmmVar;
    }

    public final apke a(fcl fclVar, aqpa aqpaVar) {
        return (apke) g(fcl.class, apke.class, fclVar, amup.k("downloads_page_filter_type", Integer.valueOf(aqpaVar.e)));
    }

    public final aqtb b(awjm awjmVar) {
        return (aqtb) g(awjm.class, aqtb.class, awjmVar, null);
    }

    public final aqtb c(awjr awjrVar) {
        return (aqtb) g(awjr.class, aqtb.class, awjrVar, null);
    }

    public final ater d(agqo agqoVar, String str) {
        amup k;
        agqoVar.getClass();
        if (amps.e(str)) {
            k = null;
        } else {
            zgh.m(str);
            k = amup.k("downloaded_video_playlist_id", str);
        }
        return (ater) g(agqo.class, ater.class, agqoVar, k);
    }

    public final ater e(agqv agqvVar, String str) {
        amup k;
        agqvVar.getClass();
        if (amps.e(str)) {
            k = null;
        } else {
            zgh.m(str);
            k = amup.k("downloaded_video_playlist_id", str);
        }
        return (ater) g(agqv.class, ater.class, agqvVar, k);
    }

    public final Optional f(jbc jbcVar, String str, int i, String str2, aoob aoobVar) {
        jbcVar.getClass();
        return Optional.ofNullable((asgt) g(jbc.class, asgt.class, jbcVar, amup.n("downloaded_video_playlist_id", str, "downloaded_video_list_index", Integer.valueOf(i), "watch_command_params", str2, "watch_command_click_tracking_params", aoobVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Class r8, java.lang.Class r9, java.lang.Object r10, defpackage.amup r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r10 != 0) goto Lb
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r8 != r2) goto L9
            goto Lb
        L9:
            r2 = 0
            goto Lc
        Lb:
            r2 = 1
        Lc:
            java.lang.String r3 = "Passed in a null model."
            defpackage.aqxo.q(r2, r3)
            jmm r2 = r7.a
            jlt r3 = new jlt
            r3.<init>(r8, r9)
            java.util.Map r4 = r2.a
            boolean r4 = r4.containsKey(r3)
            r5 = 0
            if (r4 != 0) goto L23
        L21:
            r2 = r5
            goto L62
        L23:
            java.util.Map r2 = r2.a
            java.lang.Object r2 = r2.get(r3)
            jmf r2 = (defpackage.jmf) r2
            java.lang.Class r3 = r2.c()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L3f
            java.lang.Class r3 = r2.d()
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L62
        L3f:
            java.lang.Class r3 = r2.c()
            java.lang.Class r2 = r2.d()
            java.util.Locale r4 = java.util.Locale.ROOT
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r8 = defpackage.jmm.a(r8, r9)
            r6[r0] = r8
            java.lang.String r8 = defpackage.jmm.a(r3, r2)
            r6[r1] = r8
            java.lang.String r8 = "Type mismatch for OfflineModelToRendererGenerator object. Expected=%s, Actual=%s"
            java.lang.String r8 = java.lang.String.format(r4, r8, r6)
            defpackage.zep.b(r8)
            goto L21
        L62:
            if (r2 == 0) goto L69
            java.lang.Object r8 = r2.b(r10, r11)
            return r8
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jml.g(java.lang.Class, java.lang.Class, java.lang.Object, amup):java.lang.Object");
    }
}
