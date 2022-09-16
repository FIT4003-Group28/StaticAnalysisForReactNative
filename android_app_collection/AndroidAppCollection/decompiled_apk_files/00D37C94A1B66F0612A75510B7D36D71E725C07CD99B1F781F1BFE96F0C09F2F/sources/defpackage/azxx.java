package defpackage;
/* compiled from: PG */
/* renamed from: azxx  reason: default package */
/* loaded from: classes2.dex */
public final class azxx {
    private final aztu a = ayme.f(new azya(8, false));

    public final int a() {
        long j = ((azya) this.a.a).b.b;
        return 1073741823 & (((int) ((1152921503533105152L & j) >> 30)) - ((int) (j & 1073741823)));
    }

    public final Object b() {
        aztu aztuVar = this.a;
        while (true) {
            azya azyaVar = (azya) aztuVar.a;
            Object b = azyaVar.b();
            if (b != azya.a) {
                return b;
            }
            this.a.c(azyaVar, azyaVar.c());
        }
    }

    public final void c() {
        aztu aztuVar = this.a;
        while (true) {
            azya azyaVar = (azya) aztuVar.a;
            if (azyaVar.d()) {
                return;
            }
            this.a.c(azyaVar, azyaVar.c());
        }
    }

    public final boolean d(Object obj) {
        aztu aztuVar = this.a;
        while (true) {
            azya azyaVar = (azya) aztuVar.a;
            int a = azyaVar.a(obj);
            if (a != 0) {
                if (a != 1) {
                    return false;
                }
                this.a.c(azyaVar, azyaVar.c());
            } else {
                return true;
            }
        }
    }
}
