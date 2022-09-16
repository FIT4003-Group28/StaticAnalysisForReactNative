package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajtd  reason: default package */
/* loaded from: classes.dex */
public final class ajtd {
    final /* synthetic */ ajte a;
    private final yo b;
    private final yo c;
    private final ajtp d;
    private final ajtb e;
    private boolean f = false;
    private boolean g = false;

    public ajtd(ajte ajteVar, yo yoVar, yo yoVar2, ajtp ajtpVar, ajtb ajtbVar) {
        this.a = ajteVar;
        this.b = yoVar;
        this.c = yoVar2;
        this.d = ajtpVar;
        this.e = ajtbVar;
    }

    private final void b() {
        if (!this.f || !this.g) {
            return;
        }
        this.e.a.remove(this.d);
        this.e.b.remove(this.d);
        this.a.a();
    }

    public final void a(yo yoVar) {
        yo yoVar2 = this.b;
        if (yoVar == yoVar2) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.c.remove(yoVar2);
            this.a.l(this.b);
            b();
            return;
        }
        yo yoVar3 = this.c;
        if (yoVar != yoVar3 || this.g) {
            return;
        }
        this.g = true;
        this.e.c.remove(yoVar3);
        this.a.l(this.c);
        b();
    }
}
