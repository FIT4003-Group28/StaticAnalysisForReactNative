package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dsr  reason: default package */
/* loaded from: classes3.dex */
public final class dsr extends dsv {
    public qaa r;

    protected dsr(Context context) {
        super(context);
    }

    public static dsr n(Context context) {
        s(context, true);
        return new dsr(context);
    }

    @Override // defpackage.dsv, defpackage.dsq
    protected final aopa j(Context context, View view, Activity activity) {
        return null;
    }

    @Override // defpackage.dsv, defpackage.dsq
    protected final aopa m(Context context, View view, Activity activity) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dsv
    public final List o(dtq dtqVar, Context context, aopa aopaVar, dnq dnqVar) {
        ArrayList arrayList = new ArrayList();
        if (dtqVar.b == null) {
            return arrayList;
        }
        arrayList.add(new due(dtqVar, aopaVar, dtqVar.a()));
        return arrayList;
    }

    @Override // defpackage.dsv
    protected final void p(dtq dtqVar, Context context, aopa aopaVar, dnq dnqVar) {
        if (!dtqVar.l) {
            t(o(dtqVar, context, aopaVar, dnqVar));
            return;
        }
        qaa qaaVar = this.r;
        if (qaaVar == null) {
            return;
        }
        String str = qaaVar.a;
        if (!TextUtils.isEmpty(str)) {
            String d = dts.d(str);
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            d.getClass();
            dnwVar.d |= 512;
            dnwVar.ab = d;
            aopaVar.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar.instance;
            dnwVar3.ac = 5;
            dnwVar3.d |= 1024;
            boolean z = this.r.b;
            aopaVar.copyOnWrite();
            dnw dnwVar4 = (dnw) aopaVar.instance;
            dnwVar4.d |= 2048;
            dnwVar4.ad = z;
        }
        this.r = null;
    }
}
