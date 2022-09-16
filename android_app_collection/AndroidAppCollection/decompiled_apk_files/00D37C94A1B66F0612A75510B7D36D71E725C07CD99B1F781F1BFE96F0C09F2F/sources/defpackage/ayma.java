package defpackage;
/* compiled from: PG */
/* renamed from: ayma  reason: default package */
/* loaded from: classes2.dex */
final class ayma extends ayly {
    @Override // defpackage.ayly
    public final boolean a(aymb aymbVar) {
        synchronized (aymbVar) {
            if (aymbVar.a == 0) {
                aymbVar.a = -1;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.ayly
    public final void b(aymb aymbVar) {
        synchronized (aymbVar) {
            aymbVar.a = 0;
        }
    }
}
