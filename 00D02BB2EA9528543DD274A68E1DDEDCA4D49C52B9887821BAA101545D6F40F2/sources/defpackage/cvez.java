package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvez  reason: default package */
/* loaded from: classes5.dex */
public final class cvez extends abi {
    final /* synthetic */ cvfc a;

    public cvez(cvfc cvfcVar) {
        this.a = cvfcVar;
    }

    @Override // defpackage.abi
    public final void d(int i, int i2) {
        cvfc cvfcVar = this.a;
        int i3 = cvfcVar.j;
        if (i3 != -1 && i3 >= i) {
            cvfcVar.j = i3 + i2;
        }
        for (int i4 = 0; i4 < i2 && i4 < this.a.c(); i4++) {
            int i5 = i4 + i;
            cvec b = this.a.b(i5).b();
            cvec cvecVar = cvec.MESSAGE_BUBBLE;
            if (b.ordinal() == 3) {
                this.a.k.removeCallbacksAndMessages(null);
                cvfc cvfcVar2 = this.a;
                cvfcVar2.j = i5;
                cvfcVar2.k.postDelayed(new Runnable(this) { // from class: cvey
                    private final cvez a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.j = -1;
                    }
                }, 3000L);
                return;
            }
        }
    }
}
