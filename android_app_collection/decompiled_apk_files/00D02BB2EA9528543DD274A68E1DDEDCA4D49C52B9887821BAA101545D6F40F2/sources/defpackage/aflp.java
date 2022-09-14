package defpackage;
/* compiled from: PG */
/* renamed from: aflp  reason: default package */
/* loaded from: classes2.dex */
public final class aflp {
    public final dxio<ahwf> a;

    public aflp(dxio<ahwf> dxioVar) {
        this.a = dxioVar;
    }

    public final Runnable a(@dzsi final String str) {
        return new Runnable(this, str) { // from class: aflo
            private final aflp a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aflp aflpVar = this.a;
                String str2 = this.b;
                if (str2 == null) {
                    aflpVar.a.a().q();
                } else {
                    aflpVar.a.a().o(str2);
                }
            }
        };
    }
}
