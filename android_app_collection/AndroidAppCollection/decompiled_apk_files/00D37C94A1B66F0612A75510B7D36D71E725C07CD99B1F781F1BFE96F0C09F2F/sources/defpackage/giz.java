package defpackage;

import com.google.protos.youtube.api.innertube.CreatePostCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: giz  reason: default package */
/* loaded from: classes3.dex */
public final class giz implements aafl {
    public final aafo a;
    public final yzj b;
    private final aavc c;
    private final aaqf d;
    private final afvn e;

    public giz(aavc aavcVar, aaqf aaqfVar, afvn afvnVar, aafo aafoVar, yzj yzjVar) {
        this.c = aavcVar;
        this.d = aaqfVar;
        this.e = afvnVar;
        this.a = aafoVar;
        this.b = yzjVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(CreatePostCommandOuterClass.createPostCommand)) {
            return;
        }
        aqix aqixVar = (aqix) apzgVar.qm(CreatePostCommandOuterClass.createPostCommand);
        if ((aqixVar.b & 1) == 0) {
            return;
        }
        arny arnyVar = aqixVar.c;
        if (arnyVar == null) {
            arnyVar = arny.a;
        }
        aave aaveVar = new aave(this.d, this.e.c());
        int i = arnyVar.b;
        if ((i & 32) != 0) {
            aaveVar.s = arnyVar.h;
        }
        if ((i & 4) != 0) {
            aaveVar.t(arnyVar.g);
        }
        if ((arnyVar.b & 2) != 0) {
            aaveVar.u(arnyVar.f);
        }
        int i2 = arnyVar.c;
        if (i2 == 9) {
            arnk arnkVar = (arnk) arnyVar.d;
            if ((arnkVar.b & 1) != 0) {
                aaveVar.b = arnkVar.c;
            }
            if ((arnkVar.b & 4) != 0) {
                arif arifVar = (arnyVar.c == 9 ? (arnk) arnyVar.d : arnk.a).e;
                if (arifVar == null) {
                    arifVar = arif.a;
                }
                aaveVar.u = arifVar;
            }
            if (((arnyVar.c == 9 ? (arnk) arnyVar.d : arnk.a).b & 2) != 0) {
                aaveVar.t = (arnyVar.c == 9 ? (arnk) arnyVar.d : arnk.a).d;
            }
        } else if (i2 == 10) {
            arnl arnlVar = (arnl) arnyVar.d;
            if ((arnlVar.b & 1) != 0) {
                aaveVar.d = arnlVar.c;
            }
        } else if (i2 == 8) {
            aaveVar.a = ((arnn) arnyVar.d).b;
        } else if (i2 == 7) {
            arnp arnpVar = (arnp) arnyVar.d;
            if ((arnpVar.b & 1) != 0) {
                aaveVar.c = arnpVar.c;
            }
        } else if (i2 == 14) {
            aaveVar.v = (arnj) arnyVar.d;
        } else if (i2 == 15) {
            aaveVar.w = ((arno) arnyVar.d).c;
        }
        giy giyVar = new giy(this, (aavf) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aavf.class));
        aavc aavcVar = this.c;
        aavcVar.f.a(aavcVar.b.a(aaveVar, arnz.a, new aauz(giyVar), aaul.h, aauh.n));
    }
}
