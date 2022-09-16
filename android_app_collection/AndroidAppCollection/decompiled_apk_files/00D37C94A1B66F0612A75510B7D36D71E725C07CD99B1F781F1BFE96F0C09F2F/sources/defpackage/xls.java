package defpackage;

import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
/* compiled from: PG */
/* renamed from: xls  reason: default package */
/* loaded from: classes4.dex */
final class xls implements xnt {
    final /* synthetic */ xmd a;
    final /* synthetic */ aufe b;
    final /* synthetic */ xlt c;

    public xls(xlt xltVar, xmd xmdVar, aufe aufeVar) {
        this.c = xltVar;
        this.a = xmdVar;
        this.b = aufeVar;
    }

    @Override // defpackage.xnt
    public final void a(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction) {
        aqav aqavVar;
        aqax aqaxVar = this.a.a().c;
        if (aqaxVar == null) {
            aqaxVar = aqax.a;
        }
        if (aqaxVar.b == 62285947) {
            aqavVar = (aqav) aqaxVar.c;
        } else {
            aqavVar = aqav.a;
        }
        this.c.b(aqavVar.i, this.b, updateBackstagePollActionOuterClass$UpdateBackstagePollAction);
    }
}
