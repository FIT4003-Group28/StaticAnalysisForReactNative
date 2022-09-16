package defpackage;

import com.google.protos.youtube.api.innertube.StorageInfoRendererOuterClass;
/* compiled from: PG */
/* renamed from: ngv  reason: default package */
/* loaded from: classes3.dex */
public final class ngv extends ngj {
    public ngv(aqdc aqdcVar) {
        super(aqdcVar);
    }

    @Override // defpackage.ngj
    public final amvn a(amvn amvnVar) {
        return ((aqdc) this.a).e ? amyg.a : amvnVar;
    }

    @Override // defpackage.ngj
    public final CharSequence c() {
        arag aragVar;
        aqdc aqdcVar = (aqdc) this.a;
        if ((aqdcVar.b & 1) != 0) {
            aragVar = aqdcVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ngj
    public final /* bridge */ /* synthetic */ Object d() {
        aqdc aqdcVar = (aqdc) this.a;
        if ((aqdcVar.b & 2) != 0) {
            aunb aunbVar = aqdcVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            return (auzo) aunbVar.qm(StorageInfoRendererOuterClass.storageInfoRenderer);
        }
        return null;
    }
}
