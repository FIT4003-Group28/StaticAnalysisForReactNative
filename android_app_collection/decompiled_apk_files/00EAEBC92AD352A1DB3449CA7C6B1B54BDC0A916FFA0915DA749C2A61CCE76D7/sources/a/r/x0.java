package a.r;

import android.os.IBinder;
/* loaded from: classes.dex */
class x0 implements z0 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f722a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(IBinder iBinder) {
        this.f722a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).f722a.equals(this.f722a);
    }

    public int hashCode() {
        return this.f722a.hashCode();
    }
}
