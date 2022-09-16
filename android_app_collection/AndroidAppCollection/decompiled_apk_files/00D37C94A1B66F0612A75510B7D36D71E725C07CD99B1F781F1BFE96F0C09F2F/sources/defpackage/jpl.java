package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: jpl  reason: default package */
/* loaded from: classes3.dex */
public final class jpl extends ahbb {
    private final jpu f;
    private final ahcf g;
    private final jnn h;
    private final axxa i;

    public jpl(Activity activity, afvn afvnVar, agrf agrfVar, afwc afwcVar, yzj yzjVar, yrj yrjVar, agvq agvqVar, ahcz ahczVar, ahcf ahcfVar, ahcd ahcdVar, yzv yzvVar, jpu jpuVar, agvw agvwVar, aghg aghgVar, ahdf ahdfVar, jnn jnnVar, axxa axxaVar) {
        super(activity, afvnVar, agrfVar, afwcVar, yzjVar, yrjVar, agvqVar, ahczVar, ahcfVar, ahcdVar, yzvVar, agvwVar, aghgVar, ahdfVar);
        this.f = jpuVar;
        this.g = ahcfVar;
        this.h = jnnVar;
        this.i = axxaVar;
    }

    @Override // defpackage.ahbb, defpackage.ahce
    public final void a(String str, ahbt ahbtVar) {
        super.a(str, ahbtVar);
        if (!ahbtVar.a) {
            this.f.d(R.string.offline_actions_playlist_deleted_snackbar_text);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahbb
    public final void b(final String str, final attp attpVar, final acti actiVar, atpy atpyVar) {
        byte[] bArr;
        attl u;
        atpx atpxVar;
        byte[] bArr2;
        attl attlVar;
        if ((attpVar.b & 128) != 0) {
            bArr = attpVar.i.I();
        } else {
            bArr = aadi.b;
        }
        final byte[] bArr3 = bArr;
        this.h.k(atpyVar);
        if (this.h.m(attpVar, atpyVar)) {
            this.g.d(attpVar, actiVar, new ahdc() { // from class: jpk
                @Override // defpackage.ahdc
                public final void a(attl attlVar2, atpx atpxVar2) {
                    jpl jplVar = jpl.this;
                    attp attpVar2 = attpVar;
                    acti actiVar2 = actiVar;
                    String str2 = str;
                    byte[] bArr4 = bArr3;
                    ahdq.f(attpVar2, actiVar2, null, str2, attlVar2, false, agqn.OFFLINE_IMMEDIATELY, atpxVar2);
                    jplVar.k(str2, attlVar2, agqn.OFFLINE_IMMEDIATELY, bArr4);
                }
            }, str);
            return;
        }
        if (this.i.b().booleanValue()) {
            attlVar = (attl) Optional.ofNullable(atpyVar).filter(gka.o).map(ioc.t).orElse(this.h.v(attl.UNKNOWN_FORMAT_TYPE));
            pku.m(Optional.ofNullable(atpyVar), attlVar, attpVar, actiVar, Optional.empty(), Optional.of(str));
            bArr2 = bArr3;
        } else {
            if (atpyVar == null || (atpyVar.b & 1) == 0) {
                u = this.h.u();
            } else {
                u = attl.b(atpyVar.c);
                if (u == null) {
                    u = attl.UNKNOWN_FORMAT_TYPE;
                }
            }
            agqn agqnVar = agqn.OFFLINE_IMMEDIATELY;
            if (atpyVar == null || (atpyVar.b & 2) == 0) {
                atpxVar = null;
            } else {
                atpxVar = atpx.b(atpyVar.d);
                if (atpxVar == null) {
                    atpxVar = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
                }
            }
            bArr2 = bArr3;
            ahdq.f(attpVar, actiVar, null, str, u, true, agqnVar, atpxVar);
            attlVar = u;
        }
        k(str, attlVar, agqn.OFFLINE_IMMEDIATELY, bArr2);
    }

    @Override // defpackage.ahbb
    public final void c(int i) {
        jpu jpuVar = this.f;
        jpuVar.b.n(jpuVar.a(i).b());
    }
}
