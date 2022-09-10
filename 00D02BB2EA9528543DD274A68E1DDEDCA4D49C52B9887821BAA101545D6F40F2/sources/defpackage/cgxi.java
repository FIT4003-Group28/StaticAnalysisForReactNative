package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxi  reason: default package */
/* loaded from: classes4.dex */
public class cgxi implements cgvj {
    private final List<cgvk> a = new ArrayList();

    public cgxi(Activity activity, dnmk dnmkVar, dxio<afha> dxioVar) {
        for (dorc dorcVar : dnmkVar.a) {
            this.a.add(new cgxk(activity, dorcVar, dxioVar));
        }
    }

    @Override // defpackage.cgvb
    public void a(cqiv cqivVar) {
        cqivVar.a(new cggp(), this);
    }

    @Override // defpackage.cgvj
    public List<cgvk> b() {
        return this.a;
    }
}
