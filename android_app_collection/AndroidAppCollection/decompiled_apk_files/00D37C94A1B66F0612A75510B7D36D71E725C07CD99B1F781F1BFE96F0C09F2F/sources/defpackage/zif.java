package defpackage;

import com.google.protos.youtube.api.innertube.CpidRefreshCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zif  reason: default package */
/* loaded from: classes4.dex */
public final class zif implements aafl {
    private final zin a;

    public zif(zin zinVar) {
        this.a = zinVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqiq aqiqVar = (aqiq) apzgVar.qm(CpidRefreshCommandOuterClass.cpidRefreshCommand);
        if ((aqiqVar.b & 1) != 0) {
            this.a.c(aqiqVar.c);
        }
    }
}
