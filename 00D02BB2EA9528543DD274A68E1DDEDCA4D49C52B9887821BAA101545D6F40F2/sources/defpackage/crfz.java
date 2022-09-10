package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: crfz  reason: default package */
/* loaded from: classes5.dex */
public final class crfz<T> extends btrh<T> {
    private final int d;

    public crfz(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((crfy) this.a).e((crmj) obj, 4);
        } else if (i == 1) {
            ((crfy) this.a).e((crmq) obj, 4);
        } else if (i != 2) {
            if (i != 3) {
                ((crfy) this.a).d((amqo) obj);
            } else {
                ((crfy) this.a).c((GmmCarProjectionStateEvent) obj);
            }
        } else {
            crfy crfyVar = (crfy) this.a;
            crmk crmkVar = (crmk) obj;
            amub k = crmkVar.b.a.k();
            int i2 = 6;
            if (k != null && k.ai() > 2) {
                i2 = 9;
            }
            crfyVar.e(crmkVar, i2);
        }
    }
}
