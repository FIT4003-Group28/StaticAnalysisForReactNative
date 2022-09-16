package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahbf  reason: default package */
/* loaded from: classes2.dex */
public class ahbf extends ahhv {
    private final List<agxa<?>> a;
    private final List<agwu> b;
    private final cjta c;
    private final ahhf d;

    public ahbf(ahdc ahdcVar, ahht ahhtVar, dlcv dlcvVar, agyh agyhVar, CharSequence charSequence, List<agxa<?>> list, List<agwu> list2, cjta cjtaVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        this.a = list;
        this.b = list2;
        this.c = cjtaVar;
        dlam dlamVar = dlcvVar.g;
        dlam dlamVar2 = dlamVar == null ? dlam.d : dlamVar;
        Activity activity = (Activity) ((dxjd) ahdcVar.a).a;
        ahdc.a(activity, 1);
        ahdc.a(charSequence, 2);
        ahdc.a(dlamVar2, 3);
        ahdc.a(this, 4);
        this.d = new ahdb(activity, charSequence, dlamVar2, this, null, true);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.a;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.c.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agxd> c() {
        return cqgr.fT(new agrw(), this.d);
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.b;
    }
}
