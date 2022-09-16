package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: crft  reason: default package */
/* loaded from: classes5.dex */
public final class crft<T> extends btrh<T> {
    private final int d;

    public crft(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            crfs crfsVar = (crfs) this.a;
            boolean isInProjectedMode = ((GmmCarProjectionStateEvent) obj).isInProjectedMode();
            if (crfsVar.c == isInProjectedMode) {
                return;
            }
            crfsVar.c = isInProjectedMode;
            crfsVar.d();
            return;
        }
        crfs crfsVar2 = (crfs) this.a;
        asin asinVar = (asin) obj;
        boolean z = ((asio) crfsVar2.a).b;
        if (crfsVar2.b == z) {
            return;
        }
        crfsVar2.b = z;
        crfsVar2.d();
    }
}
