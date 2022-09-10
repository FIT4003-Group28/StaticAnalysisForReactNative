package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
/* compiled from: PG */
/* renamed from: aerv  reason: default package */
/* loaded from: classes2.dex */
public final class aerv<T> extends btrh<T> {
    public aerv(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        aeru aeruVar = (aeru) this.a;
        AndroidLocationEvent androidLocationEvent = (AndroidLocationEvent) obj;
        if (androidLocationEvent.getLocation() == null) {
            return;
        }
        aeruVar.d.b(new aert(aeruVar, androidLocationEvent), bvrj.UI_THREAD);
    }
}
