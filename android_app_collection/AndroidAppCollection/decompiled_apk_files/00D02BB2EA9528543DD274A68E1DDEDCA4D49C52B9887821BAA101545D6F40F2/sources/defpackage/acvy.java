package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: acvy  reason: default package */
/* loaded from: classes2.dex */
public class acvy implements acvv {
    private final Activity a;
    private final dxio<afha> b;
    private final dxio<axwy> c;
    private final List<acvx> d = new ArrayList();

    public acvy(Activity activity, dxio<afha> dxioVar, dxio<axwy> dxioVar2) {
        this.a = activity;
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    @Override // defpackage.acvv
    public List<acvx> a() {
        return this.d;
    }

    public void b(dgmq dgmqVar) {
        this.d.clear();
        for (dgmo dgmoVar : dgmqVar.a) {
            if (!dgmoVar.e) {
                this.d.add(new acwa(this.a, this.b, dgmoVar, this.c));
            }
        }
    }
}
