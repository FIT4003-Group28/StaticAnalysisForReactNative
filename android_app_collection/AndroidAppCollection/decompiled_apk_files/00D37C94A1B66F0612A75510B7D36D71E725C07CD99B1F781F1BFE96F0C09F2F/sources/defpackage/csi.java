package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: csi  reason: default package */
/* loaded from: classes3.dex */
public final class csi implements csj {
    private final /* synthetic */ int a;

    public csi() {
    }

    public csi(int i) {
        this.a = i;
    }

    @Override // defpackage.csj
    public final cgg a(cfk cfkVar, csd csdVar, csl cslVar, Context context) {
        if (this.a == 0) {
            return new cgg(cfkVar, csdVar, cslVar, context);
        }
        return new ajoi(cfkVar, csdVar, cslVar, context);
    }
}
