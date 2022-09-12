package defpackage;
/* compiled from: PG */
/* renamed from: dyuy  reason: default package */
/* loaded from: classes6.dex */
final class dyuy extends dyuw {
    @Override // defpackage.dyuw
    public final boolean a(dyuz dyuzVar) {
        synchronized (dyuzVar) {
            if (dyuzVar.a == 0) {
                dyuzVar.a = -1;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.dyuw
    public final void b(dyuz dyuzVar) {
        synchronized (dyuzVar) {
            dyuzVar.a = 0;
        }
    }
}
