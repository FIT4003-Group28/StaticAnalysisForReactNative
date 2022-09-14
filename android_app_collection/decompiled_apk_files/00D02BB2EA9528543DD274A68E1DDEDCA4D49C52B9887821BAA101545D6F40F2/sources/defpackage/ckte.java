package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ckte  reason: default package */
/* loaded from: classes4.dex */
public final class ckte<T> extends btrh<T> {
    private final int d;

    public ckte(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            asin asinVar = (asin) obj;
            ((cktb) this.a).a.c();
            return;
        }
        cktb cktbVar = (cktb) this.a;
        GmmCarProjectionStateEvent gmmCarProjectionStateEvent = (GmmCarProjectionStateEvent) obj;
        synchronized (cktbVar.a.a) {
            cktd cktdVar = cktbVar.a;
            if (cktdVar.e) {
                return;
            }
            cktdVar.g = gmmCarProjectionStateEvent.isInProjectedMode();
            cktbVar.a.b();
        }
    }
}
