package defpackage;

import com.google.android.apps.gmm.location.mapinfo.GpsStatusEvent;
/* compiled from: PG */
/* renamed from: ahmk  reason: default package */
/* loaded from: classes2.dex */
public final class ahmk<T> extends btrh<T> {
    public ahmk(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahmh ahmhVar = (ahmh) this.a;
        float topSnr = ((GpsStatusEvent) obj).getTopSnr();
        if (topSnr <= 30.0f) {
            ahmj ahmjVar = ahmhVar.a;
            if (!ahmjVar.c) {
                ahmjVar.c = true;
                ahmjVar.c();
                return;
            }
        }
        if (topSnr > 30.0f) {
            ahmj ahmjVar2 = ahmhVar.a;
            if (!ahmjVar2.c) {
                return;
            }
            ahmjVar2.c = false;
            ahmjVar2.c();
        }
    }
}
