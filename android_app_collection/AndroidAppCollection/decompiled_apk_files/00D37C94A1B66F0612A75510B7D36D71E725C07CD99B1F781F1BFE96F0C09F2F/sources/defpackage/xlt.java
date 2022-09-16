package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
/* compiled from: PG */
/* renamed from: xlt  reason: default package */
/* loaded from: classes4.dex */
public final class xlt {
    public final Context a;
    public final aafo b;
    public final xxx c;
    public final yzj d;
    public final xyb e;
    public final ajgz f;

    public xlt(Context context, aafo aafoVar, xxx xxxVar, yzj yzjVar, xyb xybVar, ajgz ajgzVar) {
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        xxxVar.getClass();
        this.c = xxxVar;
        yzjVar.getClass();
        this.d = yzjVar;
        xybVar.getClass();
        this.e = xybVar;
        ajgzVar.getClass();
        this.f = ajgzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r4 != defpackage.aqal.COMMENT_POLL_STATUS_NO_VOTE) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r9, defpackage.aufe r10, com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlt.b(java.lang.String, aufe, com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction):void");
    }

    public final void a(xmd xmdVar, aufe aufeVar, aufc aufcVar, aqal aqalVar, acti actiVar) {
        apzg apzgVar;
        if (aufcVar.d) {
            apzgVar = aufcVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = aufcVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        if (apzgVar == null && (apzgVar = aufcVar.e) == null) {
            apzgVar = apzg.a;
        }
        aopa createBuilder = UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a.createBuilder();
        if ((aufeVar.b & 32) != 0) {
            arag aragVar = aufeVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            createBuilder.copyOnWrite();
            UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
            aragVar.getClass();
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.d = aragVar;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.b |= 4;
        }
        createBuilder.copyOnWrite();
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction2 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction2.b |= 8;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction2.e = -1;
        int i = 0;
        while (true) {
            if (i >= aufeVar.f.size()) {
                break;
            } else if (((aufc) aufeVar.f.get(i)).d) {
                createBuilder.copyOnWrite();
                UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction3 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.b |= 8;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.e = i;
                break;
            } else {
                i++;
            }
        }
        if (aqalVar != null) {
            createBuilder.copyOnWrite();
            UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction4 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.c = aqalVar.f;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.b |= 2;
        }
        afw afwVar = new afw(2);
        afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new xlr(this, xmdVar, (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.mo39build(), aufeVar));
        afwVar.put("com.google.android.libraries.youtube.comment.action_tag", new xls(this, xmdVar, aufeVar));
        if (actiVar != null && (aufeVar.b & 16) != 0) {
            actiVar.H(3, new acte(aufeVar.g.I()), null);
        }
        this.b.c(apzgVar, afwVar);
    }
}
